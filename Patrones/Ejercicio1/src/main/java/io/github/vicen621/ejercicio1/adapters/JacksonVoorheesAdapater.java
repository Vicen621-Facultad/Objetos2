package io.github.vicen621.ejercicio1.adapters;

import io.github.vicen621.ejercicio1.Socio;
import io.github.vicen621.ejercicio1.exporters.JacksonExporter;
import io.github.vicen621.ejercicio1.exporters.VoorheesExporter;

import java.util.List;

public class JacksonVoorheesAdapater extends VoorheesExporter {

    private JacksonExporter jacksonExporter;

    public JacksonVoorheesAdapater() {
        jacksonExporter = new JacksonExporter();
    }

    @Override
    public String exportar(List<Socio> socios) {
        return jacksonExporter.exportar(socios);
    }
}
