<%--
  Created by IntelliJ IDEA.
  User: arsenijsemenov
  Date: 30.05.2022
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ex5</title>
</head>
<body>
    <form method="post">
        <div>
            <label>Число 1
                <input type="number" name="num1" value="<% out.print((request.getAttribute("num1") != null) ? request.getAttribute("num1") : "0"); %>" required>
            </label>
            <label>Число 2
                <input type="number" name="num2" value="<% out.print((request.getAttribute("num2") != null) ? request.getAttribute("num2") : "0"); %>" required>
            </label>
        </div>
        <div style="display: flex; flex-direction: column;">
            <label>
                <input type="radio" name="command" value="+" required>
                +
            </label>
            <label>
                <input type="radio" name="command" value="-">
                -
            </label>
            <label>
                <input type="radio" name="command" value="*">
                *
            </label>
            <label>
                <input type="radio" name="command" value="/">
                /
            </label>
            <label>
                <input type="radio" name="command" value="**">
                **
            </label>
            <label>
                <input type="radio" name="command" value="%">
                %
            </label>
        </div>
        <input type="submit" value="Расчитать">
    </form>
    <%
        Object result = request.getAttribute("result");
        if(result != null) {
            out.println("<div><strong>Ответ: </strong>" + (String)result + "</div>");
        }
    %>
</body>
</html>
