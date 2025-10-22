package ejercicios.ejercicio4;

public class Cuenta {

    // Atributos
    protected String titular;
    protected double saldo;

    // Constructor
    public Cuenta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Metodo para depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            saldo = saldo + monto;
            System.out.println("Depósito de $" + monto + " realizado. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("El monto a depositar debe ser mayor que 0.");
        }
    }

    // Metodo para retirar dinero
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo = saldo - monto;
            System.out.println("Retiro de $" + monto + " realizado. Saldo restante: $" + saldo);
        } else if (monto <= 0) {
            System.out.println("El monto a retirar debe ser mayor que 0.");
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    // Metodo para consultar el saldo
    public double getSaldo() {
        return saldo;
    }
}