import java.sql.*;
public class DemoClass {
	
public static void main(String[] args)throws Exception
{
	Connection connection=null;
	String query="select * from employee";
	try
	{
	
	Class.forName("org.postgresql.Driver");
	connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","jessi");
	Statement st=connection.createStatement();
	ResultSet rs=st.executeQuery(query);
	rs.next();
	String card=rs.getString("id");
	String namee=rs.getString("name");
	System.out.print(namee+" ");
	System.out.println(card);
	st.close();

			
	if(connection!=null)
	{
		System.out.println("ok");
	}
	else
	{
		System.out.println("not ok");
	}
	
	}
	catch (Exception e)
	{
		System.out.println(e);
	}
		connection.close();
}
}
