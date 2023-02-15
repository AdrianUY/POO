public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(123,"lolo","2344","1543");
        CuentaAhorro cuentaAhorro = new CuentaAhorro(cliente, 0.1);
        CuentaCorriente cuentaCorriente = new CuentaCorriente(cliente,100.0);

        cuentaAhorro.depositar(1000.0);
        cuentaCorriente.depositar(1000.0);

        cuentaAhorro.cobrarInteres();
        Double interes = cuentaAhorro.cobrarInteres();
        System.out.println(interes);
        System.out.println(cuentaAhorro);

        cuentaCorriente.extraer(200.0);
        cuentaCorriente.extraer(1100.0);
        System.out.println(cuentaCorriente.getSaldo());
    }
}