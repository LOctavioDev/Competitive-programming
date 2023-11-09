package LOGICA_lv1;

import java.util.Scanner;

public class L1 {
    public static void main(String[] args) {
        //Calculadora básica: Escribe un programa que realice operaciones aritméticas simples (suma, resta, multiplicación, división) con dos números.
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("----------");
        
        System.out.println("\n1.-Suma\n2.-Resta\n3.-Multiplicacion\n4.-Division\n\t");
        int opc = sc.nextInt();
        sc.close();

        switch (opc) {
            case 1: System.out.println(num1+num2);
                break;
            case 2: System.out.println(num1-num2);
                break;
            case 3: System.out.println(num1*num2);
                break;
            case 4: System.out.println(num1/num2);
                break;
            default: System.out.println("NINGUNA OPCION ESTA DISPONIBLE");
                break;
        }

    }
}
