package org.niraj.javapratice;



import java.util.*;
public class Array {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index");
        int n=sc.nextInt();
        
        int []a=new int[n];
        for (int i=1; i<n;i++)
        {
            a[i]=sc.nextInt();
            //System.out.println(a[i]);
        }
        for (int i=1; i<n;i++){
            System.out.println(a[i]);
        }
        
    }
    
}
