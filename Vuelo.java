package ejercicio9SRA;

public class Vuelo {

    // 1. Atributos privados
    private String codigoVuelo;
    private int capacidadMaxima;
    private int asientosReservados;

    // 2. Constructor
    public Vuelo(String codigoVuelo, int capacidadMaxima, int asientosReservados) {
        this.codigoVuelo = codigoVuelo;
        this.capacidadMaxima = capacidadMaxima;
        this.asientosReservados = asientosReservados;
    }

    // 3. Getters y Setters
    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        if (capacidadMaxima > 0) {
            this.capacidadMaxima = capacidadMaxima;
        } else {
            System.out.println("La capacidad debe ser mayor a 0.");
        }
    }

    public int getAsientosReservados() {
        return asientosReservados;
    }

    public void setAsientosReservados(int asientosReservados) {
        if (asientosReservados >= 0 && asientosReservados <= capacidadMaxima) {
            this.asientosReservados = asientosReservados;
        } else {
            System.out.println("Número de asientos reservados inválido.");
        }
    }

    // 4. Métodos de comportamiento

    // Comportamiento 1: Intentar reservar un asiento
    public void reservarAsiento() {
        if (asientosReservados < capacidadMaxima) {
            asientosReservados++;
            System.out.println("Reserva realizada correctamente.");
        } else {
            System.out.println("No hay asientos disponibles.");
        }
    }

    // Comportamiento 2: Calcular porcentaje de ocupación
    public double calcularPorcentajeOcupacion() {
        return (asientosReservados * 100.0) / capacidadMaxima;
    }
}


