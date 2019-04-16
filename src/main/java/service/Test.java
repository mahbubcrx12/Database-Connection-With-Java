package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String tableName = "Mahbub_Employe";
        String column1 = "E_id";
        String column1Type = "int(10)";
        String column2 = "E_name";
        String column2Type = "varchar(30)";
        String column3 = "E_salary";
        String column3Type = "varchar(20)";
        String column4 = "E_address";
        String column4Type = "varchar(30)";
        //Class.forName("com.sql.jdbc.Driver");
        String url = "jdbc:sqlserver://vNTDACWSSQLD002:1433;"
    			+ "databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123";
        Connection connection = DriverManager.getConnection(url);
        Statement stmt = connection.createStatement();
        String query = "create table if not exist" + tableName + " ( " + column1+" " + column1Type +  " , " +
                column2 +" " + column2Type + " " +column3+ ","+column3Type+","+column4+",+"+column4Type+" )";
        
        System.out.printf(query);
        stmt.executeUpdate(query);
        connection.close();
        
       
        
    }
}