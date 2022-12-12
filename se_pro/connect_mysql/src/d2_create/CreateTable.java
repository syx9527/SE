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

        Object[] obj = {null, "乔布斯", "2243736958", "Apple", "root"};
        int i = db.update("insert into teacher values(?,?,?,?,?)", obj);
        System.out.println(i);
        db.closeConnection();
    }
}
