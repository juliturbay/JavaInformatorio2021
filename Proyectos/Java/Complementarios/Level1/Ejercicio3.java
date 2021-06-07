import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner e= new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int num = e.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
        e.close();
    }
}
