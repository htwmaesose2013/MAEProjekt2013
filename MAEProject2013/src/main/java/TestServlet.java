
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String loginName = request.getParameter("loginName");
		String password = request.getParameter("password");

		if (loginName.equals("simon")) {
			if (password.equals("itblogging")) {
				out.println("Benutzername und Passwort wurden korrekt eingegeben");
			} else {
				out.println("Das Passwort ist falsch. Bitte versuche es erneut<br />");
				out.println("<a href='index.jsp'>Hier</a> geht es zur&uuml;ck zur Eingabemaske!");
			}
		} else {
			out.println("Benutzername nicht vorhanden<br />");
			out.println("<a href='index.jsp'>Hier</a> geht es zur&uuml;ck zur Eingabemaske!");
		}
	}
}
