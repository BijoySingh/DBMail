package DBMailPackage;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class ContextListener
 *
 */
public class ContextListener implements ServletContextListener, ServletContextAttributeListener {

    /**
     * Default constructor. 
     */
    public ContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0) {
    	//Open the connection here
    	String dbURL2 = "jdbc:postgresql://10.105.1.12/cs387";
        String user = "db120050006";
        String pass = "120050006";

        try {
    		Class.forName("org.postgresql.Driver");
    		Connection conn1 = DriverManager.getConnection(dbURL2, user, pass);
    		System.out.println("init"+conn1);
    		arg0.getServletContext().setAttribute("db_conn", conn1);
        	} catch (Exception e) {
        		System.out.println("THE ERROR"+ e);
    		// TODO Auto-generated catch block
        		e.printStackTrace();
        	}
    }

	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(ServletContextAttributeEvent arg0) {
        // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent arg0) {
        // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent arg0) {
        contextInitialized(arg0);
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
		Connection conn1 = (Connection) arg0.getServletContext().getAttribute("db_conn");

    	try{
    		conn1.close();
    		System.out.println("close");
    	}catch(Exception e)
    	{
    		System.out.println(e);
    	}
    }
	
}
