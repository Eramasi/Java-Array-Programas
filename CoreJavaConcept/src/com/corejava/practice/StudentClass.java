package com.corejava.practice;

public class StudentClass {
	int rollnum;
	String studentName;
	Address StudentAddr;
	StudentClass(int sturoll, String StuName, Address adr)
	{
		this.rollnum=sturoll;
		this.studentName=StuName;
		this.StudentAddr=adr;
		
	}

	public static void main(String[] args) {
		Address ad=new Address(10,"KLD","ATP","Hyderabad");
		StudentClass obj=new StudentClass(15, "Chakravarthi Chowdary", ad);
		
		System.out.println(obj.rollnum);
		System.out.println(obj.studentName);
		System.out.println(obj.StudentAddr.streetNum);
		System.out.println(obj.StudentAddr.city);
		System.out.println(obj.StudentAddr.State);
		System.out.println(obj.StudentAddr.country);
		
		int a=15;
		int b=23;
		
		System.out.println(a+b);
		
		
		
		

	}

}
