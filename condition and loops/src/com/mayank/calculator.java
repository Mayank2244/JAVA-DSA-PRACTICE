package com.mayank;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.println("Enter operation (+, -, *, /, %, x to exit): ");
            char ch = sc.next().trim().charAt(0);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                System.out.println("Enter two numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();

                if (ch == '+') {
                    ans = a + b;
                } else if (ch == '-') {
                    ans = a - b;
                } else if (ch == '*') {
                    ans = a * b;
                } else if (ch == '/') {
                    ans = a / b;  // ⚠️ Can throw ArithmeticException if b == 0
                } else if (ch == '%') {
                    ans = a % b;  // ⚠️ Can throw ArithmeticException if b == 0
                }

                System.out.println("Result: " + ans);
            } else if (ch == 'x' || ch == 'X') {
                System.out.println("Exiting calculator...");
                break;
            } else {
                System.out.println("Invalid operation. Please try again.");
            }
        }

       
    }
}
