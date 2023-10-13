package ra.model.outputStream;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoOutPutStream {
    public static void main(String[] args) throws IOException {
    File output = new File("data.txt");
        if (output.createNewFile()){
            FileOutputStream fileOutputStream = new FileOutputStream(output);
            DataOutputStream outputStream = new DataOutputStream(fileOutputStream);
            outputStream.writeInt(1000);
            outputStream.writeUTF("Hello java");
            outputStream.writeBoolean(true);
            outputStream.writeDouble(3.14);
            outputStream.close();
            System.out.println("Đã ghi file thành công!");
        }
    }


}
