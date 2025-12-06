package ejercicio4cuentasbancarias;

public class CuentaAhorro {

        // 1. Atributos privados
        private String numeroCuenta;
        private String titular;
        private double saldo;

        // 2. Constructor
        public CuentaAhorro(String numeroCuenta, String titular, double saldo) {
            this.numeroCuenta = numeroCuenta;
            this.titular = titular;
            this.saldo = saldo;
        }

        // 3. Getters y Setters
        public String getNumeroCuenta() {
            return numeroCuenta;
        }

        public void setNumeroCuenta(String numeroCuenta) {
            this.numeroCuenta = numeroCuenta;
        }

        public String getTitular() {
            return titular;
        }

        public void setTitular(String titular) {
            this.titular = titular;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            if (saldo >= 0) {
                this.saldo = saldo;
            } else {
                System.out.println("El saldo no puede ser negativo.");
            }
        }

        // 4. Métodos de comportamiento

        // Comportamiento 1: Depósito
        public void depositar(double cantidad) {
            if (cantidad > 0) {
                this.saldo += cantidad;
                System.out.println("Depósito realizado correctamente.");
            } else {
                System.out.println("La cantidad a depositar debe ser mayor a 0.");
            }
        }

        // Comportamiento 2: Retiro
        public void retirar(double cantidad) {
            if (cantidad <= 0) {
                System.out.println("La cantidad a retirar debe ser mayor a 0.");
            } else if (cantidad > this.saldo) {
                System.out.println("Fondos insuficientes para realizar el retiro.");
            } else {
                this.saldo -= cantidad;
                System.out.println("Retiro realizado correctamente.");
            }
        }
    }

