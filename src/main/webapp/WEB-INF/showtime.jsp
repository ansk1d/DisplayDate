<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/css/style.css">
    <script type="text/javascript" src="/js/app.js"></script>
<title>Time</title>
</head>
<body onload=alerttime()>
	<p class="text"> <c:out value="${time}" /> </p>
       
</body>
</html>