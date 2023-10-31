package LOGICA_lv0;

import java.util.Scanner;

public class L12 {
    public static void main(String[] args) {
        //Tabla de multiplicar: Escribe un programa que muestre la tabla de multiplicar de un número.
        Scanner sc  = new Scanner(System.in);
        int numero = sc.nextInt();
        sc.close();
        System.out.println("----------");

        for(int i=1; i<=10; i++){
            System.out.println(numero+" X "+i+" = "+ (i*numero));
        }

    }
}