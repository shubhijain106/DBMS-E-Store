
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String userpass = request.getParameter("password");
        String name=new String();
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection c = DriverManager
                    .getConnection("jdbc:oracle:thin:@//oracle1.cise.ufl.edu:1521/orcl", "shubhi", "Anjali144");

            Statement st = c.createStatement();

            ResultSet rs = st.executeQuery("select * from customer where email='"+ username + "'");
            String username1 = new String();
            String password1 = new String();

            while (rs.next()) {
                username1 = rs.getString(2);
                name=rs.getString(1);
                password1 = rs.getString(5);
                out.println(username1);
                out.println(password1);
            }
            if(userpass.equals("nec4287") && username.equals("ornare@Nunc.edu")){
                request.getRequestDispatcher("adminprofile.jsp").forward(request, response);
            }
            
           else if (userpass.equals(password1) && username.equals(username1)) {

				HttpSession session = request.getSession(true);
                session.setAttribute("S3CRET", "S3CRET");
                session.setAttribute("full", name);
                request.getRequestDispatcher("home1.jsp").forward(request,response);
                return;
            } else {

                request.getRequestDispatcher("login.jsp").forward(request, response);
                return;
            }

        } catch (SQLException e) {
            out.println("SQL Exception " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        out.println("</body>");
        out.println("</html>");

    }

}
