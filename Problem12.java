package org.example;
import java.util.*;
public class Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int length = input.length();
        int permutations = 1;
        for (int i = 1; i <= length; i++) {
            permutations *= i;
        }

        System.out.println(permutations);
    }
}
