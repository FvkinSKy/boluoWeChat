<%@ page import="Dao.EmpDao" %>
<%@ page import="java.util.List" %>
<%@ page import="entity.Emp" %><%--
  Created by IntelliJ IDEA.
  User: a07
  Date: 2017/2/13
  Time: 下午10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>职员表</title>
</head>
<body>
    <%
        EmpDao dao=new EmpDao();
        List<Emp> list=dao.findAll();
    %>
    <%
        for (Emp e:list){
            out.print(e.getAge());
            out.print(e.getName());
            out.print(e.getSex());
        }
    %>
</body>
</html>
