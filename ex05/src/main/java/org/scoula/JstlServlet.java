package org.scoula;

import org.scoula.domain.Member;


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet("/jstl_ex")
public class JstlServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.print("<html><body>");
        out.print("");
        out.print("</body></html>");*/

        List<Member> members = new ArrayList<>();

        for (int i = 0 ; i < 10; i++){
            Member member = new Member("홍길동_" + i, "hong_" + i);
            members.add(member);
        }
        request.setAttribute("members", members);
        request.setAttribute("role", "ADMIN");

        String userid = request.getParameter("userid");

        Member user = new Member(userid, userid);
        HttpSession session = request.getSession();
        session.setAttribute("user", user);

        request.setAttribute("today", new Date());

        request.getRequestDispatcher("jstl_ex.jsp").forward(request, response);


    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        doGet(request, response);
    }
}