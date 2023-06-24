package com.java.domain;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] emps = new Employee[3];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vui long nhap vao thong tin cua 3 nhan vien");
		
		for (int i = 0; i < emps.length; i++) {
			String tenDuong = scan.nextLine();
			String ten = scan.nextLine();
			int soNamKN = scan.nextInt();
			
			Address add = new Address(tenDuong);
			Employee emp = new Employee(ten, soNamKN);
			emp.setAddress(add);
			emps[i] = emp;
			
			//Xoa bo nho dem
			scan.nextLine();
				
			}
		
			System.out.println("Thong tin nhan vien nhap vao");
			for(Employee emp: emps) {
				System.out.println(emp.getTen() + " dia chi " + emp.getAddress().getTenDuong()+ " luong " + emp.luong());
			
			
		}
	}

}
