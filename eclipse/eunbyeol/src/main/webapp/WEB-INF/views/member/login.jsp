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
            alert("���̵� �Է��ϼ���.");
            $("#userid").focus();
            return;
        }
        if(userpass == ""){
            alert("��й�ȣ�� �Է��ϼ���.");
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
   			<button type="submit" id="submit" >�α���</button>  
 		</p>
 			<c:if test="${msg == 'nologin' }">
 				<div style="color: red;">���� �α��� �ϼ���.</div>
           	</c:if> 
            <c:if test="${msg == 'error' }">
            	<div style="color: red;">���̵� �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.</div>
           	</c:if>  
           	<c:if test="${msg == 'logout' }">
                <div style="color: red;">�α׾ƿ� �Ǿ����ϴ�.</div>
            </c:if>
 		<p>
  				<a href="/">ó������</a>
 		</p>
</form>

 


</body>
</html>
