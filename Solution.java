import java.io.*;
import java.util.*;

/**
* MS的笔试题，从1~n的数中，挑选出相加为k的组合数。  比如 4 = 1+1+1+1 = 2+2 = 2+1+1 = 3+1
* 递归思想是 k中要几个n，k-i*n中要几个(n-1)
*/

public class Solution {
    
    // 递归版本
    public static int ways(int total, int k) {
        // Write your code here
        if (k==1 || total==0) return 1;
        int ret = 0;
        int times = total / k;
        for (int i=0; i<=times; i++) {
            ret += ways(total-i*k, k-1);
        }
        return ret;

    }
    
    // 动规版本
    // dp[i][j] = dp[i-1][j-n*i]  n代表的就是，可以取0个，1个，2个，3个
        public static int ways(int k, int total) {
        // Write your code here
        int[][] dp = new int[k+1][total+1];
        for (int i=0; i<=total; i++) {
            dp[0][i] = 0;
        }
        for (int i=0; i<=k; i++) {
            dp[i][0] = 1;
        }
        for (int i=1; i<=k; i++) {
            for (int j=1; j<=total; j++) {
                int times = j/i;
                for (int t=0; t<=times; t++) {
                    dp[i][j] += dp[i-1][j-t*i];
                }
            }
        }

        return dp[k][total];
    }
    
、

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int total= in.nextInt();
        System.out.print(add(k, total));
    }
}
