package javajasperReport;

/**
 * Created by hoangtd on 10/3/2017.
 */
public class UserReport {
    private String username;
    private String email;
    private String age;
    private String address;
    private String phone;
    private String fullName;

    public UserReport(String username, String email, String age, String address, String phone, String fullName) {
        this.username = username;
        this.email = email;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
