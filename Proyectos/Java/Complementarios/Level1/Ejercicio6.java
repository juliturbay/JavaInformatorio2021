import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int resul=1;
        System.out.println("Ingrese la base: ");
        int base = e.nextInt();
        System.out.println("Ingrese la potencia: ");
        int potencia = e.nextInt();

        for (int i = 0; i < potencia; i++) {
            resul *= base;
        }

        System.out.println(base + " Elevado a " + potencia + " = " + resul);
        e.close();
    }
}
