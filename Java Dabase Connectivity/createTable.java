
/* import java.sql.Connection; */
/* import java.sql.DriverManager; */
import java.sql.*;

public class createTable {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/shital";
            String password = "root";
            String username = "root";
            Connection con = DriverManager.getConnection(url, username, password);
            String query = "create table table1(tid int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(30))";

            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Table created in database");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
