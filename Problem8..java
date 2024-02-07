package org.example;
import java.util.*;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n= sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        List<Integer> leaders = new ArrayList<>();


        int maxRight = arr[n - 1];
        leaders.add(maxRight);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                maxRight = arr[i];
                leaders.add(maxRight);
            }
        }


        for(int num: leaders){
            System.out.print(num + " ");
        }

    }
}
