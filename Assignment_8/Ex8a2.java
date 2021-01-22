package Assignment_8;
import Assignment_8.Ex8a1;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex8a2 {
    public static void main(String[] args) throws SQLException {
        Connection conn = Ex8a1.getConnection();
        DatabaseMetaData dbmd = conn.getMetaData();
        ResultSet rs = dbmd.getTables(null, null, null,new String[] {"TABLE"});
        while (rs.next())
            System.out.println( rs.getString("TABLE_NAME"));
    }
}
