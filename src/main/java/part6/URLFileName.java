package part6;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Извлечь имя файла, присутствующее в URI/URL в качестве пути.
 */
public class URLFileName {
    public static void main(String[] args) throws MalformedURLException {
        URI uri = URI.create("https://www.learning.com/packt/java.txt");
        Path URItoPath = Paths.get(uri.getPath()).getFileName();
        System.out.println(URItoPath);

        URL url = new URL("https://www.learning.com/packt/Java.txt");
        Path URLtoPth = Paths.get(url.getPath()).getFileName();
        System.out.println(URLtoPth);
    }
}
