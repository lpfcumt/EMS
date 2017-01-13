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
    <link rel="stylesheet" type="text/css" href="../css/style.css"/>
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
       	<div class="row">
            <div class="col-lg-2">
            </div>
            <div class="col-lg-8">
       			<form id=""  role="form" class="form-horizontal" method="post" action="">
       				<div class="registerbox">
                    	<div style="font-size:20px;">
                        填写信息进行注册
                        </div>	
						<div class="form-group">
                			<label class="col-sm-2">用户名（学号）</label>
                            <input type="text" class="col-sm-6" id="" name="students_id" />
                        </div>
                        <div class="form-group">
							<label class="col-sm-2">姓名</label>
                            <input type="text" class="col-sm-6" id="" name="students_name" />
                        </div>
                     	<div class="form-group">
                        <div class="inputbox">
                        <div class="radio">
                        	<label class="col-sm-2"><strong>性别</strong></label>
                            <input type="radio" class="col-lg-1" name="students_sex" id="" value="男" checked/>
                            <label class="col-xs-1">男</label>
                        </div>
                        <div class="radio">
                        	<label class="col-sm-2">&nbsp;</label>
                            <input type="radio" class="col-lg-1" name="students_sex" id="" value="女"/>
                            <label class="col-xs-1">女</label>
                        </div>
                        </div>
                        </div>
                        <div class="form-group">
                        	<label class="col-sm-2">密码</label>
                            <input type="password" class="col-sm-6" id="" name="students_password" />
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2">邮箱</label>
                            <input type="text" class="col-sm-6" id="" name="students_email" />
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2">电话</label>
                            <input type="text" class="col-sm-6" id="" name="students_tel" />
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2">年级</label>
                            <input type="text" class="col-sm-6" id="" name="students_grade" />
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2">专业</label>
                            <input type="text" class="col-sm-6" id="" name="students_major" />
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2">学校</label>
                            <input type="text" class="col-sm-6" id="" name="students_school" />
                        </div>
                        <div class="form-group">
                            <input type="submit"  class="btn-info btn-group-justified"  id="" name="" value="注册" />
                        </div>
                	</div>
        		</form>
            </div>
            <div class="col-lg-2">
            </div>
		</div>
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
