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

	<c:forEach var="row" items="${list}">
		<tr>
			<td> 상품명 </td>
			<td> {row.pname} </td>
		</tr>
		<tr>
			<td> 단가 </td>
			<td> {row.pprice} </td>
		</tr>
		<tr>
			<td> 수량 </td>
			<td> {row.amount} </td>
		</tr>
		<tr>
			<td> 금액 </td>
			<td> {row.pprice} </td>
		</tr>
						   		 	
   	</c:forEach>
</form>
</body>
</html>