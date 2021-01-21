package next.xadmin.login.web;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import next.xadmin.login.bean.LoginBean;
import next.xadmin.login.bean.LoginBean1;
import next.xadmin.login.database.LoginDao;
import next.xadmin.login.database.LoginDao1;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LoginDao loginDao = new LoginDao();
		LoginDao1 loginDao1 = new LoginDao1();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		LoginBean loginBean = new LoginBean();
		loginBean.setUsername(username);
		loginBean.setPassword(password);
		LoginBean1 loginBean1 = new LoginBean1();
		loginBean1.setUsername(username);
		loginBean1.setPassword(password);
		
		if (loginDao.validate(loginBean))
		{
			response.sendRedirect("loginSuccess.jsp");
			
		}
		else if(loginDao1.validate(loginBean1)) {
			response.sendRedirect("deansucces.jsp");
		}
		else 
		{
			
			response.sendRedirect("loginFAilure.jsp");
			
		}
		
	}
	
}