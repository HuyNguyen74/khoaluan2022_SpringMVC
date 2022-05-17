<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Create new student</title>
	<link rel="stylesheet" href="${contextPath }/resources/css/index.css">
	<jsp:include page="/WEB-INF/views/layout/header.jsp" />
	
</head>
<body>
	<jsp:include page="/WEB-INF/views/layout/page-loader.jsp" />
    <jsp:include page="/WEB-INF/views/layout/navbar.jsp" />
    <jsp:include page="/WEB-INF/views/layout/sidebar.jsp" />
    
    <div class="page-content container">
    	
        <div class="row">
            <div class="col-md-5 col-md-offset-4 col-md-offset-4-custom">
                <div class="login-wrapper">
                	<div class="box">
                		
                		
                	<div class="content-wrap">
                		<div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">
							  <div class="carousel-indicators">
							    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
							    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
							    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
							  </div>
							  <div class="carousel-inner">
							    <div class="carousel-item active">
							      <img src="${contextPath }/resources/img/qc1.png" class="d-block w-100" alt="..." >
							    </div>
							    <div class="carousel-item">
							      <img src="${contextPath }/resources/img/qc2.png" class="d-block w-100" alt="...">
							    </div>
							    <div class="carousel-item">
							      <img src="${contextPath }/resources/img/qc1.png" class="d-block w-100" alt="...">
							    </div>
							  </div>
							  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
							    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
							    <span class="visually-hidden">Previous</span>
							  </button>
							  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
							    <span class="carousel-control-next-icon" aria-hidden="true"></span>
							    <span class="visually-hidden">Next</span>
							  </button>
							</div>
                		
      					
                	</div>
                </div>
            </div>
        </div>
    </div>
	</div>
	<jsp:include page="/WEB-INF/views/layout/script.jsp" />
	<jsp:include page="/WEB-INF/views/layout/footer.jsp" />
</body>
</html>