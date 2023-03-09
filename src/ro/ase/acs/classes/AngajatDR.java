package ro.ase.acs.classes;

import ro.ase.acs.interfaces.DataReader;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AngajatDR implements DataReader {
    @Override
    public void readData(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM employees");
        while (rs.next()) {
            System.out.println("id: " + rs.getInt("id"));
            System.out.println("name: " + rs.getString(2));
            System.out.println("address: " + rs.getString("address"));
            System.out.println("salary: " + rs.getDouble("salary"));
        }
        rs.close();
        statement.close();
    }
}