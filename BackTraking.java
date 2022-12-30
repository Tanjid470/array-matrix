
package leetcode;

import java.util.Scanner;

public class BackTraking {
      static public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int area = h * w;
            max = Math.max(max, area);
            if (height[left] < height[right]) {
                left++;
            } else if (height[left] > height[right]) {
                right--;
            }
            else{
                left++;
                right--;
            }         
        }
     return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = {1, 8, 6, 2, 5, 4, 9, 3, 7};
        int r = maxArea(a);
        System.out.println(r);
    }
}
