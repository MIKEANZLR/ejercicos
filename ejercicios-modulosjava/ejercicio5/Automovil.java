public class Automovil {
    private String marca;
    private int anioFabricacion;
    private int velocidadMaxima;

    public Automovil(String marca, int anioFabricacion, int velocidadMaxima) {
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() { return marca; }
    public int getAnioFabricacion() { return anioFabricacion; }
    public int getVelocidadMaxima() { return velocidadMaxima; }

    public void setMarca(String marca) { this.marca = marca; }
    public void setAnioFabricacion(int anioFabricacion) { this.anioFabricacion = anioFabricacion; }
    public void setVelocidadMaxima(int velocidadMaxima) { this.velocidadMaxima = velocidadMaxima; }

    // comportamiento 1
    public boolean encender() {
        return anioFabricacion >= 1990;
    }

    // comportamiento 2
    public int antiguedad(int anioActual) {
        return anioActual - anioFabricacion;
    }
}
