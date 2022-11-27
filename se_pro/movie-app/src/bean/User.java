package bean;

import java.util.Objects;

/**
 * 用户：客户与商家的父类
 *
 * @author SYX
 */
public class User {
    private String loginName;
    private String userName;
    private String password;
    private char sex;
    private String phone;
    private double money;

    public User() {
    }

    public User(String loginName, String userName, String password, char sex, String phone, double money) {
        this.loginName = loginName;
        this.userName = userName;
        this.password = password;
        this.sex = sex;
        this.phone = phone;
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "loginName='" + loginName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", phone='" + phone + '\'' +
                ", money=" + money +
                '}';
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return sex == user.sex && Double.compare(user.money, money) == 0 && Objects.equals(loginName, user.loginName) && Objects.equals(userName, user.userName) && Objects.equals(password, user.password) && Objects.equals(phone, user.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loginName, userName, password, sex, phone, money);
    }
}
