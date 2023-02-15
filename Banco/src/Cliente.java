public class Cliente {
    private Integer nroCliente;
    private String apellido;
    private String DNI;
    private String CUIT;

    public Cliente(Integer nroCliente, String apellido, String DNI, String CUIT) {
        this.nroCliente = nroCliente;
        this.apellido = apellido;
        this.DNI = DNI;
        this.CUIT = CUIT;
    }
}
