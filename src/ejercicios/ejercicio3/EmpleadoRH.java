package ejercicios.ejercicio3;

public class EmpleadoRH extends Empleado {

    public EmpleadoRH(String nombre, String apellidos, String puesto) {
        super(nombre, apellidos, puesto);
    }

    // Metodo adicional propio de Recursos Humanos
    public void contratarEmpleado(String nombreNuevo) {
        System.out.println(nombre + " ha contratado a " + nombreNuevo + ".");
    }

    // Sobrescritura opcional: un empleado de RH puede tener un bono o comportamiento diff
    @Override
    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        double bono = salarioBase * 0.10; // bono del 10%
        return salarioBase + bono;
    }
}