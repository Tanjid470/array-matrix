/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class FindMedianSortedArrays {
    
    static public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int[] ar=new int[n];
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(i<nums1.length){
              ar[i]=nums1[i];
            }
            else{
                ar[i]=nums2[j++]; 
            }       
        }
       Arrays.sort(ar);
       if(n%2 != 0){
           return ar[(n/2)];
       }
       double bf=ar[n/2];
       double af=ar[(n/2)-1];
       return (double)(bf+af)/2;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a={3};
        System.out.println(a.length);
        int[] b={-2,-1};
        System.out.println(b.length);
       double rslt = findMedianSortedArrays(a,b);
        System.out.println(rslt);
     
    }
    
}
