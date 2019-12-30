import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {

	public static Connection getConnection () throws SQLException, ClassNotFoundException 
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver found");
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://192.168.100.26:3306/group016","group016","welcome");
		System.out.println("Connection Established");
		return con;
	}
}
