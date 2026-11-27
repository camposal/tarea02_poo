package clientes;

import utilidades.Validador;

public abstract class Cliente {

    private static int contadorId = 1;
    private final String id;
    private final TipoCliente tipoCliente;
    private String nombre;
    private String correo;

    protected Cliente(TipoCliente tipoCliente, String nombre, String correo) {
        if (tipoCliente == null) {
            throw new IllegalArgumentException("El tipo de cliente no puede ser nulo.");
        }
        boolean esEstricto = (tipoCliente != TipoCliente.EMPRESA);
        this.tipoCliente = tipoCliente;
        this.nombre = Validador.validarString(nombre, esEstricto);
        this.correo = Validador.validarCorreo(correo);
        this.id = "CN" + (contadorId++);
    }

    public String getId() {
        return id;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombre(String nombre) {
        boolean esEstricto = (this.tipoCliente != TipoCliente.EMPRESA);
        this.nombre = Validador.validarString(nombre, esEstricto);
    }

    public void setCorreo(String correo) {
        this.correo = Validador.validarCorreo(correo);
    }

}
