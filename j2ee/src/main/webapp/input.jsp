<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	 <%
	 
	 int n = Integer.parseInt(request.getParameter("num1"));
	 for(int i =0; i<n ; i++){
		 for(int j =0; j<n; j++){
			 out.print("* ");
		 }
		 out.println("<br>");
	 }
	 %>
</body>
</html>