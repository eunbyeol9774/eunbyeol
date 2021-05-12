<%@ page contentType="text/html; charset=euc-kr" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script>

$(document).ready(function){
	
    $("#btnlogin").click(function(){
        var userid = $("#userid").val();
        var userpass = $("#userpass").val();
        if(userid==""){
            alert("아이디를 입력하세요.");
            $("#userid").focus();
            return;
        }
        if(userpass == ""){
            alert("비밀번호를 입력하세요.");
            $("#userpass").focus();
            return;
        }
        
        document.form1.action = "${path}/member/logincheck.do";
        document.form1.submit();
    });
});
</script>
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
 			<c:if test="${msg == 'nologin' }">
 				<div style="color: red;">먼저 로그인 하세요.</div>
           	</c:if> 
            <c:if test="${msg == 'error' }">
            	<div style="color: red;">아이디 또는 비밀번호가 일치하지 않습니다.</div>
           	</c:if>  
           	<c:if test="${msg == 'logout' }">
                <div style="color: red;">로그아웃 되었습니다.</div>
            </c:if>
 		<p>
  				<a href="/">처음으로</a>
 		</p>
</form>

 


</body>
</html>
