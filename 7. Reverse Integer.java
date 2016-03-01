/**
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 *
 */

public class Solution {
    public int reverse(int x) {
        
        boolean isNegative = false;
        int m = 0;
        
        if(x<0){
            x = -x;
            isNegative = true;
        } 
        
        while(x != 0){
            //注意越界
            if(m>(Integer.MAX_VALUE-x%10)/10) return 0;  
            int temp = x % 10;
            x = x / 10;
            m = m*10 + temp;
        }
        
        if(isNegative) return -m;
        return m;
        
    }
}