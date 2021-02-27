package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Games {

    public void result(){
        Scanner scanner = new Scanner(System.in);

        String[] nk = scanner.nextLine().split("\\s");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] height = new int[n];

        String[] heightItems = scanner.nextLine().split("\\s");


        for (int i = 0; i < n; i++) {
            int heightItem = Integer.parseInt(heightItems[i]);
            height[i] = heightItem;
        }

        int diff = 0;
        int max = 0 ;

        if (Arrays.stream(height).max().isPresent()){
            max = Arrays.stream(height).max().getAsInt();
        }


        if ( max -k > 0){
            diff = max - k;
        }

        System.out.println(diff);

    }
}
