package next.xadmin.login.web;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import next.xadmin.login.web.*;

/**
 * Servlet implementation class actionforbutton
 */
@WebServlet("/LeaveStatus")
	
	
	
public class LeaveStatus extends HttpServlet {
	private String dbUrl = "jdbc:mysql://localhost:3306/userdb";
	private String dbUname = "root";
	private String dbPassword = "password";
	private String dbDriver = "com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	{
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LeaveStatus() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out = response.getWriter();
		loadDriver(dbDriver);
		  Connection con = getConnection();
		  PreparedStatement pst;
		String Email=request.getParameter("Email");
		String action=request.getParameter("action");
		//Class.forName("com.mysql.jdbc.Driver");
		if("enter".equals(action)) {
			
			 try {
			
	     
	         Statement stmt = con.createStatement();
	         String sql;
	         sql = "SELECT email,leavestatus FROM leavetable ";
	         ResultSet rs = stmt.executeQuery(sql);
	         // Extract data from result set
	         while(rs.next()){
	            //Retrieve by column name
	
	            String email = rs.getString("email");
	            String leavestatus = rs.getString("leavestatus");
	            if(email.equals(Email)) {
	            //Display values
	            out.println("email: " + email);
	            out.println("leavestatus: " + leavestatus);}}
	         
	       
	         // Clean-up environment
	         rs.close();
	         stmt.close();}
	       catch(SQLException e) {
	         //Handle errors for JDBC
	         e.printStackTrace();
	      }
			
			
		}
	
			
		
		}
		
	
}