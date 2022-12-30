package leetcode;

import java.util.Scanner;

public class Sorting_Matrix_BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m=input.nextInt();
        int n=input.nextInt();
        int[][] a=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]=input.nextInt();
            }   
        }
        int target=input.nextInt();
        int temp=0;
        int flag=0;
           for (int j = 0; j < n; j++) {
             for (int i = m-1; i >=0; i--) {
                if(a[i][j]==target){
                    flag=1;
                    break;
                }
                else if(a[i][j]<target){
                  //  System.out.println("index : "+j+" "+i);
                    i=-2;
                }
                else{
                  continue;  
                }
            }   
        }
        if(flag==1){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
       
    }
}
