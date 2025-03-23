package io.github.vicen621.piedrapapeltijera.options;

import io.github.vicen621.piedrapapeltijera.Resultado;

public class Piedra implements Opcion {
    @Override
    public Resultado jugarContra(Opcion other) {
        return other.jugarContraPiedra(this);
    }

    @Override
    public Resultado jugarContraTijera(Tijera tijera) {
        return new Resultado(this);
    }

    @Override
    public Resultado jugarContraPiedra(Piedra piedra) {
        return new Resultado(null);
    }

    @Override
    public Resultado jugarContraPapel(Papel papel) {
        return new Resultado(papel);
    }

    @Override
    public Resultado jugarContraSpock(Spock spock) {
        return new Resultado(spock);
    }

    @Override
    public Resultado jugarContraLagarto(Lagarto lagarto) {
        return new Resultado(this);
    }
}
