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
   <label for="userid">아이디</label>
   <input type="email" id="userid" name="userid" placeholder="example@email.com" required="required" />      
  </div>
  
  <div class="input_area">
   <label for="userpass">패스워드</label>
   <input type="password" id="userpass" name="userpass" required="required" />      
  </div>
  
  <div class="input_area">
   <label for="username">닉네임</label>
   <input type="text" id="username" name="username" placeholder="닉네임을 입력해주세요" required="required" />      
  </div>
  
  <div class="input_area">
   <label for="userphon">연락처</label>
   <input type="text" id="userphon" name="userphon" placeholder="연락처를 입력해주세요" required="required" />      
  </div>
  
  <button type="submit" id="signup_btn" name="signup_btn">회원가입</button>
  
 </form>   
</section>