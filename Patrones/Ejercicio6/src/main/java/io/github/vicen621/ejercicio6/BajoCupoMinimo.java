package io.github.vicen621.ejercicio6;

public class BajoCupoMinimo extends ExcursionState {
    @Override
    public void inscribirUsuario(User user, Excursion excursion) {
        super.inscribirUsuario(user, excursion);
        if (excursion.getCantidadInscriptos() == excursion.getCupoMinimo()) {
            excursion.setState(new EntreCupos());
        }
    }

    @Override
    public String obtenerInformacion(Excursion excursion) {
        return super.obtenerInformacion(excursion) +
                String.format(
                        "\nCantidad usuarios faltantes para alcanzar cupo minimo: %d",
                        excursion.getCupoMinimo() - excursion.getCantidadInscriptos()
                );
    }
}
