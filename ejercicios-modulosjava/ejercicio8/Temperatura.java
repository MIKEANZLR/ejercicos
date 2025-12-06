public class Temperatura {
    private double valor;
    private String unidad;
    private String fecha;

    public Temperatura(double valor, String unidad, String fecha) {
        this.valor = valor;
        this.unidad = unidad;
        this.fecha = fecha;
    }

    public double getValor() { return valor; }
    public String getUnidad() { return unidad; }
    public String getFecha() { return fecha; }

    public void setValor(double valor) { this.valor = valor; }
    public void setUnidad(String unidad) { this.unidad = unidad; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    // comportamiento 1
    public void convertir() {
        if (unidad.equalsIgnoreCase("C")) {
            valor = valor * 9 / 5 + 32;
            unidad = "F";
        } else {
            valor = (valor - 32) * 5 / 9;
            unidad = "C";
        }
    }

    // comportamiento 2
    public boolean esExtrema() {
        return unidad.equals("C") && valor > 40;
    }
}
