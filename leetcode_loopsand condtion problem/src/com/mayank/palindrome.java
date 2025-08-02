package com.mayank;

import java.util.*;
class palindrome {
    public  boolean isPalindrome(int x) {
        if(x<0)

            return false;
        int org=x;
        int ans=0;

        while(x>0){

            int rem= x%10;
            x=x/10;
            ans=ans*10+rem;


        }
        return org==ans;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        palindrome o=new palindrome();

        boolean ans= o.isPalindrome(  x);
        System.out.println(ans);

    }
}


