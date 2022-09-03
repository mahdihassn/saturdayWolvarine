package com.upskil.java6;

public class polimorphism {

	public static void main(String[] args) {
	car();	
	car(4);
	car(2, 4);
	car("Red");
	}
	public static void car(){
		System.out.println("My car is Audi !");	
	}
	public static void car(int door){
		System.out.println("My car is Audi. it has door:+ ");
	}
	public static void car(int door,int Wheel){
		System.out.println("My car is Audi, it has door: "+ door +"Wheel : " + Wheel);	
	}
	
	public static void car(String color){
		System.out.println("My car is Audi,it has color:"+ color);
	}
	
	
	//method overriding
	
	public static void weeklyIncomeStatic(){
		int hourlyIncome = 75;
		int calculateWeelyIncome = hourlyIncome * 40;
		System.out.println("My weekly Income = "+  calculateWeelyIncome);
		
		int businessIncome = 2000;
				int newIncome =  calculateWeelyIncome+businessIncome;
		
		System.out.println("My Weekly Income including business = "+ newIncome);
		
	}
}