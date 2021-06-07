import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner e= new Scanner(System.in);
        
        System.out.println("Ingrese su nombre y apellido: ");
        String nombreApellido = e.nextLine();

        System.out.println("Ingrese su edad: ");
        String edad = e.nextLine();

        System.out.println("ingrese su direccion: ");
        String direccion = e.nextLine();

        System.out.println("Ingrese ciudad: ");
        String ciudad = e.nextLine();

        String mensaje = String.format("%s - %s  - %s  - %s", ciudad, direccion, edad, nombreApellido);
        System.out.println(mensaje);

        e.close();
    }
}
