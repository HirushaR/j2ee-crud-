package dbase;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;


class DBUtils{
    private static Connection connect = null;
    private static Statement statement = null;
    private static PreparedStatement preparedStatement = null;
    private static ResultSet resultSet = null;
    private static  String url ="jdbc:mysql://localhost:3306/testnews";
    private static  String user = "root",pass ="";


    public static PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException{
        PreparedStatement ps = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        connect = DriverManager.getConnection(url,user,pass);
        ps = connect.prepareStatement(sql);
        return ps;

    }




//    public static void main(String[] args)  {
//    try {
//
//        getPreparedStatement("select * from news");
//
//    }catch (Exception e) {
//        e.printStackTrace();
//    }
//
//
//    }

}

