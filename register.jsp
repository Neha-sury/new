<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
      <h2>Register Page</h2>
      <div align ="center">
      <h1 style ="color:Red">Student Management System</h1>
      <form action="Register_Servlet" method="post">
      <table style="width: 50">
      <tr>
      <td>Student id</td>
      <td><input type="text" name="id"></td>
      </tr>
      
      <tr>
      <td>Student Name</td>
      <td><input type="text" name="name"></td>
      </tr>
      
       <tr>
      <td>Username</td>
      <td><input type="text" name="uname"></td>
      </tr>
   
      
      <tr>
      <td>Password</td>
      <td><input type="text" name="password"></td>
      </tr>
      
      <tr>
      <td>City</td>
      <td><input type="text" name="city"></td>
      </tr>
      
      <tr>
      <td>Contact</td>
      <td><input type="text" name="contact"></td>
      </tr>
      </table>
      <br></br>
      
      <input type="submit" value="submit">
      <input type="reset" value="reset">
      <br></br>
      <a href="login.jsp"></a>
      </form> 
      </div>
 
</body>
</html>