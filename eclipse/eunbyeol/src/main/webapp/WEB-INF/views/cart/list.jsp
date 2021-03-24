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
<h2>��ٱ���</h2>
<c:choose>
    <c:when test="${map.count == 0 }">
        ��ٱ��ϰ� ������ϴ�.
    </c:when>
    
    <c:otherwise>
        <form id="form1" name="form1" method="post" action="${path}/cart/update.do">
            <table border="1" width="400px">
                <tr>
                    <th>��ǰ��</th>
                    <th>�ܰ�</th>
                    <th>����</th>
                    <th>�ݾ�</th>
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
                    <td><a href= "${path}/cart/delete.do?cart_id=${row.cart_id}">[����]</a>
                    </td>
                </tr>
            </c:forEach>
     <tr>
        <td colspan="5" align="right">
                        ��ٱ��� �ݾ� �հ� : <fmt:formatNumber value="${map.sumMoney}" pattern="#,###,###" /><br>                        
                        ���հ� : <fmt:formatNumber value="${map.sum}" pattern="#,###,###" />
        </td>
     </tr>
     </table>
     <button id="btnUpdate">����</button>
     <button type="button" id="btnDelete">��ٱ��� ����</button>
   </form>
   </c:otherwise>
</c:choose>
<button type="button" id="btnList">��ǰ���</button>
</body>
</html>
