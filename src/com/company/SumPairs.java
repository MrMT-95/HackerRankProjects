package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SumPairs {

    public void result() {

        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split("\\s");
        int n = Integer.parseInt(numbers[0]);
        int k = Integer.parseInt(numbers[1]);

        String[] strings = scanner.nextLine().split("\\s");
        int[] ar = new int[6];

        for (int i = 0;i<n;i++){
            ar[i]= Integer.parseInt(strings[i]);
        }

        int sum = 0;
        int output = 0;

        for (int i = 0 ; i < n; i++){
            for (int j = i+1; j<n;j++){
                sum = ar[i]+ar[j];
                if (sum%k==0){
                    output += 1;
                }
            }
        }

        System.out.println(n + "\n" + k + "\n" + Arrays.toString(ar));
        System.out.println(output);


    }
}
