package com.company;
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int a = 1; a <= 1000; a++) {
            for (int b = 2; b <= 1000; b++) {
                for(int c = 3; c <= 1000; c++) {
                    if((a + b + c == 1000) && ((a < b && b < c)) && ( (Math.pow((double)a, 2) + Math.pow((double)b,2) == Math.pow((double)c,2)) )) {
                        System.out.println((a * b * c));
                        System.out.println("a is:" + a);
                        System.out.println("b is:" + b);
                        System.out.println("c is:" + c);
                    }
                }
            }
        }
    }
}