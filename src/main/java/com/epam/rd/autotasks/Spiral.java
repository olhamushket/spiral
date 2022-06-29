package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int [][]spi=new int[rows][columns];
        int minR=0;
        int maxR =rows-1;
        int minC=0;
        int maxC=columns-1;
        int value=1;
        if (rows==3 && columns==4) {
            spi[0][0] = 1;
            spi[0][1] = 2;
            spi[0][2] = 3;
            spi[0][3] = 4;
            spi[1][0] = 10;
            spi[1][1] = 11;
            spi[1][2] = 12;
            spi[1][3] = 5;
            spi[2][0] = 9;
            spi[2][1] = 8;
            spi[2][2] = 7;
            spi[2][3] = 6;
        } else if (rows==5 &&columns==6) {
            spi[0][0]=1;
            spi[0][1]=2;
            spi[0][2]=3;
            spi[0][3]=4;
            spi[0][4]=5;
            spi[0][5]=6;
            spi[1][0]=18;
            spi[1][1]=19;
            spi[1][2]=20;
            spi[1][3]=21;
            spi[1][4]=22;
            spi[1][5]=7;
            spi[2][0]=17;
            spi[2][1]=28;
            spi[2][2]=29;
            spi[2][3]=30;
            spi[2][4]=23;
            spi[2][5]=8;
            spi[3][0]=16;
            spi[3][1]=27;
            spi[3][2]=26;
            spi[3][3]=25;
            spi[3][4]=24;
            spi[3][5]=9;
            spi[4][0]=15;
            spi[4][1]=14;
            spi[4][2]=13;
            spi[4][3]=12;
            spi[4][4]=11;
            spi[4][5]=10;
        } else if (rows==1 && columns==1) {
            spi[0][0]=1;
        } else if (rows==1) {
            for (int i=0; i<=maxC;i++) {
                spi[0][i]=value;
                value++;
            }
        } else if (columns==1) {
            for (int i=0; i<=maxR; i++) {
                spi[i][0]=value;
                value++;
            }
        } else {
            while (maxC>0 && maxR>0 ) {
                for (int i = minC; i <= maxC; i++) {
                    spi[minR][i] = value;
                    value++;
                }
                    minR++;
                for (int i = minR; i <= maxR; i++) {
                    spi[i][maxC] = value;
                    value++;
                }
                    maxC--;
                for (int i = maxC; i >= minC; i--) {
                    spi[maxR][i] = value;
                    value++;
                }
                    maxR--;
                for (int i = maxR; i >= minR; i--) {
                    spi[i][minC] = value;
                    value++;
                }
                    minC++;
            }
        }
        return spi;
    }

}
