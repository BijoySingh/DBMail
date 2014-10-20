package DBMailPackage;

import java.io.BufferedReader;
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
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Servlet implementation class PSQLConnector
 */
public class WriteHandler extends HttpServlet {
	Connection conn1 =null;
	Statement st =null;
	String get_inbox_query = "";
	public void init() throws ServletException {

	}

	public void destroy() {

	}
	protected void inputEmail(String userid, HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException{


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException
	{
		HttpSession session = request.getSession();

		StringBuffer jb = new StringBuffer();
		String line = null;
		try {
			BufferedReader reader = request.getReader();
			while ((line = reader.readLine()) != null)
				jb.append(line);
		} catch (Exception e) {
			response.getOutputStream().print("SHIT HAPPENS");
		}
				
		JSONObject jsonObj = null;
		try {
			jsonObj = new JSONObject(jb.toString());
			response.getOutputStream().print(jsonObj.toString());
			
		} catch (JSONException e) {
			response.getOutputStream().print("SHIT HAPPENS EVERYTIME");
		}

		inputEmail("",request,response);	
	}

}