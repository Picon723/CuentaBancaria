package Objetos;

public class CuentaAhorros extends Cuenta{
    private Boolean activa;
    
    public CuentaAhorros(Double saldo, Integer consignaciones, Integer retiros,
            Double tasaA, Double comisionM, Boolean activa){
        super(saldo, consignaciones, retiros, tasaA, comisionM);
        this.activa = activa;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("------[CuentaAhorros]------");
        sb.append("\nSaldo = $").append(saldo);
        sb.append("\nTasa de interés = = ").append(tasaA).append("%");
        sb.append("\nComisión mensual = $").append(comisionM);
        sb.append("\nActiva = ").append(activa);
        return sb.toString();
    } 
}
