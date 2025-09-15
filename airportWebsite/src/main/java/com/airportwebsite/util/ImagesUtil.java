// ImagesUtil.java (placeholder for image handling)
package com.airportwebsite.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ImagesUtil {
    public static byte[] loadImage(String path) throws IOException {
        return Files.readAllBytes(Paths.get(path));
    }
}