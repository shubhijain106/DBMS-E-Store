<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">

    <!-- BC_OBNW -->

<head>
<title>Registered Successfully</title>
<link href="StyleSheets/ModuleStyleSheets.css" type="text/css" rel="StyleSheet" />
<script type="text/javascript">var jslang='EN';</script>
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,700italic,400,600,700" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="css/styles.css" />
<script type="text/javascript" src="../www.freerentalsite.com/widgets/master.js"></script>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/master.js"></script>
<style type="text/css">
.sign-in-button {
background:#5CCD00;
	background:-moz-linear-gradient(top,#5CCD00 0%,#4AA400 100%);
	background:-webkit-gradient(linear,left top,left bottom,color-stop(0%,#5CCD00),color-stop(100%,#4AA400));
	background:-webkit-linear-gradient(top,#5CCD00 0%,#4AA400 100%);
	background:-o-linear-gradient(top,#5CCD00 0%,#4AA400 100%);
	background:-ms-linear-gradient(top,#5CCD00 0%,#4AA400 100%);
	background:linear-gradient(top,#5CCD00 0%,#4AA400 100%);
	filter: progid DXImageTransform.Microsoft.gradient( startColorstr='#5CCD00', endColorstr='#4AA400',GradientType=0);
	padding:10px 15px;
	color:#fff;
	font-family:'Helvetica Neue',sans-serif;
	font-size:16px;
	border-radius:5px;
	-moz-border-radius:5px;
	-webkit-border-radius:5px;
	border:1px solid #459A00}
</style>
</head>
<body>

  <%
String name = (String)request.getAttribute("firstname");
String lname = (String)request.getAttribute("lastname");
String full=name+" "+lname;
%>
 

	<div id="hdr-bg">
		<div id="hdr">
			<a href="index.jsp"><img src="logo.jpg" class="logo" /></a>
			<div class="call-today">Call Today Toll Free No:</div>
			<div class="phone">1800-103-0202</div>
			<div class="portals"><a href="login.jsp" ">Already a Member then Login</a></div>
		</div>
	</div>
	<div id="nav-bg">
		<div class="wrap">
			<ul id="nav">
				<li id="nav-home"><a href="index.jsp">Home</a></li>
				<li id="nav-services">
					<a href="property-management.jsp">Services</a>
					<ul>
						<li><a href="property-management.jsp">Services</a></li>
						<li><a href="agents.jsp">Agent Referral</a></li>
						<li><a href="faqs.jsp">FAQs</a></li>
					</ul>
				</li>
				<li id="nav-homes-for-rent"><a href="mypage.jsp">Properties</a></li>
				<li id="nav-owners">
					<a href="owners.jsp">Sellers</a>
					<ul>
						<li><a href="owners.jsp">Sellers</a></li>
						<li><a href="faqs.jsp">FAQs</a></li>
					</ul>
				</li>
				<li id="nav-tenants">
					<a href="tenants.jsp">Buyers</a>
					<ul>
						<li><a href="tenants.jsp">Buyer Resources</a></li>
						<li><a href="faqs.jsp">FAQs</a></li>
					</ul>
				</li>
				<li id="nav-about"><a href="about.jsp">About</a></li>
				<li id="nav-contact"><a href="contact.jsp">Contact</a></li>
				</ul>
		</div>
	</div>
    
   
	
		
	<div id="main" class="full">
		<div id="full-wlcm-bg"><div id="full-wlcm"><img src="full-bg.png"></div></div>		
		<div class="clr"></div>
		<div id="full-bg">
		<h1 align="center">REGISTERED SUCCESSFULLY <%=full%></h1>
		
                <h3 align="center"><a href="login.jsp">Continue To Login</a></h3>




<input type="hidden" id="curpage" value="homes-for-rent" />
		</div>
		<div class="clr"></div>
	</div>
	
	
	
	<div id="ftr-bg">
		<div id="ftr">
			<div class="links">
				<h3>Site Links</h3>
				- <a href="owners.jsp">Seller Resources</a><br />
				- <a href="tenants.jsp">Buyer Resources</a><br />
				- <a href="property-management.jsp">Management Services</a><br />
				- <a href="contact.jsp">Contact Us</a><br />
				- <a href="about.jsp">About Us</a><br />
				</div>
			<div class="social">
				<h3>Connect with Us</h3>
				<a href="index.jsp"><img src="social/twitter.png" /></a>
				<a href="index.jsp"><img src="social/linkedin.png" /></a>
				<a href="index.jsp"><img src="social/facebook.png" /></a>
				<a href="index.jsp"><img src="social/youtube.png" /></a>
				<a href="index.jsp"><img src="social/google.png" /></a>
				<a href="index.jsp"><img src="social/pinterest.png" /></a>
			</div>
			<div class="cred">
				<h3>RightPlace.com</h3>
				170 HUB Stadium Road<br />
				Connaught Place, New Delhi<br />
				Phone: 1800-103-0202<br />
				Fax: 011-27012701
				<ul>
					<li><img src="logos/narpm.png" /></li>
					<li><img src="logos/equal-housing.png" /></li>
					<li><img src="logos/realtor.png" /></li>
				</ul>
			</div>
			<div class="clr"></div>
		</div>
	</div>
	<div id="ftr2">
		<div class="copy">
			Copyright &copy;<script language="javascript" type="text/javascript">document.write(orgApp.getCurrentYear());</script>
			RightPlace Properties.  All Rights Reserved.<br />
			<a href="http://www.propertymanagerwebsites.com/" target="_blank">Property Management Website</a> powered by 
			<a href="http://www.freerentalsite.com/" target="_blank">Shubham Gupta</a>&nbsp;&nbsp;|&nbsp;&nbsp;
			<a href="sitemap.jsp">Sitemap</a>
		</div>
		<div class="links">
		</div>
	</div>














    


</body>

</html>
