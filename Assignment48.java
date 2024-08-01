package Assignment43;

import java.util.Scanner;

//"Write a program try and catch similar Nested ifelse using Scanner (Class 29)
public class Assignment48 {

	public static void main(String[] args) 
	{
		
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter number");
     try {
    	 int a=sc.nextInt();
     }
     catch(Exception e)
     {
    	 Scanner sc1=new Scanner(System.in);
    	 System.out.println("Enter proper number");
    	 try {
    		 int a=sc1.nextInt();
    	 }catch (Exception a) 
    	 {
		    System.out.println("enter wrong number");	
		}
      System.out.println("you enter proper number");	 
    	
     }
     
	}

}
