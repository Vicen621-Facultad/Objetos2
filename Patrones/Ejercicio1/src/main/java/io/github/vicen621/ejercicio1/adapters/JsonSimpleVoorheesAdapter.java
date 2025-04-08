package io.github.vicen621.ejercicio1.adapters;

import io.github.vicen621.ejercicio1.Socio;
import io.github.vicen621.ejercicio1.exporters.JsonSimpleExporter;
import io.github.vicen621.ejercicio1.exporters.VoorheesExporter;

import java.util.List;

public class JsonSimpleVoorheesAdapter extends VoorheesExporter {

    private JsonSimpleExporter jsonSimpleExporter;

    public JsonSimpleVoorheesAdapter() {
        jsonSimpleExporter = new JsonSimpleExporter();
    }

    @Override
    public String exportar(List<Socio> socios) {
        return jsonSimpleExporter.exportar(socios);
    }
}
