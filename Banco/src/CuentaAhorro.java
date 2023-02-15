public class CuentaAhorro extends Cuenta {
    private Double tazaInteres;

    public CuentaAhorro(Cliente cliente, Double tazaInteres) {
        super(cliente);
        this.tazaInteres = tazaInteres;
   //     setSaldo(getSaldo()*tazaInteres);
    }

    @Override
    public void depositar(Double monto) {
        super.depositar(monto);
    }

    @Override
    public void extraer(Double monto) {
        super.extraer(monto);
    }

    public Double cobrarInteres(){
        Double interes = getSaldo() * tazaInteres;//0.1 es el interes mensual
        return interes;
    }
}
