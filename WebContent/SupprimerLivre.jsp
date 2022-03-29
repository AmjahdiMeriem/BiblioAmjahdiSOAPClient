<!DOCTYPE HTML>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page import="DAO.LangueLivre"%>
<%@ page import="DAO.LangueLivreDAOImpl"%>
<%@ page import="DAO.LangueLivreDAOImplService"%>
<%@ page import="DAO.LangueLivreDAOImplServiceLocator"%>
<%@ page import="DAO.GenreLivre"%>
<%@ page import="DAO.GenreLivreDAOImpl"%>
<%@ page import="DAO.GenreLivreDAOImplService"%>
<%@ page import="DAO.GenreLivreDAOImplServiceLocator"%>
<%@ page import="DAO.Livre"%>
<%@ page import="DAO.LivreDAOImpl"%>
<%@ page import="DAO.LivreDAOImplService"%>
<%@ page import="DAO.LivreDAOImplServiceLocator"%>
<%@ page import="javax.xml.rpc.ServiceException"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

</head>
<!-- ----------------------------------------------------------------------------------------------------------- -->
<body>

	<div class="gtco-loader"></div>

	<div id="page">

		<!-- ----------------------------------------------------------------------------------------------------------- -->

		<%@ include file="/Include/Nav.jsp"%>

		<!-- ----------------------------------------------------------------------------------------------------------- -->
		<header id="gtco-header" class="gtco-cover gtco-cover-md"
			role="banner"
			style="background-image: url(Template/images/img_6.jpg)">
			<div class="overlay"></div>
			<div class="gtco-container">
				<div class="row row-mt-15em" style="margin-top: 15%">
					<div class="col-md-7 mt-text animate-box"
						data-animate-effect="fadeInUp"></div>
					<div class="col-md-4 col-md-push-1 animate-box"
						data-animate-effect="fadeInRight">
						<div class="form-wrap">
							<div class="tab">
								<%
								LangueLivreDAOImplService langueLivreService=new LangueLivreDAOImplServiceLocator();
								LangueLivreDAOImpl port1=null;
									//List<LangueLivre> langues = langueService.findLangueAll();
									LangueLivre[] langues =null;
									try {
										port1=langueLivreService.getLangueLivreDAOImplPort();
										langues =port1.findLangueAll();
									} catch (ServiceException e) {
										e.printStackTrace();
									}
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

								<div class="tab-content">
									<div class="tab-content-inner active" data-content="signup">
										<h3>
											<%
												
											%>
											Search for a book
										</h3>
										<form action="Index.jsp">
											<div class="row form-group">
												<div class="col-md-12">
													<label for="Kind">Kind</label> <select name="Kind"
														id="Kind" class="form-control">
														<option value=""></option>
														<%
															for (int i = 0; i < genres.length; i++) {
														%>
														<option value=<%=String.valueOf(genres[i].getIdGenreLivre())%>><%=genres[i].getNomGenreLivre()%></option>

														<%
															}
														%>
													</select>
												</div>
											</div>
											<div class="row form-group">
												<div class="col-md-12">
													<label for="Language">Language</label> <select
														name="Language" id="Language" class="form-control">
														<option value=""></option>
														<%
															for (int i = 0; i < langues.length; i++) {
														%>
														<option value=<%=String.valueOf(langues[i].getIdLangueLivre())%>><%=langues[i].getNomLangueLivre()%></option>
														<%
															}
														%>

													</select>

												</div>
											</div>

											<div class="row form-group">
												<div class="col-md-12">
													<input type="submit" class="btn btn-primary btn-block"
														value="Search">
												</div>
											</div>
										</form>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</header>
		<!-- ----------------------------------------------------------------------------------------------------------- -->
		<%
			/* List<Livre> livres = new ArrayList<Livre>();*/
			
			Livre[] livres = null;
			//ILivreService livresService = new LivreServiceImpl();
			LivreDAOImplService livreService = new LivreDAOImplServiceLocator();
			LivreDAOImpl port = null;
			//livres = livresService.findBookAll();
			try {
				port = livreService.getLivreDAOImplPort();
				livres = port.findBookAll();
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		%>

		<div class="gtco-section">
			<div class="gtco-container">
				<div class="row">
					<div class="col-md-8 col-md-offset-2 text-center gtco-heading">
						<h2></h2>
					</div>
				</div>
				<div class="row">
					<%
						for (int i = 0; i < livres.length; i++) {
					%>
					<div class="col-lg-4 col-md-4 col-sm-6">

						<figure>
							<img src=<%="Template/images/" + livres[i].getUrlImage()%>
								alt="Image" class="img-responsive">
						</figure>
						<div class="fh5co-text">
							<h3><%=livres[i].getTitre()%></h3>
							<p><%=livres[i].getDescription()%></p>
							<a href="./SupprimerLivreServlet?id=<%=livres[i].getISBN()%>"><p>
									<span class="btn btn-primary">Delete</span>
								</p></a>
						</div>
					</div>
					<%
						}
					%>

				</div>

			</div>
		</div>
		<!-- -------------------------------------------------------------------------------------------------------------- -->
		<!-- </div> -->

	</div>

	<%@ include file="/Include/js.jsp"%>

</body>
</html>

