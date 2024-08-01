package Assignment43;
//Write a program to find out alphabets in a given string (Eg: Name123, 50cents)
public class Assignment44 {

	public static void main(String[] args) {
	 String str="Name123, 50cents";
	 char ch[]=str.toCharArray();
	 int count=0;
	 for(int i=0;i<ch.length;i++)
	 {
		 if(Character.isAlphabetic(ch[i]))
		 {
			 count++;
		 }
	 }
   System.out.println(count);
	}

}
