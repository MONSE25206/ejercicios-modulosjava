package ejercicio7Tareas;

public class Main {
    public static void main(String[] args) {

        // Crear una tarea
        Tarea tarea1 = new Tarea("Entregar reporte final", "Alta", false);

        // Mostrar datos iniciales
        System.out.println("Descripción: " + tarea1.getDescripcion());
        System.out.println("Prioridad: " + tarea1.getPrioridad());
        System.out.println("¿Completada?: " + tarea1.isCompletada());

        // Verificar si es urgente
        System.out.println("¿Es urgente?: " + tarea1.esUrgente());

        // Completar la tarea
        tarea1.completarTarea();
        System.out.println("¿Completada ahora?: " + tarea1.isCompletada());

        // Verificar urgencia nuevamente
        System.out.println("¿Es urgente ahora?: " + tarea1.esUrgente());
    }
}


