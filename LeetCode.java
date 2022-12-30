
package leetcode;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class LeetCode 
{

    
    
   static int romanToInt(String s) 
    {
        int sum=0;
       for(int i=0;i<s.length();i++)
       {
         char r=s.charAt(i);
         int temp=0;
        if (r == 'I')
           temp= 1;
        if (r == 'V')
            temp=5;
        if (r == 'X')
            temp=10;
        if (r == 'L')
           temp= 50;
        if (r == 'C')
            temp= 100;
        if (r == 'D')
            temp= 500;
        if (r == 'M')
            temp= 1000;
         sum+=temp;
       }  
    return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s=input.next();
       int result= romanToInt(s);
        System.out.println(""+result);
        System.exit(0);        
    }
    
}
