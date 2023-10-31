package LOGICA_lv0;

import java.util.Scanner;

public class L15{
    public static void main(String[] args) {
        //Factorización: Escribe un programa que descomponga un número en sus factores primos.
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        sc.close();
        System.out.println("---------");

        for(int i=2; i<Math.sqrt(numero); i++){
            while (numero%i == 0) {
                System.out.println(i);
                numero /=i;
            }
        }

        if(numero>1){
            System.out.println(numero);
        }
    }
}