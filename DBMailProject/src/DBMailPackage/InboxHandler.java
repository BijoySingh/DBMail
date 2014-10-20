package DBMailPackage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
	String get_inbox_query = "";
	public void init() throws ServletException {
	
	}

	public void destroy() {

	}
	protected JSONObject getEmail(String userid, HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException{
		JSONObject jo = new JSONObject();
		JSONArray ja = new JSONArray();
		JSONObject mainObj = new JSONObject();
		
		Connection conn1 = (Connection) request.getServletContext().getAttribute("db_conn");
	
		
		try{
			PreparedStatement preparedSt = 
				conn1.prepareStatement(
						"SELECT * FROM Received WHERE receiver_id = ?"
						);
			preparedSt.setInt(1, Integer.parseInt(userid));
			
			ResultSet rs;
			rs = preparedSt.executeQuery();
			while(rs.next()){
			jo = new JSONObject();
				jo.put("email_source", rs.getString(1));
				jo.put("thread_id", rs.getString(2));
				jo.put("email_read", rs.getString(3));
				jo.put("email_subject", rs.getString(4));
				jo.put("email_interval", rs.getString(5));
				ja.put(jo);	
			}
				
			jo.put("email_source", "Johny");
			jo.put("thread_id", "1");	
			jo.put("email_read", "true");	
			jo.put("email_subject", "This is the bloody subject of the email");	
			jo.put("email_interval", "1 day ago");	
			ja.put(jo);	
			jo = new JSONObject();
			jo.put("email_source", "Harry");
			jo.put("thread_id", "1");	
			jo.put("email_read", "false");	
			jo.put("email_subject", "Yo Douche!");	
			jo.put("email_interval", "1 day ago");	
			ja.put(jo);	
			mainObj.put("inbox", ja);
		}catch(Exception e){
			e.printStackTrace();
		}
		return mainObj;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException
	{
		 HttpSession session = request.getSession();
		 String userid = (String) session.getAttribute("user_id");
//		 System.out.println(userid);
//		 String cc = request.getParameter("cc_receivers");
//		 String bcc = request.getParameter("bcc_receivers");
		 JSONObject jsonobj = getEmail(userid,request,response);	
	     response.getOutputStream().print(jsonobj.toString());
	}

}