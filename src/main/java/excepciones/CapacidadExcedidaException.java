package excepciones;

public class CapacidadExcedidaException extends ExcepcionCorreos {
// Error de negocio cuando se supera la capacidad máxima de carga permitida

    public CapacidadExcedidaException(String mensaje) {
        super(mensaje);
    }

    public CapacidadExcedidaException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }

}
