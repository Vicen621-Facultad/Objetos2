package io.github.vicen621.ejercicio1.exporters;

import io.github.vicen621.ejercicio1.Socio;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class JsonSimpleExporter {

    private JSONObject exportar(Socio socio) {
        JSONObject object = new JSONObject();
        try {
            object.put("nombre", socio.getNombre());
            object.put("email", socio.getEmail());
            object.put("legajo", socio.getLegajo());
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        return object;
    }

    public String exportar(List<Socio> socios) {
        JSONArray array = new JSONArray();
        socios.forEach(socio -> array.put(this.exportar(socio)));
        return array.toString();
    }
}
