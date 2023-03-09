package ro.ase.acs.main;

import ro.ase.acs.classes.AngajatCM;
import ro.ase.acs.classes.AngajatDI;
import ro.ase.acs.classes.AngajatDR;
import ro.ase.acs.classes.AngajatTC;
import ro.ase.acs.interfaces.ConnectionMan;
import ro.ase.acs.interfaces.DataInsertor;
import ro.ase.acs.interfaces.DataReader;
import ro.ase.acs.interfaces.TableCreator;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        try {
            ConnectionMan connectionManager = new AngajatCM();
            Connection connection = connectionManager.getConnection();


            TableCreator employeeTableCreator = new AngajatTC();
            employeeTableCreator.createTable(connection);

            DataInsertor employeeDataInsertor = new AngajatDI();
            employeeDataInsertor.inserData(connection);

            DataReader employeeReader = new AngajatDR();
            employeeReader.readData(connection);

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}