package JavaCore.level23.Z2_AdapterFileOutputStream;

import java.io.IOException;

public interface AmigoStringWriter {
    void flush() throws IOException;

    void writeString(String s) throws IOException;

    void close() throws IOException;
}
