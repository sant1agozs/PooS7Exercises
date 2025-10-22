package ejercicios.ejercicio3;

public class Empleado {

    // Atributos
    protected String nombre;
    protected String apellidos;
    protected String puesto;

    // Constantes
    protected static final int HORAS_TRABAJADAS_DIA = 8;
    protected static final double PAGO_HORA = 10.0; // dólares por hora

    // Constructor
    public Empleado(String nombre, String apellidos, String puesto) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.puesto = puesto;
    }

    // Metodo general
    public void trabajar() {
        System.out.println(nombre + " " + apellidos + " está trabajando como " + puesto + ".");
    }

    // Metodo para calcular el salario mensual
    public double calcularSalario() {
        int diasMes = 4 * 5; // 4 semanas * 5 días
        return HORAS_TRABAJADAS_DIA * PAGO_HORA * diasMes;
    }
}