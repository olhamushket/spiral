package com.epam.rd.autotasks;

public class Main {
    public static void main(String[] args) {
        {
            int[][] spiral = Spiral.spiral(4, 5);

            for (int[] ints : spiral) {
                for (int anInt : ints) {
                    System.out.printf("%4s", anInt);
                }
                System.out.println();
            }
            System.out.println();
        }
     }
}
