package org.example;
import java.util.*;
public class problem4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the all value of input");
        int n= sc.nextInt();
        int p= sc.nextInt();
        int b= sc.nextInt();
        int i= sc.nextInt();
        int j= sc.nextInt();
        int a=p/i;
        int c=b/j;
        int ans=n-(a+c);
        System.out.println(ans);

    }
}
