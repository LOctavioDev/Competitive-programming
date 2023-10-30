package LOGICA_lv0;
import java.util.Scanner;

public class L1 {
    public static void main(String[] args) {
        //Suma de dos números: Escribe un programa que tome dos números y muestre su suma.
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        System.out.println(num1+num2);
    }
}