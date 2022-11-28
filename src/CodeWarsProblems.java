import java.util.Arrays;

public class CodeWarsProblems {
	
	public static String rps(String p1, String p2) {
	    if (p1.equals(p2)) {
	    	return "Draw!";
	    }
	    
	    switch (p1) {
	    case "rock":
	    	if (p2.equals("scissors")) return "Player 1 won!";
	    	break;

	    case "paper":
	    	if (p2.equals("rock")) return "Player 1 won!";
			break;

	    case "scissors":
	    	if (p2.equals("paper")) return "Player 1 won!";
			break;
		}

		return "Player 2 won!";
	}
	
	public static int Liters(double time) {
		return (int)(time * 0.5);
	}

	public static int[] reverse(int n) {
		int[] result = new int[n];
		int count = 0;
		for (int i = n; i > 0; i--) {
			result[count] = i;
			count++;
		}
		return result;
	}
	
	public static boolean isTriangle(int a, int b, int c) {
		return a+b>c && a+c>b && b+c>a;
	}
	
	public static int findShort(String s) {
		String[] splitS = s.split(" ");
		int shortest = Integer.MAX_VALUE;
		for (String sp : splitS) {
			if (sp.length() < shortest) {
				shortest = sp.length();
			}
		}
		return shortest;
	}

	public static String spinWords(String sentence) {
//		Given a string, reverse all words that have 5 or more letters;
		/*
		 * Plan:
		 * 1. Split the sentence into a String Array.
		 * 2. Go through each word, and check if it is 5 letters long or longer
		 * 3. If it is, reverse the word. 
		 * 4. Join the String[] into a String and return that String.
		 */
		String[] splitS = sentence.split(" ");
		StringBuilder result = new StringBuilder();
		for (String s : splitS) {
			if (s.length() >= 5) {
				s = new StringBuilder(s).reverse().toString();
			}
			result.append(s + " ");
		}
		return result.deleteCharAt(result.length()-1).toString();
	}

	public static int[] addToZero(int n) {
		int[] res = new int[n];
		if (n % 2 != 0) { 
			// if n is odd, put a 0 at the end of the array and subtract 1 
			res[n-1] = 0;
			n--;
		}
		
		boolean isNextNumNegative = false;
		for (int i = 0; i < n; i++) {
			if (isNextNumNegative) {
				res[i] = -(i);
				isNextNumNegative = false;
			} else {
				res[i] = i+1;
				isNextNumNegative = true;
			}
			
		}
		
		return res;
	}
	
	
	
}















