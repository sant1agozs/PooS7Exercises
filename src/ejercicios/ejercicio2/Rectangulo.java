package ejercicios.ejercicio2;

public class Rectangulo extends Figura {
    private double largo;
    private double ancho;

    // Constructor
    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    // Sobrescritura de los métodos
    @Override
    public double calcularArea() {
        return largo * ancho;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largo + ancho);
    }

    // Getters opcionales
    public double getLargo() { return largo; }
    public double getAncho() { return ancho; }
}