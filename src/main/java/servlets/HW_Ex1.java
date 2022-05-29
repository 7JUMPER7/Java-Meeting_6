package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HW_Ex1", value = "/HW_Ex1")
public class HW_Ex1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.write("Bad programmers worry about the code. Good program- mers worry about data structures and their relationships");
        writer.write("\nLinus Torvalds");
        writer.close();
    }
}
