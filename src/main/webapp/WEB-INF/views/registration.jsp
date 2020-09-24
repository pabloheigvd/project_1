<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Register Account</title>
</head>
<body>

<div id="navbar">
    <%@ include file="fragments/navbar.jsp" %>
</div>

<h1>Register Account</h1>
    <form action="${pageContext.request.contextPath}/register.do" method="post">
        <p>Username</p>
        <input type="text" placeholder="username" name="username" required/>
        <p>Password</p>
        <input type="password" placeholder="password" name="password" required/>
        <input type="submit" value="Register">
    </form>
</body>
</html>
