package org.example;
import java.util.*;

public class Problem14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] E = new int[n];
        int[] L = new int[n];

        for (int i = 0; i < n; i++) {
            E[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            L[i] = scanner.nextInt();
        }

        // Calculate maximum guests present
        int maxGuest = 0;
        int currentGuest = 0;
        for (int i = 0; i < n; i++) {
            currentGuest += E[i] - L[i];
            if (currentGuest > maxGuest) {
                maxGuest = currentGuest;
            }
        }
        System.out.println( maxGuest);


    }
}
