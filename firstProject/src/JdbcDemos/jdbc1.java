package JdbcDemos;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class jdbc1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test?characterEncoding=latin1","root","password"); 
		    Statement stmt =con.createStatement();
//		    PreparedStatement st=con.prepareStatement("insert into employees values(?,?,?,?)");
//		    st.setInt(1, 2);
//		    st.setString(2,"Avi");
//		    st.setString(3, "Middle tier");
//		    st.setInt(4, 251);
//		    int count=st.executeUpdate();
		    PreparedStatement updateStudent=con.prepareStatement("update employees set dept_name=? where dept_id=?");
		    updateStudent.setString(1,"IT");
		    updateStudent.setString(2,"251");
		    int count=updateStudent.executeUpdate();
//		    PreparedStatement deleteEmp = con.prepareStatement("delete from employees where dept_id=?");
//		    deleteEmp.setString(1,"251");
//		    int count=deleteEmp.executeUpdate();
		    
		    System.out.println(count+"row/s affected");
		    
		  
		    ResultSet rs=stmt.executeQuery("select * from employees");
		  
		  while(rs.next())
		  {
			  System.out.println(rs.getInt(1)+ " " + rs.getString(2) + " " + rs.getString(3) + " " +rs.getInt(4));
			  
		  }
		  con.close();
		}
		
		catch(Exception e1)
		{
			e1.printStackTrace();
			
		}		
		finally {
			System.out.println("received the data");
		}
	}

}
