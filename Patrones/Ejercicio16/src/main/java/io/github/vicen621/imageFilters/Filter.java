package io.github.vicen621.imageFilters;

import java.awt.image.BufferedImage;

public abstract class Filter {
    abstract public BufferedImage filter(BufferedImage image);
}
