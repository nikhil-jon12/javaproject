
import java.sql.*;
import java.sql.Connection;


public class LoginDao {

	public boolean validate(Login log) throws ClassNotFoundException 
	{
		Connection con=null;
		PreparedStatement ps;
		ResultSet rs;
		boolean status = false;
		try
		 {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Found");
		con=DriverManager.getConnection("jdbc:mysql://192.168.100.26:3306/group016","group016","welcome");
		System.out.println("Connection Established");
		
		 ps = con
		            .prepareStatement("select * from BOOK2 where username = ? and password = ? ");
		 ps.setString(1, log.getUsername());
		 ps.setString(2, log.getPassword());
		 System.out.println(ps);
		 rs = ps.executeQuery();
		 status = rs.next();
		}
		catch(Exception e)
		{
			
		}
		return status;
		
	}
}
