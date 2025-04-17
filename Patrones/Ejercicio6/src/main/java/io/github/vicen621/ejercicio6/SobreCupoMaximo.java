package io.github.vicen621.ejercicio6;

public class SobreCupoMaximo extends ExcursionState {
    @Override
    public void inscribirUsuario(User user, Excursion excursion) {
        excursion.inscribirListaEspera(user);
    }
}
