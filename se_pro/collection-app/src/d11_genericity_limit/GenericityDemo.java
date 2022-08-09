package d11_genericity_limit;

import java.util.ArrayList;

/**
 * 通配符：?
 *
 * @author SLJ
 */
public class GenericityDemo {
    public static void main(String[] args) {
        ArrayList<Car> bmws = new ArrayList<>();
        bmws.add(new BMW());
        bmws.add(new BMW());
        bmws.add(new BMW());
        go(bmws);

        ArrayList<Car> benzs = new ArrayList<>();
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        go(benzs);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        // dog没有继承汽车不再能使用go了
        // go(dogs);

    }

    //  ? extends Car: ?必须是Car或者是其子类    泛型上限
    //  ? super Car: ?必须是Car或者其父类       泛型下限
    public static void go(ArrayList<? extends Car> car) {

    }
}

class Dog {

}

class BENZ extends Car {

}

class BMW extends Car {

}

/**
 * 父类
 */
class Car {

}