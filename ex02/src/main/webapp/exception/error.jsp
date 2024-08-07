<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-29
  Time: 오후 3:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>exception 실습</title>
</head>
<body>
    <h1>divide.jsp 발생된 예외를 처리하는 페이지</h1>
    <%
        out.print("발생된 예외는 : " + exception.getMessage());
    %>
</body>
</html>
