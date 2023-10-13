package baiTap.baiThem;

import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String username;
    private String password;
    private boolean status;

    public User(int id, String username, String password, boolean status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }
}
