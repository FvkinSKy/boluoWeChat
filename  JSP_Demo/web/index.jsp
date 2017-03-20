<%@ page import="java.util.Date" %>
<%@ page import="java.util.logging.SimpleFormatter" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: a07
  Date: 2017/2/13
  Time: 下午10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <div>
    <%
      Date date=new Date();
      SimpleDateFormat format=new SimpleDateFormat("HH:mm:ss");
      String now=format.format(date);
    %>
    <%
      out.print(now.toString());
    %>
  </div>
  </body>
</html>
