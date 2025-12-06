package ejercicio8temperaturayclima;

public class Main {

        public static void main(String[] args) {

            // Crear un registro de temperatura
            Temperatura temp1 = new Temperatura(42, "C", "2025-02-10");

            // Mostrar datos iniciales
            System.out.println("Valor: " + temp1.getValor() + "°" + temp1.getUnidad());
            System.out.println("Fecha: " + temp1.getFechaRegistro());

            // Verificar si es extrema
            System.out.println("¿Es extrema?: " + temp1.esExtrema());

            // Convertir unidad
            temp1.convertir();
            System.out.println("Nueva temperatura: " + temp1.getValor() + "°" + temp1.getUnidad());

            // Verificar nuevamente
            System.out.println("¿Es extrema ahora?: " + temp1.esExtrema());
        }
    }


