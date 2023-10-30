package LOGICA_lv0;
import java.util.Scanner;

public class L3 {
    public static void main(String[] args) {
        //Número mayor: Escribe un programa que tome dos números y determine cuál es el mayor.
        Scanner sc = new Scanner(System.in);
        float num1,num2;

        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
        sc.close();

        if(num1 > num2)
            System.out.println("EL NUMER0 MAYOR ES: " + num1);
        else
            System.out.println("EL NUMERO MAYOR ES: " + num2);

    }
}
