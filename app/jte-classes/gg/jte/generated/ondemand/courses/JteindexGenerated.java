package gg.jte.generated.ondemand.courses;
import org.example.hexlet.dto.courses.CoursesPage;
public final class JteindexGenerated {
	public static final String JTE_NAME = "courses/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,3,3,5,5,8,8,11,11,11,14,14,14,14,14,14,14,15,15,15,18,18,20,20,20,20,20,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursesPage page) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n        <h1>Курсы</h1>\r\n        <table>\r\n            ");
				for (var course: page.getCourses()) {
					jteOutput.writeContent("\r\n                <tr>\r\n                    <td>\r\n                        ");
					jteOutput.setContext("td", null);
					jteOutput.writeUserContent(course.getId());
					jteOutput.writeContent("\r\n                    </td>\r\n                    <td>\r\n                        <h2><a href=\"/courses/");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(course.getId());
					jteOutput.setContext("a", null);
					jteOutput.writeContent("\">");
					jteOutput.setContext("a", null);
					jteOutput.writeUserContent(course.getName());
					jteOutput.writeContent("</a></h2>\r\n                        <p>");
					jteOutput.setContext("p", null);
					jteOutput.writeUserContent(course.getDescription());
					jteOutput.writeContent("</p>\r\n                    </td>\r\n                </tr>\r\n            ");
				}
				jteOutput.writeContent("\r\n        </table>\r\n    ");
			}
		}, null);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CoursesPage page = (CoursesPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
