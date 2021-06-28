import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int[] valores = valores();
        int valor1 = min(valores);
        int valor2 = max(valores);
        fizzBuzz(valor1, valor2);
    }

    static List<String> fizzBuzz(int valor1, int valor2) {
        List<String> secuenciaNumeros = new ArrayList<>();
        for (int i = valor1; i < valor2; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                secuenciaNumeros.add("FizzBuzz");
            } else if (i % 2 == 0) {
                secuenciaNumeros.add("Fizz");
            } else if (i % 3 == 0) {
                secuenciaNumeros.add("Buzz");
            } else {
                secuenciaNumeros.add(Integer.toString(i));
            }
        }
        System.out.println(secuenciaNumeros);
        return secuenciaNumeros;
    }

    static int[] valores() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese otro número entero:");
        int numero2 = sc.nextInt();
        sc.close();
        int[] listaValores = {numero1, numero2};
        return listaValores;
    }

    static int max(int[] valores) {
        if (valores[0] > valores[1]) {
            return valores[0];
        }
        return  valores[1];
    }
    
    static int min(int[] valores) {
        if (valores[0] < valores[1]) {
            return valores[0];
        }
        return  valores[1];
    }
}