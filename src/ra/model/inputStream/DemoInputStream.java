package ra.model.inputStream;

import java.io.*;

public class DemoInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("data.txt");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        System.out.println(dataInputStream.readBoolean());
    }
}
