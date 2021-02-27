package com.company;

import java.util.Scanner;

public class CatAndMouse {

    public void result (){

        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");



        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split("\\s");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String output;

            if (Math.abs(x-z)==Math.abs(y-z)){
                output = "Mouse C";
            }else if (Math.abs(x-z)>Math.abs(y-z)){
                output = "Cat B";
            }else {
                output = "Cat A";
            }

            System.out.println(output);
        }


    }
}
