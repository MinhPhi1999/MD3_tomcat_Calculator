package com.example.caculator;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "CalculatorDiscount", value = "/calculator")
public class CalculatorDiscount extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pd = req.getParameter("pd");
        float lp = Float.parseFloat(req.getParameter("lp"));
        float dp = Float.parseFloat(req.getParameter("dp"));
        float da = (float) (lp*dp*0.01);
        float discountPrice = lp-da;
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h1>"+pd+"</h1>");
        printWriter.println("<h1>"+lp+"</h1>");
        printWriter.println("<h1>"+dp+"</h1>");
        printWriter.println("<h1>"+"tien dc giam: "+da+"</h1>");
        printWriter.println("<h1>"+"tien sau khi giam: "+discountPrice+"</h1>");
        printWriter.println("</html>");
    }

    public void destroy() {
    }
}