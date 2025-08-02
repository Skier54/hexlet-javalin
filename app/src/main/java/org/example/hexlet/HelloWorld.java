package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;
import static io.javalin.rendering.template.TemplateUtil.model;
import org.example.hexlet.model.Course;
import org.example.hexlet.dto.courses.CoursesPage;

import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte());
        });

        var courses = List.of(
                new Course("Java для начинающих", "Основы программирования на Java"),
                new Course("Spring Framework", "Создание веб-приложений"),
                new Course("React JS", "Разработка интерфейсов"),
                new Course("Python", "Основы Python и его применение")
        );

        app.get("/courses", ctx -> {
            //var courses = /* Список курсов извлекается из базы данных */;
            var header = "Курсы по программированию";
            var page = new CoursesPage(courses, header);
            ctx.render("courses/index.jte", model("page", page));
        });

        app.start(7070);
    }
}
