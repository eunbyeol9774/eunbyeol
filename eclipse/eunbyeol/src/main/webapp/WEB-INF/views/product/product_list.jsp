<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>��ǰ���</h2>
<table border = "1" width = "500px">
    <tr>
        <th>��ǰID</th>
        <th>��ǰ����</th>
        <th>��ǰ��</th>
        <th>����</th>
    </tr>
<c:forEach var="row" items="${list }">
    <tr align = "center">
    <td>${row.pid }</td>
    <td><img src="${path }/image/${row.pphoto}"
    width="100" height = "100"></td>
    <td>${row.pname }</td>
    <td>
    <fmt:formatNumber value="${row.price}" pattern="#,###" /> </td>
    </tr>
    
</c:forEach>
</table>
</body>
</html>

</body>
</html>