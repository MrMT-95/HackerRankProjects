package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pairs {

    public void result() {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split("\\s");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        ar = Arrays.stream(ar).sorted().toArray();

        int output = 0;
        for (int i = 0; i < n - 1; i++) {
            if (ar[i] == ar[i + 1]) {
                output += 1;
                i++;
            }
        }


        System.out.println(output);
    }
}
