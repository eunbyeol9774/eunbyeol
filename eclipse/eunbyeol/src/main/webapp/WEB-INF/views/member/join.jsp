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
  <label for="userid">아이디</label>
  <input type="text" id="userid" name="userid" />
 </p>  
 <p>
  <label for="userpass">패스워드</label>
  <input type="password" id="userpass" name="userpass" />
 </p>
 <p>
  <label for="username">닉네임</label>
  <input type="text" id="username" name="username" />
 </p>
 <p>
   <button type="submit" id="submit" >가입</button>  
 </p>
 <p>
  <a href="/">처음으로</a>
 </p>
 
</form>
</body>
</html>
