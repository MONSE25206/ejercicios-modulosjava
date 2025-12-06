package ejercicio2Inventario;

public class Main {
    public static void main(String[] args) {

        // Crear un objeto Producto
        Producto prod1 = new Producto("REF-200", 30, 15.75);

        // Mostrar datos iniciales
        System.out.println("Referencia: " + prod1.getReferencia());
        System.out.println("Cantidad en stock: " + prod1.getCantidad());
        System.out.println("Precio unitario: $" + prod1.getPrecioUnitario());

        // Incrementar stock
        prod1.incrementarStock(20);
        System.out.println("Cantidad después de entrada: " + prod1.getCantidad());

        // Calcular valor total del stock
        double valorTotal = prod1.calcularValorTotal();
        System.out.println("Valor total del stock: $" + valorTotal);
    }

}
