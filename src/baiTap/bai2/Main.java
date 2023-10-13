package baiTap.bai2;

import java.io.*;
import java.nio.file.Files;
public class Main {
    //Viết một chương trình cho phép người dùng sao chép các tập tin.
    // Người sử dụng cần phải cung cấp một tập tin nguồn (source file) và một tập tin đích (target file).
    //Chương trình sao chép tệp nguồn vào tệp tin đích và hiển thị số byte trong tệp.
    // Chương trình nên cảnh báo người dùng nếu tệp nguồn không tồn tại hoặc nếu tập tin đích đã tồn tại.
    //Để sao chép nội dung từ tệp tin nguồn đến tệp tin đích, bạn nên sử dụng luồng đầu vào để đọc byte từ tệp nguồn và luồng đầu ra để gửi byte đến tệp tin đích, bất kể nội dung của tệp.
    public static void main(String[] args) {
        File sourceFile = new File("file/products.dat");
        File targetFile = new File("src/baitap/bai2/pakage2/target.dat");

        try {
            if (sourceFile.exists() && !targetFile.exists()) {
                Files.copy(sourceFile.toPath(), targetFile.toPath());
                System.out.println("Copy thành công");
            } else {
                System.out.println("Tập tin nguồn tồn tại hoặc tệp tin đích đã tồn tại.");
            }
        } catch (IOException e) {
            System.out.println("Lỗi trong quá trình sao chép tệp tin.");
        }
    }
}
