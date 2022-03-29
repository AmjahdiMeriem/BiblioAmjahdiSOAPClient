package Presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.rpc.ServiceException;

import DAO.Livre;
import DAO.LoginDAOImpl;
import DAO.LoginDAOImplService;
import DAO.LoginDAOImplServiceLocator;
import DAO.PannierDAOImpl;
import DAO.PannierDAOImplService;
import DAO.PannierDAOImplServiceLocator;

@WebServlet("/AfficherLivrePannierServlet")
public class AfficherLivrePannierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AfficherLivrePannierServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//IPannierService pannier = new PannierServiceImpl();
		PannierDAOImplService pannier=new PannierDAOImplServiceLocator();
		PannierDAOImpl port=null;
		Livre[] livres = null;
		HttpSession session = request.getSession();
		Long idUser = (Long) session.getAttribute("idUser");

		//livres = pannier.findLivrePannierByIdUsr(idUser);
		try {
			port=pannier.getPannierDAOImplPort();
			livres=port.findLivrePannierByIdUsr(idUser);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		if (livres==null){
			this.getServletContext().getRequestDispatcher("/Index.jsp").forward(request, response);
		}else {
		request.setAttribute("livres", livres);
		this.getServletContext().getRequestDispatcher("/Panier.jsp").forward(request, response);
	}}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//IPannierService pannier = new PannierServiceImpl();
		PannierDAOImplService pannier=new PannierDAOImplServiceLocator();
		PannierDAOImpl port=null;
		//List<Livre> livres = new ArrayList<Livre>();
		Livre[] livres = null;
		HttpSession session = request.getSession();
		Long idUser = (Long) session.getAttribute("idUser");

		//livres = pannier.findLivrePannierByIdUsr(idUser);
		try {
			port=pannier.getPannierDAOImplPort();
			livres=port.findLivrePannierByIdUsr(idUser);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		request.setAttribute("livres", livres);
		this.getServletContext().getRequestDispatcher("/Panier.jsp").forward(request, response);
	}

}
