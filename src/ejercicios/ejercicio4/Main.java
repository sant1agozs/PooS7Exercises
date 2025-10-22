package ejercicios.ejercicio4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws Exception {

        Cuenta cuenta1 = new Cuenta("Carlos López", 250);
        CuentaAhorros cuenta2 = new CuentaAhorros("Ana Gómez", 150);

        out.println("\nCuenta normal:");
        cuenta1.depositar(100);
        cuenta1.retirar(50);

        out.println("\nCuenta de ahorros:");
        cuenta2.depositar(50);
        cuenta2.retirar(80);  // Permitido
        cuenta2.retirar(60);  // No permitido (saldo < 100)
        cuenta2.retirar(1000); // No permitido (fondos insuficientes)
        cuenta2.retirar(1); // Permitido (119 left)
    }
}