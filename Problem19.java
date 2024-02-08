package org.example;
import java.util.Arrays;
public class Program19 {
    public static void main(String[] args) {
        String str1 = "coding";
        String str2 = "ingodc";
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        boolean isAnagram = Arrays.equals(charArray1, charArray2);
        if (isAnagram) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
