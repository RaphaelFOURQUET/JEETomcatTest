package fr.adaming.formulaire;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Auto-generated method stub
		login(request, response);
	}

	private void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String sessionLogin = (String) request.getSession().getAttribute("login");
		String login = request.getParameter("login");

		if(sessionLogin == null) {
			request.getSession().setAttribute("login", login);
			response.getWriter().append("Bienvenue "+login);
		} else {
			if(login == null || login.isEmpty()) {
				response.getWriter().append("Login incorrect : REFUS.");
			} else {
				response.getWriter().append("Déja connecté !");
			}
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		login(request, response);
		response.sendRedirect( "index.jsp" );
	}

}
