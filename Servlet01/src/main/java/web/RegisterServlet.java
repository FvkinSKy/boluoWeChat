package web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by a07 on 2017/2/12.
 */
public class RegisterServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String account = req.getParameter("account");
        String pwd = req.getParameter("pwd");
        String sex = req.getParameter("sex");
        String[] likes = req.getParameterValues("like");
        System.out.println("account  " + account);
        System.out.println("pwd " + pwd);
        System.out.println("sex " + sex);

        if (likes!=null) {
            for (String like:likes){
                System.out.println("like "+like);
            }
        }

        res.setContentType("text/html;charset=utf-8");
        PrintWriter writer=res.getWriter();
        writer.print("<h1>"+"注册成功"+"</h1>");
        writer.close();
    }
}
