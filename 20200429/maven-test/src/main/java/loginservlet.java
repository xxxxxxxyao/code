import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class loginservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        String username=req.getParameter("username");
        String password=req.getParameter("password");

        PrintWriter pw=resp.getWriter();
        if("abc".equalsIgnoreCase(username) && "123".equalsIgnoreCase(password)){
            //pw.println("<p>登陆成功</p>");
            //重定向
            HttpSession session=req.getSession();
            session.setAttribute("user","username="+username);
            resp.sendRedirect(req.getContextPath()+"/main.html");
        }else{
            //转发
            req.getRequestDispatcher("/error.html").forward(req,resp);
        }
        pw.flush();
    }
}
