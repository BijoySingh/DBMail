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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Servlet implementation class PSQLConnector
 */
public class InboxHandler extends HttpServlet {
	Connection conn1 =null;
	Statement st =null;
	String source_link = "/LibraryApplication/";
	public void init() throws ServletException {
		//Open the connection here

//		String dbURL2 = "jdbc:postgresql://10.105.1.12/cs387";
//		String user = "db120050006";
//		String pass = "120050006";
//
//		try {
//			Class.forName("org.postgresql.Driver");
//
//			conn1 = DriverManager.getConnection(dbURL2, user, pass);
//			st = conn1.createStatement();
//			System.out.println("init"+conn1);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	public void destroy() {
		//Close the connection here
//		try{
//			conn1.close();
//			System.out.println("close");
//		}catch(Exception e)
//		{
//			System.out.println(e);
//		}
	}
	protected JSONObject getEmail(String userid, HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException{
		JSONObject jo = new JSONObject();
		JSONArray ja = new JSONArray();
		JSONObject mainObj = new JSONObject();
		try{
			jo.put("email_source", "John");
			jo.put("thread_id", "1");	
			jo.put("email_read", "true");	
			jo.put("email_subject", "This is the bloody subject of the email");	
			jo.put("email_interval", "1 day ago");	
			ja.put(jo);	
			
			mainObj.put("inbox", ja);
		}catch(Exception e){
			
		}
		return mainObj;
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException
	{
		 HttpSession session = request.getSession();
//	     String userid = request.getParameter( "user_id" );
//		 String cc = request.getParameter("cc_receivers");
//		 String bcc = request.getParameter("bcc_receivers");
		 JSONObject jsonobj = getEmail("",request,response);
	     response.getOutputStream().print(jsonobj.toString());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException
	{
		 HttpSession session = request.getSession();
//	     String userid = request.getParameter( "user_id" );
//		 String cc = request.getParameter("cc_receivers");
//		 String bcc = request.getParameter("bcc_receivers");
		 JSONObject jsonobj = getEmail("",request,response);	
	     response.getOutputStream().print(jsonobj.toString());
	}

}