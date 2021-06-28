  
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> cartas = baraja();
        System.out.println(cartas);
        invertirOrden(cartas);
        aleatoriOrden(cartas);
    }
    static ArrayList<String> baraja() {
        ArrayList<String> cartas = new ArrayList<String>();
        cartas.add("A");
        for (int i=2; i<11; i++) {
            String carta = Integer.toString(i);
            cartas.add(carta);
        }
        cartas.add("J");
        cartas.add("Q");
        cartas.add("K");
        return cartas;
    }
    
    static void invertirOrden(ArrayList<String> cartas) {
        Collections.reverse(cartas);
        System.out.println(cartas);
    }

    static void aleatoriOrden( ArrayList<String> cartas) {
        Collections.shuffle(cartas);
        System.out.println(cartas);
    }
}
