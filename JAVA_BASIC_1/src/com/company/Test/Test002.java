package com.company.Test;

import java.util.Scanner;

public class Test002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        switch (i) {
            case 1:
                System.out.println("10이다");
                break;
            case 2:
                System.out.println("20이다");
                break;
            case 3:
                System.out.println("30이다");
                break;
            default:
                System.out.println("1,2,3이 아니다");
        }
    }
}