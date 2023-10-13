package baiTap.baiThem;

import java.io.*;
import java.util.List;

public class RenderUsers {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("src/baitap/users.dat");
        ObjectInputStream inputStream1 = new ObjectInputStream(inputStream);
        try {
            List<User> users = (List<User>) inputStream1.readObject();
            File file = new File("src/baitap/users.txt");
            FileWriter fileWriter = new FileWriter(file);
            for (User user : users) {
                System.out.println(user);
                fileWriter.write(user.toString() + "\n");
            }
            fileWriter.close();
        } catch (ClassNotFoundException e) {
            System.err.println("Định dạng nhập vào không đúng!!");
        }
    }
}
