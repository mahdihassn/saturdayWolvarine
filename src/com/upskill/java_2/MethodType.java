package com.upskill.java_2;

public class MethodType {
	
	public static int hourlyIncome =65;

	public static void main(String[] args) {
		MethodType myjob = new MethodType();
		myjob.AnnualIncomeVoid();
		
		weeklyIncomeStatic();
		
		System.out.println("My Monthly Income= " + myjob.monthlyIncomeReturn());
	

	}
	
	//void method
	public void AnnualIncomeVoid(){
		 int calculateAnnualIncome = hourlyIncome* 65;
		 System.out.println("My Annual Income= " + calculateAnnualIncome);
		 
		 
		 
	}
	
	//static Method
	public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyIncome * 65;
		System.out.println("My Weekly Income="   + calculateWeeklyIncome);
				
	}
				
				
				
			
					
	
	
	//return type method
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome * 65;
		return calculateMonthlyIncome;
	 
}
}