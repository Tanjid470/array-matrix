package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Array_TrioSum_Target {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Array Size :");
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        Arrays.sort(array);
        System.out.print("Target Value :");
        int target = input.nextInt();

        for (int i = 0; i < n - 2; i++) {
            int rem = target - array[i];
            if (rem == array[i + 1] + array[n - 1]) {
                //System.out.println(i +" "+(i+1)+" "+(n-1));
                System.out.println("Target Exist");
                break;
            } else if (rem < array[i + 1] + array[n - 1]) {
                for (int j = n - 1; j > i + 1; j--) {
                    if (rem == array[j] + array[i + 1]) {
                        System.out.println("Target Exist 2");
                        break;
                    } else {
                        continue;
                    }

                }
            } else {
                continue;
            }
        }
    }
}
