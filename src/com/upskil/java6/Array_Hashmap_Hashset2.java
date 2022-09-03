package com.upskil.java6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset2 {

	public static void main(String[] args) {
		int age = 34;
		int[]ageWolvarine = new int[]{24, 28, 30, 35,29, 40};
		
		//Array Index   [0] [1] [2] [3] [4] [5]
		
		System.out.println("student Age:" +ageWolvarine[5]);
		System.out.println("Total student:" +ageWolvarine.length);
		
		String[]nameWolverine = new String[]{"Ansarul","Liaqath","Sheakh","Omar","Rusthi","Adnan"};
		System.out.print("Student Name:" + nameWolverine[3]);
		
		//Multi-dimentional Array
		
		int[][] ageWolverine2D = { {24, 28, 30, 35,29, 40},//[0][0] [0][1][2][0][3][0][4]0[][5]
				                 {35, 22, 27}};            //[1][0] [1][1] [1][2]  
		
		System.out.println("Student Age 2D:" + ageWolverine2D[0][3]);
		
		//Hash store multipul data using key-value pair,Implementation of Map interface
		
		HashMap<String,Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Ansarul", 28);
		Student.put("Omar", 25);
		Student.put("Ruddi", 27);
		Student.put("Sheak", 30);
		Student.put("Liquat", 35);
		
		System.out.println("Stusent Age:" +Student.get("Omar"));
		System.out.println("Stusent Age:" +Student.get("Ansarul"));
		
		//Hashset store unordered collection containing unique value, Implementation of set interface
		
		HashSet<String> car = new HashSet<String>();
		
		car.add("BMW");
		car.add("Audi");
		car.add("Ford");
		
		System.out.println("Car:" + car);
		
		//HashTable store multiple data using key-value pair, implementation of Map interface
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		
		Region.put("BD", "Asia");
		
		

		}

	}



