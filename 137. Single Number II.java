/**
 * Given an array of integers, every element appears three times except for one. Find that single one.
 *
 */

public class Solution {
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
		
		int result = 0;
		int[] bits = new int[32];
		
		for(int i=0; i<32; i++){
			for(int j=0; j<nums.length; j++){
				bits[i] += nums[j] >> i & 1;
				bits[i] %= 3;
			}
			
			result |= (bits[i] << i);
			
		}
		
		return result;
    }
}