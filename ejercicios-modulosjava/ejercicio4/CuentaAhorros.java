public class CuentaAhorro {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaAhorro(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() { return numeroCuenta; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }

    public void setNumeroCuenta(String numeroCuenta) { this.numeroCuenta = numeroCuenta; }
    public void setTitular(String titular) { this.titular = titular; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    // comportamiento 1
    public void depositar(double monto) {
        saldo += monto;
    }

    // comportamiento 2
    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }
}
