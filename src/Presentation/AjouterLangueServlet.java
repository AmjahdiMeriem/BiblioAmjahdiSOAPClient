package Presentation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import DAO.LangueLivre;
import DAO.LangueLivreDAOImpl;
import DAO.LangueLivreDAOImplService;
import DAO.LangueLivreDAOImplServiceLocator;


@WebServlet("/AjouterLangueServlet")
public class AjouterLangueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AjouterLangueServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		LangueLivre langue = new LangueLivre();
		//ILangueLivreService langueService = new LangueLivreServiceImpl();
		LangueLivreDAOImplService langueLivreService=new LangueLivreDAOImplServiceLocator();
		LangueLivreDAOImpl port=null;
		try {
			langue.setNomLangueLivre(request.getParameter("nameLangue"));
			//genreService.addLangueLivre(langue);
			try {
				port=langueLivreService.getLangueLivreDAOImplPort();
				port.addLangueLivre(langue);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
			this.getServletContext().getRequestDispatcher("/AjouterLangue.jsp").forward(request, response);
		} catch (Exception e) {
			System.out.println("Erreur");
		}
	}

}
