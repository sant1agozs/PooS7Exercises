import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws Exception {

        // Creamos un Gato
        Gato miGato = new Gato("Michi");

        // Llamamos al metodo hacerSonido()
        miGato.hacerSonido();
    }
}