package io.github.vicen621.filters_pipes;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import io.github.vicen621.filtros.*;
import io.github.vicen621.pipes.ImageFilterPipe;

import java.awt.image.BufferedImage;

public class PNGFilterLauncher {
    private static Map<String, ImageFilter> filters = new HashMap<String, ImageFilter>();
    private static ArrayList<ImageFilter> activeFilters = new ArrayList<ImageFilter>();
    private static File inputFile;
    private static File outputFile;

    public static void main(String args[]) {
        // Initialize the list of filers
        PNGFilterLauncher.initializeFilters();

        // Process the arguments
        if (args.length < 2) {
            System.out.println("Usage: java Main input-file output-file [--filter]");
            return;
        }
        PNGFilterLauncher.processArgs(args);

        // Read the image file
        BufferedImage image;
        try {
            image = ImageIO.read(inputFile);
        } catch(IOException exception) {
            System.err.println("Unable to read file: " + inputFile + "\n" + exception);
            return;
        }

        // Convert to 8-bit RGB Colorspace
        BufferedImage newImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);
        newImage.getGraphics().drawImage(image, 0, 0, null);
        image = newImage;

        // Filter the image
        for (ImageFilter activeFilter : activeFilters) {
            image = ((ImageFilter) activeFilter).filter(image);
        }

        // Write the image file
        try {
            ImageIO.write(image, "png", outputFile);
        } catch(IOException exception) {
            System.err.println("Unable to write file: " + outputFile + "\n" + exception);
            return;
        }
    }

    static void processArgs(String args[]) {
        // Get the input and output file values
        inputFile = new File(args[0]);
        outputFile = new File(args[1]);

        for (int i = 2; i < args.length; i++) {
            ImageFilter filter = filters.get(args[i]);
            if (filter == null) {
                System.out.println("No filter matches '" + args[i] + "'");
            } else {
                activeFilters.add(filter);
            }
        }
    }

    static ImageFilter getRainbowArtifactPipe(){
        ImageFilterPipe aPipe = new ImageFilterPipe(new Rainbow() )  ;
        aPipe.addFilter(new Artifacter() );
        return aPipe;
    }

    static ImageFilter getMonoArtifactPipe(){
        ImageFilterPipe aPipe = new ImageFilterPipe(new Monochrome() )  ;
        aPipe.addFilter(new Artifacter() );
        return aPipe;
    }

    static void initializeFilters() {
        filters.put("--rainbow", new Rainbow());
        filters.put("--artifacter", new Artifacter());
        filters.put("--rgb-shifter", new RGBShifter());
        filters.put("--repeater", new Repeater());
        filters.put("--rgb-shift-repeater", new RGBShiftRepeater());
        filters.put("--none", new Dull());
        filters.put("--mono", new Monochrome());
        filters.put("--rain-arti", getRainbowArtifactPipe());
        filters.put("--mono-arti", getMonoArtifactPipe());

    }
}
