<%--
  Created by IntelliJ IDEA.
  User: arsenijsemenov
  Date: 29.05.2022
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HW Ex2, 3</title>
</head>
<body>
    <form method="post" style="display: flex; flex-direction: column;">
        <input type="number" value="<% out.print((request.getAttribute("num1") != null) ? request.getAttribute("num1").toString() : "0"); %>" name="num1">
        <input type="number" value="<% out.print((request.getAttribute("num2") != null) ? request.getAttribute("num2").toString() : "0"); %>" name="num2">
        <input type="number" value="<% out.print((request.getAttribute("num3") != null) ? request.getAttribute("num3").toString() : "0"); %>" name="num3">
        <br>
        <label>Максимум
            <input type="radio" name="action" value="1" required>
        </label>
        <label>Минимум
            <input type="radio" name="action" value="2" required>
        </label>
        <label>Среднее арифметическое
            <input type="radio" name="action" value="3" required>
        </label>
        <br>
        <input type="submit" value="Посчитать">
    </form>
    <%
        Object result = request.getAttribute("result");
        if(result != null) {
            out.println("<div>");
            out.println("<strong>Ответ: </strong>" + (double)result);
            out.println("</div>");
        }
    %>
</body>
</html>
