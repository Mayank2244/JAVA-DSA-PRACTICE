package com.mayank;

import java.util.Scanner;

public class maxnum

 {

    public static void main(String[] args) {

        // find maximum number
        // System.out.println("Hello world!");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        /* int max=0;
       if(a>max){
            max=a;
        }
        else{
            max=b;
        }
        if(c>max){
            max=c;
        } */
        int max= Math.max(c,Math.max(a,b));

        System.out.print(max);
    }
}

