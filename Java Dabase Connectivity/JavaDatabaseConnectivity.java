import java.sql.*;

public class JavaDatabaseConnectivity {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/shital";
            String username = "root";
            String password = "root";
            Connection con = DriverManager.getConnection(url, username, password);
            if (con.isClosed()) {
                System.out.println("Connection is still closed !!!");
            } else {
                System.out.println("Connection is established");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong !!!!");
        }
    }
}