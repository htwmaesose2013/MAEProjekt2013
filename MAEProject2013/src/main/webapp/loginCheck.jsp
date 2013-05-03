<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 
<%
String loginName = request.getParameter("loginName");
String password = request.getParameter("password");
 
if(loginName.equals("simon"))
{
    if(password.equals("itblogging"))
    {
        out.println("Benutzername und Passwort wurden korrekt eingegeben");
    }else
    {
        out.println("Das Passwort ist falsch. Bitte versuche es erneut<br />");
        out.println("<a href='index.jsp'>Hier</a> geht es zur&uuml;ck zur Eingabemaske!");
    }
     
}else
{
    out.println("Benutzername nicht vorhanden<br />");
    out.println("<a href='index.jsp'>Hier</a> geht es zur&uuml;ck zur Eingabemaske!");
}
%>
 
</body>
</html>