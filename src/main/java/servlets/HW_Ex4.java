package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet(name = "HW_Ex4", value = "/HW_Ex4")
public class HW_Ex4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/HW_Ex4.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String text = request.getParameter("text");
        ArrayList<String> vowels = StringTools.Vowels(text);
        ArrayList<String> consonants = StringTools.Consonants(text);
        ArrayList<String> signs = StringTools.Signs(text);

        request.setAttribute("vowels", vowels);
        request.setAttribute("consonants", consonants);
        request.setAttribute("signs", signs);
        request.setAttribute("text", text);
        doGet(request, response);
    }
}


class StringTools {
    public static ArrayList<String> Vowels(String text) {
        Pattern vowelsPattern = Pattern.compile("(?iu)[aeiouy]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = vowelsPattern.matcher(text);

        ArrayList<String> vowels = new ArrayList<String>();
        int vowelsCount = 0;
        while(matcher.find()) {
            vowelsCount++;
            vowels.add(matcher.group());
        }

        return vowels;
    }

    public static ArrayList<String> Consonants(String text) {
        Pattern consonantsPattern = Pattern.compile("(?iu)[bcdfgjklmnpqstvxzhrw]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = consonantsPattern.matcher(text);

        ArrayList<String> consonants = new ArrayList<String>();
        int consonantsCount = 0;
        while(matcher.find()) {
            consonantsCount++;
            consonants.add(matcher.group());
        }

        return consonants;
    }

    public static ArrayList<String> Signs(String text) {
        Pattern consonantsPattern = Pattern.compile("(?iu)[,.!?()-]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = consonantsPattern.matcher(text);

        ArrayList<String> signs = new ArrayList<String>();
        int wordsCount = 0;
        while(matcher.find()) {
            wordsCount++;
            signs.add(matcher.group());
        }

        return signs;
    }
}