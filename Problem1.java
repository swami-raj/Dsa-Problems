package org.example;
import java.util.*;

public class ProblemSolve {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter pizza: ");
        int p=sc.nextInt();
        System.out.println("Enter puffs");
        int q= sc.nextInt();
        System.out.println("Enter coldrink");
        int c=sc.nextInt();
        int a=100*p;
        int b=q*20;
        int d=c*10;
        System.out.println("total bill amount : "+ (a+b+d));
    }
}
