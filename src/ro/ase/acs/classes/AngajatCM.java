package ro.ase.acs.classes;

import ro.ase.acs.interfaces.ConnectionMan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AngajatCM implements ConnectionMan {
    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection("jdbc:sqlite:database.db");
        connection.setAutoCommit(false);
        return connection;
    }
}