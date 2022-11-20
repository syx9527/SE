package d2_stream;

import java.util.Objects;

/**
 * 员工信息
 *
 * @author SYX
 */
public class Employee {
    private String name;
    private char sex;
    private double salary;
    private double bonus;
    private String punishment;

    public Employee() {
    }

    public Employee(String name, char sex, double salary, double bonus, String punishment) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
        this.bonus = bonus;
        this.punishment = punishment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return sex == employee.sex && Double.compare(employee.salary, salary) == 0 && Double.compare(employee.bonus, bonus) == 0 && Objects.equals(name, employee.name) && Objects.equals(punishment, employee.punishment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, salary, bonus, punishment);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getPunishment() {
        return punishment;
    }

    public void setPunishment(String punishment) {
        this.punishment = punishment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", punishment='" + punishment + '\'' +
                '}';
    }
}
