<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List of questions</title>
</head>
<body>
<div id="navbar">
    <%@ include file="fragments/navbar.jsp" %>
</div>
<h1>List of questions</h1>

<ul>
    <c:forEach items="${questions}" var="question">
        <li>"${question.question} - ${question.author}"</li>
    </c:forEach>
</ul>
</body>
</html>
