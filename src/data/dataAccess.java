package data;

import model.news;
import dbase.DBUtils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static dbase.DBUtils.getPreparedStatement;

public class dataAccess {
    public void addNew(news n){
        try{
            PreparedStatement ps = DBUtils.getPreparedStatement("insert into news values(?,?,?,?,?,?)");
            ps.setString(1, n.getTitle());
            ps.setString(2, n.getDate());
            ps.setString(3, n.getDescription());
            ps.setString(4, n.getDetails());
            ps.setString(5, n.getCategory());
            ps.setString(6, n.getImage());
            ps.executeUpdate();
        }catch (ClassNotFoundException| SQLException ex)
        {
            Logger.getLogger(dataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static List<news> getAll() throws SQLException, ClassNotFoundException {
        List<news> ls = new LinkedList<>();
        ResultSet rs = getPreparedStatement("select * from news").executeQuery();
        while (rs.next())
        {
            news n = new news(rs.getInt(1),rs.getString(2),rs.getString(3),
                    rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
            ls.add(n);
        }

        return ls;
    }
}
