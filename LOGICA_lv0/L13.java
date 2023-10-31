package LOGICA_lv0;

import java.util.Scanner;

public class L13{
    public static void main(String[] args) {
        //Cuenta regresiva: Escribe un programa que haga una cuenta regresiva desde un número dado hasta 0.
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        sc.close();
        System.out.println("----------");

        for(int i=numero; i>=0; i--){
            System.out.println(i);            
        }
    }
}
