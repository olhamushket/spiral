package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int [][]spi=new int[rows][columns];
        int minR=0;
        int maxR =rows-1;
        int minC=0;
        int maxC=columns-1;
        int value=1;
        while (maxR>=0&&maxC>=0) {
                for (int i = minC; i <= maxC; i++) {
                    if (value>rows*columns) return spi;
                    spi[minR][i] = value;
                    value++;
                }
                    minR++;
                for (int i = minR; i <= maxR; i++) {
                    if (value>rows*columns) return spi;
                    spi[i][maxC] = value;
                    value++;
                }
                    maxC--;
                for (int i = maxC; i >= minC; i--) {
                    if (value>rows*columns) return spi;
                    spi[maxR][i] = value;
                    value++;
                }
                    maxR--;
                for (int i = maxR; i >= minR; i--) {
                    if (value>rows*columns) return spi;
                    spi[i][minC] = value;
                    value++;
                }
                    minC++;
            }
        return spi;
    }

}
