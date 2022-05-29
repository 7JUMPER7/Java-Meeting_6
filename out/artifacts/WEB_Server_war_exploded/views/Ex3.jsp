<%--
  Created by IntelliJ IDEA.
  User: arsenijsemenov
  Date: 29.05.2022
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ex3</title>
</head>
<body>
    <h3>Ваше число: </h3>
    <form method="post" style="display: flex; flex-direction: column; max-width: 400px">
        <input type="hidden" name="iter" value="<% out.print(request.getAttribute("iter")); %>" readonly>
        <div style="display: flex">
            <button type="submit" name="command" value="1">Меньше</button>
<%--            <input type="number" name="number" value="<% out.print((int)request.getAttribute("number") / 2); %>" readonly style="flex: 1 1 auto;">--%>
            <input type="number" name="number" value="<% out.print(request.getAttribute("number")); %>" readonly style="flex: 1 1 auto;">
            <button type="submit" name="command" value="2">Больше</button>
        </div>
        <button type="submit" name="command" value="3" style="width: 100%">Угадал!</button>
    </form>
</body>
</html>
