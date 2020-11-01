package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageTypes){
        if(imageTypes == imageTypes.JPG) return new JpgReader();
        if(imageTypes == imageTypes.BMP) return new BmpReader();
        if(imageTypes == imageTypes.PNG) return new PngReader();
        else throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
