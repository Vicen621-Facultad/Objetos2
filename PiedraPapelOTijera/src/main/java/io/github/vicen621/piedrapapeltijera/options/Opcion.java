package io.github.vicen621.piedrapapeltijera.options;

import io.github.vicen621.piedrapapeltijera.Resultado;

public interface Opcion {
    Resultado jugarContra(Opcion other);
    Resultado jugarContraTijera(Tijera tijera);
    Resultado jugarContraPiedra(Piedra piedra);
    Resultado jugarContraPapel(Papel papel);
    Resultado jugarContraSpock(Spock spock);
    Resultado jugarContraLagarto(Lagarto lagarto);
}
