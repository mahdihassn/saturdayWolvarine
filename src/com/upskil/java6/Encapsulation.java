package com.upskil.java6;

public class Encapsulation {
	
	//Encapsulation used to hide the data by using setter and getter method
	
	private int ssn = 45358475;       //write only
	private String username = "ansarul"; //read only
    private String name = "upskill";//write & read
    
    //setter method
    public void setName(String value){      //set the data
    	name = value;
    }
    
    //getter method                         //get the data
    public String getName(){
    	return name;
    }
    //setter method ssn
    public void setssn(int value){
    	  ssn = value;
    }
    //getter method  username
    public String getusername(){
    	return username;
    }
     
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("ansarul");
		obj.getName();
		obj.setssn(45768456);
		obj.getuserName();
		System.out.println(obj.getName());
		
	
	 
		

	}

}
