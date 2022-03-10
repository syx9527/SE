package d7_abstract_test;

public abstract class Card {
    private String name;
    private double money;

    /**
     * 子类一定要支付，但是支付的情况是不一样的
     *
     * @param money
     */
    public abstract void Pay(double money);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}

class GoldCard extends Card {

    @Override
    public void Pay(double money) {
        // 优惠后的金额算出来
        double rs = money * 0.8;
        double lastMoney = getMoney() - rs;
        System.out.println(getMoney() + "当前账户总额");
    }
}


