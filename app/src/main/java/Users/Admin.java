package Users;

import java.util.Objects;

public class Admin {
    private String email;
    private String f_name;
    private String l_name;
    private String phone;
    private String password;
    private String token;

    public Admin(String email, String f_name, String l_name, String phone, String password, String token) {
        this.email = email;
        this.f_name = f_name;
        this.l_name = l_name;
        this.phone = phone;
        this.password = password;
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getToken() {
        return Objects.equals(this.token, "Admin123");
    }
}
