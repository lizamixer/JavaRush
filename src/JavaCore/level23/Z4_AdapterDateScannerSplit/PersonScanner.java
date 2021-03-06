package JavaCore.level23.Z4_AdapterDateScannerSplit;

import java.io.IOException;
import java.text.ParseException;

public interface PersonScanner {
    Person read() throws IOException, ParseException;

    void close() throws IOException;
}
