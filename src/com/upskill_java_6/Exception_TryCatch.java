package com.upskill_java_6;

public class Exception_TryCatch {

	public static void main(String[] args) {
		// Build-in Exception - Array
		
		try{
			
			int[] ageChewbacca = new int[]{ 25, 26, 60, 45, 55, 35};
		
		System.out.println("Student Age: " + ageChewbacca[6]);

	} 
	catch (Exception e){
		System.out.println("Array Index is not available");
	      e.printStackTrace();
	}

	// Build-in Exception - NumberFormat Exception
	
			
	try{
		int num= Integer.parseInt("Test");
			
			System.out.println("Value of num int: " + num);
		} 
		catch (NumberFormatException e){
			System.out.println("Please enter a  valid number= ");
		      e.printStackTrace();
		}



//User defined Exception 

try{
	throw new myException("Test");	
    }
 catch(myException e){
	 System.out.println("User Defined Exception");
	 e.printStackTrace();	 
                     }

finally {   System.out.println("Test executed successfully"); 
        }
	
}
	}

	