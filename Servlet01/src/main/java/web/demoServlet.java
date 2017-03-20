package web;

import entity.Course;
import entity.Students;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by a07 on 2017/2/13.
 */
public class demoServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        Students s=new Students();
        s.setName("cang");
        s.setAge(40);
        s.setSex("M");
        s.setInterests(
                new String[]{"篮球","足球","排球"});

        Course c=new Course();
        c.setCourseId(1);
        c.setName("Java");
        c.setDays(80);
        s.setCourse(c);

        req.setAttribute("ss",s);
        req.getRequestDispatcher("").forward(req,res);
    }
}
