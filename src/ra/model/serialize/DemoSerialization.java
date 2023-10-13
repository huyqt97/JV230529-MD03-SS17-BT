package ra.model.serialize;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DemoSerialization {
    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Honda", 12));
        students.add(new Student(2, "Toyota", 12));
        students.add(new Student(3, "huyndai", 12));

        File file = new File("student.txt");
        if (file.createNewFile()) {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(students);
            outputStream.close();
            System.out.println("Ghi file thành công!!");
        } else {
            System.out.println("file đã tồn tại!!");
        }
    }
}
