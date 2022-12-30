
package leetcode;

import java.util.Scanner;


public class String_Prefix_Suffix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         String one = "ddyflow";
        String two = "flow";
        int i=1;
        while (two.indexOf(one) != 0)
        {   
           int len =one.length();
           one = one.substring(i,len);    //Suffix
          // one = one.substring(0,len-1); // Prefix
        }
        System.out.println(one);
        System.exit(0);        
    } 
}
