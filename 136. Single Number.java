/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 *
 */

public class Solution {
    public int singleNumber(int[] nums) {
    
        int num = 0;
    
        for(int i=0; i<nums.length; i++){
            num ^= nums[i]; 
        }
        
        return num;
   
    }
}