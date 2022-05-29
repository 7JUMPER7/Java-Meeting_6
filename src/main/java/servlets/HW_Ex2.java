package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "HW_Ex2", value = "/HW_Ex2")
public class HW_Ex2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/HW_Ex2.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int num3 = Integer.parseInt(request.getParameter("num3"));
        String action = request.getParameter("action");

        double res = 0.0;

        switch (action) {
            case "1": {
                if(num1 > num2 && num1 > num3) {
                    res = num1;
                } else {
                    if(num2 > num3) {
                        res = num2;
                    } else {
                        res = num3;
                    }
                }
                break;
            }
            case "2": {
                if(num1 < num2 && num1 < num3) {
                    res = num1;
                } else {
                    if(num2 < num3) {
                        res = num2;
                    } else {
                        res = num3;
                    }
                }
                break;
            }
            case "3": {
                res = (double)(num1 + num2 + num3) / 3;
            }
        }

        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);
        request.setAttribute("num3", num3);
        request.setAttribute("result", res);
        doGet(request, response);
    }
}
