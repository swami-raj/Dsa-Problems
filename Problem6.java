package org.example;
import java.util.*;


public class Problem6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n= sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> v = new ArrayList<Integer>();
        ArrayList<Integer> v1 = new ArrayList<Integer>();
        for (int i=0;i<n;i++){
            if(i%2==0){
                v.add(arr[i]);
            }
            else{
                v1.add(arr[i]);
            }
        }
        Collections.sort(v);
        Collections.sort(v1);
        int s1 = v.get(v.size() - 2);
        int s2 = v1.get(v1.size() - 2);
        System.out.println("the sum is : "+(s1+s2));


    }
}
