package UI;

public class User {
    String Username;
    String password;

    public User() {
    }

    public User(String Username, String password) {
        this.Username = Username;
        this.password = password;
    }

    /**
     * 获取
     * @return Username
     */
    public String getUsername() {
        return Username;
    }

    /**
     * 设置
     * @param Username
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "User{Username = " + Username + ", password = " + password + "}";
    }
}
