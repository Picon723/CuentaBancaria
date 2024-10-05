package Objetos;

public class Cuenta {
    protected Double saldo;
    protected Integer consignaciones;
    protected Integer retiros;
    protected Double tasaA;
    protected Double comisionM;

    public Cuenta(Double saldo, Integer consignaciones, Integer retiros,
            Double tasaA, Double comisionM) {
        this.saldo = saldo;
        this.consignaciones = consignaciones;
        this.retiros = retiros;
        this.tasaA = tasaA;
        this.comisionM = comisionM;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Integer getConsignaciones() {
        return consignaciones;
    }

    public Integer getRetiros() {
        return retiros;
    }

    public Double getTasaA() {
        return tasaA;
    }

    public Double getComisionM() {
        return comisionM;
    }
    
    //metodos
    public void consignar(Double cantidad){
        System.out.println("Cantidad consignada = " + cantidad);
        saldo = saldo + cantidad;
        consignaciones = consignaciones + 1;
        
    }
     
    public void retirar(Double cantidad){
        System.out.println("Cantidad retirada = " + cantidad);
        saldo = saldo - cantidad;
        retiros = retiros + 1;
    }
    
    public void calcularInteres(){
        //interes = (saldo*tasaA)*t
        Double interes = (saldo * tasaA) * 1;
        saldo = saldo + interes;
    }
    
    public void extratoMensual(String nombre, Integer cuenta, String fecha){
        System.out.println(
                "Nombre del titular = " + nombre +
                "\nNumero de cuenta = " + cuenta +
                "\nFecha de emisión = " + fecha );
    }
    
}
