package libros;

    public class Main {
    public static void main(String[] args) {

        // Crear un objeto Libro
        Libro libro1 = new Libro("LB-001", "Gabriel García Márquez", true, 2015);

        // Mostrar información inicial
        System.out.println("Identificador: " + libro1.getIdentificador());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Disponible: " + libro1.isDisponible());
        System.out.println("Año de publicación: " + libro1.getAnioPublicacion());

        // Probar método reservar
        libro1.reservar();
        System.out.println("Disponible después de reservar: " + libro1.isDisponible());

        // Probar método esAptoParaPrestamo
        boolean apto = libro1.esAptoParaPrestamo(2024);
        System.out.println("¿Es apto para préstamo? " + apto);


    }}
