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
		
//		char myC = 94;
//		System.out.println(myC);
//		for (int i = 1; i < 3; i++) {
//			System.out.println(i);
//		}
//		
//		System.out.println("Please give me a number:");
//		String guess = scanner.nextLine();
//		System.out.println(guess);
//		
//		guess = scanner.nextLine();
//		
//		System.out.println(Integer.parseInt(guess) * 23);
//		System.out.println("done");
		
		
	}
	
}
