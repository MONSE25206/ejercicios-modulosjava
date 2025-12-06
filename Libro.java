package libros;

public class Libro {

    // 1. Atributos privados
    private String identificador;
    private String autor;
    private boolean disponible;  // true = disponible, false = prestado
    private int anioPublicacion;

    // 2. Constructor
    public Libro(String identificador, String autor, boolean disponible, int anioPublicacion) {
        this.identificador = identificador;
        this.autor = autor;
        this.disponible = disponible;
        this.anioPublicacion = anioPublicacion;
    }

    // 3. Getters y Setters
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    // 4. Métodos de comportamiento

    // Comportamiento 1: Reservar libro
    public void reservar() {
        if (this.disponible) {
            this.disponible = false;
            System.out.println("El libro ha sido reservado correctamente.");
        } else {
            System.out.println("El libro no está disponible para reserva.");
        }
    }

    // Comportamiento 2: Verificar si es apto para préstamo
    public boolean esAptoParaPrestamo(int anioActual) {
        int antiguedad = anioActual - this.anioPublicacion;
        return antiguedad > 5;
    }
}
