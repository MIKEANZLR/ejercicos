public class Tarea {
    private String descripcion;
    private String prioridad;
    private boolean completada;

    public Tarea(String descripcion, String prioridad, boolean completada) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.completada = completada;
    }

    public String getDescripcion() { return descripcion; }
    public String getPrioridad() { return prioridad; }
    public boolean isCompletada() { return completada; }

    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setPrioridad(String prioridad) { this.prioridad = prioridad; }
    public void setCompletada(boolean completada) { this.completada = completada; }

    // comportamiento 1
    public void marcarCompletada() {
        completada = true;
    }

    // comportamiento 2
    public boolean esUrgente() {
        return prioridad.equalsIgnoreCase("Alta") && !completada;
    }
}
