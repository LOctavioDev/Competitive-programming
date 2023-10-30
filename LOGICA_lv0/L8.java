package LOGICA_lv0;
import java.util.Scanner;

public class L8 {
    public static void main(String[] args) {
        //Secuencia de Fibonacci: Escribe un programa que genere la secuencia de Fibonacci hasta un cierto número.
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int sum = 1, num1 = 0, num2 = 1;
        sc.close();
        System.out.println("------------------");

        for(int i = 1; i < numero; i++){
            System.out.println(sum);
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;

        }

    }
}
