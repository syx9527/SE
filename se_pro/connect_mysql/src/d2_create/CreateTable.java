package d2_create;

import db.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author SYX
 */
public class CreateTable {
    public static void main(String[] args) {

        DBUtil db = new DBUtil();
        Object[] obj = {};
        ResultSet select = db.select("select * from websites", obj);
        try {
            while (select.next()) {
                System.out.println("id:\t\t\t" + select.getString("id"));
                System.out.println("name:\t\t" + select.getString("name"));
                System.out.println("url:\t\t" + select.getString("url"));
                System.out.println("alexa:\t\t" + select.getString("alexa"));
                System.out.println("country:\t" + select.getString("country"));
                System.out.println("--------------");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println();
        db.closeConnection();
    }
}
