package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "HW_Ex5", value = "/HW_Ex5")
public class HW_Ex5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/HW_Ex5.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Double num1 = Double.parseDouble(request.getParameter("num1"));
        Double num2 = Double.parseDouble(request.getParameter("num2"));
        String command = request.getParameter("command");
        String responseMessage = "";

        try {
            Double result = 0.0;
            switch (command) {
                case "+": {
                    result = Calculator.Summ(num1, num2);
                    break;
                }
                case "-": {
                    result = Calculator.Sub(num1, num2);
                    break;
                }
                case "*": {
                    result = Calculator.Mult(num1, num2);
                    break;
                }
                case "/": {
                    result = Calculator.Div(num1, num2);
                    break;
                }
                case "**": {
                    result = Calculator.Pow(num1, num2);
                    break;
                }
                case "%": {
                    result = Calculator.Percent(num1, num2);
                    break;
                }
            }
            responseMessage = result.toString();
        } catch(Exception ex) {
            responseMessage = ex.getMessage();
        }

        request.setAttribute("result", responseMessage);
        request.setAttribute("num1", num1.toString());
        request.setAttribute("num2", num2.toString());
        doGet(request, response);
    }
}



class Calculator {
    public static double Summ(double num1, double num2) {
        return num1 + num2;
    }

    public static double Sub(double num1, double num2) {
        return num1 - num2;
    }

    public static double Mult(double num1, double num2) {
        return num1 * num2;
    }

    public static double Div(double num1, double num2) throws DivByZeroException {
        if(num2 == 0) {
            throw new DivByZeroException("Division by zero");
        }
        return num1 / num2;
    }

    public static double Percent(double number, double percent) {
        return number * percent / 100;
    }

    public static double Pow(double number, double pow) {
        return Math.pow(number, pow);
    }
}

class DivByZeroException extends Exception {
    public DivByZeroException() { }

    public DivByZeroException(String message) {
        super(message);
    }
}