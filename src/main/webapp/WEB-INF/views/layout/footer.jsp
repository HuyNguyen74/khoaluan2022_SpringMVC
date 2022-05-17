<!-- Footer  -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<footer class="footer">
	<div class="widget_wrapper" >
		<div class="container">
			<div class="row">
				<div class="col-lg-4 col-md-6 col-12">
					<div class="widget widegt_about">
						<div class="widget_title">
						<figure>
							<img src="${contextPath}/resources/img/qr2.png"  class="img-fluid" alt="" style="width: 60px; height: 60px" title="infomation">
							</figure>
						</div>
						
						<ul class="social">
							<li><a href="#"><i class="fa fa-facebook-f"></i></a></li>
							<li><a href="#"><i class="fa fa-twitter"></i></a></li>
							<li><a href="#"><i class="fa fa-instagram"></i></a></li>
						</ul>
					</div>
				</div>
				<div class="col-lg-4 col-md-6 col-sm-12">
					<div class="widget_title">
						<img src="${contextPath}/resources/img/spring.png"  class="rounded-circle" alt="" style="width: 70px; height: 70px">
						
					</div>
				</div>
				<div class="col-lg-4 col-md-6 col-sm-12">
					<div class="widget widget_contact">
						<div class="widget_title">
							<h4>Contact Me</h4>
						</div>
						<div class="contact_info">
							<div class="single_info">
								<div class="icon">
									<i class="fa fa-phone">  0945 759 445</i>
									<i class="fa fa-envelope">  nguyenthaihuy2802@gmail.com</i>
								</div>
								
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<div class="copyright_area">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="copyright_text">
						<span class="text-muted"> &copy; <script>document.write(new Date().getFullYear())</script> Nguyễn Thái Huy</span>
					</div>
				</div>
			</div>
		</div>
	</div>
</footer>