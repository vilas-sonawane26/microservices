<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H1>${loginPageHeader}</H1>

<form method="POST">
 <table>
   <tr>
     <td>
      Name : <input type="text" name="name" size="10"/>
     </td>
   </tr>
   <tr>
    <td>
      Password: <input type="password" name="password" size="10">
    </td>
   </tr>
   <tr> <td><button type="submit" value="Submit">Submit</button> </td></tr>
   <tr> <td> <a href="/register">New Registration</a> </td></tr>
 </table>
</form>
</body>
</html>