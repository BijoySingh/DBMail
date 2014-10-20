package DBMailPackage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUpHandler
 */
public class SignUpHandler extends HttpServlet { //extends ConnectionHandler
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = (Connection) getServletConfig().getServletContext().getAttribute("db_conn");
		String name = request.getParameter("Name");
        String username = request.getParameter("Username");
        String pswd = request.getParameter("Password");
        if(!(pswd.equals(request.getParameter("ConfirmPassword")))){
        	response.sendRedirect("/DBMailProject/error.jsp");
        }
        try {
        	PreparedStatement a = conn.prepareStatement("SELECT 1 FROM user_list WHERE email = ?");
        	a.setString(1,username);
        	ResultSet rs = a.executeQuery();
        	if(rs.next()) response.sendRedirect("/DBMailProject/login.jsp?error=error");
        	a = conn.prepareStatement("INSERT INTO user_list(email,name,password) values(?,?,?)");
        	a.setString(1,username);
        	a.setString(2,name);
        	a.setString(3,pswd);
        	a.executeUpdate();
        	response.sendRedirect("/DBMailProject/login.jsp");
        }
        catch(SQLException e) {
        	System.out.print(e);
        	try {
        		if(conn.isClosed()) request.getServletContext().removeAttribute("conn");
        	}
        	catch(Exception e1) {
        		e1.printStackTrace();
        	}
        }
		
	}

}
