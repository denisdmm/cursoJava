
import java.sql.Connection;
import java.sql.DriverManager;

public class HeroDAO {

    public static Connection getConnection() {

        Connection con = null;

        String url = "jdbc:postgresql:localhost:5432/hero";
        String user = "hero";
        String password = "hero";

        try {
            Class.forName("org.postgres.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}