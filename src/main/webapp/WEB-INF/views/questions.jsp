<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List of questions</title>
</head>
<body>
<h2>List of questions</h2>
<ul>
    <c:forEach items="${questions}" var="question">
        <li>${question.author} : "${question.question}"</li>
    </c:forEach>
</ul>
</body>
</html>
