package tdd;

import java.util.Arrays;

public class ArrayImage {
    public static void main(String[] args) {
        int[][] picture = {
                {0,0,0,1,0,0,0},
                {0,0,1,1,1,0,0},
                {0,1,1,1,1,1,0},
                {1,1,1,1,1,1,1},
                {0,0,0,1,0,0,0},
                {0,0,0,1,0,0,0},
                {0,0,0,1,0,0,0},
                {0,0,0,1,0,0,0}
        };
        for (int i = 0; i < 8; i++){
            for (int k = 0; k < picture[i].length; k++) {
                if (picture[i][k]==1){
                    System.out.print("*");
                }
                else if (picture[i][k]==0){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
