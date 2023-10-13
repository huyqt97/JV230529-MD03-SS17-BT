package baiTap.baiThem;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Register {
    public static void main(String[] args) throws IOException {
        List<User> users = new ArrayList<>();
        users.add(new User(1,"Tran linh", "Aa123456", true));
        users.add(new User(2,"Đặng Thùy", "Aa123456", true));
        users.add(new User(3,"Văn Đặng", "Aa123456", true));
        File file = new File("src/baitap/users.dat");
        if (file.createNewFile()) {
            FileOutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream outputStream1 = new ObjectOutputStream(outputStream);
            outputStream1.writeObject(users);
            System.out.println("Tạo thành công!!");
        } else {
            System.err.println("File đã tồn tại!!");
        }
    }
}
