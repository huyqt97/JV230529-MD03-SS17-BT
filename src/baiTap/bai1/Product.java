package baiTap.bai1;

import config.InputMethods;

import java.io.Serializable;

import static baiTap.bai1.Main.products;

public class Product implements Serializable {
    //Viết một chương trình cho phép người dùng thêm, hiển thị, tìm kiếm thông tin sản phẩm vào file.
    //Thông tin sản phẩm gồm:
    //Mã sản phẩm
    //Tên sản phẩm
    //Hãn sản xuất
    //Giá
    //Các mô tả khác
    private int productId;
    private String productName, brand, des;
    private double price;

    public Product(int productId, String productName, String brand, String des, double price) {
        this.productId = productId;
        this.productName = productName;
        this.brand = brand;
        this.des = des;
        this.price = price;
    }

    public Product() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // methods
    public void inputData() {
        System.out.println("<---------------------------------------------------->");
        boolean isExit = true;
        // id
        do {
            System.out.print("Nhập id sản phẩm: ");
            int id = InputMethods.getInteger();
            Boolean isExist = false;
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).productId == id) {
                    isExist = true;
                }
            }
            if (isExist) {
                System.out.println("Id đã tồn tại! Vui lòng nhập lại...!!");
            } else {
                this.productId = id;
                break;
            }
        } while (isExit);
        // name
        do {
            System.out.print("Nhập tên sản phẩm: ");
            this.productName = InputMethods.getString();
            break;
        } while (isExit);
        // brand
        do {
            System.out.print("Nhập hãng sản phẩm: ");
            this.brand = InputMethods.getString();
            break;
        } while (isExit);
        // price
        do {
            System.out.print("Nhập giá sản phẩm: ");
            this.price = InputMethods.getDouble();
            break;
        } while (isExit);
        // descriptions
        do {
            System.out.print("Nhập mô tả sản phẩm: ");
            String descriptions = InputMethods.getString();
            if (descriptions.length() <= 10) {
                System.out.println("Mô tả không được dưới 10 kí tự! Vui lòng nhập lại...");
            } else {
                this.des = descriptions;
                break;
            }
        } while (isExit);
        System.out.println("Thêm sản phẩm " + this.productName + " thành công!!");
    }

    public void displayData() {
        System.out.println(productName.toUpperCase());
        System.out.println("Id sản phẩm: " + productId + " | " + "Tên sản phẩm: " + productName + " | " +"Tên hãng: " + brand + " | " + "Giá bán: " + price);
    }
}
