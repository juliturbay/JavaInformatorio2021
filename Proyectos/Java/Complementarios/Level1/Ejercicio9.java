import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner e= new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = e.nextLine().toLowerCase();
        System.out.println("Ingrese la letra que quiera buscar: ");

        char caracter = e.next().toLowerCase().charAt(0);
        int cont=0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)==  caracter) {
                cont++;
            }
        }
        System.out.println("El caracter aparce " + cont + " veces");
        e.close();
    }
}
