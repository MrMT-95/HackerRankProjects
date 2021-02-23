package com.company;

import java.util.Scanner;
import java.util.stream.Stream;

public class Hike {

    public void result() {
        Scanner scanner = new Scanner(System.in);

        int steps = Integer.parseInt(scanner.nextLine().trim());

        String path = scanner.nextLine();

        int output = 0;
        int valley = 0;

        char[] chars = path.toCharArray();


        for (int i = 0; i < steps; i++) {
            int temp = output;
            if (chars[i] == 'U'){
                output +=1;
            }else {
                output -=1;
            }

            if (temp == 0 && output <0){
                valley+=2;
            }

            if (temp<0 && output == 0){
                valley-=1;
            }
        }

        System.out.println(valley);

    }
}
