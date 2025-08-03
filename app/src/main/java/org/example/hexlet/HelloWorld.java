package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.http.NotFoundResponse;
import io.javalin.rendering.template.JavalinJte;
import static io.javalin.rendering.template.TemplateUtil.model;

import org.example.hexlet.dto.courses.CoursePage;
import org.example.hexlet.model.Course;
import org.example.hexlet.dto.courses.CoursesPage;

import java.util.List;
import java.util.Objects;

public class HelloWorld {
    private static final List<Course> COURSES = List.of(
            new Course(1,"Java для начинающих", "Основы программирования на Java"),
            new Course(2,"Spring Framework", "Создание веб-приложений"),
            new Course(3,"React JS", "Разработка интерфейсов"),
            new Course(4,"Python", "Основы Python и его применение")
    );

    public static void main(String[] args) {
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte());
        });

        app.get("/courses/{id}", ctx -> {
            var id = ctx.pathParamAsClass("id", Long.class).get();
            var course = COURSES.stream()
                    .filter(cur -> Objects.equals(cur.getId(), id))
                    .findFirst()
                    .orElse(null);

            if (course == null) {
                throw new NotFoundResponse("Course not found");
            }

            var page = new CoursePage(course);
            ctx.render("courses/show.jte", model("page", page));
        });

        app.get("/courses", ctx -> {
            //var courses = /* Список курсов извлекается из базы данных */;
            var header = "Курсы по программированию";
            var page = new CoursesPage(COURSES, header);
            ctx.render("courses/index.jte", model("page", page));
        });

        app.get("/", ctx -> {
            ctx.render("index.jte");
        });

        app.start(7070);
    }
}
