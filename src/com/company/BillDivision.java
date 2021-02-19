package com.company;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BillDivision {

    public static void result(){
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split("\\s");
//        int n = Integer.parseInt(strings[0]);
        int k = Integer.parseInt(strings[1]);

        List<Integer> bill = Stream.of(scanner.nextLine().split("\\s"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int b = Integer.parseInt(scanner.nextLine().trim());


        bill.remove(k);
        
        int sum = 0;
        for (Integer integer : bill) {
            sum += integer;
        }


        if (sum/2 == b){
            System.out.println("Bon Appetit");
        }else {
            System.out.println(b-sum/2);
        }



    }
}
