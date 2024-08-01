package Assignment43;
//Write a program to find out whitespaces, numeric values and special characters in a given  string (Eg: Name123, 50cents) 
public class Assignment45 {

	public static void main(String[] args) {
		String str="Arbind kumar@#123";
		char ch[]=str.toCharArray();
		int Acount=0,wcount=0,dcount=0,scount=0;
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isAlphabetic(ch[i])) {
				Acount++;
			}
			else if(Character.isWhitespace(ch[i]))
			{
			  wcount++;
			}
			else if(Character.isDigit(ch[i]))
			{
				dcount++;
			}
			else {
				scount++;
			}
		}
		System.out.println(Acount);
		System.out.println(wcount);
		System.out.println(dcount);
		System.out.println(scount);

	}

}
