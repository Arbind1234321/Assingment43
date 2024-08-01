package Assignment43;
//Write a program to Perform String Reversal
public class Assignment40 {

	public static void main(String[] args)
	{
		  String str="Madam";
			 int l=str.length();
			 String rev="";
			 for(int i=l-1;i>=0;i--)
			 {
				 char ch=str.charAt(i);
				    rev=rev+ch;
			 }
			 System.out.println(rev);
	}

}
