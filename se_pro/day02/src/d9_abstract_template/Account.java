package d9_abstract_template;

public abstract class Account {

    private String CardId;
    private double money;

    public Account() {
    }

    public Account(String cardId, double money) {
        CardId = cardId;
        this.money = money;
    }

    public String getCardId() {
        return CardId;
    }

    public void setCardId(String cardId) {
        CardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public abstract double calc();

    public final void handle(String username, String password) {
        if ("admin".equals(username) && "123456".equals(password)) {
            System.out.println("登录成功！");

            // 正式结算利息
            double result = calc();
            System.out.println("本账户利息是" + result);

        } else {
            System.out.println("密码错误！");
        }
    }
}
