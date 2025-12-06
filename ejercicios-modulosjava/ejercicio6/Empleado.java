public class Empleado {
    private String clave;
    private double salarioMensual;
    private double retencion;

    public Empleado(String clave, double salarioMensual, double retencion) {
        this.clave = clave;
        this.salarioMensual = salarioMensual;
        this.retencion = retencion;
    }

    public String getClave() { return clave; }
    public double getSalarioMensual() { return salarioMensual; }
    public double getRetencion() { return retencion; }

    public void setClave(String clave) { this.clave = clave; }
    public void setSalarioMensual(double salarioMensual) { this.salarioMensual = salarioMensual; }
    public void setRetencion(double retencion) { this.retencion = retencion; }

    // comportamiento 1
    public double salarioNeto() {
        return salarioMensual - (salarioMensual * retencion / 100);
    }

    // comportamiento 2
    public void aumentarSalario(double porcentaje) {
        salarioMensual += salarioMensual * porcentaje / 100;
    }
}
