<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
h2
{
background-color:black;
color:white;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 

<form action="AddPetServlet" method="post"> 
<h2>AddPets</h2>
ID:</br>
<input type="text" name="id"/><br/><br/>   
Name:</br>
<input type="text" name="petname"/><br/><br/>  
Age:</br>
<input type="text" name="age"/><br/><br/>
Place:</br>
<input type="text" name="place"/><br/><br/> 
<input type="submit" value="Add Pet"/>  
</form>  

</body>
</html>