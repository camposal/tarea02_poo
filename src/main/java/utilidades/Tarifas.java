package utilidades;

public final class Tarifas {
// Esta clase final no permite herencia 'extends'
// Los atributos estáticos pertenecen a la clase
// El constructor privado no permite instanciar desde fuera y la excepción desde adentro
// Los métodos estáticos permiten ser llamados sin objeto

    private static double tarifaBasePorKg = 2.50;
    private static double recargoCombustible = 0.12;
    private static double iva = 0.21;

    private Tarifas() {
        throw new UnsupportedOperationException("Clase no destinada a instanciarse.");
    }

    public static double getTarifaBasePorKg() {
        return tarifaBasePorKg;
    }

    public static double getRecargoCombustible() {
        return recargoCombustible;
    }

    public static double getIva() {
        return iva;
    }

    public static void setTarifaBasePorKg(String nuevaTarifa) {
        tarifaBasePorKg = Validador.validarDouble(nuevaTarifa, "tarifa base por kg");
    }

    public static void setRecargoCombustible(String nuevoRecargo) {
        recargoCombustible = Validador.validarDouble(nuevoRecargo, "recargo de combustible");
    }

    public static void setIva(String nuevoIva) {
        iva = Validador.validarDouble(nuevoIva, "IVA");
    }

}
