package org.example;
import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of stair:");
        int a=sc.nextInt();
        System.out.println("Enter no of steps");
        int b=sc.nextInt();
        if(b>=a){
            System.out.println(1);
        }
        else{
            int ans=0;
            int c=a%b;
            int d=a/b;
            ans=d+(c>0?1:0);
            System.out.println(ans);
        }
    }
}
