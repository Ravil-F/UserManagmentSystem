<%@ page import="java.util.List" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ru">
    <head>
        <meta charset="UTF-8">
         <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Users list</title>
        <link rel="stylesheet" href="../css/style_list.css">
    </head>
    <body>
        <header>
            <h1>Super app!</h1>
        </header>

        <main>
            <section>
                    <h2> Users </h2>
                    <div class="information">
                <%
                    List<String> names = (List<String>) request.getAttribute("userNames");
                    if(names != null && !names.isEmpty()){
                        out.println("<ui>");
                        for(String s : names){
                            out.println("<li>" + s + "</li>");
                        }
                        out.println("</ui>");
                    }else out.println("<p> There are no users yet!</p>");
                %>
            </div>
            </section>
        </main>

        <footer>
            <button onclick="location.href='/adding_viewing_users_war_exploded/'"> Back to main</button>
        </footer>

    </body>
</html>
