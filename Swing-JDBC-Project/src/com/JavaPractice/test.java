package com.JavaPractice;
import java.util.*;
import java.io.*;

class test{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int i1=0;i1<n;i1++){
                int value=0;
                for(int i2=0;i2<=i1;i2++){
                    value=2^10;
                }
                System.out.println((2^10)+"kk");

//                System.out.print(a+b*value+" ");
            }
            System.out.println();

        }
        in.close();
    }
}