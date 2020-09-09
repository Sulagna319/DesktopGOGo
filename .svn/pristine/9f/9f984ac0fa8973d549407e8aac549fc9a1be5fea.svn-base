package util;

import java.sql.*;

public class JDBCUtil {

    // Object of Connection from the Database

   static Connection conn = null;

    // Object of Statement. It is used to create a Statement to execute the query
   static Statement stmt = null;

   //Object of ResultSet => 'It maintains a cursor that points to the current row in the result set'
    ResultSet resultSet = null;

    public static void loadDB(String dbname) throws ClassNotFoundException, SQLException {
        Class.forName("com.sqlserver.jdbc.Driver");

        conn= DriverManager.getConnection("jdbc:sqlserver://localhost:1433/"+dbname,"sa","Saperion@123456");



    }

}
