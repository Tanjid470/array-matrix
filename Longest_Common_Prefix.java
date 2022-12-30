package leetcode;
import java.util.Scanner;

/*
Input: strs = {"flower","flow","flight"}
Output: "fl"
Input: strs = {"dog","racecar","car"
Output: ""
Explanation: There is no common prefix among the input strings.
*/

/* public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String one = "flowerwew";
        String two = "flow";
        while (two.indexOf(one) != 0) {
            one = one.substring(0, one.length() - 1);
        }
        System.out.println(one);
        System.exit(0);
    }*/


public class Longest_Common_Prefix {
    public static String longestCommonPrefix(String[] strs)
    {
        int count = 0;
        if (strs.length == 1) {
            return strs[0];
        } else 
        {
            for (int i = 0; i < strs[0].length(); i++)
            {
                int flag = 0;
                for (int j = 1; j < strs.length; j++)
                {
                    try 
                    {
                        if (strs[0].charAt(i) == strs[j].charAt(i)) 
                        {
                            flag++;
                            // System.out.println(strs[0].charAt(i)+""+ strs[j].charAt(i));
                            if (flag == strs.length - 1)
                            {
                                count++;
                                flag = 0;
                            }
                        }
                        else{
                        i=strs[0].length();
                        }
                    } catch (Exception e) 
                    {
                        break;
                    }
                }
            }
        }
        int len = count;
        String Fresh = strs[0].substring(0, len);
        return Fresh;
    }


public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] FlowerName = {"ab", "aa"};
        String o = longestCommonPrefix(FlowerName);
        System.out.println(o);
        System.exit(0);
    }
}
