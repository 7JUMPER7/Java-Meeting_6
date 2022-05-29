package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Ex4", value = "/ex4")
public class Ex4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/Ex4.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        int age = Integer.parseInt(request.getParameter("age"));
        String newsletter = request.getParameter("newsletter");
        String gender = request.getParameter("gender");

        String message = "";

        if(age < 0) {
            message = "Возраст не может быть ниже 0";
        } else {
            message += "Имя: " + name;
            message += "\nТелефон: " + phone;
            message += "\nПочта: " + email;
            message += "\nВозраст: " + age;
            message += "\nПодписка на рассылку: ";
            if(newsletter == null) {
                message += "Нет";
            } else {
                message += "Да";
            }
            message += "\nПол: " + gender;
            message += "\nУспешно отправлено.";
        }

        request.setAttribute("message", message);
        doGet(request, response);
    }
}
