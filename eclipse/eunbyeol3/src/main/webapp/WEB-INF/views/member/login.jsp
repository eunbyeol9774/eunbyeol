<%@ page contentType="text/html; charset=euc-kr" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>


<c:if test="${member == null}">

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

<c:if test="${member != null}">
	<p> ${member.userid}�� ȯ���մϴ�.</p>	
	
	<br><br>
	<a href="logout">logout</a>
	<br><br>
</c:if>
	<p>
  		<a href="/">ó������</a>
 	</p>
</body>
</html>