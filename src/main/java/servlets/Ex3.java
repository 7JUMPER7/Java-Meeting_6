package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Ex3", value = "/ex3")
public class Ex3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/Ex3.jsp");
        if(request.getParameter("number") == null) {
            request.setAttribute("number", 50);
        }
        if(request.getParameter("iter") == null) {
            request.setAttribute("iter", 0);
        }
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer number = Integer.parseInt(request.getParameter("number"));
        String command = request.getParameter("command");
        int iter = Integer.parseInt(request.getParameter("iter"));

        switch (command) {
            case "1": {
                number = (int)(number - 50 / Math.pow(2, (iter + 1)));
                break;
            }
            case "2": {
                number = (int)(number + 50 / Math.pow(2, (iter + 1)));
                break;
            }
            case "3": {
                number = 50;
                iter = -1;
            }
        }

        iter++;
        request.setAttribute("number", number);
        request.setAttribute("iter", iter);
        doGet(request, response);
    }
}
