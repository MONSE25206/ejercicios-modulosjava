package ejercicio5vehiculo;

public class Main {
    public static void main(String[] args) {

        // Crear un objeto Automovil
        Automovil auto1 = new Automovil("Toyota", 2010, 180.5);

        // Mostrar datos iniciales
        System.out.println("Marca: " + auto1.getMarca());
        System.out.println("Año de fabricación: " + auto1.getAnioFabricacion());
        System.out.println("Velocidad máxima: " + auto1.getVelocidadMaxima() + " km/h");

        // Probar encendido
        String mensajeEncendido = auto1.encender();
        System.out.println(mensajeEncendido);

        // Calcular antigüedad
        int antiguedad = auto1.calcularAntiguedad(2024);
        System.out.println("Antigüedad del vehículo: " + antiguedad + " años");
    }
}


