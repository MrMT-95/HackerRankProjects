package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class Store {

    public void result() {
        Scanner scanner = new Scanner(System.in);

        String[] bnm = scanner.nextLine().split("\s");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int b = Integer.parseInt(bnm[0]);

        int n = Integer.parseInt(bnm[1]);

        int m = Integer.parseInt(bnm[2]);

        int[] keyboards = new int[n];

        String[] keyboardsItems = scanner.nextLine().split("\\s");


        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
            int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
            keyboards[keyboardsItr] = keyboardsItem;
        }

        int[] drives = new int[m];

        String[] drivesItems = scanner.nextLine().split("\\s");


        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
            int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
            drives[drivesItr] = drivesItem;
        }
        int output = -1;

        ArrayList<Integer> integers = new ArrayList<>();

        Arrays.stream(keyboards).forEach(k -> Arrays.stream(drives).forEach(d -> integers.add(k+d)));

        Optional<Integer> result =  integers.stream().filter(i-> i <= b).max(Integer::compareTo);

        if (result.isPresent()){
            output = result.get();
        }

        System.out.println(output);

    }
}
