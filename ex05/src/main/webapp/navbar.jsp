<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-31
  Time: 오후 5:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${empty user}">
    <a href="login_form.jsp">로그인</a> | <a href="#">회원가입</a>
</c:if>
<c:if test="${!empty user}">
    <a href="#">${user.name}님의 정보</a> | <a href="#">로그아웃</a>
</c:if>
<hr>

<c:if test="${role == 'ADMIN'}">관리자</c:if>
<c:if test="${role != 'ADMIN'}">일반회원</c:if>