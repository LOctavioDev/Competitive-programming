package LOGICA_lv1;

import java.util.Scanner;

public class L3 {
    public static void main(String[] args) {
        //Cálculo de la potencia de un número: Escribe un programa que calcule la potencia de un número, dado el número y el exponente.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int potencia = sc.nextInt();
        int total = 1;
        sc.close();
        System.out.println("-----------");

        for(int i=0; i<potencia; i++){
            total *= num;
        }

        System.out.println(total);

    } 
}
