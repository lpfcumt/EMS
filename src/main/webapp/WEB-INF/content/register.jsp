<%@ page contentType="text/html; charset=utf-8" language="java"
	errorPage=""%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!doctype html>
<html>
<head>
	<meta charset="utf-8">
<title>学生注册</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../vendor/bootstrap/css/bootstrap.css"/>
    <link rel="stylesheet" href="../dist/css/bootstrapValidator.css"/>
    <link rel="stylesheet" type="text/css" href="../css/registerstyle.css"/>
    <link rel="stylesheet" type="text/css" href="../css/templatemo_style.css"/>
    <script type="text/javascript" src="../vendor/jquery/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="../vendor/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="../dist/js/bootstrapValidator.js"></script>
</head>

<body>
<div class="container">
   <section class="bodybackgroundcolor">
    	<!-- banner -->
    	<div class="row">
			<div class="col-lg-2">
            </div>
            <div class="col-lg-8">
                <img  class="img-responsive" alt="厦门大学管理学院" src="../image/topimage.jpg"/>
            </div>
            <div class="col-lg-2">
            </div>
        </div>
        <!--end of banner -->
       
        <!-- register  -->
        <div class="registerbox">
        <div class="row">
        	<div class="col-lg-12" style="font-size:18px; text-align:center;">
            	<strong>学生注册</strong>
            </div>
        </div>
       	<div class="row">
            <div class="col-lg-2">
            </div>
            <div class="col-lg-8">
       			<div class="col-md-12">			
			<form class="form-horizontal templatemo-create-account templatemo-container" role="form" action="#" method="post">
				<div class="form-inner">
                			        <div class="form-group">
			          <div class="col-md-6">		          	
			            <label for="username" class="control-label"><span class="glyphicon glyphicon-barcode"></span> 学号</label>
			            <input type="text" class="form-control" id="username" placeholder="请输入您的学号">		            		            		            
			          </div>
			          <div class="col-md-6 templatemo-radio-group">
			          	<label class="radio-inline">
		          			<input type="radio" name="optionsRadios" id="optionsRadios1" value="option1">男性
		          		</label>
		          		<label class="radio-inline">
		          			<input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">女性
		          		</label>
			          </div>             
			        </div>
                    <div class="form-group">
                      <div class="col-md-4">		          	
			            <label for="username" class="control-label"><span class="glyphicon glyphicon-user"></span> 姓名</label>
			            <input type="text" class="form-control" id="username" placeholder="请填写您的姓名">		            		      
			          </div>
			          <div class="col-md-4">
			            <label for="password" class="control-label"><span class="glyphicon glyphicon-lock"></span> 密码</label>
			            <input type="password" class="form-control" id="password" placeholder="请输入您的密码">
			          </div>
			          <div class="col-md-4">
			            <label for="password" class="control-label">&nbsp;</label>
			            <input type="password" class="form-control" id="password_confirm" placeholder="请再次输入密码">
			          </div>
			        </div>
					<div class="form-group">
			          <div class="col-md-6">		          	
			            <label for="first_name" class="control-label"><span class="glyphicon glyphicon-stats"></span> 年级</label>
			            <input type="text" class="form-control" id="first_name" placeholder="请输入您的年级,如“大一”">		            		            		            
			          </div>  
			          <div class="col-md-6">		          	
			            <label for="last_name" class="control-label"><span class="glyphicon glyphicon-pencil"></span> 专业</label>
			            <input type="text" class="form-control" id="last_name" placeholder="请输入您的专业">		            		            		            
			          </div>             
			        </div>
                    <div class="form-group">
			          <div class="col-md-6">		          	
			            <label for="first_name" class="control-label"><span class="glyphicon glyphicon-book"></span> 学院</label>
			            <input type="text" class="form-control" id="first_name" placeholder="请输入您的学院">		            		            		            
			          </div>  
			          <div class="col-md-6">		          	
			            <label for="last_name" class="control-label"><span class="glyphicon glyphicon-phone"></span> 电话</label>
			            <input type="text" class="form-control" id="last_name" placeholder="请输入您的电话">		            		            		            
			          </div>             
			        </div>
			        <div class="form-group">
			          <div class="col-md-12">		          	
			            <label for="username" class="control-label"><span class="glyphicon glyphicon-envelope"></span> 邮箱</label>
			            <input type="email" class="form-control" id="email" placeholder="请输入您的邮箱">		            		            		            
			          </div>              
			        </div>			
			        
			        <div class="form-group">
                      <div class="col-md-4">
                      </div>
			          <div class="col-md-4">
			            <input type="submit" value="注册" class="btn btn-info btn-block">
			          </div>
                      <div class="col-md-4">
                      </div>
			        </div>	
				</div>				    	
		      </form>		      
		</div>
            <div class="col-lg-2">
            </div>
		</div>
        </div>
        </section>	
   		<!-- end of register-->
   	<!-- footer-->
   		<div class="footer">
        	<div class="text-center">
        	<address>
            	Email questions tomking15@qq.com<br/>
                Copyright &copy; 1997-2017&nbsp;sm.cumt.edu 
            </address> 
        	</div>
        </div>
    <!-- end of footer -->
</div><!-- container end-->
</body>
</html>
