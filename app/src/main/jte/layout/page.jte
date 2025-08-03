@import gg.jte.Content

@param Content content
@param Content footer = null

<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <title>Сайт курсов</title>
    </head>
    <body>
        <header>
            <div>
                <ul>
                    <li>
                        <a href="/">Главная страница</a>
                    </li>
                    <li>
                        <a href="/courses">Все курсы</a>
                    </li>
                </ul>
            </div>
        </header>
        <div>
            ${content}
        </div>
        @if (footer != null)
            <footer>
                <p> запутанность в квантовой физике </p>
            </footer>
        @endif
    </body>
</html>