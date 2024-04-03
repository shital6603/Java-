import java.sql.*;

public class InsertusingPreparedStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/shital";
            String username = "root";
            String password = "root";
            Connection con = DriverManager.getConnection(url, username, password);
            if (con.isClosed()) {
                System.out.println("Connection not established!!!");
            } else {
                System.out.println("Connection Established successfully !!");
            }
            String query = "insert into table1 (tName,tCity) values(?,?)";
            // getPreparedstatement object

            PreparedStatement pstmt = con.prepareStatement(query);

            // set values to query
            pstmt.setString(1, "Dhannu Khairnar");
            pstmt.setString(2, "Pune");
            pstmt.executeUpdate();

            System.out.println("Data inserted successfully !!!");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
