package com.company;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MarchProgram1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //no of test cases
        int t = scanner.nextInt();

        for (int l=0;l<t;l++) {
            //no of baskets
            int N = scanner.nextInt();
            //no of items;
            int M = scanner.nextInt();
            int[] F = new int[N];
            int[] P = new int[N];
            for (int i = 0; i < F.length; i++) {
                F[i] = scanner.nextInt();
            }
            for (int j = 0; j < P.length; j++) {
                P[j] = scanner.nextInt();
            }
            Map<Integer, Integer> map = IntStream.range(0, P.length).boxed().
                    collect(Collectors.toMap(i -> F[i], i -> P[i], (s, a) -> s + a));
            int max = map.values().stream().min(Integer::compareTo).get();
            System.out.println(max);
        }
    }
}
