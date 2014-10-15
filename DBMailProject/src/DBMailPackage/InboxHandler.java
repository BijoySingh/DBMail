package DBMailPackage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PSQLConnector
 */
public class InboxHandler extends HttpServlet {
	Connection conn1 =null;
	Statement st =null;
	String source_link = "/LibraryApplication/";
	public void init() throws ServletException {
		//Open the connection here

		String dbURL2 = "jdbc:postgresql://10.105.1.12/cs387";
		String user = "db120050006";
		String pass = "120050006";

		try {
			Class.forName("org.postgresql.Driver");

			conn1 = DriverManager.getConnection(dbURL2, user, pass);
			st = conn1.createStatement();
			System.out.println("init"+conn1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void destroy() {
		//Close the connection here
		try{
			conn1.close();
			System.out.println("close");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	protected void getEmail(String userid, HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException{
		
		
		JSONObject jo = new JSONObject();
		jo.put("firstName", "John");
		jo.put("lastName", "Doe");

		JSONArray ja = new JSONArray();
		ja.put(jo);

		JSONObject mainObj = new JSONObject();
		mainObj.put("employees", ja);		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException
	{
		 HttpSession session = request.getSession();
	     String userid = request.getParameter( "user_id" );
//		 String cc = request.getParameter("cc_receivers");
//		 String bcc = request.getParameter("bcc_receivers");
	     getEmail(userid,request,response);
	     
	     response.sendRedirect(source_link + "menu?issue=something");		
	}

}