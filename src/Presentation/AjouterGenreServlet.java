package Presentation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import DAO.GenreLivre;
import DAO.GenreLivreDAOImpl;
import DAO.GenreLivreDAOImplService;
import DAO.GenreLivreDAOImplServiceLocator;


@WebServlet("/AjouterGenreServlet")
public class AjouterGenreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AjouterGenreServlet() {
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
		GenreLivre genre = new GenreLivre();
		//IGenreLivreService genreService = new GenreLivreServiceImpl();
		GenreLivreDAOImplService genreLivreService=new GenreLivreDAOImplServiceLocator();
		GenreLivreDAOImpl port=null;
		try {
			genre.setNomGenreLivre(request.getParameter("nameKind"));
			//genreService.addGenreLivre(genre);
			try {
				port=genreLivreService.getGenreLivreDAOImplPort();
				port.addGenreLivre(genre);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
			this.getServletContext().getRequestDispatcher("/AjouterGenre.jsp" ).forward( request, response );
		} catch (Exception e) {
			System.out.println("Erreur");
		}
	}

}
