package banking_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaConnect {

    public static Connection ConnectDb() throws ClassNotFoundException, SQLException {
        // Load SQL Server JDBC driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        // SQL Server connection URL
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Banking_accounts;encrypt=true;trustServerCertificate=true";
        String user = "sa"; // SQL Server username
        String password = "Santhu@11"; // SQL Server password

        // Return the connection
        return DriverManager.getConnection(url, user, password);
    }
}
