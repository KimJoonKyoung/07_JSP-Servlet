<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Todo 목록</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            color: #333;
        }
        h1 {
            background-color: #4CAF50;
            color: white;
            padding: 15px;
            text-align: center;
        }
        .container {
            width: 80%;
            margin: 0 auto;
            padding: 20px;
            background: white;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        ul {
            list-style-type: none;
            padding: 0;
        }
        li {
            background: #e2e2e2;
            margin: 10px 0;
            padding: 10px;
            border-radius: 5px;
        }
        a {
            text-decoration: none;
            color: #4CAF50;
            font-weight: bold;
            padding: 10px;
            display: inline-block;
            margin-top: 10px;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }
        a:hover {
            background-color: #d4e8d4;
        }
    </style>
</head>
<body>
<h1>Todo 목록 보기</h1>
<div class="container">
    <ul>
        <c:forEach var="todo" items="${todoList}">
            <li>${todo}</li>
        </c:forEach>
    </ul>
    <a href="view">상세보기</a>
    <a href="create">새 Todo</a>
</div>
</body>
</html>
