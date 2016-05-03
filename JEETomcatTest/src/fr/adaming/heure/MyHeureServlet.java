package fr.adaming.heure;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyHeureServlet
 */
@WebServlet(
		urlPatterns = { "/heure" }, //RFRF : acces par localhost:8080/JEETomcatTest/heure
		initParams = {
				@WebInitParam(name = "bienvenue", value = "Bonjour !")	//Peut egalement être passé dans le web.xml (dans balise servlet, init-param)
		})
public class MyHeureServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyHeureServlet() {
        super();
        // Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Auto-generated method stub
		String valeur = request.getParameter("nom");
		System.out.println(valeur);
		response.getWriter().append("Bonjour "+valeur);
		response.getWriter().append("\nServed at: ").append(request.getContextPath()).append(" Il est "+new Date());
		//response.getWriter().append("Il est "+new Date());
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// Auto-generated method stub
		System.out.println( config.getInitParameter("bienvenue") );	//RFRF : On peut récuperer un parametre initial.
	}
	
	

}
