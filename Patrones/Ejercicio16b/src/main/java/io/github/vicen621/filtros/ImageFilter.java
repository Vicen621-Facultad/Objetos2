package io.github.vicen621.filtros;

import java.awt.image.BufferedImage;


public interface ImageFilter {
    
    BufferedImage filter(BufferedImage image);
    
}
