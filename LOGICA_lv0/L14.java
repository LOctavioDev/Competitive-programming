package LOGICA_lv0;

import java.util.Scanner;

public class L14{
    //Calcule la suma de todos los numeros pares hasta un numero dado
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int suma = 0;
        sc.close();
        System.out.println("-----------");

        for(int i=0; i<=numero;i++){
            if(i%2==0){
                suma += i;
            }
        }

        System.out.println(suma);
    }
}