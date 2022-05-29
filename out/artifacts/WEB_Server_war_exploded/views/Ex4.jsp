<%--
  Created by IntelliJ IDEA.
  User: arsenijsemenov
  Date: 29.05.2022
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ex4, 5, 6, 7</title>
</head>
<body>
    <form method="post" style="display: flex; flex-direction: column;">
        <input type="text" name="name" placeholder="ФИО" required>
        <input type="tel" name="phone" placeholder="Телефон" required>
        <input type="email" name="email" placeholder="E-mail" required>
        <input type="number" name="age" placeholder="Возраст" required>
        <label>Хотите подписаться на нашу рассылку?
            <input type="checkbox" name="newsletter">
        </label>
        <div>Пол: <br>
            <label>Мужской
                <input type="radio" name="gender" value="Male" required>
            </label>
            <label>Женский
                <input type="radio" name="gender" value="Female" required>
            </label>
            <label>Другой
                <input type="radio" name="gender" value="Other" required>
            </label>
        </div>
        <input type="submit" value="Отправить форму">
    </form>
    <%
        Object message = request.getAttribute("message");
        if(message != null) {
            out.println("<pre>" + message.toString() + "</pre>");
        }
    %>
</body>
</html>
