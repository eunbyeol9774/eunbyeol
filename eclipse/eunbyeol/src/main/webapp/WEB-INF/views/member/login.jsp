<%@ page contentType="text/html; charset=euc-kr" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	Object content = (Object)request.getAttribute("member");
%>
<c:if test="${content == null}">
<form role="form" method="post" autocomplete="off">
 		<p>
  			<label for="userid">ID</label>
  			<input type="text" id="userid" name="userid" />
	 	</p>  
 		<p>
  			<label for="userpass">PASS</label>
  			<input type="password" id="userpass" name="userpass" />
 		</p>
 		<p>
   			<button type="submit" >�α���</button>  
 		</p>		
</form>
</c:if>
<c:if test="${msg == false}">
	<p style="color:#f00;"> �α��ο� �����߽��ϴ�. �ٽ� �Է��� �ּ���.</p>
</c:if>

<c:if test="${msg == true}">
	<p>${content.username}�� ȯ���մϴ�.</p>		
</c:if>
	<p>
  		<a href="/">ó������</a>
 	</p>
</body>
</html>