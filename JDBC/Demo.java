package JDBC;

import javax.xml.transform.Result;
import java.sql.*;

public class Demo {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/newdatabase";
        String username = "irishprajapati";
        String password = "4696";

        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();

        // INSERT data
        st.executeUpdate("INSERT INTO product (name) VALUES ('Apple')");
        st.executeUpdate("INSERT INTO product (name) VALUES ('Banana')");
        st.executeUpdate("INSERT INTO product (name) VALUES ('Mango')");

        System.out.println("Data inserted successfully!");

        // FETCH data
        ResultSet rs = st.executeQuery("SELECT name FROM product WHERE id = 1");

        if (rs.next()) {
            System.out.println("Product name: " + rs.getString("name"));
        }

        // Close resources
        rs.close();
        st.close();
        con.close();
    }
}

