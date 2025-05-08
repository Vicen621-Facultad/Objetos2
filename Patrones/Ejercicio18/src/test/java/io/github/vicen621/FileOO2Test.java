package io.github.vicen621;

import io.github.vicen621.decorators.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileOO2Test {
    private IFile file;
    
    @BeforeEach
    public void setup() {
        file = new FileOO2("test", "txt", "rwxr-xr-x");
    }

    @Test
    public void test_without_strategy() {
        assertEquals("test", file.prettyPrint());
    }

    @Test
    public void test_nombre_extension() {
        IFile decorator = new ExtensionDecorator(file);
        assertEquals(file.getNombre() + " - " + file.getExtension(), decorator.prettyPrint());
    }

    @Test
    public void test_nombre_creacion_extension() {
        IFile decorator = new CreacionDecorator(file);
        decorator = new ExtensionDecorator(decorator);
        assertEquals(file.getNombre() + " - " + file.getCreacion().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " - " + file.getExtension(), decorator.prettyPrint());
    }

    @Test
    public void test_nombre_tamanio_permisos_extension() {
        IFile decorator = new TamanioDecorator(file);
        decorator = new PermisosDecorator(decorator);
        decorator = new ExtensionDecorator(decorator);
        assertEquals(file.getNombre() + " - " + file.getTamanio() + " - " + file.getPermisos() + " - " + file.getExtension(), decorator.prettyPrint());
    }
}
