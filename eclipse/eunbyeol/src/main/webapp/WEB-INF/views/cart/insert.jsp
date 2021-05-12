<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="${path}/cart/list.do">
	<input type="hidden" name="pname" value="${product.pname}">
	<input type="hidden" name="pprice" value="${product.pprice}"> 
    <input type="hidden" name="amount" value="${cart.amount}">
	
</form>
</body>
</html>

