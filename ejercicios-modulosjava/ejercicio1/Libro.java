public class Libro {
    private String id;
    private String autor;
    private boolean disponible;

    public Libro(String id, String autor, boolean disponible) {
        this.id = id;
        this.autor = autor;
        this.disponible = disponible;
    }

    public String getId() { return id; }
    public String getAutor() { return autor; }
    public boolean isDisponible() { return disponible; }

    public void setId(String id) { this.id = id; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    // comportamiento 1
    public void reservar() {
        if (disponible) {
            disponible = false;
        }
    }

    // comportamiento 2
    public boolean aptoParaPrestamo(int antiguedad) {
        return antiguedad > 5;
    }
}
