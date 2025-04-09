package tns.com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> list= new ArrayList<Integer>();
        
        System.out.println("the size of the ArrayList " +list.isEmpty());
        System.out.println("the size of the ArrayList " +list.size());
        list.add(2);
        list.add(7);
        list.add(222);
        list.add(null);
      //Collections.sort(list);
        System.out.println("the size of the ArrayList " +list.size());
        System.out.println(list);
        System.out.println(list.contains(55));
        list.remove(1);
        System.out.println(list);
	System.out.println("element that the position" +list.get(0));
}
}
        