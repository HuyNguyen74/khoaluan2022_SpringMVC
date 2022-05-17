<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!-- Navbar-->
<nav class="navbar navbar-expand-lg navbar-light nav-custom">
  <div class="container-fluid justify-content-between">
    <!-- Left elements -->
    <div class="d-flex">
      <!-- Brand -->
      <a class="navbar-brand me-2 mb-1 d-flex align-items-center" href="#">
        <img
          src="${contextPath }/resources/img/home2.png"
          height="20"
          alt=""
          loading="lazy"
          style="margin-top: 2px; height: 30px"
         
        />
      </a>

      <!-- Search form -->
      <form class="input-group w-auto my-auto d-none d-sm-flex">
        <input
          autocomplete="off"
          type="search"
          class="form-control rounded"
          placeholder="Search"
          style="min-width: 125px;"
        />
        <span class="input-group-text border-0 d-none d-lg-flex"
          ><i class="fa fa-search"></i
        ></span>
      </form>
    </div>
    <!-- Left elements -->

    <!-- Center elements -->
    <ul class="navbar-nav flex-row d-none d-md-flex">
      <li class="nav-item me-3 me-lg-1 active">
        <a class="nav-link" href="#">
          <span><i class="fa fa-home fa-lg"></i></span>
          
        </a>
      </li>
		


      <li class="nav-item me-3 me-lg-1">
        <a class="nav-link" href="#">
          <span><i class="fa fa-shopping-bag fa-lg"></i></span>
        </a>
      </li>
		<li class="nav-item me-3 me-lg-1">
	        <a class="nav-link" href="#">
	    		<span><i class="fa fa-history" aria-hidden="true"></i></span>
	    	</a>
    	</li>
      <li class="nav-item me-3 me-lg-1">
        
        <div class="dropdown">
		 
		  <a class="nav-link"id="dropdownMenuButton" data-toggle="dropdown" aria-expanded="false" href="#">
	          <span><i class="fa fa-users fa-lg"></i></span>
	          <span class="badge rounded-pill badge-notification bg-danger">2</span>
       	 </a>
		  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
		    <a class="dropdown-item" href="#">Action</a>
		    <a class="dropdown-item" href="#">Another action</a>
		    <a class="dropdown-item" href="#">Something else here</a>
		  </div>
		</div>
      </li>
    </ul>
    <!-- Center elements -->

    <!-- Right elements -->
    <ul class="navbar-nav flex-row">
      <li class="nav-item me-3 me-lg-1">
       
      </li>
      <li class="nav-item me-3 me-lg-1">
        
      </li>
      <li class="nav-item dropdown me-3 me-lg-1">
        

        
      </li>
      <li class="nav-item dropdown me-3 me-lg-1">
        
        
      </li>
      
    </ul>
    <!-- Right elements -->
  </div>
</nav>
