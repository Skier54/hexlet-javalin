@import org.example.hexlet.dto.courses.CoursesPage
@param CoursesPage page

@template.layout.page(
    content = @`
        <h1>Курсы</h1>
        <table>
            @for(var course: page.getCourses())
                <tr>
                    <td>
                        ${course.getId()}
                    </td>
                    <td>
                        <h2><a href="/courses/${course.getId()}">${course.getName()}</a></h2>
                        <p>${course.getDescription()}</p>
                    </td>
                </tr>
            @endfor
        </table>
    `
)