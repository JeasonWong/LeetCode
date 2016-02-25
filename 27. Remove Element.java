/**
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 *
 */

public class Solution {
	
    public int removeElement(int[] nums, int val) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] == val){
                for(int j=nums.length-1; j>i; j--){
                    if(nums[j] != val){
                        nums[i] = nums[j];
                        nums[j] = val;
                        break;
                    }
                }
            }
        }
        
        int expand = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == val) {
                expand++;
            }
        }
        
        return nums.length - expand;
        
    }
}