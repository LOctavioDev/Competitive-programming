package LOGICA_lv0;

import java.util.Scanner;

public class L10 {
    public static void main(String[] args) {
        //Palíndromo: Escribe un programa que determine si una cadena es un palíndromo (se lee igual de izquierda a derecha y viceversa).
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        int tamanio = palabra.length();
        int contador = 0;
        sc.close();
        System.out.println("----------");

        for(int i = 0; i < palabra.length();i++){
            if(palabra.charAt(i) == palabra.charAt(tamanio-1)){
                contador++;
            }
            tamanio--;
        }
        if (contador == tamanio)
            System.out.println("NO ES PALINDROMO");
        else
            System.out.println("ES PALINDROMO");

    }
}