<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="head.jsp"></jsp:include>

  <body>
  <!-- Pre-loader start -->
  <jsp:include page="theme-loader.jsp"></jsp:include>
  <!-- Pre-loader end -->
  <div id="pcoded" class="pcoded">
      <div class="pcoded-overlay-box"></div>
      <div class="pcoded-container navbar-wrapper">

      <jsp:include page="navbar.jsp"></jsp:include>
         
          <div class="pcoded-main-container">
              <div class="pcoded-wrapper">
                  <nav class="pcoded-navbar">
                      <div class="sidebar_toggle"><a href="#"><i class="icon-close icons"></i></a></div>
                      <jsp:include page="navbar-main-menu.jsp"></jsp:include>
                  </nav>
                  <div class="pcoded-content">
                      <!-- Page-header start -->
                      <jsp:include page="page-header.jsp"></jsp:include>
                      <!-- Page-header end -->
               <div class="pcoded-inner-content">
               <!-- Main-body start -->
               <div class="main-body">
                   <div class="page-wrapper">
                       <!-- Page-body start -->
                       <div class="page-body">
                           <div class="row">
                               <h1>Layout das páginas do sistema</h1>
                           </div>
                       </div>
                   </div>
               </div>
            </div>
           </div>
       </div>
     </div>
    </div>
   </div>
    <jsp:include page="javaScript.jsp"></jsp:include>
</body>

</html>
