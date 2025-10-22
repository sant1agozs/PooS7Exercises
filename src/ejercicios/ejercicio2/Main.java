package ejercicios.ejercicio2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws Exception {

        out.println("=== Ejercicio 2: Herencia con Figuras Geométricas ===");

        Rectangulo rect = new Rectangulo(5.0, 3.0);
        Circulo circ = new Circulo(2.5);

        // Creamos un rectangulo.
        out.println("\nRectángulo:");
        out.printf("Área: %.2f\n", rect.calcularArea());
        out.printf("Perímetro: %.2f\n", rect.calcularPerimetro());

        // Creamos un circulo.
        out.println("\nCírculo:");
        out.printf("Área: %.2f\n", circ.calcularArea());
        out.printf("Perímetro: %.2f\n", circ.calcularPerimetro());
    }
}