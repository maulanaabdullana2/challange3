package day01;

import java.util.Arrays;
import java.util.Random;

public class math {
    public static void main(String[] args) {
        var matrix2 = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

//        displayMatrix();
        //displayMatrix(fillMatrixRandom(5));
//        displayMatrix(matrixDiagonal(7));
//        displayMatrix(matrikDiagonal(7));
//       displayMatrix(matrix4(7));



        String[] arr ={
                "donout","king","donout",
        };
        String[] arr1 ={
                "true","false","true",
        };

        String[] arr2 ={
                "min","max","min",
        };

//        System.out.println(isPalingdrome(arr));
//        System.out.println(isPalingdrome(arr1));
//        System.out.println(isPalingdrome(arr2));


//        int[] data = {3,4,5,2,10};
//        int[] result = OrderevenBeforeadd(data);
        //
//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i]);
//        }


        int[] example1 = {9,9,9,9};
        int[] result1 = addOne(example1);
        for (int i = 0; i < result1.length ; i++) {
            System.out.print(result1[i]);
        }




    }







        public static int[] addOne(int[] digits) {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }
                digits[i] = 0;
            }

            int[] result = new int[digits.length+1];
            result[0] = 1;
            return result;
        }



    public static boolean isPalingdrome(String[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            if(arr[i] != arr[arr.length-i-1]){
                return false;
            }
        }
        return true;
    }



    public static int[] OrderevenBeforeadd(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;

        while (left < right) {

            if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }


            if (arr[left] % 2 == 0) {
                left++;
            }


            if (arr[right] % 2 != 0) {
                right--;
            }
        }

      //urut angka genap
        for (int i = 0; i < left - 1; i++) {
            for (int j = i + 1; j < left; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // urut angka ganjil
        for (int i = left; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }








    public static void initMatrix(){
        int[][] matrix = new int[2][2];
        matrix[0][1] = 10;

        var matrix2 = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
    }

    public static void displayMatrix(int[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("%3d", matrix[row][col]);
            }
            System.out.println();
        }
    }

    public static int[][] fillMatrixRandom(int n){
        int[][] matrix = new int[n][n];

        Random rand = new Random();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = rand.nextInt(11);
            }
        }
        return matrix;
    }

    public static int[][] matrixDiagonal(int n){
        int[][] matrix = new int[n][n];
        int counter = n;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(row == col){
                    matrix[row][col] = counter;
                    counter--;
                } else if (row > col) {
                    matrix[row][col] = 10;
                } else {
                    matrix[row][col] = 20;
                }

            }
        }
        return matrix;
    }

    public static int[][] matrikDiagonal(int n){
        int[][] matrix = new int[n][n];
        int counter = n;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(row == col){
                    matrix[row][col] = row;
                } else if (row > col) {
                    matrix[row][col] = 10;
                } else {
                    matrix[row][col] = 20;
                }

            }
        }
        return matrix;
    }


    public static int[][] matrix4(int n){
        int[][] matrix = new int[n][n];
        for (int row = 0; row < n - 1; row++) {
            for (int col = 0; col < n - 1; col++) {
                matrix[row][col] = row + col;
                matrix[row][n-1] += matrix[row][col];
                matrix[n-1][row] += matrix[row][col];
            }
        }

//        matrix[n-1][n-1] = matrix[n-2][n-1]*2;
        for (int i = 0; i < n - 1; i++) {
            matrix[n-1][n-1] += matrix[n-1][i];
        }
        return matrix;
    }




}