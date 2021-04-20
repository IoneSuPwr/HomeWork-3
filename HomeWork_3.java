package main.java.pack_3;

import java.util.Arrays;

public class HomeWork_3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reversNum()) + "\n");
        System.out.println(Arrays.toString(fillInNum()) + "\n");
        System.out.println(Arrays.toString(multiplyTheNum()) + "\n");
        fillDiagNum();
        System.out.println(Arrays.toString(lenInitialvalue(len,initialvalue) + "\n");

    }

    /**1 Задание */
    public static int[] reversNum() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }

    /** 2 Задание */
    public static int[] fillInNum() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    /** 3 Задание */
    public static int[] multiplyTheNum() {

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        return arr;
    }
    /** 4 Задание*/
    public static void fillDiagNum() {
        int[][] arr = new int[size][size];
        for (int i =0; i < arr.length; i++) {
            int rowLenght = arr[i].length;
            for (int j = 0; j < rowLenght; j++) {
                if ((i == j) || (j == rowLenght - 1 - i)) {
                    arr[i][j] = 1;
                }
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    /** 5 Задание*/
    public static int[] lenInitialvalue(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }


}