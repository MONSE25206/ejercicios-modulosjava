package ejercicio8temperaturayclima;

public class Temperatura {

    // 1. Atributos privados
    private double valor;
    private String unidad; // "C" para Celsius, "F" para Fahrenheit
    private String fechaRegistro;

    // 2. Constructor
    public Temperatura(double valor, String unidad, String fechaRegistro) {
        this.valor = valor;
        this.unidad = unidad;
        this.fechaRegistro = fechaRegistro;
    }

    // 3. Getters y Setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    // 4. Métodos de comportamiento

    // Comportamiento 1: Convertir temperatura
    public void convertir() {
        if (unidad.equalsIgnoreCase("C")) {
            // Celsius → Fahrenheit
            valor = (valor * 9/5) + 32;
            unidad = "F";
            System.out.println("Convertido a Fahrenheit.");
        } else if (unidad.equalsIgnoreCase("F")) {
            // Fahrenheit → Celsius
            valor = (valor - 32) * 5/9;
            unidad = "C";
            System.out.println("Convertido a Celsius.");
        } else {
            System.out.println("Unidad no válida.");
        }
    }

    // Comportamiento 2: Evaluar si es extrema
    public boolean esExtrema() {
        if (unidad.equalsIgnoreCase("C")) {
            return valor > 40;
        } else if (unidad.equalsIgnoreCase("F")) {
            // Convertimos a Celsius para evaluar
            double celsius = (valor - 32) * 5/9;
            return celsius > 40;
        }
        return false;
    }
}


