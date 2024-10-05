package Main;

import Objetos.CuentaAhorros;

public class Ejecutar {
    public static void main(String[] args) {
        CuentaAhorros cuenta_1 = new CuentaAhorros(100000.0, 0, 0, 0.1, 0.0,
                true);
        System.out.println(cuenta_1.toString());
        
        cuenta_1.calcularInteres();
        cuenta_1.consignar(50000.0);
        cuenta_1.retirar(70000.0);
        
        System.out.println("Numero de consignaciones = " +
                cuenta_1.getConsignaciones());
        
        System.out.println("Numero de retiros = " + cuenta_1.getRetiros());
        
        System.out.println("Saldo total= $" + cuenta_1.getSaldo());
        
        cuenta_1.extratoMensual("TONY", 1005331183, "5/enero/2024");
    }
}
