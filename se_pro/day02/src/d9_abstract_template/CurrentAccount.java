package d9_abstract_template;

public class CurrentAccount extends Account {
    public CurrentAccount() {
    }

    public CurrentAccount(String CardId, int money) {
        super(CardId, money);
    }

    @Override
    public double calc() {
        return getMoney() * 0.0175;
    }

}
