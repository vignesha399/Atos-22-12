package com.example;

import java.util.Scanner;

/**
 * Interfacce
 */

public class New1 implements Inter {
    
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a =n.nextInt();
        int b =n.nextInt();
        String x = n.nextLine();
        Inter d = ((a1, b1) -> {return a+b;});
        System.out.println(d.test(a, b));
        System.out.println(x);
        n.close();
    }

    @Override
    public int test(int a1, int b1) {
        return 0;
    }
}