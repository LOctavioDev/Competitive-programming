package LOGICA_lv0;
import java.util.Scanner;

public class L4 {
    public static void main(String[] args) {
        //Factorial de un número: Escribe un programa que calcule el factorial de un número entero.
        Scanner sc = new Scanner(System.in);
        int num, fact=1; 
        num = sc.nextInt();

        sc.close();

        for(int i = 1; i <= num; i++){ 
            fact *= i;
        }

        System.out.println(fact);

    }
}
