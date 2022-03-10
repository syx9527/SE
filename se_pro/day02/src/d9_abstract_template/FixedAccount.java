package d9_abstract_template;

public class FixedAccount extends Account {
    public FixedAccount() {
    }

    public FixedAccount(String CardId, int money) {
        super(CardId, money);
    }
    @Override
    public double calc() {
        return getMoney() * 0.02;
    }
}
