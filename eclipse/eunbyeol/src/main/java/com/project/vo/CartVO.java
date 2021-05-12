package com.project.vo;

public class CartVO {
	
	private int cart_id;
	private String userid;
	private String username;
	private int pid;
	private String pname;
	
	
	public int getCart_id() {
		return cart_id;
	}
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	public String getUser_id() {
		return userid;
	}
	public void setUser_id(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	private int pprice;
	private int money;
	private int amount;
	public void setUserid(String userid) {
		// TODO Auto-generated method stub
		
	}
	public static int sumMoney(String userid) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
	
