package ejercicio3geometriabasica;

public class Rectangulo {

    // 1. Atributos privados
    private double base;
    private double altura;
    private String etiqueta;

    // 2. Constructor
    public Rectangulo(double base, double altura, String etiqueta) {
        this.base = base;
        this.altura = altura;
        this.etiqueta = etiqueta;
    }

    // 3. Getters y Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        } else {
            System.out.println("La base debe ser mayor a 0.");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("La altura debe ser mayor a 0.");
        }
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    // 4. Métodos de comportamiento

    // Comportamiento 1: Calcular área
    public double calcularArea() {
        return this.base * this.altura;
    }

    // Comportamiento 2: Calcular perímetro
    public double calcularPerimetro() {
        return 2 * (this.base + this.altura);
    }
}

