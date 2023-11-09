package LOGICA_lv1;

import java.util.Scanner;

public class L2 {
    public static void main(String[] args) {
        //Mayor de tres números: Escribe un programa que determine cuál de tres números es el mayor.
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        sc.close();
        System.out.println("-----------");

        if (num1 > num2 & num1 > num3) {
            System.out.println(num1);
        }
        else if(num2 > num1 & num2 > num3){
            System.out.println(num2);
        }
        else
            System.out.println(num3);

    }
}
