

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username =request.getParameter("username");
		String email =request.getParameter("email");
                String gender =request.getParameter("gender");
		String date =request.getParameter("date");
                String password =request.getParameter("password");
           
                int id=0;
                
		PrintWriter out = response.getWriter();
		
	
		out.println("<html>");
		out.println("<body>");
		try {
                     
                                    PrintWriter out1 = response.getWriter();  
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager
					.getConnection("jdbc:oracle:thin:@//oracle1.cise.ufl.edu:1521/orcl","shubhi","Anjali144");

		
			
			Statement st=c.createStatement();
			Statement st1=c.createStatement();
                        
			ResultSet rs = st.executeQuery("select * from customer where uname='"+ username + "'");
			
			if(rs.next()){
				response.sendRedirect("registration.jsp");
			}
			else{
                        ResultSet rs2 = st.executeQuery("select MAX(CAST(SUBSTR(user_id, 5) AS INT))  from customer");
                        while(rs2.next()){
                        id=rs2.getInt(1)+1;    
                        }
                        String queryx= "insert into customer values('"+username+"','"+email+"','UID-"+id+"','10-jun-1993','"+password+"','"+gender+"','customer')";
			//
			out1.print(queryx);
                        int r = st1.executeUpdate(queryx);
			if((r>0)){
						HttpSession session = request.getSession(true);
                session.setAttribute("S3CRET", "S3CRET");
                session.setAttribute("full", username);
                request.getRequestDispatcher("home1.jsp").forward(request,response);
                return;
		
                        }
				else{
					response.sendRedirect("index.jsp");}
			}
					
			

		
		} catch (SQLException e) {
			out.println("SQL Exception " + e.getMessage());
			e.printStackTrace();
		} catch (ClassNotFoundException ex) {
                Logger.getLogger(RegistrationServlet.class.getName()).log(Level.SEVERE, null, ex);
            }

		out.println("</body>");
		out.println("</html>");
	}

}
