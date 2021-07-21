<%@ page contentType="text/html; charset=euc-kr" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
  <label for="username">NAME</label>
  <input type="text" id="username" name="username" />
 </p>
 <p>
  <label for="userphon">PHONE</label>
  <input type="text" id="userphon" name="userphon" />
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
