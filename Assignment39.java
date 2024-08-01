package Assignment43;

import java.util.Arrays;
import java.util.Scanner;

//Perform array for boolean and double datatype and write down their values from scanner class.
public class Assignment39 {

	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 double d[]=new double[2];
	 boolean b[]=new boolean[2];
	 System.out.println("Enter double value");
	 for(int i=0;i<2;i++)
	 {
		 d[i]=sc.nextDouble();
	 }
	 System.out.println("Enter boolean value");
	 for(int i=0;i<2;i++)
	 {
		 b[i]=sc.nextBoolean();
	 }
	 System.out.println(Arrays.toString(d));
	 System.out.println(Arrays.toString(b));
	 

	}

}
