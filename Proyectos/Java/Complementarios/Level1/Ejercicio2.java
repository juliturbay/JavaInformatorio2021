import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        int num1 = n.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int num2 = n.nextInt();

        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
        System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
        System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
        System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));

        n.close();

    }
}
