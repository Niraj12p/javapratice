/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.niraj.javapratice;

public class Palindrome {
    public static void main(String[] args) {
        String str="aga";
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
        if(str.equals(rev))
        {
            System.out.println("palindrome");
              
        }
        else
            System.out.println("not palindrome");
    }
            
    
}
