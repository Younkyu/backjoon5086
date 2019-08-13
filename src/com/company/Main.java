package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a == 0 && b == 0) break;
            String result;
            if(a < b) result = "factor";
            else {
                result = "multiple";
                int temp = b;
                b = a;
                a = temp;
            }

            if( b % a != 0) result = "neither";

            System.out.println(result);
        }
    }
}
