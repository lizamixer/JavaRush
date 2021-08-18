package JavaCore.level20.Z23_FactoryMethodPattern;

import JavaCore.level20.Z23_FactoryMethodPattern.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes picture) {
        ImageReader imageReader = null;

        if (picture == null) {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        switch (picture) {
            case JPG:
                imageReader = new JpgReader();
                break;
            case BMP:
                imageReader = new BmpReader();
                break;
            case PNG:
                imageReader = new PngReader();
                break;
        }
        return imageReader;
    }

}

