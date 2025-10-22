package ejercicios.ejercicio3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws Exception {

        Empleado emp1 = new Empleado("Sofía", "Jiménez", "Analista Financiera");
        EmpleadoRH rh1 = new EmpleadoRH("Carlos", "Rodríguez", "Especialista en Recursos Humanos");

        out.println("\nEmpleado:");
        emp1.trabajar();
        out.printf("Salario mensual: $%.2f\n", emp1.calcularSalario());

        out.println("\nEmpleado de Recursos Humanos:");
        rh1.trabajar();
        rh1.contratarEmpleado("María López");
        out.printf("Salario mensual con bono: $%.2f\n", rh1.calcularSalario());
    }
}