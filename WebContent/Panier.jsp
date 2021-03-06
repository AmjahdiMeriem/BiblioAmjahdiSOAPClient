<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="DAO.Livre"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
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
		Livre[] livres = (Livre[]) request.getAttribute("livres");
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
				
					<% for(int i=0;i<livres.length;i++){ %>
					<div class="col-md-4 col-sm-6">
						<div class="feature-center animate-box"
							data-animate-effect="fadeIn">
							<span class="icon"> <i><%=i+1 %></i>
							</span>
							<h3><%=livres[i].getTitre()%></h3>
							<p><%=livres[i].getDescription()%></p>
							<a href="#" class="btn btn-default btn-sm">Buy Now</a>
						</div>
					</div>
					<%} %>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="/Include/js.jsp"%>
</body>
</html>