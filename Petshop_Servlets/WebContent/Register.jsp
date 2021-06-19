<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style>
#username,#password,#confirmpassword
{
width:100%;
}
#petshop
{
background-color:black;
color:white;

}
#login
{
float:right;
color:white;
} 

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- <form action="Register.jsp" > -->
<div id="petshop">
PetShop

<a href="Login.jsp"><span id="login">Login</span></a>
</div>
<h2>Register</h2>
<!-- </form> -->
<form action="RegisterServlet" method="post">
Username:<br/>
<input id="username" type="text" name="username" required><br/><br/>

Password:<br/>
<input id="password" type="password" name="password" required><br/><br/>

Confirm Password:<br/>
<input id="confirmpassword" type="password" name="confirmpassword" required><br/><br/>

<input type="submit" value="Register">

</form>
</body>
</html>