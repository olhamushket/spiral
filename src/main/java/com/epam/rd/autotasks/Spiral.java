package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int [][]spi=new int[rows][columns];
        int minR=0;
        int maxR =rows-1;
        int minC=0;
        int maxC=columns-1;
        int value=1;
        while (maxR>0&&maxC>0) {
                for (int i = minC; i <= maxC; i++) {
                    System.out.println(value);
                    if (value>rows*columns) return spi;
                    spi[minR][i] = value;
                    value++;
                    System.out.println(value);
                }
                    minR++;
                System.out.println("minR="+minR);
                for (int i = minR; i <= maxR; i++) {
                    System.out.println(value);
                    if (value>rows*columns) return spi;
                    spi[i][maxC] = value;
                    value++;
                    System.out.println(value);
                }
                    maxC--;
                System.out.println("maxC="+maxC);
                for (int i = maxC; i >= minC; i--) {
                    System.out.println(value);
                    if (value>rows*columns) return spi;
                    spi[maxR][i] = value;
                    value++;
                    System.out.println(value);
                }
                    maxR--;
                System.out.println("maxR="+maxR);
                for (int i = maxR; i >= minR; i--) {
                    System.out.println(value);
                    if (value>rows*columns) return spi;
                    spi[i][minC] = value;
                    value++;
                    System.out.println(value);
                }
                    minC++;
                System.out.println("minC="+minC);
            }
        return spi;
    }

}
