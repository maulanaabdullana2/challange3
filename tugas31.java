package day01;

import java.util.Scanner;

public class tugas31 {
    public static void main(String[] args) {
        tugas1(5);

        tugas2(5);

        tugas3(5);

        tugas4(5);

        tugas5(5);

        tugas6(5);

//        tugas7();

        tugas9(9);

//        tugas9(5);


        tugas10(9);

//        tugas10(5);


        int num = 42;
        int num1 = 415;
        int num2 = 4563;

        System.out.println(Reverse(num));
        System.out.println(Reverse(num1));
        System.out.println(Reverse(num2));


        int palingdrome = 121;
        int palingdrome1 = 2147447412;
        int palingdrome2 = 110;
        System.out.println(isPalingdrome(palingdrome));
        System.out.println(isPalingdrome(palingdrome1));
        System.out.println(isPalingdrome(palingdrome2));


        String text = "this is a very special title";
        System.out.println(Capitalize(text));


        System.out.println(duplicateKey("abcde"));


        System.out.println(isBrace("()()"));





    }

    public static void tugas1(int n) {
        int num = 1;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", num);
                num++;
            }
            System.out.println();
        }
        System.out.println();
    }



    public static void tugas2(int n) {
        for (int i = 1; i <= n ; i++) {
            int num = i;
            for (int j = 1 ; j<=i ; j++) {
                System.out.printf("%2d",num);
                num++;
            }
            System.out.println();
        }
        System.out.println();
    }



    public  static  void tugas3(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = i; j <= n; j++) {
                System.out.printf("%2d",j);
            }
            System.out.println();
        }
        System.out.println();
    }


    public  static  void tugas4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                if (i <= j){
                    System.out.print(j);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }


    public static  void tugas5(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j){
                    System.out.printf("%2d ",j);
                }else if(i<j){
                    System.out.printf("%2d ",10);
                }else {
                    System.out.printf("%2d ",20);
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static  void tugas6(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                if (i == j){
                    System.out.printf("%2d ",j);
                }else if(i<j){
                    System.out.printf("%2d ",10);
                }else {
                    System.out.printf("%2d ",20);
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void tugas7(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Jumlah Baris Baris:");
        int n = scan.nextInt();
        for (int i = n; i >=1 ; i--) {
            for (int j = i; j >= 1 ; j--) {
                System.out.printf("%2d",j);
            }

            for (int k = 2; k <= i ; k++) {
                System.out.printf("%2d",k);
            }

            System.out.println();
        }

        System.out.println();

    }

    public static void tugas9(int n)  {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = n; j >= 1; j--) {
                    System.out.printf("%2d ", j);
                }
            }else {
                for (int j = 1; j <=n ; j++) {
                    System.out.printf("%2d ",j);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    
    
    public static void tugas10(int n){
        for (int i = 1; i <= n ; i++) {
            if (i%2 != 0){
                for (int j = 1; j <= n; j++) {
                    if (j % 2 == 0){
                        System.out.printf("%2d",j);
                    }else {
                        System.out.print(" -");
                    }
                }
            }else {
                for (int j = 1; j <= n; j++) {
                    if (j % 2 != 0){
                        System.out.printf("%2d",j);
                    }else {
                        System.out.print(" -");
                    }
                }
            }
            System.out.println();
        }

        System.out.println();
    }



    public static int Reverse(int n) {
        int num = 0;
        while (n > 0){
           num = num * 10 + n % 10;
           n = n /10;
        }
        return  num;

    }

    public static Boolean isPalingdrome(int n){
        return Reverse(n) == n;
    }

    public  static String Capitalize(String input){
        if (input == null || input.trim().isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        String[] words = input.split(" ");
                for(String word : words){
                    result.append(Character.toTitleCase(word.charAt(0)));
                    result.append(word.substring(1));
                   result.append(" ");

                }

        return  result.toString();
    }



    public static boolean duplicateKey(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length() ; j++) {
                if (s.charAt(i) == s.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean isBrace(String s){
        int openCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '('){
                openCount ++;
            }else if (c == ')'){
                openCount --;
                if (openCount < 0) {
                    return false;
                }
            }
        }
        return openCount == 0;
    }


}
