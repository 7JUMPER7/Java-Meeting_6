<%--
  Created by IntelliJ IDEA.
  User: arsenijsemenov
  Date: 29.05.2022
  Time: 12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ex2</title>
</head>
<body>
    <form method="post">
        <label>Число:
            <input type="number" name="number">
        </label>
        <input type="submit" value="Calculate">
    </form>
    <%
        Integer number = (Integer)request.getAttribute("number");
        if(number != null) {
            out.println("<div style='padding: 20px'>");
            for(int i = 1; i <= 10; i++) {
                out.println("<div>");
                out.println(number + " * " + i + " = " + (i * number));
                out.println("</div>");
            }
            out.println("</div>");
        }
    %>



</body>
</html>
