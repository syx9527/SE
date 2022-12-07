package run;

import bean.Business;
import bean.Customer;
import bean.Movie;
import bean.User;

import java.text.SimpleDateFormat;
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
        c1.setMoney(1000);


        Customer c2 = new Customer();
        c2.setLoginName("lxl666");
        c2.setPassword("123456");
        c2.setUserName("李小兰");
        c2.setSex('女');
        c2.setMoney(10000);
        c2.setPhone("166666");
        c2.setMoney(1000);

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

        Movie movie1 = new Movie();
        movie1.setName("天龙八部");
        movie1.setPrice(50);
        movie1.setNumber(60);
        movie1.setTime(120);
        movie1.setActor("乔峰");
        movie1.setStartTime(new Date(10000000L));

        Movie movie2 = new Movie();
        movie2.setName("倚天屠龙记");
        movie2.setPrice(40);
        movie2.setNumber(120);
        movie2.setTime(143);
        movie2.setActor("张无忌");
        movie2.setStartTime(new Date(14546466L));

        List<Movie> m1 = new ArrayList<>();
        List<Movie> m2 = new ArrayList<>();

        m1.add(movie1);
        m2.add(movie2);


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
        int command = 0;
        int exit = 4;
        while (command != exit) {
            System.out.println("=============影院管理系统=============");
            System.out.println("1.登录");
            System.out.println("2.用户注册");
            System.out.println("3.商家注册");
            System.out.println("4.退出");
            System.out.println("请输入命令");
            try {
                command = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("不存在该命令，青春重新输入！");
                continue;
            }
            switch (command) {
                case 1:
                    // 登录
                    login();
                    break;
                case 2:
                    // 用户注册
                    break;
                case 3:
                    // 商家注册
                    break;
                case 4:
                    // 退出
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
        int command = 0;
        int exit = 5;
        while (command != exit) {
            System.out.println("1.展示全部影片信息");
            System.out.println("2.上架电影");
            System.out.println("3.下架电影");
            System.out.println("4.修改影片");
            System.out.println("5.退出登录");
            System.out.println("请输入您要操作的命令");
            command = Integer.parseInt(SCANNER.nextLine());
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
    }

    /**
     * 展示全部影片信息
     */
    private static void showBusinessInfo() {
        System.out.println("==========================");
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        if (movies.size() < 1) {
            System.out.println("当前没有影片");
            System.out.println("==========================");
            return;
        }
        System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s%n", "名称", "主演", "评分", "时长", "票价", "余票", "放映时间");
        for (Movie movie : movies) {
            System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s%n", movie.getName(), movie.getActor(), movie.getScore(), movie.getTime(), movie.getPrice(), movie.getNumber(), movie.getStartTime());
        }
        System.out.println("==========================");
    }

    /**
     * 修改影片
     */
    private static void updateMovieInfo() {
        System.out.println("=============修改电影=============");
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        if (movies.size() < 1) {
            System.out.println("当前没有影片，无法修改！");
            return;
        }
        while (true) {
            // 让用户选择需要的电影名称
            System.out.println("请您输入需要修改的电影名称：");
            String movieName = SCANNER.nextLine();
            // 3.差看是否存在则删除，反之报错
            Movie movie = getMovieByName(movieName);
            if (movie != null) {
                // 修改电影信息
                setMovie(movie);
                showBusinessInfo();
                return;
            } else {
                System.out.println("您的店铺没有该影片");
                System.out.println("请问是否继续修改？Y/N(N)");
                String command = SCANNER.nextLine();
                if (!"y".equalsIgnoreCase(command)) {
                    return;
                }
            }
        }

    }

    /**
     * 下架电影
     */
    private static void deleteMovie() {
        System.out.println("=============下架电影=============");
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        if (movies.size() < 1) {
            System.out.println("当前没有影片可以删除！");
            return;
        }
        while (true) {
            // 让用户选择需要的电影名称
            System.out.println("请您输入需要下架的电影名称：");
            String movieName = SCANNER.nextLine();
            // 3.差看是否存在则删除，反之报错
            Movie movie = getMovieByName(movieName);
            if (movie != null) {
                movies.remove(movie);
                showBusinessInfo();
                return;
            } else {
                System.out.println("您的店铺没有上架该影片");
                System.out.println("请问是否继续下架？Y/N(N)");
                String command = SCANNER.nextLine();
                if (!"y".equalsIgnoreCase(command)) {
                    return;
                }
            }
        }
    }


    /**
     * 上架电影
     */
    private static void addMovie() {
        System.out.println("=============上架电影=============");
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        Movie m = new Movie();
        setMovie(m);
        movies.add(m);
        showBusinessInfo();
    }

    /**
     * 设置电影各信息
     *
     * @param m 电影
     */
    public static void setMovie(Movie m) {
        String name;
        String actor;
        double price;
        double time;
        int number;
        double score;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date startTime;
        System.out.println("请输入新的片名");
        name = SCANNER.nextLine();
        System.out.println("请输入主演");
        actor = SCANNER.nextLine();
        while (true) {
            try {

                System.out.println("请输入票价");
                price = Double.parseDouble(SCANNER.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("您输入的格式不正确，请重新输入~");
            }
        }
        while (true) {
            try {

                System.out.println("请输入余票数");
                number = Integer.parseInt(SCANNER.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("您输入的格式不正确，请重新输入~");
            }
        }
        while (true) {
            try {
                System.out.println("请输入时长");
                time = Double.parseDouble(SCANNER.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("您输入的格式不正确，请重新输入~");
            }
        }
        while (true) {
            try {
                System.out.println("请输入评分");
                score = Double.parseDouble(SCANNER.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("您输入的格式不正确，请重新输入~");
            }
        }
        while (true) {
            try {
                System.out.println("请输入上映时间 年-月-日 时:分:秒");
                String sTime = SCANNER.nextLine();
                startTime = sdf.parse(sTime);
                break;
            } catch (Exception e) {
                System.out.println("您输入的格式不正确，请重新输入~");
            }
        }
        m.setName(name);
        m.setActor(actor);
        m.setPrice(price);
        m.setTime(time);
        m.setNumber(number);
        m.setScore(score);
        m.setStartTime(startTime);
    }

    /**
     * 用户操作界面
     */
    private static void showCustomerMain() {

        int command = 0;
        int exit = 5;
        while (command != exit) {
            System.out.println(loginUser.getUserName() + (loginUser.getSex() == '男' ? "先生" : "女士") + "您好");

            System.out.println("1.展示全部影片信息");
            System.out.println("2.根据电影名称查询电影信息");
            System.out.println("3.评分");
            System.out.println("4.购票");
            System.out.println("5.退出登录");
            System.out.println("请输入您要操作的命令");
            try {
                command = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("不存在该命令，青春重新输入！");
                continue;
            }
            switch (command) {
                case 1:
                    // 展示全部影片信息
                    showAllMovies();
                    break;
                case 2:
                    // 根据电影名称查询电影信息

                    break;
                case 3:
                    // 评分

                    break;
                case 4:
                    // 购票
                    buyMovie();
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
    }

    /**
     * 购票
     */
    private static void buyMovie() {
        showAllMovies();
        System.out.println("============购票============");
        String command;
        while (true) {
            System.out.println("请您输入需要购票的门店");
            String shopName = SCANNER.nextLine();
            Business business = getBusinessByShopName(shopName);
            if (business == null) {
                System.out.println("没有该商家");
                System.out.println("是否退出购票?Y/N(N)");
                command = SCANNER.nextLine();
                if ("y".equalsIgnoreCase(command)) {
                    return;
                }
            } else {
                List<Movie> movies = ALL_MOVIES.get(business);
                if (movies.size() > 0) {
                    while (true) {
                        System.out.println("请您输入需要购买的电影名称");
                        String movieName = SCANNER.nextLine();
                        Movie movie = getMovieByName(movieName, business);
                        if (movie == null) {
                            System.out.println("该店铺没有该影片");
                            System.out.println("请问是否继续搜索？Y/N(Y)");
                            command = SCANNER.nextLine();
                            if ("N".equalsIgnoreCase(command)) {
                                return;
                            }
                        } else {
                            if (movie.getNumber() <= 0) {
                                System.out.println("没票啦");
                                System.out.println("请问是否继续买票？Y/N(Y)");
                                command = SCANNER.nextLine();
                                if ("N".equalsIgnoreCase(command)) {
                                    return;
                                }
                            } else {
                                while (true) {
                                    System.out.println("电影" + movie.getName());
                                    System.out.println("余票" + movie.getNumber());
                                    System.out.println("票价" + movie.getPrice());
                                    System.out.println("您的余额" + loginUser.getMoney());


                                    System.out.println("请输入您需要购买的数量");
                                    int buyNumber = Integer.parseInt(SCANNER.nextLine());
                                    if (movie.getNumber() <= buyNumber) {
                                        System.out.println("您输入购买的数量超出限制");
                                        System.out.println("请问是否继续买票？Y/N(Y)");
                                        command = SCANNER.nextLine();
                                        if ("N".equalsIgnoreCase(command)) {
                                            return;
                                        }
                                    } else if (buyNumber * movie.getPrice() > loginUser.getMoney()) {
                                        System.out.println("您的余额不足");
                                        System.out.println("请问是否继续买票？Y/N(Y)");
                                        command = SCANNER.nextLine();
                                        if ("N".equalsIgnoreCase(command)) {
                                            return;
                                        }
                                    } else {
                                        System.out.println(movie);
                                        System.out.println("买票成功");
                                        return;
                                    }
                                }

                            }
                        }
                    }

                } else {
                    System.out.println("该电影院倒闭啦！");
                    System.out.println("是否退出购票系统?Y/N(N)");
                    command = SCANNER.nextLine();
                    if ("y".equalsIgnoreCase(command)) {
                        return;
                    }
                }
            }
        }

    }

    /**
     * 更具店铺名查找商家
     *
     * @param shopName 店铺名
     * @return 商家
     */
    public static Business getBusinessByShopName(String shopName) {
        return ALL_MOVIES.keySet().stream().filter(s -> s.getShopName().contains(shopName)).findFirst().orElse(null);
    }

    /**
     * 展示全部商家和其排片信息
     */
    private static void showAllMovies() {
        System.out.println("============所有商家排片信息============");
        ALL_MOVIES.forEach((business, movies) -> {
            System.out.println(business.getUserName() + "----" + business.getShopName() + "----" + business.getAddress());
            System.out.printf("\t\t%s\t%s\t%s\t%s\t%s\t%s\t%s%n", "名称", "主演", "评分", "时长", "票价", "余票", "放映时间");
            for (Movie movie : movies) {
                System.out.printf("\t\t%s\t%s\t%s\t%s\t%s\t%s\t%s%n", movie.getName(), movie.getActor(), movie.getScore(), movie.getTime(), movie.getPrice(), movie.getNumber(), movie.getStartTime());
            }
            System.out.println("==================================");
        });
    }

    /**
     * 搜索当前商家的排片
     *
     * @param movieName 电影名
     * @return 电影
     */
    public static Movie getMovieByName(String movieName) {
        Business business = (Business) loginUser;
        return getMovieByName(movieName, business);
    }

    /**
     * 用户在商家里搜索影片
     *
     * @param movieName 影片名
     * @param business  商家对象
     * @return 电影对象
     */
    public static Movie getMovieByName(String movieName, Business business) {
        List<Movie> movies = ALL_MOVIES.get(business);
        for (Movie movie : movies) {
            if (movie.getName().contains(movieName)) {
                return movie;
            }
        }
        return null;
    }

    /**
     * 登录鉴权
     *
     * @param loginName loginName
     * @param password  password
     * @return user
     */
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
