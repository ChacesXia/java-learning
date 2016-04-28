package demo.collection;

//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	public static void main(String[] agrs){
		List<Object> list = new ArrayList<Object>();
		for(int i=0;i<20;i++){
			list.add(i);
		}
		List <Integer> list2 = new LinkedList<Integer>();
		for(int i=50;i>10;i--){
			list2.add(i);
		}
		
		Collections.sort(list2);
		Collections.shuffle(list2);
		System.out.println(list2.retainAll(list));
//		System.out.println(Collections.shuffle(list2));
//		list.retainAll();
		System.out.println(list.containsAll(list.subList(4, 9)));
		for(Object i: list){
			System.out.print(i+" ");
		}
	}
}
