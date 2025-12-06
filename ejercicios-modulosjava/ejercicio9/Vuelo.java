public class Vuelo {
    private String codigo;
    private int capacidad;
    private int reservados;

    public Vuelo(String codigo, int capacidad, int reservados) {
        this.codigo = codigo;
        this.capacidad = capacidad;
        this.reservados = reservados;
    }

    public String getCodigo() { return codigo; }
    public int getCapacidad() { return capacidad; }
    public int getReservados() { return reservados; }

    public void setCodigo(String codigo) { this.codigo = codigo; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }
    public void setReservados(int reservados) { this.reservados = reservados; }

    // comportamiento 1
    public boolean reservarAsiento() {
        if (reservados < capacidad) {
            reservados++;
            return true;
        }
        return false;
    }

    // comportamiento 2
    public double porcentajeOcupacion() {
        return (reservados * 100.0) / capacidad;
    }
}
