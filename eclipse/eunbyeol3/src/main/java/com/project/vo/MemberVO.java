package com.project.vo;

import java.util.Date; 

public class MemberVO {

	private String userid;
	private String userpass;
	private String username;
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
	public Integer getUserphon() {
		return userphon;
	}
	public void setUserphon(Integer userphon) {
		this.userphon = userphon;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	private Integer userphon;
	private Date regdate;
	
}
