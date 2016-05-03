package fr.adaming.formulaire;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NameServlet
 */
//@WebServlet("/bonjour")	//RFRF : remplacé par declaration dans web xml, méthodes équivalentes.
public class NameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NameServlet() {
        super();
        // Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Auto-generated method stub
		afficherBonjour(request, response, "GET");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Auto-generated method stub
		afficherBonjour(req, resp, "POST");
	}
	
	private void afficherBonjour(HttpServletRequest req, HttpServletResponse resp, String n) throws ServletException, IOException {
		String nom = req.getParameter("nom");	//On recupere le parametre de type nom
		resp.getWriter().append(n+" : \n\tBonjour "+nom);
	}

}
