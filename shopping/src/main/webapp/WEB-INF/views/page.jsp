<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:set var="ctxtroot" value="${pageContext.request.contextPath}" />

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />


<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>${title}</title>

<script>
	window.menu = '${title}';
</script>


<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>

	<div class="wrapper-custom">
		<!-- Navigation -->

		<div class="content">

			<%@include file="./shared/navbar.jsp"%>

			<!-- Page Content -->
			<c:if test="${userClickHome}">
				<%@include file="home.jsp"%>
			</c:if>

			<c:if test="${userClickAbout}">
				<%@include file="about.jsp"%>
			</c:if>

			<c:if test="${userClickContact}">
				<%@include file="contact.jsp"%>
			</c:if>
			
			<c:if test="${userClickAllProducts or userClickCategoryProducts}">
				<%@include file="listproducts.jsp"%>
			</c:if>
			

		</div>
		<div class="footer-custom">
			<!-- Footer -->
			<%@include file="./shared/footer.jsp"%>
		</div>


		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.js"></script>
		<script src="${js}/bootstrap.bundle.min.js"></script>

	</div>
	<!-- self js -->
	<script src="${js}/myapp.js"></script>

</body>

</html>