package org.example;
import java.util.*;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int ca1 = 0;
        int ca2 = 0;

        while (num1 > 0 || num2 > 0) {
            int sum = (num1 % 10) + (num2 % 10) + ca1;
            if (sum > 9) {
                ca2++;
                ca1 = 1;
            } else {
                ca1 = 0;
            }
            num1 /= 10;
            num2 /= 10;
        }

        System.out.println( ca2);
    }
}
