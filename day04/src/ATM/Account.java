package ATM;

public class Account {
    /**
     * 成员变量
     */
    private String cardId;  // 卡号
    private String username;  // 姓名
    private String password; // 密码
    private double money;// 金额
    private double quotaMoney; // 每次取现额度

    public Account() {
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getQuotaMoney() {
        return quotaMoney;
    }

    public void setQuotaMoney(double quotaMoney) {
        this.quotaMoney = quotaMoney;
    }

    public Account(String cardId, String username, String password, double money, double quotaMoney) {
        this.cardId = cardId;
        this.username = username;
        this.password = password;
        this.money = money;
        this.quotaMoney = quotaMoney;
    }

}
