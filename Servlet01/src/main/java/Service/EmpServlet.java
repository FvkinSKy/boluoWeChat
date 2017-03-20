package Service;

import Dao.EmpDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by a07 on 2017/2/13.
 */
public class EmpServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        EmpDao dao = new EmpDao();
//        List<Emp> list = dao.findAll();
        //转发
        req.getRequestDispatcher("find.jsp").forward(req,res);

    }
}
