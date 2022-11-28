
public class AddToZero {
	public static int[] addToZero(int n) {
		int[] res = new int[n];
		
		if (n % 2 != 0) { 
			// if n is odd, put a 0 at the end of the array and subtract 1 from n
			res[n-1] = 0;
			n--;
		}
		
		boolean isNextNumNegative = false;
		for (int i = 0; i < n; i++) {
			if (isNextNumNegative) {
				res[i] = -i;
				isNextNumNegative = false;
			} else {
				res[i] = i+1;
				isNextNumNegative = true;
			}
			
		}
		
		return res;
	}
}
