package clientes;

public class ClienteParticular extends Cliente {

    public ClienteParticular(String nif, String nombre, String correo) {
        super(TipoCliente.PARTICULAR, nif, nombre, correo);
    }

}
