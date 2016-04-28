package genericityclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class GenericityClass<T> {
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}
class TestG{
	public static void main(String[] args) {
		GenericityClass<String> ss = new GenericityClass<String>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		String [] arr =new String[3];
		arr[0]="88388";
		arr[1]="8838fdafdsa8";
		arr[2]="88dadafdafd";
		al.add(443);
		al.add(5);
		al.add(45);
		System.out.println(al.toString());
		System.out.println(Arrays.toString(arr));
		ss.setObj("sssssssssssss");
		System.out.println(ss.getObj());
//		collection learning
		Collection<String> collection = new ArrayList<String>();
		collection.add("one");
		collection.addAll(Arrays.asList("two","three","four"));
		collection.addAll(Arrays.asList(arr));
		
		Collections.addAll(collection, arr);
		
		System.out.println(collection.toString());
		
		Integer[] moreInt = {1,2,3,4};
		List<Integer> list = new ArrayList<Integer>( Arrays.asList(moreInt));
		list.set(2, 99);
		list.add(66);
		List<Integer> list2 = new ArrayList<Integer>();
		
		System.out.println(list.toString());
//		map class test
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "xwj");
		map.put(2, "xc");
		
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("x444c"));
		System.out.println(map.get(2));
		System.out.println(map.toString());
//		stack class test
		Stack<String> stack = new Stack<String>();
		stack.add("h");
		stack.add("e");
		stack.add("l");
		stack.add("l");
		stack.add("o");
		System.out.println(stack.peek());
		System.out.println(stack.push("iii"));
		System.out.println(stack.pop());
		System.out.println(stack.search(""));
		System.out.println(stack.toString());
		
//		set class test
		Set<Integer> intset = new HashSet<Integer>();
		Random rand = new Random(47);
		for(int i=0;i<100;i++){
			intset.add(rand.nextInt(30));
		}
		System.out.println(intset);
		
		Set<String> strset = new TreeSet<String>();
		for(int i=0;i<100;i++){
			int num = rand.nextInt(30);
			strset.add(num + "");
		}
		Collections.addAll(strset, "I am a djjja dadfa da dsad a fdad fa sdf ads fa df asd fa sd".split(" "));
		System.out.println(strset.contains("22"));
		System.out.println(strset.contains("I"));
		System.out.println(strset);
//		queue class test
		Queue<Character> queue = new LinkedList<Character>();
		for(char c : "fdjalksfjskal".toCharArray()){
			queue.offer(c);
		}
		System.out.println(queue);
	}
}