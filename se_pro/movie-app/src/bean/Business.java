package bean;

import java.util.Objects;

/**
 * 商家
 *
 * @author SYX
 */
public class Business extends User {
    // 店铺名称
    private String shopName;
    // 店铺地址
    private String address;

    public Business() {
    }

    public Business(String shopName, String address) {
        this.shopName = shopName;
        this.address = address;
    }

    public Business(String loginName, String userName, String password, char sex, String phone, double money, String shopName, String address) {
        super(loginName, userName, password, sex, phone, money);
        this.shopName = shopName;
        this.address = address;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Business{" +
                "shopName='" + shopName + '\'' +
                ", address='" + address + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Business business = (Business) o;
        return Objects.equals(shopName, business.shopName) && Objects.equals(address, business.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), shopName, address);
    }
}
