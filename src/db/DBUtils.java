package db;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


class DBUtils{
    public static PreparedStatement getPreparedStatement(String sql) throws  ClassNotFoundException, SQLException {

            PreparedStatement ps = null;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testjee","root","");
            ps = con.prepareStatement(sql);

            return  ps;
    }
    public static void main(String[] agrs)throws ClassNotFoundException,SQLException{
        getPreparedStatement("select * from news");
    }
}
