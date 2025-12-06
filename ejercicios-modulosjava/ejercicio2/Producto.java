public class Producto {
    private String referencia;
    private int cantidad;
    private double precio;

    public Producto(String referencia, int cantidad, double precio) {
        this.referencia = referencia;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getReferencia() { return referencia; }
    public int getCantidad() { return cantidad; }
    public double getPrecio() { return precio; }

    public void setReferencia(String referencia) { this.referencia = referencia; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public void setPrecio(double precio) { this.precio = precio; }

    // comportamiento 1
    public void agregarStock(int entrada) {
        cantidad += entrada;
    }

    // comportamiento 2
    public double valorTotal() {
        return cantidad * precio;
    }
}
