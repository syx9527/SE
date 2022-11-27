package run;

import bean.Business;
import bean.Customer;
import bean.Movie;
import bean.User;

import java.time.Instant;
import java.util.*;

/**
 * 系统启动
 *
 * @author SYX
 */
public class MovieSystem {
    /**
     * 定义系统的数据容器用于存储用户数据
     * 1.存储很多用户
     */
    public static List<User> ALL_USERS = new ArrayList<>();
    public static User loginUser = null;

    /**
     * 2.存储全部商家和其排片信息
     * 商家1 = {p1,p2,p3}
     * 商家2 = {p2,p4,p5}
     */

    public static Map<Business, List<Movie>> ALL_MOVIES = new HashMap<>();

    /**
     * 输入
     */
    public static final Scanner SCANNER = new Scanner(System.in);

    /*
    提前准备测试用户与商家
     */
    static {
        Customer c1 = new Customer();
        c1.setLoginName("lb666");
        c1.setPassword("123456");
        c1.setUserName("刘斌");
        c1.setSex('男');
        c1.setMoney(10000);
        c1.setPhone("1777777");

        Customer c2 = new Customer();
        c2.setLoginName("lxl666");
        c2.setPassword("123456");
        c2.setUserName("李小兰");
        c2.setSex('女');
        c2.setMoney(10000);
        c2.setPhone("166666");

        Business b1 = new Business();
        b1.setLoginName("zq888");
        b1.setPassword("123456");
        b1.setUserName("张麻子");
        b1.setSex('男');
        b1.setMoney(0);
        b1.setPhone("144444");
        b1.setShopName("天龙影城");
        b1.setAddress("芒市大街55号七楼");

        Business b2 = new Business();
        b2.setLoginName("bbd555");
        b2.setPassword("123456");
        b2.setUserName("马邦德");
        b2.setSex('男');
        b2.setMoney(0);
        b2.setPhone("133333");
        b2.setShopName("玖寒3D影院");
        b2.setAddress("团结大街168号二楼");


        // Movie m1 = new Movie();
        // m1.setName("笑傲江湖");
        // m1.setActor("令狐冲");
        // m1.setPrice(23);
        // m1.setTime(143);
        // m1.setNumber(120);
        // m1.setScore(9.5);


        List<Movie> m1 = new ArrayList<>();
        List<Movie> m2 = new ArrayList<>();


        ALL_USERS.add(c1);
        ALL_USERS.add(c2);
        ALL_USERS.add(b1);
        ALL_USERS.add(b2);

        ALL_MOVIES.put(b1, m1);
        ALL_MOVIES.put(b2, m2);

    }


    public static void main(String[] args) {
        // 展示首页
        showMain();
    }

    private static void showMain() {
        System.out.println("=============影院管理系统=============");
        System.out.println("1.登录");
        System.out.println("2.用户注册");
        System.out.println("4.商家注册");
        while (true) {
            System.out.println("请输入命令");
            int command = Integer.parseInt(SCANNER.nextLine());
            switch (command) {
                case 1:
                    // 登录
                    login();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("命令有误!");
            }
        }

    }


    private static void login() {
        while (true) {
            System.out.println("请输入登录名");
            String loginName = SCANNER.nextLine();
            System.out.println("请输入密码");
            String password = SCANNER.nextLine();
            // 1.根据登录名、密码查询用户对象
            loginUser = getUser(loginName, password);
            if (loginUser == null) {
                System.out.println("用户名或密码不正确,请重新输入");
            } else {
                if (loginUser instanceof Customer) {
                    // TODO:登录为客户
                    showCustomerMain();
                } else {
                    // TODO:登录为商家
                    showBusinessMain();
                }
                return;
            }
        }

    }

    /**
     * 商家操作界面
     */
    private static void showBusinessMain() {
        System.out.println("1.展示全部影片信息");
        System.out.println("2.上架电影");
        System.out.println("3.下架电影");
        System.out.println("4.修改影片");
        System.out.println("5.退出登录");
        System.out.println("请输入您要操作的命令");
        int command = Integer.parseInt(SCANNER.nextLine());
        switch (command) {
            case 1:
                // 展示全部影片信息
                showBusinessInfo();
                break;
            case 2:
                // 上架电影
                addMovie();
                break;
            case 3:
                // 下架电影
                deleteMovie();
                break;
            case 4:
                // 修改影片
                updateMovieInfo();
                break;
            case 5:
                // 退出登录
                System.out.println("您已成功退出!");
                break;
            default:
                System.out.println("不存在该命令，青春重新输入！");
                break;

        }
    }

    /**
     * 修改影片
     */
    private static void updateMovieInfo() {
    }

    /**
     * 下架电影
     */
    private static void deleteMovie() {

    }

    /**
     * 上架电影
     */
    private static void addMovie() {
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);

        System.out.println("请输入新的片名");
        String name = SCANNER.nextLine();
        System.out.println("请输入主演");
        String actor = SCANNER.nextLine();
        System.out.println("请输入票价");
        double price = Double.parseDouble(SCANNER.nextLine());
        System.out.println("请输入时长");
        double time = Double.parseDouble(SCANNER.nextLine());
        System.out.println("请输入余票数");
        int number = Integer.parseInt(SCANNER.nextLine());
        System.out.println("请输入评分");
        double score = Double.parseDouble(SCANNER.nextLine());

        Movie m = new Movie();
        m.setName(name);
        m.setActor(actor);
        m.setPrice(price);
        m.setTime(time);
        m.setNumber(number);
        m.setScore(score);
        movies.add(m);

    }

    /**
     * 展示全部影片信息
     */
    private static void showBusinessInfo() {
    }

    /**
     * 用户操作界面
     */
    private static void showCustomerMain() {
    }

    public static User getUser(String loginName, String password) {
        for (User user : ALL_USERS) {
            // 判断这个用户名是否存在
            if (user.getLoginName().equals(loginName)) {
                if (user.getPassword().equals(password)) {
                    return user;
                }
            }
        }
        // 登录出错
        return null;
    }
}
