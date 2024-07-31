package Assignment43;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Vector;

//Write a -all method programm for ArrayList,LinkedList,Vector,Priority Queue,HashSet,treeSet,LinkedHashSet and
//check wheather it is accepting Index,Null,Duplicate,Sort,
//Order of index,Dynamic, Hetrogenius values(As per class30)
public class Assignment49 {

	public static void main(String[] args) {
	ArrayList l=new ArrayList<>();
	l.add(1);
	l.add("arbind");
	l.add(null);
	System.out.println(l);
	l.add(2, "kumar");
	l.remove(0);
	System.out.println(l);
	System.out.println(l.contains(null));
	LinkedList ll=new LinkedList<>();
	ll.add(1);
	ll.add("Arbind");
	ll.add(null);
	System.out.println(ll);
	ll.remove(0);
	System.out.println(ll);
	
	Vector v=new Vector<>();
	v.add(0);
	v.add("arbind");
	v.add(null);
	v.add(null);
	v.add(0);
	System.out.println(v);
	System.out.println(v.capacity());
	
	PriorityQueue q=new PriorityQueue();
	q.add("1");
	q.add("Arbind");
	q.add("kumar");
	//q.add(null);
	System.out.println(q);
	q.add("arbind");
	
	HashSet hs=new HashSet<>();
	hs.add(1);
	hs.add(null);
	hs.add("arbind");
	System.out.println(hs);
	
	

	}

}
