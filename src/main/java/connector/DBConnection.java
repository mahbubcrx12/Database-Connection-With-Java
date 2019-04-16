package connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	public static Connection get_connection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://vNTDACWSSQLD002:1433;"
					+ "databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123");
			System.out.println("connected");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return connection;

	}
	
//	public static void main(String[] args) throws SQLException {
//		get_connection();
//		
//		String tableName = "Mahbub_Employe";
//        String column1 = "E_id";
//        String column1Type = "int(10)";
//        String column2 = "E_name";
//        String column2Type = "varchar(30)";
//        String column3 = "E_salary";
//        String column3Type = "varchar(20)";
//        String column4 = "E_address";
//        String column4Type = "varchar(30)";
//	    
//	    String url = "jdbc:sqlserver://vNTDACWSSQLD002:1433;\"\r\n" + 
//	    		"					+ \"databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123";
//	    Connection connection = DriverManager.getConnection(url, " dev_test_dbo", " dev_test_dbo123");
//	    Statement stmt = connection.createStatement();
//	    String query = "create table if not exist" + tableName + " ( " + column1+" " + column1Type +  " , " +
//                column2 +" " + column2Type + " " +column3+ ","+column3Type+","+column4+",+"+column4Type+" )";
//	    System.out.printf(query);
//	    stmt.executeUpdate(query);
//	    stmt.close();
//	}

	

}
