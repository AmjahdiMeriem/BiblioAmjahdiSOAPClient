<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="DAO.GenreLivre"%>
<%@ page import="DAO.GenreLivreDAOImpl"%>
<%@ page import="DAO.GenreLivreDAOImplService"%>
<%@ page import="DAO.GenreLivreDAOImplServiceLocator"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="javax.xml.rpc.ServiceException"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title></title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description"
	content="Free HTML5 Website Template by FreeHTML5.co" />
<meta name="keywords"
	content="free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive" />
<meta name="author" content="FreeHTML5.co" />

<!-- Facebook and Twitter integration -->
<meta property="og:title" content="" />
<meta property="og:image" content="" />
<meta property="og:url" content="" />
<meta property="og:site_name" content="" />
<meta property="og:description" content="" />
<meta name="twitter:title" content="" />
<meta name="twitter:image" content="" />
<meta name="twitter:url" content="" />
<meta name="twitter:card" content="" />

<%@ include file="/Include/css.jsp"%>

<!-- Modernizr JS -->
<script src="js/modernizr-2.6.2.min.js"></script>

</head>
<body>

	<%
		/* IGenreLivreService genreService = new GenreLivreServiceImpl();
		List<GenreLivre> genres = genreService.findGenreLivre();
		genres=genreService.findGenreLivre(); */
		GenreLivreDAOImplService genreLivreService=new GenreLivreDAOImplServiceLocator();
		GenreLivreDAOImpl port2=null;
		//List<GenreLivre> genres = genreService.findGenreLivre();
		GenreLivre[] genres=null;
		try {
			port2=genreLivreService.getGenreLivreDAOImplPort();
			genres =port2.findGenreLivre();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	%>

	<div class="gtco-loader"></div>

	<div id="page">


		<!-- <div class="page-inner"> -->
		<%@ include file="/Include/Nav.jsp"%>


		<div id="gtco-features">
			<div class="gtco-container">
				<div class="row">
					<div
						class="col-md-8 col-md-offset-2 text-center gtco-heading animate-box">
						<h2>my basket</h2>
					</div>
				</div>
				<div class="row">
					<%
						for (int i = 0; i < genres.length; i++) {
					%>
					<div class="col-md-4 col-sm-6">
						<div class="feature-center animate-box"
							data-animate-effect="fadeIn">
							<span class="icon"> <i><%=i + 1%></i>
							</span>
							<h3><%=genres[i].getNomGenreLivre()%></h3>
							<a href="./SupprimerGenreLivreServlet?id=<%=genres[i].getIdGenreLivre()%>" class="btn btn-default btn-sm">Delete</a>
						</div>
					</div>
					<%
						}
					%>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="/Include/js.jsp"%>
</body>
</html>