import java.util.ArrayDeque;
import java.util.Deque;

public class Ejercicio1 {

    //Metodo que devuelve una cadena de 
    // texto invertida
    //texto -> COMPUTACION
    //return -> NOICATUPMOC
    // USANDO PILAS
    public String inverString (String texto) {

        Deque<Character> pila = new ArrayDeque<>();

        for (char letra : texto.toCharArray()) {
            pila.push(letra);
        }
        String invertido = "";
        while (!pila.isEmpty()) {
            invertido += pila.poll();
        }

        return invertido;
    }

}
