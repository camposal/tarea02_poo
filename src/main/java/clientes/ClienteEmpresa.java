package clientes;

import utilidades.Validador;

public class ClienteEmpresa extends Cliente {

    private static double descuentoVolumen = 10.0;

    public ClienteEmpresa(String nif, String nombre, String correo) {
        super(TipoCliente.EMPRESA, nif, nombre, correo);
    }

    public double getDescuentoVolumen() {
        return descuentoVolumen;
    }

    public void setDescuentoVolumen(String descuento) {
        double nuevoDescuentoVolumen = Validador.validarDouble(descuento, "descuento por volumen");
        if (nuevoDescuentoVolumen >= 100) {
            throw new IllegalArgumentException("El descuento por volumen no puede ser 100% o mayor.");
        }
        ClienteEmpresa.descuentoVolumen = nuevoDescuentoVolumen;
    }
}
