import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int resul=0;
        System.out.println("Ingrese los numero a multiplicar: ");
        int num1 = e.nextInt();
        int num2 = e.nextInt();

        for (int i = 0; i < num2; i++) {
            resul += num1;
        }

        System.out.println(num1 + " * " + num2 + " = " + resul);
        e.close();
    }
}
