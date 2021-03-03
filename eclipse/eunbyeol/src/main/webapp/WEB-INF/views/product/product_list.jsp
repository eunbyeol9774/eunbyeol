<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
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
    <td>${row.pid}
    </td>
    <td>
    	<a href="${path}/product/product_detail/${row.pid}">
   			<img src="${path}/image/${row.pphoto}" width="120px" height="110px">
    	</a>
    </td>
    
    <td>
    	<a href="${path}/product/product_detail/${row.pid}">${row.pname}</a>
    </td>
    <td>
    <fmt:formatNumber value="${row.pprice}" pattern="#,###"/> </td>
    </tr>
    
</c:forEach>
</table>
</body>
</html>

