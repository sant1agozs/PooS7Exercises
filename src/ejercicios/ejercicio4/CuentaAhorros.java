package ejercicios.ejercicio4;

public class CuentaAhorros extends Cuenta {

    // Constructor
    public CuentaAhorros(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    // Sobrescritura del metodo retirar con la validación del saldo mínimo
    @Override
    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a retirar debe ser mayor que 0.");
        } else if (monto > saldo) {
            System.out.println("Fondos insuficientes para realizar el retiro.");
        } else if ((saldo - monto) < 100) {
            System.out.println("No puede realizar el retiro. El saldo no puede quedar por debajo de $100.");
        } else {
            saldo = saldo - monto;
            System.out.println("Retiro de $" + monto + " realizado exitosamente. Saldo restante: $" + saldo);
        }
    }
}
