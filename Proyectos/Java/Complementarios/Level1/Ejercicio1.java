import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String[] args ){
        Scanner j = new Scanner (System.in);
        System.out.println("Ingrese su Nombre: ");
        String Nombre= j.nextLine();
        System.out.println("Hola "+ Nombre);
        j.close();
    }
}
