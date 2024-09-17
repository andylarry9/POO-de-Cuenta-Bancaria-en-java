

package CuentaBancaria;


public class CuentaAhorro {
    private long numeroCuenta;
    private String CI;
    private double saldo;
    private double interes;

    // Constructor por defecto
    public CuentaAhorro() {
        this.numeroCuenta = 0;
        this.CI = "";
        this.saldo = 0.0;
        this.interes = 0.0;
    }

    // Constructor con parámetros
    public CuentaAhorro(long numeroCuenta, String CI, double saldo, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.CI = CI;
        this.saldo = saldo;
        this.interes = interes;
    }

    // Métodos de acceso y modificadores
    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    // Método para acreditar una cantidad de dinero a la cuenta
    public void acreditar(double monto) {
        saldo += monto;
    }

    // Método para debitar una cantidad de dinero de la cuenta (si hay saldo suficiente)
    public boolean debitar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            return true;
        } else {
            return false;
        }
    }

    // Método para imprimir los datos de la cuenta
    public void imprimirDatos() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("CI del cliente: " + CI);
        System.out.println("Saldo actual: " + saldo);
        System.out.println("Interés: " + interes);
    }
}
