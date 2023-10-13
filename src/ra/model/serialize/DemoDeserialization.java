package ra.model.serialize;

import java.io.*;
import java.util.List;

public class DemoDeserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("student.txt");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        // avaiable trả ra số lượng byte khả dụng
        // nếu trả ra 0 tức là đã đọc hết file
        try {
            List<Student> students = (List<Student>) inputStream.readObject();
            for (Student student : students) {
                System.out.println(student);
            }
        } catch (EOFException e) {
            System.out.println("vcl hết rồi!!");
        }


    }
}
