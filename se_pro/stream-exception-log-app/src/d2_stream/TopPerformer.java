package d2_stream;

import java.util.Objects;

/**
 * 最佳员工
 *
 * @author SYX
 */
public class TopPerformer {
    private String name;
    private double money;

    public TopPerformer() {
    }

    public TopPerformer(String name, double money) {
        this.name = name;
        this.money = money;
    }

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

    @Override
    public String toString() {
        return "TopPerformer{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TopPerformer that = (TopPerformer) o;
        return Double.compare(that.money, money) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, money);
    }
}
