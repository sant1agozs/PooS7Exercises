package ejercicios.ejercicio1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws Exception {

        // Creamos un Gato
        Gato miGato = new Gato("Michi");
        Animal miAnimal = new Animal("Animal random");

        out.println("\nLlamando al método hacerSonido() del Animal:");
        miAnimal.hacerSonido();

        out.println("\nLlamando al método hacerSonido() del Gato:");
        miGato.hacerSonido();
    }
}