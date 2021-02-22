package com.company;

import java.util.Scanner;

public class Pairs {
    public void result(){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split("\\s");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }
    }
}
