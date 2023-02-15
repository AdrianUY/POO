public abstract class Cuenta {
    private Double saldo;
    private Cliente cliente;

    public Cuenta(Cliente cliente) {
        this.saldo = 0.0;
        this.cliente = cliente;
    }

    public void depositar(Double monto){
        saldo += monto;
    }

    public void extraer(Double monto){
        if(saldo > monto) {
            saldo -= monto;
        }
    }
    public Double informarSaldo(){
        return saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
