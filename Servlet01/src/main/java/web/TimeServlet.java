package web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by a07 on 2017/2/12.
 */
public class TimeServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter writer=res.getWriter();
        Date date=new Date();
        SimpleDateFormat format=new SimpleDateFormat("HH:mm:ss");
        String now=format.format(date);
        writer.println("<h1>"+now+"</h1>");
        writer.close();
    }
}
