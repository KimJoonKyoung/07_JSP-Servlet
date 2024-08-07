package org.scoula;

import org.scoula.domain.Member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/scope")
public class ScopeServlet extends HttpServlet {
    ServletContext sc;

    @Override
    public void init(ServletConfig config) throws ServletException {
        sc = config.getServletContext();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.print("<html><body>");
        out.print("");
        out.print("</body></html>");*/

        sc.setAttribute("scopeName", "applicationScope 값");

        HttpSession session = request.getSession();
        session.setAttribute("scopeName","sessionScope 값");
        
        request.setAttribute("scopeName", "requestScope 값");
        Member member = new Member("홍길동","hong");
        request.setAttribute("member",member);

        request.getRequestDispatcher("scope.jsp").forward(request,response);
    }




    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        doGet(request, response);
    }
}