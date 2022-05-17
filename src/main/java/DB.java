import org.sql2o.Sql2o;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

//    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://ec2-44-195-169-163.compute-1.amazonaws.com:5432/d6qv4dj4pkl47","yaghjavhlbtnsg","e97cdcf0025dac1e150268b94596e9b77f7fdbe7e204405864757e7ce984b877");
        public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker", "postgres", "kamotho");

    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/wildlife_tracker", "postgres", "kamotho")) {
            System.out.println("This is a trial to check if my database will connect");
            System.out.println("Congratulations...Database connected Successfully");

            Statement statement = con.createStatement();
        } catch (SQLException e) {
            System.out.println("Connection failure.");
        }
    }
}
