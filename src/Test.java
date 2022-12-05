import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Test {
	
	public static void test1() {
		int[][] arr1 = new int[][] {{1, 2}, {3, 4}};
		for (int[] a : arr1) {			
			System.out.println(Arrays.toString(a));
		}
		
	}
	
	public static void test2() {
		Set<Integer> t2 = new HashSet<>();
		t2.add(1);
		t2.add(1);
		t2.add(2);
		System.out.println(t2);
	}
	
	public static void test3() {
		Set<Integer> mySet = new HashSet<>();
		mySet.add(1);
		mySet.add(2);
		mySet.add(3);
		for (int s : mySet) {
			System.out.println(s);
		}
		
		HashMap<Integer, Integer[]> leads = new HashMap<>();
		leads.put(1, new Integer[] {1,2,3});
		
		Integer[] oldArr = leads.get(1);
		Integer[] newArr = new Integer[oldArr.length+1];
		for (int i=0; i<oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}
		newArr[newArr.length-1] = 2;
		
		leads.replace(1, newArr);
		leads.put(2, new Integer[] {3,4});
		
		System.out.println(Arrays.toString(leads.get(1)));
		
	}

	public static void main(String[] args) {
//		test1();
//		test2();
		test3();
	}

}
