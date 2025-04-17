package io.github.vicen621.ejercicio6;

import java.util.List;

public class EntreCupos extends ExcursionState {
    @Override
    public void inscribirUsuario(User user, Excursion excursion) {
        super.inscribirUsuario(user, excursion);

        if (excursion.getCantidadInscriptos() == excursion.getCupoMaximo()) {
            excursion.setState(new SobreCupoMaximo());
        }
    }

    @Override
    public String obtenerInformacion(Excursion excursion) {
        List<String> mails = excursion.getMailsInscriptos();

        StringBuilder sb = new StringBuilder();
        mails.forEach(mail -> sb.append(mail).append("\n"));

        return super.obtenerInformacion(excursion) + "\n" + sb +
                String.format(
                        "\nCantidad usuarios faltantes para alcanzar cupo máximo: %d",
                        excursion.getCupoMaximo() - excursion.getCantidadInscriptos()
                );
    }
}
