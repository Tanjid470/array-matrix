
package leetcode;

import java.util.Scanner;


public class Terget_Sum {
    
    
      public int[] twoSum(int[] nums, int target)
      {
          int[] result=new int[2];
          int n=nums.length;
         for (int i = 0; i < n-1; i++) 
         {
                  if(nums[i]+nums[i+1]==target)
                    {
                         result[0]=i;
                         result[1]=i+1;
                         break;
                    }
         }
          return result ;
      }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
            int n=input.nextInt();
            int nums[]=new int[n];
           
           
            for (int i = 0; i < n; i++)
            {
                 nums[i]=input.nextInt();
            }  int target=input.nextInt();
          

        System.exit(0);        
    }
    
}
