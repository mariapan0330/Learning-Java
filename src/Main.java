import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		double two = 2.5;
		System.out.println("Hello world" + " and Maria" + two);
		Scanner scanner = new Scanner(System.in);
//		System.out.println(CodeWarsProblems.Liters(11.8));
//		System.out.println(CodeWarsProblems.reverse(5));
//		System.out.println(CodeWarsProblems.isTriangle(1,2,2)); // true
//		System.out.println(CodeWarsProblems.isTriangle(7,2,2)); // false
		System.out.println(CodeWarsProblems.findShort("bitcoin take over the world maybe who knows perhaps")); // 3 
		System.out.println(CodeWarsProblems.findShort("turns out random test cases are easier than writing out basic ones")); // 3
		System.out.println(CodeWarsProblems.findShort("Let's travel abroad shall we")); // 2
		StringBuilder test = new StringBuilder("12345");
		System.out.println(test.deleteCharAt(test.length()-1));
		System.out.println((int)(Math.random()*25));
		
		if ("t".matches(".*[adjiuet].*")) {
			System.out.println(true);
		} else {
			System.out.println(false);			
		}
		
		System.out.println(Math.sqrt(25));
		
		System.out.println("+++++");
		System.out.println(Arrays.toString(AddToZero.addToZero(5)));
		System.out.println(Arrays.toString(AddToZero.addToZero(4)));
		System.out.println(Arrays.toString(AddToZero.addToZero(3)));
		System.out.println(Arrays.toString(AddToZero.addToZero(6)));
		System.out.println(Arrays.toString(AddToZero.addToZero(7)));
		
		
	}
	
}
