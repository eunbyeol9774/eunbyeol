<%@ page contentType="text/html; charset=euc-kr" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<section id="content">
 <form role="form" method="post" autocomplete="off">
  <div class="input_area">
   <label for="userid">���̵�</label>
   <input type="email" id="userid" name="userid" placeholder="example@email.com" required="required" />      
  </div>
  
  <div class="input_area">
   <label for="userpass">�н�����</label>
   <input type="password" id="userpass" name="userpass" required="required" />      
  </div>
  
  <div class="input_area">
   <label for="username">�г���</label>
   <input type="text" id="username" name="username" placeholder="�г����� �Է����ּ���" required="required" />      
  </div>
  
  <div class="input_area">
   <label for="userphon">����ó</label>
   <input type="text" id="userphon" name="userphon" placeholder="����ó�� �Է����ּ���" required="required" />      
  </div>
  
  <button type="submit" id="signup_btn" name="signup_btn">ȸ������</button>
  
 </form>   
</section>