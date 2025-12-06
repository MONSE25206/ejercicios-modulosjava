package ejercicio5vehiculo;

public class Automovil {

    // 1. Atributos privados
    private String marca;
    private int anioFabricacion;
    private double velocidadMaxima;

    // 2. Constructor
    public Automovil(String marca, int anioFabricacion, double velocidadMaxima) {
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.velocidadMaxima = velocidadMaxima;
    }

    // 3. Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        if (anioFabricacion > 1900) {
            this.anioFabricacion = anioFabricacion;
        } else {
            System.out.println("El año de fabricación no es válido.");
        }
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        if (velocidadMaxima > 0) {
            this.velocidadMaxima = velocidadMaxima;
        } else {
            System.out.println("La velocidad máxima debe ser mayor a 0.");
        }
    }

    // 4. Métodos de comportamiento

    // Comportamiento 1: Simular encendido
    public String encender() {
        if (anioFabricacion >= 2000) {
            return "El vehículo ha encendido correctamente.";
        } else {
            return "El vehículo es muy antiguo y no encendió.";
        }
    }

    // Comportamiento 2: Calcular antigüedad
    public int calcularAntiguedad(int anioActual) {
        return anioActual - this.anioFabricacion;
    }
}


