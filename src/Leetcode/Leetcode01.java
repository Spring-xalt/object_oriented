package Leetcode;

/**
 * 我亦无他，惟手熟尔
 */

public class Leetcode01 {

}
class Solution {
    public int reverse(int x) {
        long n=0;
        while(x!=0){
            n=n*10+x%10;
            x/=10;
        }
        if(n==0)return 0;
        return (int)n;
    }
}