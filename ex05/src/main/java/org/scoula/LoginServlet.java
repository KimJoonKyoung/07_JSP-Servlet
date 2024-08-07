package org.scoula;

import org.scoula.dto.LoginDTO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");

        String userid = request.getParameter("userid");
        String passwd = request.getParameter("passwd");
        LoginDTO loginDTO=new LoginDTO(userid,passwd);

        request.setAttribute("userid", userid);
        request.setAttribute("passwd", passwd);
        request.setAttribute("login", loginDTO);

        request.getRequestDispatcher("login.jsp").forward(request, response);

        /*PrintWriter out = response.getWriter();

        out.print("<html><body>");
        out.print("");
        out.print("</body></html>");*/

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        doGet(request, response);
    }
}