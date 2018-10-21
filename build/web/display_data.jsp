<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Job Recommendation System</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/arial.js"></script>
<script type="text/javascript" src="js/cuf_run.js"></script>
<script>
    function validate(){
     
        var userid=document.getElementById("userid").value;
        var password=document.getElementById("password").value;
        if(userid==""){
            
            alert("Enter userid");
            return false;
        }
         if(password==""){
            
            alert("Enter password");
            return false;
        }
        if(password.length<6){
            
            alert("Icorrect Password");
            return false;
        }
    }
</script>
</head>
<body>
    
       <%
        String login="",reg_msg="";
        if(session.getAttribute("login")!=null){
        
            login=session.getAttribute("login").toString();
        }
          if(session.getAttribute("reg_msg")!=null){
        
            reg_msg=session.getAttribute("reg_msg").toString();
        }

%>
    
<div class="main">
  <div class="main_resize">
    <div class="header">
      <div class="logo">
        <h1><a href="#">Job Recommendation System</a></h1>
      </div>
      <div class="search">
    
        <!--/searchform -->
        <div class="clr"></div>
      </div>
      <div class="clr"></div>
      <div class="menu_nav">
        <ul>
                    <li class="active"><a href="update_dataset.jsp">Update Dataset</a></li>
       
        </ul>
        <div class="clr"></div>
      </div>
      <div class="hbg"> Matching Companies and Position:</div>
    </div>
    <div class="content">
       

   <%
        
        String data=session.getAttribute("data").toString();
        
        %>
   <textarea name="disp" cols="100" rows="100" ><%=data%></textarea>
      <div class="content_bg">
          <div class="mainbar" style="margin-left: 186px;">
          <div class="article">

   
   
   
   
   
 
 
            <div class="clr"></div>
            
           
            <p></p>
          
            <div class="clr"></div>
          </div>
          <div class="article">
            <h2></h2>
            <div class="clr"></div>
            <p class="post-data"></p>
           <div class="clr"></div>
          </div>
          <div class="pagenavi"></div>
        </div>
        <div class="sidebar">
          <div class="gadget">
            <h2 class="star"></h2>
            <div class="clr"></div>
            <ul class="sb_menu">
              
          </div>
          <div class="gadget">
            <h2 class="star"></h2>
            <div class="clr"></div>
        
          </div>
          <div class="gadget">
            <h2 class="star"></h2>
            <div class="clr"></div>
            <div class="testi">
              <p></p>
              <p class="title"></p>
            </div>
          </div>
        </div>
        <div class="clr"></div>
      </div>
    </div>
  </div>
  <div class="fbg">
    <div class="fbg_resize">
      <div class="col c1">
        <h2></h2>
         </div>
     
        <% session.removeAttribute("login"); %>
        <% session.removeAttribute("reg_msg"); %>
      <div class="clr"></div>
    </div>
  </div>
</div>

</html>