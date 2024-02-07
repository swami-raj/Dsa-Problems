package org.example;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        int [][] arr1=new int[3][3];
        int [] arr2=new int[3];
        int max=0;
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr1[i][j]=sc.nextInt();
                if(arr1[i][j]<1||arr1[i][j]>100){
                    arr1[i][j]=0;
                }
            }
        }
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                arr2[i]=arr2[i]+arr1[j][i];
            }
            arr2[i]=arr2[i]/3;
        }
        for (int i=0;i<3;i++){
            if(arr2[i]>max){
                max=arr2[i];
            }
        }
        for(int i=0;i<3;i++){
            if (arr2[i]==max){
                System.out.println("Trainee number : "+(i+1));
            }
            if(arr2[i]<70){
                System.out.println("trainee is unfit");
            }
        }

    }
}
