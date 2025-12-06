package ejercicio4cuentasbancarias;

public class Main {
    public static void main(String[] args) {

        // Crear una cuenta de ahorro
        CuentaAhorro cuenta1 = new CuentaAhorro("AC-5001", "Monserrat Luna", 1500.00);

        // Mostrar datos iniciales
        System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
        System.out.println("Titular: " + cuenta1.getTitular());
        System.out.println("Saldo inicial: $" + cuenta1.getSaldo());

        // Realizar un depósito
        cuenta1.depositar(500);
        System.out.println("Saldo después del depósito: $" + cuenta1.getSaldo());

        // Realizar un retiro
        cuenta1.retirar(300);
        System.out.println("Saldo después del retiro: $" + cuenta1.getSaldo());
    }
}


