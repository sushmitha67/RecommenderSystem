
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title></title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width">
       
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/bootstrap-responsive.css">
        <link rel="stylesheet" href="css/custom-styles.css">
        <link rel="stylesheet" href="css/font-awesome.css">
        <link rel="stylesheet" href="css/component.css">
        <link rel="stylesheet" href="css/font-awesome-ie7.css">
        
        
        <script src="js/modernizr-2.6.2-respond-1.1.0.min.js"></script>
    </head>
    <body>
       
                <div class="site-header">


                     <!-- Site Name starts here -->

                    <div class="site-name">
                        <h1><font color="white">Job Recommendation System</font></h1>
                        <!--<h5>your caption goes here</h5>-->
                    </div>

                    <!-- Site Name ends -->

                     <!-- Menu starts here -->
                    <div class="menu">
                        <div class="navbar">
                            <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                               <i class="fw-icon-th-list"></i>
                            </a>
                           <div class="nav-collapse collapse">
                                <ul class="nav">
                                     
                                    <li ><a href="index.jsp">Home</a></li>
                                   <li class="active"><a href="registration.jsp">Registration</a></li>
                                   
                                    </ul>
                           </div>
                        </div>
                    </div>

                    <!-- Menu ends -->
                   
       
                </div>

                <!-- Banner starts here -->

             <div class="banner">
                  
                   <!-- <div class="carousel slide" id="myCarousel">-->
                                    <!-- Carousel items -->
                       <div class="carousel-inner">
                             
                            <div class="item active">
                               
                                <img src="img/banner-image.jpg" alt="">
                               
                                <div class="carousel-caption">
                                      <% String msg = "";
            if (session.getAttribute("msg") != null) {
                msg = session.getAttribute("msg").toString();
}
%>        
        
                   <%=msg%>            
                                    
                               
                                  <h1>Registration</h1>
                                  <form action="./registration" method="post">
                                      <table>
                                        
                                          <tr>
                                              <td>Email</td><td><input type="text" name="email" id="email"/></td>
                                          </tr>
                                        
                                          <tr>
                                              <td>Password</td><td><input type="password" name="pass" id="pass"/></td>
                                          </tr>
                                        
                                          <tr>
                                              <td></td><td><input type="submit" name="submit" value="Login"/></td>
                                          </tr>
                                      </table>
                                      
                                  </form>
                                </div>
                                
                            </div>
                        
                      <div class="carousel-inner">
                          <div class="item active">
                             
                        </div>
                        <a class="carousel-control left" href="#myCarousel1" data-slide="prev"><i class="fw-icon-chevron-left"></i></a>
                        <a class="carousel-control right" href="#myCarousel1" data-slide="next"><i class="fw-icon-chevron-right"></i></a>
                    </div>
                </div>
           
                                    
       <script src="js/jquery-1.9.1.js"></script> 
<script src="js/bootstrap.js"></script>
<script src="js/masonry.pkgd.min.js"></script>
    <script src="js/imagesloaded.js"></script>
    <script src="js/classie.js"></script>
    <script src="js/AnimOnScroll.js"></script>
    
    <script>
      new AnimOnScroll( document.getElementById( 'grid' ), {
        minDuration : 0.4,
        maxDuration : 0.7,
        viewportFactor : 0.2
      } );
    </script>
<script>
$('#myCarousel').carousel({
    interval: 1800
});
</script>
        



   </body>
</html>
