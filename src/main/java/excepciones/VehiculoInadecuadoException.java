package excepciones;

public class VehiculoInadecuadoException extends ExcepcionCorreos {
// Error de negocio cuando un vehículo no cumple las restricciones de envío o ruta 

    public VehiculoInadecuadoException(String mensaje) {
        super(mensaje);
    }

    public VehiculoInadecuadoException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
