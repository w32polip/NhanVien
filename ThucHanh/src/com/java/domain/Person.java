package com.java.domain;

public class Person {
	private final double LUONG_CO_BAN = 2000000;// 2tr
	private String ten;
	private Address address;
	
	public Person() {
		
	}
	
	
	public Person(String ten) {
		super();
		this.ten = ten;
	}


	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public double luong() {
		return LUONG_CO_BAN;
	}
	
}
