package LOGICA_lv0;

import java.util.Scanner;

public class L9 {
    public static void main(String[] args) {
        //Conteo de dígitos: Escribe un programa que cuente cuántos dígitos tiene un número.
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int contador=0;
        sc.close();
        System.out.println("----------");

        while (numero>=1) {
            numero/=10;
            contador++;
        }

        System.out.println("EL NUMERO "+numero+" TIENE: "+contador+" CIFRAS");

    }
}
