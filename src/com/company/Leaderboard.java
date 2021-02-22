package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Leaderboard {

    public void result() {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());

        List<Integer> ranked = Stream.of(scanner.nextLine().split("\\s")).map(Integer::parseInt).collect(Collectors.toList());

        int m = Integer.parseInt(scanner.nextLine().trim());

        List<Integer> player = Stream.of(scanner.nextLine().split("\\s")).map(Integer::parseInt).collect(Collectors.toList());



        int[] results = new int[player.size()];
        int rank = 1;
        int rankScore = ranked.get(0);

        for (int a = player.size() - 1, s = 0; a >= 0; a--) {
            if (player.get(a) < rankScore) {
                for (; s < ranked.size(); s++) {
                    if (ranked.get(s) < rankScore) {
                        rank++;
                        rankScore = ranked.get(s);
                    }
                    if(player.get(a) >= ranked.get(s)) break;
                }
            }

            results[a] = s == ranked.size() ? rank + 1 : rank;
        }

        List<Integer> out= new ArrayList<>();


        for (int result : results) {
            out.add(result);
        }

        System.out.println(out);


    }
}
