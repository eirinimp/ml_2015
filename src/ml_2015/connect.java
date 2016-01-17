package ml_2015;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class connect {
	
	public static Connection connect() {
		// TODO Auto-generated method stub
		Connection conn = null;
		String connectionUrl = "jdbc:mysql://localhost:3306/";
		String connectionDb = "ml_2015";
		String connectionUser = "root";
		String connectionPassword = "";
		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			conn = DriverManager.getConnection(connectionUrl+connectionDb, connectionUser, connectionPassword);

			if (conn != null) {
				Logger logger = Logger.getLogger("database");
				logger.setLevel(Level.SEVERE);
				logger.info("Connection cannot be established");
			} else {
				Logger logger = Logger.getLogger("database");
				logger.setLevel(Level.INFO);
				logger.info("Connected to Database!");
			}
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
		
		public static void printResult(ResultSet rs) {
	
			try {
				ResultSetMetaData rsmd = rs.getMetaData();
				int columnsNumber = rsmd.getColumnCount();
	
				String cur_row = "";
				for (int i = 1; i <= columnsNumber; i++) {
					cur_row += rsmd.getColumnName(i) + "\t";
				}
				//logger.info(cur_row);
				System.out.println(cur_row);
	
	
				rs.beforeFirst();
				while ( rs.next() ) {
					cur_row = "";
					for (int i = 1; i <= columnsNumber; i++) {
						cur_row += rs.getString(i) + "\t  ";
					}
					//logger.info(cur_row);
					System.out.println(cur_row);
				}
			} catch (SQLException e) {
	
				e.printStackTrace();
	
			}
		}

}