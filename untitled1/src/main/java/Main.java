import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Main {

  public static void main(String[] args) throws ClassNotFoundException {
    try {
      String url = "jdbc:mysql://localhost:1433/TestDB";
      String username = "sa";
      String password = "Forestrock2020";
       Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection(url, username, password);
      if (con != null) {
        System.out.println("Successfully connected to MySQL database test");
      }
    } catch (SQLException ex) {
      System.out.println("An error occurred while connecting MySQL databse");
      ex.printStackTrace();
    }
  }

}
