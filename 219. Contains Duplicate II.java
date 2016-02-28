/**
 * Given an array of integers and an integer k, 
 * find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.
 * 
 */

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
            if(set.size() > k) set.remove(nums[i-k]);
        }
        
        return false;
        
    }
}