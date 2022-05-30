<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: arsenijsemenov
  Date: 30.05.2022
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ex4</title>
</head>
<body>
    <form method="post">
        <textarea type="text" name="text" required></textarea>
        <input type="submit" value="Отправить">
    </form>
    <%
        Object vowels = request.getAttribute("vowels");
        if(vowels != null) {
            ArrayList<String> vowelsList = (ArrayList<String>)vowels;
            out.println("<div>Кол-во гласных: " + vowelsList.size());
            out.println("<ul>");
            for(String vowel : vowelsList) {
                out.println("<li>" + vowel + "</li>");
            }
            out.println("</ul></div>");
        }
        Object consonants = request.getAttribute("consonants");
        if(consonants != null) {
            ArrayList<String> consonantsList = (ArrayList<String>)consonants;
            out.println("<div>Кол-во согласных: " + consonantsList.size());
            out.println("<ul>");
            for(String consonant : consonantsList) {
                out.println("<li>" + consonant + "</li>");
            }
            out.println("</ul></div>");
        }
        Object signs = request.getAttribute("signs");
        if(vowels != null) {
            ArrayList<String> signsList = (ArrayList<String>)signs;
            out.println("<div>Кол-во знаков препинания: " + signsList.size());
            out.println("<ul>");
            for(String sign : signsList) {
                out.println("<li>" + sign + "</li>");
            }
            out.println("</ul></div>");
        }
    %>
</body>
</html>
