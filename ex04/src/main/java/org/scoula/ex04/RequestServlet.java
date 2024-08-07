package org.scoula.ex04;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/request")
public class RequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");

//        PrintWriter out = response.getWriter();

        request.setAttribute("username", "홍길동");
        request.setAttribute("useraddress", "서울");
        //foward
        RequestDispatcher dis = request.getRequestDispatcher("/response.jsp");
        dis.forward(request, response);

//        out.print("<html><body>");
//        out.print("");
//        out.print("</body></html>");

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        doGet(request, response);
    }
}