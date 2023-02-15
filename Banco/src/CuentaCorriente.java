public class CuentaCorriente extends Cuenta{
    private Double montoGiroDescubierto;

    public CuentaCorriente(Cliente cliente, Double montoGiroDescubierto) {
        super(cliente);
        this.montoGiroDescubierto = montoGiroDescubierto;
    }

    @Override
    public void depositar(Double monto) {
        super.depositar(monto);
    }

    @Override
    public void extraer(Double monto) {
        if(monto <= (getSaldo()+montoGiroDescubierto)){
            setSaldo(getSaldo() - monto);
        }
    }
}
