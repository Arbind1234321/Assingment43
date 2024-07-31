package Assignment43;

import java.util.ArrayList;

//Write a addAll method(index int,collection c) program in Arraylist(As per class 31)
public class Assignment50 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("arbind");
		list.add(1);
		list.add(null);
		list.add("kumar");
		System.out.println(list);
		list.addAll(2, list);
		System.out.println(list);
		

	}

}
