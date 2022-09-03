package com.upskill.java_2;

public class IfElseStatement {

static int age = 99;
	 
	public static void main(String[] args) {
	age();

	}
 public static void age(){
	 
	if (age <13){
		
		System.out.println("YOU are children");
	} else if (age >13 && age <18) {
		System.out.println("YOU are Teenager");
	}else if (age >= 60){
		//Nested if Else Statement
		if(age >100){
			System.out.println("YOU are Hero");	
		} else {
		System.out.println("YOU are senior");
		}
	}else {
		System.out.println("YOU are adult");
	}
 
}
}