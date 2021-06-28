  
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<String> estudiantes = estudiantes();
        System.out.println("--------");
        clasificacion(estudiantes);
    }
    static List<String> estudiantes() {
        Scanner sc = new Scanner(System.in);
        List<String> listEstudiantes = new ArrayList<>();
        for (int i=0; i< 12; i++) {
            System.out.println("Ingrese el nombre del estudiante:");
            String estudiante = sc.nextLine();
            listEstudiantes.add(estudiante);
        }
        sc.close();
        return listEstudiantes;
    }
    

    static void clasificacion(List<String> estudiantes) {
        Collections.shuffle(estudiantes);
        List<String> curso1 = estudiantes.subList(0, 4);
        List<String> curso2 = estudiantes.subList(4, 8);
        List<String> curso3 = estudiantes.subList(8, 12);

        System.out.println("Curso 1: " + curso1);
        System.out.println("Curso 2: " + curso2);
        System.out.println("Curso 3: " + curso3);
    }
}
