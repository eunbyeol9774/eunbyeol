<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 상세 정보</title>
</head>
<body>
<h2>상품 상세 정보</h2>
<table border="1">
	<tr>
		<td>
			<img src="${path}/image/${vo.pphto}" width="340" height="300">
		</td>
		<td>
			<table border="1" style="height:300px; width: 400px;">
				<tr align="center">
					<td>상품명</td>
					<td>${vo.pname}</td>
				</tr>
				<tr align="center">
					<td>가격</td>
					<td><fmt:formatNumber value="${vo.pprice}" pattern="###,###,###"/></td>
				</tr>
				<tr align="center">
					<td>상품 소개</td>
					<td>${vo.pdetail}</td>
				</tr>
				
				<tr align="center">
					<td colspan="2">
						<form name="form1" method="post" action="${path}/product/cart.do">
							<input type="hidden" name="pid" value="${vo.pid}">
							<select name="amount">
								<c:forEach begin="1" end="5" var="i">
									<option value="${i}">${i}</option>
								</c:forEach>
							</select>&nbsp;개 
							<input type="submit" value="장바구니에 담기">
						</form>
						
						<br>
						
						<a href="${path}/product/product_list.do">상품 목록으로</a>
						
						
						
						
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>						
							
</body>
</html>