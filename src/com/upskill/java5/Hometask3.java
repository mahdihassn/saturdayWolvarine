package com.upskill.java5;

public class Hometask3 {
	
	public static int a;
	public static int b;
	
	public static void main(String[]args){
		a = myFunction1();
		b = myFuction2();
		myMethod();
	}
	public static int myFunction1(){
		  return 55;
	}
	public static int myFuction2(){
		return 65;
	}
	public static void myMethod(){
		if(a>b);{
			System.out.println("1st Function is bigger then 2nd Fuction");}
		if(a<b);{
		System.out.println("2nd Function is bigger then 1st Fuction");}
		
	}

}
