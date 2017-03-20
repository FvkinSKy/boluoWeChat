<%--
  Created by IntelliJ IDEA.
  User: a07
  Date: 2017/2/13
  Time: 下午11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>JSTL & EL</title>
</head>
<body>
<h1>jstl</h1>
<%--if--%>
<p>
    <c:if test="${ss.sex=='M' }">男</c:if>
    <c:if test="${ss.sex=='W' }">女</c:if>
</p>
<%--choose--%>
<p>
    <c:choose>
        <c:when test="${ss.sex=='M' }">男</c:when>
        <c:otherwise>女</c:otherwise>
    </c:choose>
</p>
<p>
    <c:forEach items="${ss.interests }"
         var="i"  varStatus="s">
        ${i } ${s.index}
    </c:forEach>
</p>


<h1>EL</h1>
<p>姓名:${ss.name}</p>
<p>年龄:${ss.age}</p>
</body>
</html>
