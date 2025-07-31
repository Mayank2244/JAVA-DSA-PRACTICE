package com.mayank;
import java.util.Scanner;
//fibonacci=0,1,1,2,3
public class fibonnaci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c=2;
        while(c<=n){
            int temp=b;
            b=b+a;
            a=temp;
            c++;
        }
        System.out.println(b);

    }
}
