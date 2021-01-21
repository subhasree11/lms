package next.xadmin.login.web;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import next.xadmin.login.web.*;

@WebServlet("/actionforbutton")
	
	
	
public class actionforbutton extends HttpServlet {
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
    public actionforbutton() {
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
		if("approve".equals(action)) {
			try {
				String query="Update leavetable set leavestatus=? where email=?"  ;
				pst = con.prepareStatement(query);
				pst.setString(1,"APPROVED");
				pst.setString(2, Email);
				pst.executeUpdate();}catch (SQLException e) {
					e.printStackTrace();

				}
			
			
		 out.println("Leave approved");
			
		
		}
		else {
			try {
			String query1="Update leavetable set leavestatus=? where email=?"  ;
			pst = con.prepareStatement(query1);
			pst.setString(1,"DISAPPROVED");
			pst.setString(2, Email);
			pst.executeUpdate();}catch (SQLException e) {
				e.printStackTrace();
				
		}
			 out.println("Leave disapproved");	
	}
}
}