package examples;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(value = "/dashboard", initParams = {
		@WebInitParam( name = "dashboardFeedbackEmail", value = "dash-feedback@mycompany.com")
})
public class DashboardServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// using request parameters
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Helcome, " + request.getParameter("username") + "!</h1>");
		
		// using config parameters
		writer.println("<p>If you would like to give feedback on this page, please email: " + getServletConfig().getInitParameter("dashboardFeedbackEmail") + "</p>");
		
		// using context parameters
		writer.println("<p>If you are having trouble and need assistance, please email: " + getServletContext().getInitParameter("supportEmail") + "</p>");

	}
}
