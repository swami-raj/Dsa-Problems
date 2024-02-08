package org.example;
import java.util.*;

public class Problem17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        boolean[] v = new boolean[n + 1];
        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                v[j] = !v[j];
            }
        }

        for (int i = 1; i <= n; i++) {
            if (v[i]) {
                count++;
            }
        }

        System.out.println( count);



    }
}
