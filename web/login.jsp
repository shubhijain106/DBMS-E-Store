<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>Electronix Store</title>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
        <link rel="stylesheet" type="text/css" href="style.css" />
        <!--[if IE 6]>
        <link rel="stylesheet" type="text/css" href="iecss.css" />
        <![endif]-->
        <script type="text/javascript" src="js/boxOver.js"></script>
    </head>
    <body>
        <div id="main_container">
            <div class="top_bar">
                <div class="top_search">
                    <div class="search_text"><a href="#">Advanced Search</a></div>
                    <input type="text" class="search_input" name="search" />
                    <input type="image" src="search.gif" class="search_bt"/>
                </div>
                <div class="languages">
                    <div class="lang_text">Languages:</div>
                    <a href="#" class="lang"><img src="en.gif" alt="" border="0" /></a> <a href="#" class="lang"><img src="de.gif" alt="" border="0" /></a> </div>
            </div>
            <div id="header">
                <div id="logo"> <a href="#"><img src="ELECTRONICS_LOGO_1.gif" alt="" border="0" width="237" height="140" /></a> </div>
                <div class="oferte_content">
                    <div class="top_divider"><img src="header_divider.png" alt="" width="1" height="164" /></div>
                    <div class="oferta">
                        <div class="oferta_content"> 
                            <div class="oferta_details">
                                <div class="oferta_title"></div>
                                <div class="oferta_text"></div>
                                
                        </div>
                        <div class="oferta_pagination"> <span class="current">1</span></div>
                    </div>
                    <div class="top_divider"><img src="header_divider.png" alt="" width="1" height="164" /></div>
                </div>
                <!-- end of oferte_content-->
            </div>
            <div id="main_content">
                <div id="menu_tab">
                    <div class="left_menu_corner"></div>
                    <ul class="menu">
                        <li><a href="home.jsp" class="nav1"> Home</a></li>
                        <li class="divider"></li>
                        
                        <li><a href="registration.jsp" class="nav4">Sign Up</a></li>
                        <li class="divider"></li>
                       

                    </ul>

                    <form action="LoginServlet" method="post">
                        <table cellpadding="5" cellspacing="10" align="center">
                            <tr><td>Email </td><td><input id="username" name="username" value="" type="text" ></input></td></tr>

                            <tr><td>Password</td><td><input id="password" name="password" value="" type="password" ></input></td></tr>

                            <tr><td colspan ="2" align="center"><input type="submit" value="Login" class="sign-in-button"/></td></tr>


                        </table>
                    </form>
                    <div class="footer">
                        <div class="left_footer">  </div>
                        <div class="center_footer"> <br />
                            <a href="http://csscreme.com"><img src="csscreme.jpg" alt="csscreme" border="0" /></a><br />
                            <img src="payment.gif" alt="" /> </div>
                        <div class="right_footer"> </div>
                    </div>
                </div>
                <!-- end of main_container -->
                </body>
                </html>