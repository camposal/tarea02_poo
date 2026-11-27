package clientes;

import utilidades.Validador;

public abstract class Cliente {

    private static int contadorId = 1;

    private final String id;
    private final TipoCliente tipoCliente;
    private final String nif;
    private String nombre;
    private String correo;
    private Facturacion facturacion;

    protected Cliente(TipoCliente tipoCliente, String nif, String nombre, String correo) {
        if (tipoCliente == null) {
            throw new IllegalArgumentException("El tipo de cliente no puede ser nulo.");
        }
        boolean esEmpresa = (tipoCliente == TipoCliente.EMPRESA);
        this.tipoCliente = tipoCliente;
        this.nif = Validador.validarNif(nif, esEmpresa);
        this.nombre = Validador.validarString(nombre, esEmpresa);
        this.correo = Validador.validarCorreo(correo);
        this.facturacion = esEmpresa ? Facturacion.MENSUAL : Facturacion.CONTADO;
        this.id = "CN" + (contadorId++);
    }

    public String getId() {
        return id;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public Facturacion getFacturacion() {
        return facturacion;
    }

    public void setNombre(String nombre) {
        boolean esEstricto = (this.tipoCliente != TipoCliente.EMPRESA);
        this.nombre = Validador.validarString(nombre, esEstricto);
    }

    public void setCorreo(String correo) {
        this.correo = Validador.validarCorreo(correo);
    }

}
