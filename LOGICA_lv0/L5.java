package LOGICA_lv0;
import java.util.Scanner;

public class L5 {
    public static void main(String[] args) {
        //Número primo: Escribe un programa que determine si un número es primo o no.

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        if(num % 2 == 0 )
            System.out.println("EL NUMERO ES PRIMO");
        else
            System.out.println("EL NUMERO NO ES PRIMO");
    }
}
