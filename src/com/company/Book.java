package com.company;

import java.util.Scanner;

public class Book {

    public void result() {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();


        int forward = 0;

        for (int i = 1; i < n / 2; i++) {
            if (p == 1) {
                break;
            } else {
                if (p == i * 2 || p == (i * 2) + 1) {
                    forward = i;
                    break;
                }
            }


        }

        int backward = 0;

        for (int i = 1; i < n / 2; i++) {
            if (p%2==0&&(p == n || p == n - 1)) {
                break;
            } else {
                if (n % 2 == 0 && (p == n - i * 2 || p == n - i * 2 + 1)) {
                    backward = i;
                    break;
                }

                if (n % 2 != 0 && (p == n - 1 - i * 2 || p == n - i * 2)) {
                    backward = i;
                    break;
                }
            }
        }


        System.out.println(Math.min(forward, backward));
    }
}
