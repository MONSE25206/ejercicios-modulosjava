package ejercicio6Empleado;

public class Main {
    public static void main(String[] args) {

        // Crear un objeto Empleado
        Empleado emp1 = new Empleado("EMP-900", 12000.00, 12);

        // Mostrar datos iniciales
        System.out.println("Clave del empleado: " + emp1.getClaveEmpleado());
        System.out.println("Salario mensual: $" + emp1.getSalarioMensual());
        System.out.println("Retención de impuestos: " + emp1.getPorcentajeRetencion() + "%");

        // Calcular salario neto
        double salarioNeto = emp1.calcularSalarioNeto();
        System.out.println("Salario neto: $" + salarioNeto);

        // Aplicar aumento
        emp1.aplicarAumento(10);
        System.out.println("Nuevo salario mensual: $" + emp1.getSalarioMensual());
    }
}


