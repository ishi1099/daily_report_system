<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
    </head>
    <body>

        <%
    int a=1;
    int b=1;
    int c=0;
    %>

    <ul>

       <%  for(a = 1;a <10; a++ )   { %>
               <% for(b = 1;b <10; b++ ) { %>
                    <li><%= a %> × <%= b %> = <%= a*b %></li>
               <% }%>
       <% }%>

    </ul>

    </body>
</html>