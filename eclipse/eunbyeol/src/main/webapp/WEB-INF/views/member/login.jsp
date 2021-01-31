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
   <button type="submit" id="submit" >로그인</button>  
 </p>
 <p>
  <a href="/">처음으로</a>
 </p>
  <c:if test="${msg == false}">
   <p style="color:#f00;">로그인에 실패했습니다.</p>
  </c:if>
</form>
</body>
</html>
