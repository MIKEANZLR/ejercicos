public class Rectangulo {
    private double base;
    private double altura;
    private String etiqueta;

    public Rectangulo(double base, double altura, String etiqueta) {
        this.base = base;
        this.altura = altura;
        this.etiqueta = etiqueta;
    }

    public double getBase() { return base; }
    public double getAltura() { return altura; }
    public String getEtiqueta() { return etiqueta; }

    public void setBase(double base) { this.base = base; }
    public void setAltura(double altura) { this.altura = altura; }
    public void setEtiqueta(String etiqueta) { this.etiqueta = etiqueta; }

    // comportamiento 1
    public double area() {
        return base * altura;
    }

    // comportamiento 2
    public double perimetro() {
        return 2 * (base + altura);
    }
}
