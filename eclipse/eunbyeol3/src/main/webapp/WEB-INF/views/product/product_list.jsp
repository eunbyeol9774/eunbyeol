<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록</title>
</head>
<body>
<h2>상품목록</h2>
<table border = "1">
    <tr>
        <th>상품ID</th>
        <th>상품사진</th>
        <th>상품명</th>
        <th>가격</th>
    </tr>
<c:forEach var="row" items="${list}">

    <tr>
    <td><center>${row.pid}</center>
    </td>
    <td>
    	
   			<img src="/image/${row.pphoto}" width="120px" height="110px">
    	
    </td>
    
    <td>
    	<a href="${path}/product/product_detail/${row.pid}">${row.pname}</a>
    </td>
    <td>
    <fmt:formatNumber value="${row.pprice}" pattern="#,###"/> </td>
    </tr>
    
</c:forEach>
</table>
<br>
<a href="/">처음으로</a>
</body>
</html>

