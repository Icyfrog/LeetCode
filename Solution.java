import java.io.*;
import java.util.*;

/**
* MS的笔试题，从1~n的数中，挑选出相加为k的组合数。  比如 4 = 1+1+1+1 = 2+2 = 2+1+1 = 3+1
* 递归思想是 k中要几个n，k-i*n中要几个(n-1)
*/

public class Solution {
    public static int add(int n, int k) {
        if (n==1 || k==0) return 1;
        int ret = 0;
        int times = k / n;
        for (int i = 0; i <= times; i++) {
            ret += add(n-1, k - i * n);
        }
        return ret;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k= in.nextInt();
        System.out.print(add(n, k));
    }
}
