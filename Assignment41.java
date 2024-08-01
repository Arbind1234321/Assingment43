package Assignment43;
//Write a program to verify if the given String is a Palindrome (Eg: Madam, Radar, Mom, Wow, Dad)
public class Assignment41 {

	public static void main(String[] args) {
		
       String str="M adam";
		 int l=str.length();
		 String rev="";
		 for(int i=l-1;i>=0;i--)
		 {
			 char ch=str.charAt(i);
			    rev=rev+ch;
		 }
		 if(str.equals(rev))
		 {
			 System.out.println("palindrome");
		 }
		 else {
			System.out.println("not palindrome");
		 }
	}

}
