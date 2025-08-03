package gg.jte.generated.ondemand.layout;
import gg.jte.Content;
public final class JtepageGenerated {
	public static final String JTE_NAME = "layout/page.jte";
	public static final int[] JTE_LINE_INFO = {0,0,2,2,2,26,26,26,26,28,28,32,32,34,34,34,2,3,3,3,3};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Content content, Content footer) {
		jteOutput.writeContent("\r\n<!doctype html>\r\n<html lang=\"en\">\r\n    <head>\r\n        <meta charset=\"utf-8\" />\r\n        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n        <title>Сайт курсов</title>\r\n    </head>\r\n    <body>\r\n        <header>\r\n            <div>\r\n                <ul>\r\n                    <li>\r\n                        <a href=\"/\">Главная страница</a>\r\n                    </li>\r\n                    <li>\r\n                        <a href=\"/courses\">Все курсы</a>\r\n                    </li>\r\n                </ul>\r\n            </div>\r\n        </header>\r\n        <div>\r\n            ");
		jteOutput.setContext("div", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\r\n        </div>\r\n        ");
		if (footer != null) {
			jteOutput.writeContent("\r\n            <footer>\r\n                <p> запутанность в квантовой физике </p>\r\n            </footer>\r\n        ");
		}
		jteOutput.writeContent("\r\n    </body>\r\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Content content = (Content)params.get("content");
		Content footer = (Content)params.getOrDefault("footer", null);
		render(jteOutput, jteHtmlInterceptor, content, footer);
	}
}
