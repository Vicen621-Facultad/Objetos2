package io.github.vicen621.pipes;

import io.github.vicen621.filtros.ImageFilter;

import java.awt.image.BufferedImage;

public class ImageFilterPipe implements ImageFilter, ImageFilterPipeInterface{
    protected ImageFilterPipeInterface nextPipe;
    private ImageFilter filter;

    public ImageFilterPipe(ImageFilter aFilter){
        filter = aFilter;
        nextPipe = new EndPipe();
    }
    
    public void addFilter(ImageFilter next){
        nextPipe.addPipeFrom(new ImageFilterPipe(next), this);
    }

    public void addPipeFrom(ImageFilterPipe newPipe, ImageFilterPipe aPipe){
        nextPipe.addPipeFrom(newPipe, this);
        
    }

    public void setNextPipe(ImageFilterPipe newPipe){
        nextPipe = newPipe;
    }

    public BufferedImage filter(BufferedImage image) {
        return nextPipe.filter(filter.filter(image));
    }
}
