package Tarea;

import java.util.Scanner;

public class Conversion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        System.out.println("==========");
        sc.close();
    
        int cociente = decimal / 8;
        String octal = "" + (decimal % 8);
    
        while (cociente > 0) {
            octal = (cociente % 8) + octal;
            cociente /= 8;
        }
    
        System.out.println(octal);
    }
}