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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SignInHandler
 */
public class SignInHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignInHandler() {
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
		String username = request.getParameter("Username");
		String password = request.getParameter("Password");
		System.out.println("fasdfaddsf");
		Connection conn1 = (Connection) request.getServletContext().getAttribute("db_conn");
		try {
			if(conn1 == null)
				System.out.println("fuck");
			
			PreparedStatement a = conn1.prepareStatement("SELECT user_id FROM user_list WHERE email = ? and password = ?");
			
			a.setString(1, username);
			a.setString(2, password);
			
			ResultSet rs = a.executeQuery();
			
			if(rs.next()) {
				System.out.println("hey " + rs.getString(1));
				HttpSession current = request.getSession();
				current.setAttribute("user_id", rs.getString(1));
				response.sendRedirect("/DBMailProject/home.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				if(conn1.isClosed())
					request.getServletContext().removeAttribute("db_conn");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}

}
