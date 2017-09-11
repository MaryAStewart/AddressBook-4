package addressbook.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtils {
	private static Connection connection;
	
	public static void closeResultSet(ResultSet rs){
		try {
			if (rs!=null) {
				rs.close();
			}
		} catch (SQLException e){
			System.out.println(e);
		}
	}
	 public static void closeConnection()  throws SQLException{
	        if (connection != null) {
	            try {
	                connection.close();
	            } catch (SQLException e) {
	            	System.out.println("Error closing connection!");
	                throw e;
	            } finally {
	                connection = null;                
	            }
	        }
	    }
	
}
