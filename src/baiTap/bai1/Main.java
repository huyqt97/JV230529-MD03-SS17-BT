package baiTap.bai1;

import config.InputMethods;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Product> products = new ArrayList<>();
    public static File file = new File("file/products.dat");

    //Viết một chương trình cho phép người dùng thêm, hiển thị, tìm kiếm thông tin sản phẩm vào file.
    public static void main(String[] args) {
        do {
            System.out.println("<---------------MENU--------------->");
            System.out.println("1. Thêm sản phẩm ");
            System.out.println("2. Hiển thị tất cả sản phẩm ");
            System.out.println("3. Tìm kiếm sản phẩm ");
            System.out.println("4. Thoát ");
            System.out.print("Nhập chức năng: ");
            int choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    showProduct();
                    break;
                case 3:
                    searchProduct();
                    break;
                case 4:
                    System.out.println("Thoát chương trình");
                    return;
                default:
                    System.out.println("Yêu cầu nhập đúng trường!!");
            }
        } while (true);
    }

    private static void searchProduct() {
        try {
            List<Product> productList = getListProduct();
            System.out.print("Nhập tên sản phẩm bạn muốn tìm kiếm: ");
            String productName = InputMethods.getString();
            boolean isExist = false;
            for (Product product : productList) {
                if (product.getProductName().equals(productName)) {
                    product.displayData();
                    isExist = true;
                }
            }
            if (!isExist) System.out.println("Không tồn tại sản phẩm " + productName);
        } catch (IOException e) {
            System.out.println("Không đọc được dữ liệu!!");
        } catch (ClassNotFoundException e) {
            System.out.println("Không đọc được dữ liệu!!");
        }

    }

    private static List<Product> getListProduct() throws IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        List<Product> productList = (List<Product>) objectInputStream.readObject();
        return productList;
    }

    private static void showProduct() {
        try {
            List<Product> productList = getListProduct();
            for (Product product : productList) {
                product.displayData();
            }
        } catch (IOException e) {
        } catch (ClassNotFoundException e) {
            System.out.println("Không đọc được dữ liệu!!");
        }
    }

    private static void addProduct() {
        Product product = new Product();
        product.inputData();
        products.add(product);
        try {
            file.createNewFile();
            FileOutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println("Lỗi khi thêm sản phẩm!!");
        }
    }
}
