package ejercicio6Empleado;

public class Empleado {

    // 1. Atributos privados
    private String claveEmpleado;
    private double salarioMensual;
    private double porcentajeRetencion; // porcentaje de impuestos (ej. 10 = 10%)

    // 2. Constructor
    public Empleado(String claveEmpleado, double salarioMensual, double porcentajeRetencion) {
        this.claveEmpleado = claveEmpleado;
        this.salarioMensual = salarioMensual;
        this.porcentajeRetencion = porcentajeRetencion;
    }

    // 3. Getters y Setters
    public String getClaveEmpleado() {
        return claveEmpleado;
    }

    public void setClaveEmpleado(String claveEmpleado) {
        this.claveEmpleado = claveEmpleado;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0) {
            this.salarioMensual = salarioMensual;
        } else {
            System.out.println("El salario debe ser mayor a 0.");
        }
    }

    public double getPorcentajeRetencion() {
        return porcentajeRetencion;
    }

    public void setPorcentajeRetencion(double porcentajeRetencion) {
        if (porcentajeRetencion >= 0) {
            this.porcentajeRetencion = porcentajeRetencion;
        } else {
            System.out.println("El porcentaje de retención no puede ser negativo.");
        }
    }

    // 4. Métodos de comportamiento

    // Comportamiento 1: Calcular salario neto
    public double calcularSalarioNeto() {
        double impuestos = salarioMensual * (porcentajeRetencion / 100);
        return salarioMensual - impuestos;
    }

    // Comportamiento 2: Aplicar aumento
    public void aplicarAumento(double porcentajeAumento) {
        if (porcentajeAumento > 0) {
            double aumento = salarioMensual * (porcentajeAumento / 100);
            salarioMensual += aumento;
            System.out.println("Aumento aplicado correctamente.");
        } else {
            System.out.println("El porcentaje de aumento debe ser mayor a 0.");
        }
    }
}


