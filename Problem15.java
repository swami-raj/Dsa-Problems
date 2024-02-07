package org.example;
import java.util.*;
public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int way = 1;
        for (int i = 2; i < n; i++) {
            way *= i;
        }
        System.out.println(way);

    }
}
