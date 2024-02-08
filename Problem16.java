package org.example;
import java.util.*;
public class Problem16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1;
        s1=sc.nextLine();
        int a1=0;
        int a2=0;
        for (int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='#'){
                a1++;
            }
            else{
                a2++;
            }
        }
        if(a1 > a2){
            System.out.println("-");
        }
        else if(a1 < a2){
            System.out.println("+");
        }
        else{
            System.out.println("0");
        }


    }
}
