

package CuentaBancaria;

public class Banco {
    private String nombreBanco;
    private String ciudad;
    private CuentaAhorro cuentaAhorro;

    // Constructor por defecto vacío
    public Banco() {
        this.nombreBanco = "";
        this.ciudad = "";
        this.cuentaAhorro = new CuentaAhorro();
    }

    // Constructor con parámetros
    public Banco(String nombreBanco, String ciudad, CuentaAhorro cuentaAhorro) {
        this.nombreBanco = nombreBanco;
        this.ciudad = ciudad;
        this.cuentaAhorro = cuentaAhorro;
    }

    // Métodos de acceso y modificadores
    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public CuentaAhorro getCuentaAhorro() {
        return cuentaAhorro;
}
    public void setCuentaAhorro(CuentaAhorro cuentaAhorro) {
    this.cuentaAhorro = cuentaAhorro;
}

// Método para acreditar una cantidad de dinero en la cuenta de ahorro
public void acreditarCuentaAhorro(double monto) {
    cuentaAhorro.acreditar(monto);
}

// Método para debitar una cantidad de dinero de la cuenta de ahorro
public void debitarCuentaAhorro(double monto) {
    cuentaAhorro.debitar(monto);
}

// Método para mostrar los datos de la cuenta de ahorro
public void datosCuentaAhorro() {
    System.out.println("Datos de la cuenta de ahorro:");
    System.out.println("Número de cuenta: " + cuentaAhorro.getNumeroCuenta());
    System.out.println("CI del cliente: " + cuentaAhorro.getCI());
    System.out.println("Saldo actual: " + cuentaAhorro.getSaldo());
    System.out.println("Interés: " + cuentaAhorro.getInteres());
}
}