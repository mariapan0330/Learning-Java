/*
	 * Given an integer array nums of length n and an integer k,
	 * return the number of pairs (i, j) where 0 <= i < j < n,
	 * such that nums[i] == nums[j] and (i * j) is divisible by k.
	 * 
	 * EXAMPLE:
	 * Input: nums = [3,1,2,2,2,1,3], k = 2
	 *                0 1 2 3 4 5 6
	 * Output: 4
	 * Explanation:
	 * There are 4 pairs that meet all the requirements:
	 * - nums[0] == nums[6], and 0 * 6 == 0, which is divisible by 2.
	 * - nums[2] == nums[3], and 2 * 3 == 6, which is divisible by 2.
	 * - nums[2] == nums[4], and 2 * 4 == 8, which is divisible by 2.
	 * - nums[3] == nums[4], and 3 * 4 == 12, which is divisible by 2.
	 * 
	 * 
	 * Input: nums = [1,2,3,4], k = 1
	 * Output: 0
	 * Explanation: Since no value in nums is repeated,
	 * there are no pairs (i,j) that meet all the requirements.
	 * 
	 */

public class NumPairs {
	
	public static int numPairs(int[] nums, int k) {		
		int count = 0;
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] == nums[j] && (i * j) % k == 0) {
					System.out.println(nums[i] + " " +
						nums[j] + " " + i*j);
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(numPairs(new int[] {3,1,2,2,2,1,3}, 2));
		System.out.println(numPairs(new int[] {1,2,3,4}, 1));
	}
}













