package d7_abstract_test;

public  class Test {
    public static void main(String[] args) {
        GoldCard goldCard = new GoldCard();
        goldCard.setMoney(10000);
        goldCard.setName("刘二");
        goldCard.pay(300);
        goldCard.getMoney();
    }
}

abstract class Card {
    private String name;
    private double money;

    /**
     * 子类一定要支付，但是支付的情况是不一样的
     *
     * @param money 支付费用
     */
    public abstract void pay(double money);

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
    public void pay(double money) {
        // 优惠后的金额算出来
        double rs = money * 0.8;
        double lastMoney = getMoney() - rs;
        System.out.println(getName() + "当前账户总额:" + getMoney() + "当前消费了：" + rs + "消费后剩余：" + lastMoney);
        setMoney(lastMoney);
    }
}

class SilverCard extends Card {

    @Override
    public void pay(double money) {
        // 优惠后的金额算出来
        double rs = money * 0.9;
        double lastMoney = getMoney() - rs;
        System.out.println(getName() + "当前账户总额:" + getMoney() + "当前消费了：" + rs + "消费后剩余：" + lastMoney);
        setMoney(lastMoney);
    }
}


