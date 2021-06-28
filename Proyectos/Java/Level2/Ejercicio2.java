import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = listaNumeros(sc);
        agregarInicio(sc, numeros);
        agregarFinal(sc, numeros);
        sc.close();
    }
    static ArrayList<Integer> listaNumeros(Scanner sc) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i=0; i<5; i++) {
            System.out.println("Ingrese un numero entero a la lista");
            int numero = sc.nextInt();
            numeros.add(numero);
        }
        return numeros;
    }
    
    static void agregarInicio(Scanner sc, ArrayList<Integer> numeros) {
        System.out.println("Ingrese un numero al inicio de la lista");
        int numero = sc.nextInt();
        numeros.add(0, numero);
        System.out.println(numeros);
    }
    
    static void agregarFinal(Scanner sc, ArrayList<Integer> numeros) {
        System.out.println("Ingrese un numero al final de la lista");
        int numero = sc.nextInt();
        numeros.add(numero);
        System.out.println(numeros);
    }
}
