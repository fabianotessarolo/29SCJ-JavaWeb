import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MinhaPrimeiraServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -467119238201745800L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.append("<h1> Minha Primeira Servlet </h1>");
		
		req.getRequestDispatcher("/sucesso").include(req, resp);
		HttpSession session = req.getSession(true);
		out.append("Seu id é " + session.getAttribute("id"));
		
		//resp.sendRedirect("/sucesso");
		// super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String firstName = req.getParameter("firstname");
		String lastName = req.getParameter("lastname");

		BufferedWriter writer = null;

		try {
			String timeLog = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
			File logFile = new File(timeLog);

			System.out.println(logFile.getCanonicalPath());

			writer = new BufferedWriter(new FileWriter(logFile));
			writer.append(firstName).append("\n").append(lastName);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (Exception e) {
			}
		}

	}

}
