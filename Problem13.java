package org.example;
import java.util.*;

public class Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int count = 0;
        for (int num = n1; num <= n2; num++) {
            boolean rep = false;
            String numStr = String.valueOf(num);
            for (int i = 0; i < numStr.length(); i++) {
                for (int j = i + 1; j < numStr.length(); j++) {
                    if (numStr.charAt(i) == numStr.charAt(j)) {
                        rep = true;
                        break;
                    }
                }
                if (rep) {
                    break;
                }
            }
            if (!rep) {
                count++;
            }
        }
        System.out.println(count);
    }
}
