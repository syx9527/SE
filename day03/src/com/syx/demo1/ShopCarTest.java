package com.syx.demo1;

import java.util.Scanner;

public class ShopCarTest {

    public static void main(String[] args) {
        Goods[] shopCar = new Goods[100];
        boolean status = true;
        while (status) {
            System.out.println("请您选择如下命令操作：");
            System.out.println("添加商品到购物车：add");
            System.out.println("查询商品到购物车：query");
            System.out.println("修改商品到购物车：update");
            System.out.println("结算商品到购物车：pay");

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的命令：");

            String command = sc.next();

            switch (command) {
                case "add" -> addGoods(shopCar, sc);
                case "query" -> queryGoods(shopCar);
                case "update" -> updateGoods(shopCar, sc);
                case "pay" -> {
                    pay(shopCar);
                    status = false;
                }
                default -> System.out.println("您输入的命令不正确");
            }
        }
    }


    public static void addGoods(Goods[] shopCar, Scanner sc) {

        System.out.println("请您输入购买商品的编号(不重复)：");
        int id = sc.nextInt();
        System.out.println("请您输入购买商品的名称：");
        String name = sc.next();
        System.out.println("请您输入购买商品的价格：");
        double price = sc.nextDouble();
        System.out.println("请您输入购买商品的购买数量：");
        int buyNumber = sc.nextInt();

        Goods g = new Goods();
        g.id = id;
        g.name = name;
        g.price = price;
        g.buyNumber = buyNumber;

        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null) {
                shopCar[i] = g;
                break;
            }
        }


    }

    public static void queryGoods(Goods[] shopCar) {
        System.out.println("===========查询信息如下==============");

        System.out.println("编号\t\t名称\t\t价格\t\t购买数量");

        for (Goods g : shopCar) {
            if (g != null) {
                System.out.printf("%s\t\t%s\t\t%s\t\t%s%n", g.id, g.name, g.price, g.buyNumber);
            } else {
                break;
            }
        }
    }

    public static Goods getGoodsById(Goods[] shopCar, int id) {
        for (Goods g : shopCar) {
            if (g != null) {
                if (g.id == id) {
                    return g;
                }
            } else {
                return null;
            }
        }
        return null;
    }

    public static void updateGoods(Goods[] shopCar, Scanner sc) {
        queryGoods(shopCar);
        System.out.println("请输入需要修改的商品ID：");
        int id = sc.nextInt();
        Goods g = getGoodsById(shopCar, id);
        if (g != null) {
            System.out.printf("请您输入 %s 最新购买数量：%n", g.name);
            g.buyNumber = sc.nextInt();
            System.out.println("修改完成！");
            queryGoods(shopCar);

        } else {
            System.out.println("对不起没有购买该商品");
        }
    }


    public static void pay(Goods[] shopCar) {
        System.out.println("您购物车商品信息如下：");
        queryGoods(shopCar);

        double money = 0;
        for (Goods g : shopCar) {
            if (g != null) {
                money += (g.price * g.buyNumber);
            } else {
                break;
            }
        }

        System.out.printf("您本次购物需支付%s%n", money);
    }


}
