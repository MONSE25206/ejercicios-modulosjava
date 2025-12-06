package ejercicio9SRA;

public class Main {
    public static void main(String[] args) {

        // Crear un vuelo
        Vuelo vuelo1 = new Vuelo("MX-450", 120, 85);

        // Mostrar datos iniciales
        System.out.println("Código del vuelo: " + vuelo1.getCodigoVuelo());
        System.out.println("Capacidad máxima: " + vuelo1.getCapacidadMaxima());
        System.out.println("Asientos reservados: " + vuelo1.getAsientosReservados());

        // Intentar reservar un asiento
        vuelo1.reservarAsiento();
        System.out.println("Asientos reservados ahora: " + vuelo1.getAsientosReservados());

        // Calcular porcentaje de ocupación
        double porcentaje = vuelo1.calcularPorcentajeOcupacion();
        System.out.println("Porcentaje de ocupación: " + porcentaje + "%");
    }
}


