<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script>
	$(document.ready(function){

    	$("#btnList").click(function(){
        	location.href="${path}/product/list.do";
    	});

	});
</script>
</head>
<body>
<h2>장바구니</h2>
<c:choose>
    <c:when test="${map.count == 0 }">
        장바구니가 비었습니다.
    </c:when>
    
    <c:otherwise>
        <form id="form1" name="form1" method="post" action="${path}/cart/update.do">
            <table border="1" width="400px">
                <tr>
                    <th>상품명</th>
                    <th>단가</th>
                    <th>수량</th>
                    <th>금액</th>
                    <th>&nbsp;</th>
                </tr>
               
            <c:forEach var="row" items="${map.list}" varStatus="i">
                <tr align="center">
                    <td>${row.pname}</td>                    
                    <td><fmt:formatNumber value="${row.pprice}"
                            pattern="#,###,###" /></td>
                  	<td><input type="number" name="amount" 
                        style="width:30px;"
                        value="<fmt:formatNumber value="${row.amount}"
                            pattern="#,###,###" />">
                            <input type="hidden" name="cart_id"
                            value="${row.cart_id}">                            
                    </td>
                    <td><fmt:formatNumber value="${row.money}"
                            pattern="#,###,###" /></td>
                    <td><a href= "${path}/cart/delete.do?cart_id=${row.cart_id}">[삭제]</a>
                    </td>
                </tr>
            </c:forEach>
     <tr>
        <td colspan="5" align="right">
                        장바구니 금액 합계 : <fmt:formatNumber value="${map.sumMoney}" pattern="#,###,###" /><br>                        
                        총합계 : <fmt:formatNumber value="${map.sum}" pattern="#,###,###" />
        </td>
     </tr>
     </table>
     <button id="btnUpdate">수정</button>
     <button type="button" id="btnDelete">장바구니 비우기</button>
   </form>
   </c:otherwise>
</c:choose>
<button type="button" id="btnList">상품목록</button>
</body>
</html>
