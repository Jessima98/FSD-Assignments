import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionFactory {

    private static Connection conn = null;

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        if(conn==null){
            //ResourceBundle bundle = ResourceBundle.getBundle("resources/dbConfig");
            //String dc = bundle.getString("driverclass");
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/postgres";
            String username = "postgres";
            String password = "jessi";

            conn = DriverManager.getConnection(url, username, password);
        }
        return conn;
    }
}
