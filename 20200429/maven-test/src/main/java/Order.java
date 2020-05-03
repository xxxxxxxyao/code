import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/order")
public class Order extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        PrintWriter pw=resp.getWriter();
        //对敏感资源进行登录校验
        HttpSession session=req.getSession(false);
        if(session==null){
            resp.sendRedirect(req.getContextPath()+"/index.html");
        }else{
            pw.println("<h2>已登录</h2>");
            pw.flush();
        }
    }
}
