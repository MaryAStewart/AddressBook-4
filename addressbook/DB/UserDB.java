package addressbook.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import addressbookbusiness.User;

public class UserDB {
	
	static Connection connection = null;
	static Statement statement = null;
	
	public static Connection getConnection() throws SQLException {		

		// set up the home directory for Derby
		
		String dbDirectory = "c:/murach/java/db";
		System.setProperty("derby.system.home", dbDirectory);

		// create and return the connection
		DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());//New Code!!!!
		
		String dbUrl = "jdbc:derby:AddressBookDB";
		 connection = DriverManager.getConnection(dbUrl);
		 return connection;
	
		
	}
	
	public static void getStatementConnection() {

		try {
			statement = getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public static ArrayList<User> fList () {
		ArrayList<User>users = new ArrayList<User>();
		String query = "SELECT Name, Email, PhoneNumber FROM Contacts ORDER by Name";
		
		try{	Connection connection = getConnection();		
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(query);
			 
			while (rs.next()) {
				User user = new User();
				user.setName(rs.getString("Name"));
				user.setEmail(rs.getString("Email"));
				user.setPhoneNumber(rs.getString("PhoneNumber"));
				users.add(user);				
			}
			DBUtils.closeResultSet(rs);
			
		} catch (SQLException e) {
			for (Throwable t : e) {
				e.printStackTrace();				
			}
		}
		
		return users;			
		
	}


}
