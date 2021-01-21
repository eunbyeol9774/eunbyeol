package com.project.vo;


import java.util.Date;

public class MemberVO {
	
	private String userid;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Integer getUserphon() {
		return userphon;
	}
	public void setUserphon(Integer userphon) {
		this.userphon = userphon;
	}
	private String userpass;
	private String username;
	private Date regdate;
	private Integer userphon;
	

}
