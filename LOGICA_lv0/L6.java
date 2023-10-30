package LOGICA_lv0;
import java.util.Scanner;

public class L6 {
    public static void main(String[] args) {
        //Inversión de cadena: Escribe un programa que invierta una cadena de caracteres.

        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        String nuevaCadena = "";
        sc.close();
        
        for(int i = cadena.length()-1; i >= 0; i--){
            nuevaCadena += cadena.charAt(i);
        }

        System.out.println(nuevaCadena);

    }
}
