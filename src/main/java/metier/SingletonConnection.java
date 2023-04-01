package metier;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {
    private static Connection cnx = null;

    public static Connection getConnection() {
        if (cnx != null) {
            return cnx;
        } else {
            try {
                Class.forName("org.postgresql.Driver");
                String url = "jdbc:postgresql://localhost:5432/tp3";
                String username = "postgres";
                String password = "0000";
                cnx = DriverManager.getConnection(url, username, password);
                return cnx;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                return null;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public static void closeConnection() {
        if (cnx != null) {
            try {
                cnx.close();
                cnx = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}
