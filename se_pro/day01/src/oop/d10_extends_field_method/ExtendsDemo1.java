package oop.d10_extends_field_method;

public class ExtendsDemo1 {
    public static void main(String[] args) {
        Birds birds = new Birds();
        System.out.println(birds.name);
        birds.showName();
    }
}


class Animal {
    public String name = "动物类";
}

class Birds extends Animal {
    public String name = "鸟";

    public void showName() {
        String name = "局部名称-鸟";
        System.out.println(name);// 局部name
        System.out.println(this.name);// 子类name
        System.out.println(super.name);// 父类name


    }
}