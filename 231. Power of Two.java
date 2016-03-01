/**
 * Given an integer, write a function to determine if it is a power of two.
 *
 */

public class Solution {
    public boolean isPowerOfTwo(int n) {
        
        if(n<=0) return false;
        
        int m = 1;
        
        while(n > 0){
            if(((1 & n) == 1 )&&n>>1 > 0) return false;
            n = n>>1;
        }
        
        return true;
        
        //return (n>0) && (n&(n-1)) == 0;
        
    }
}