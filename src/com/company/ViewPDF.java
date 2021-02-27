package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ViewPDF {

    public void result (){
        Scanner scanner = new Scanner(System.in);

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        char[] wordChar = word.toCharArray();
        int output = 0;
        int[] table = new int[word.length()];

        for (int i = 0 ; i < wordChar.length;i++){
            table[i]=h[ (int) wordChar[i] - 97];

        }
        if (Arrays.stream(table).max().isPresent()) {
            output = Arrays.stream(table).max().getAsInt()*word.length();

        }
        System.out.println(output);

    }
}
