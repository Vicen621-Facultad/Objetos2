package io.github.vicen621.pipes;

import java.awt.image.BufferedImage;
import io.github.vicen621.filtros.ImageFilter;

public interface ImageFilterPipeInterface {
    BufferedImage filter(BufferedImage image);
    void addFilter(ImageFilter next);
    void setNextPipe(ImageFilterPipe newPipe);
    void addPipeFrom(ImageFilterPipe newPipe, ImageFilterPipe aPipe);
}
