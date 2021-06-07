import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int factorial=1;
        System.out.println("Ingrese un numero para calcular el factorial: ");
        int num= e.nextInt();
        for (int i = 1; i <= num; i++) {
            factorial = factorial*i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
        e.close();
    }
}
