package io.github.vicen621.ejercicio6;

public abstract class ExcursionState {
    public void inscribirUsuario(User user, Excursion excursion) {
        excursion.inscribirState(user);
    }

    public String obtenerInformacion(Excursion excursion) {
        return String.format(
                "Nombre: %s, costo: %f, fecha inicio: %tD, fecha fin: %tD, punto encuentro: %s",
                excursion.getNombre(),
                excursion.getPrecio(),
                excursion.getFechaIni(),
                excursion.getFechaFin(),
                excursion.getPuntoEncuentro()
        );
    }
}
