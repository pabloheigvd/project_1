<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Register Account</title>
</head>
<body>
<h1>Register Account</h1>
    <form action="RegisterCommandServlet" method="post">
        <p>Username</p>
        <input type="text" placeholder="username" name="username" required/>
        <p>Password</p>
        <input type="password" placeholder="password" name="password" required/>
        <input type="submit" value="Register">
        <a href="index.jsp">Already have Account?</a>
    </form>
</body>
</html>
