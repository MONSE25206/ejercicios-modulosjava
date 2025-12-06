package ejercicio2Inventario;

public class Producto {

    // 1. Atributos privados
    private String referencia;
    private int cantidad;
    private double precioUnitario;

    // 2. Constructor
    public Producto(String referencia, int cantidad, double precioUnitario) {
        this.referencia = referencia;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    // 3. Getters y Setters
    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("Error: la cantidad no puede ser negativa.");
        }
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario > 0) {
            this.precioUnitario = precioUnitario;
        } else {
            System.out.println("Error: el precio debe ser mayor a 0.");
        }
    }

    // 4. Métodos de comportamiento

    // Comportamiento 1: Incrementar stock
    public void incrementarStock(int entrada) {
        if (entrada > 0) {
            this.cantidad += entrada;
            System.out.println("Stock incrementado correctamente.");
        } else {
            System.out.println("La cantidad de entrada debe ser mayor a 0.");
        }
    }

    // Comportamiento 2: Calcular valor total del stock
    public double calcularValorTotal() {
        return this.cantidad * this.precioUnitario;
    }
}
