package Presentation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import DAO.LangueLivreDAOImpl;
import DAO.LangueLivreDAOImplService;
import DAO.LangueLivreDAOImplServiceLocator;


@WebServlet("/SupprimerLangueLivreServlet")
public class SupprimerLangueLivreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SupprimerLangueLivreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Long idLangue = Long.valueOf(Integer.parseInt(request.getParameter("id")));
		
		LangueLivreDAOImplService langueLivreService=new LangueLivreDAOImplServiceLocator();
		LangueLivreDAOImpl port=null;
			try {
				port=langueLivreService.getLangueLivreDAOImplPort();
				port.removeLangueLivre(idLangue);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		this.getServletContext().getRequestDispatcher("/SupprimerLangue.jsp").forward(request, response);
	}

}
