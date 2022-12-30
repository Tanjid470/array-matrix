package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class test {
static public int maxArea(int[] a) {
        int len = a.length;
        Arrays.sort(a);
        int count = 0;
        int max = 0;
        int rslt = 0;
        for (int i = 0; i < len - 1; i++) {
            if (a[i] == a[i + 1]) {
                count++;
            }
            if (max < count) {
                max = count;
                rslt = a[i];
                count = 0;
            }
           

        }
        return rslt;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] aa = {2, 2, 1, 1, 1};

        int r = maxArea(aa);
        System.out.println(r);
    }
}
