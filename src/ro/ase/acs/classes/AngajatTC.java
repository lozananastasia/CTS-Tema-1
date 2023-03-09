package ro.ase.acs.classes;

import ro.ase.acs.interfaces.TableCreator;

import java.sql.Connection;
import java.sql.Statement;

public class AngajatTC implements TableCreator {
    @Override
    public void createTable(Connection connection) throws Exception {


        Statement statement = connection.createStatement();
        statement.executeUpdate( "DROP TABLE IF EXISTS employees");
        statement.executeUpdate("CREATE TABLE employees(id INTEGER PRIMARY KEY, name TEXT, address TEXT, salary REAL)");
        statement.close();
        connection.commit();
    }
}