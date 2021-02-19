package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SubArrayDivision {

    public void result() {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] strings = scanner.nextLine().split("\\s");
        List<Integer> s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            s.add(Integer.parseInt(strings[i]));
        }


        int d = scanner.nextInt();
        int m = scanner.nextInt();


        int output = 0;
        int sum = 0;

        for(int i = 0 ; i <= (s.size() - m) ; i++){
            for(int j = 0 ; j < m ; j++){
                sum = sum + s.get(j+i);
            }
            if(sum == d){
                output++;
            }
            sum = 0;
        }




        System.out.println(output);
    }
}
