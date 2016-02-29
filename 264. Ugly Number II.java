/**
 * Write a program to find the n-th ugly number.
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.
 * Note that 1 is typically treated as an ugly number.
 *
 */

public class Solution {
    public int nthUglyNumber(int n) {
        
        int result = 1;
        int array[] = new int[n+1];
        
        int m2 = 0, m3 = 0, m5 = 0;
        array[0] = 1;
        
        for(int i=1; i<n; i++){
            int a = array[m2]*2;
            int b = array[m3]*3;
            int c = array[m5]*5;
            
            array[i] = min(a, b, c);
            
            if(array[i] == a) m2++;
            if(array[i] == b) m3++;
            if(array[i] == c) m5++;
        }
        
        return array[n-1];
        
    }
    
    public int min(int i, int j, int k){
        return ((i<j?i:j)<k)?(i<j?i:j):k;
    }
    
}