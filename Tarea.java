package ejercicio7Tareas;

public class Tarea {

    // 1. Atributos privados
    private String descripcion;
    private String prioridad; // Baja, Media, Alta
    private boolean completada;

    // 2. Constructor
    public Tarea(String descripcion, String prioridad, boolean completada) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.completada = completada;
    }

    // 3. Getters y Setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    // 4. Métodos de comportamiento

    // Comportamiento 1: Marcar como completada
    public void completarTarea() {
        if (!this.completada) {
            this.completada = true;
            System.out.println("La tarea ha sido marcada como completada.");
        } else {
            System.out.println("La tarea ya estaba completada.");
        }
    }

    // Comportamiento 2: Determinar si es urgente
    public boolean esUrgente() {
        return this.prioridad.equalsIgnoreCase("Alta") && !this.completada;
    }
}


