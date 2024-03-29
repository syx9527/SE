package db;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @author SYX
 */
public class DBUtil {

    //连接信息
    private static String driverName;
    private static String url;
    private static String username;
    private static String password;

    //注册驱动，使用静态块，只需注册一次
    static {
        //初始化连接信息
        Properties properties = new Properties();
        try {
            File file = new File(".");
            System.out.println(file.getAbsolutePath());
            properties.load(new FileReader("connect_mysql/src/db.properties"));
            driverName = properties.getProperty("driverName");
            url = properties.getProperty("url");
            username = properties.getProperty("username");
            password = properties.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //1、注册驱动
        try {
            //通过反射，注册驱动
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //jdbc对象
    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    /**
     * 获取连接
     */
    public void getConnection() {
        try {
            //2、建立连接
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 更新操作：增删改
     *
     * @param sql  sql
     * @param objs objs
     * @return i
     */
    public int update(String sql, Object[] objs) {
        int i = 0;
        try {
            getConnection();
            //3、创建sql对象
            preparedStatement = connection.prepareStatement(sql);
            for (int j = 0; j < objs.length; j++) {
                preparedStatement.setObject(j + 1, objs[j]);
            }
            //4、执行sql，返回改变的行数
            i = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    /**
     * 其他操作
     *
     * @param sql  sql
     * @param objs objs
     * @return boolean execute
     */
    public boolean execute(String sql, Object[] objs) {
        boolean execute = false;
        try {
            getConnection();
            //3、创建sql对象
            preparedStatement = connection.prepareStatement(sql);
            for (int j = 0; j < objs.length; j++) {
                preparedStatement.setObject(j + 1, objs[j]);
            }
            //4、执行sql，返回查询到的set集合
            execute = preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return execute;
    }

    /**
     * 查询操作
     *
     * @param sql  sql
     * @param objs objs
     * @return resultSet
     */
    public ResultSet select(String sql, Object[] objs) {
        try {
            getConnection();
            //3、创建sql对象
            preparedStatement = connection.prepareStatement(sql);
            for (int j = 0; j < objs.length; j++) {
                preparedStatement.setObject(j + 1, objs[j]);
            }
            //4、执行sql，返回查询到的set集合
            resultSet = preparedStatement.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }


    /**
     * 断开连接
     */
    public void closeConnection() {
        //5、断开连接
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
