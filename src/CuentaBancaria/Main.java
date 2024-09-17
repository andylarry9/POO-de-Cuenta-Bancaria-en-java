

package CuentaBancaria;

import java.util.Scanner;


public class Main {
public static void main(String[] args) {
// Creamos un objeto de la clase Banco
Banco banco = new Banco("Banco ABC", "Ciudad XYZ", new CuentaAhorro(1234567890L, "1234567", 1000, 0.05));

    Scanner scanner = new Scanner(System.in);
    int opcion;

    do {
        // Mostramos el menú de opciones
        System.out.println("Menu de opciones:");
        System.out.println("1. Acreditar dinero a la cuenta bancaria conocido su número de cuenta y el monto a depositar.");
        System.out.println("2. Debitar dinero de la cuenta bancaria conocido su número de cuenta y el monto a sacar.");
        System.out.println("3. Mostrar los datos de la cuenta bancaria conocido su número de cuenta.");
        System.out.println("4. Salir");

        // Leemos la opción ingresada por el usuario
        System.out.print("Ingrese una opción: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                // Acreditar dinero a la cuenta bancaria
                System.out.print("Ingrese el número de cuenta: ");
                long numeroCuenta = scanner.nextLong();
                System.out.print("Ingrese el monto a depositar: ");
                double monto = scanner.nextDouble();
                if (numeroCuenta == banco.getCuentaAhorro().getNumeroCuenta()) {
                    banco.acreditarCuentaAhorro(monto);
                    System.out.println("Monto depositado con éxito.");
                } else {
                    System.out.println("Número de cuenta incorrecto.");
                }
                break;
            case 2:
                // Debitar dinero de la cuenta bancaria
                System.out.print("Ingrese el número de cuenta: ");
                numeroCuenta = scanner.nextLong();
                System.out.print("Ingrese el monto a sacar: ");
                monto = scanner.nextDouble();
                if (numeroCuenta == banco.getCuentaAhorro().getNumeroCuenta()) {
                    if (banco.getCuentaAhorro().getSaldo() >= monto) {
                        banco.debitarCuentaAhorro(monto);
                        System.out.println("Monto sacado con éxito.");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                } else {
                    System.out.println("Número de cuenta incorrecto.");
                }
break;
case 3:
// Mostrar los datos de la cuenta bancaria
System.out.print("Ingrese el número de cuenta: ");
numeroCuenta = scanner.nextLong();
if (numeroCuenta == banco.getCuentaAhorro().getNumeroCuenta()) {
System.out.println("Datos de la cuenta bancaria:");
System.out.println("Número de cuenta: " + banco.getCuentaAhorro().getNumeroCuenta());
System.out.println("Titular de la cuenta: " + banco.getCuentaAhorro().getCI());
System.out.println("Saldo actual: " + banco.getCuentaAhorro().getSaldo());
} else {
System.out.println("Número de cuenta incorrecto.");
}
break;
case 4:
// Salir
System.out.println("Gracias por utilizar nuestro sistema bancario.");
break;
default:
// Opción inválida
System.out.println("Opción inválida. Por favor ingrese una opción válida.");
break;
}
} while (opcion != 4);
scanner.close();
}
}