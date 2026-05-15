import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class AddPatientServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        int pid = Integer.parseInt(request.getParameter("pid"));
        String pname = request.getParameter("pname");
        int age = Integer.parseInt(request.getParameter("age"));
        String disease = request.getParameter("disease");

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps =
            con.prepareStatement(
            "INSERT INTO Patients VALUES(?,?,?,?)");

            ps.setInt(1, pid);
            ps.setString(2, pname);
            ps.setInt(3, age);
            ps.setString(4, disease);

            int i = ps.executeUpdate();

            if(i > 0) {

                out.println("<h2>Patient Added Successfully</h2>");

            } else {

                out.println("<h2>Record Not Inserted</h2>");
            }

            con.close();

        } catch(Exception e) {

            out.println(e);
        }
    }
}