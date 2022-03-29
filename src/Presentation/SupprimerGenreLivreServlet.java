package Presentation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import DAO.GenreLivreDAOImpl;
import DAO.GenreLivreDAOImplService;
import DAO.GenreLivreDAOImplServiceLocator;

@WebServlet("/SupprimerGenreLivreServlet")
public class SupprimerGenreLivreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SupprimerGenreLivreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Long idGenre = Long.valueOf(Integer.parseInt(request.getParameter("id")));
		
		GenreLivreDAOImplService genreLivreService=new GenreLivreDAOImplServiceLocator();
		GenreLivreDAOImpl port=null;
		try {
			port=genreLivreService.getGenreLivreDAOImplPort();
			port.removeGenreLivre(idGenre);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		this.getServletContext().getRequestDispatcher("/SupprimerGenre.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
