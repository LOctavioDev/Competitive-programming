package LOGICA_lv0;
import java.util.Scanner;

public class L2 {
    public static void main(String[] args) {
        //Área de un triángulo: Escribe un programa que calcule el área de un triángulo dado su base y altura.
        Scanner sc = new Scanner(System.in);
        float base,height;
        base = sc.nextFloat();
        height = sc.nextFloat();
        sc.close();

        System.out.println((base * height) / 2);

    }
}
