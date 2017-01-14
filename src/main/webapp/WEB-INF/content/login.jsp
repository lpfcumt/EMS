<%@ page contentType="text/html; charset=utf-8" language="java"
	errorPage=""%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
    <title>实验管理系统</title>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../vendor/bootstrap/css/bootstrap.css"/>
    <link rel="stylesheet" href="../dist/css/bootstrapValidator.css"/>
    <link rel="stylesheet" type="text/css" href="../css/style.css"/>
    <script type="text/javascript" src="../vendor/jquery/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="../vendor/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="../dist/js/bootstrapValidator.js"></script>
    <script type="text/javascript" src="../js/Ajax.js"></script>
</head>
<body>
<div class="container">
   <div class="bodybackgroundcolor">
    	<!-- banner -->
   		<div class="row">
			<div class="col-lg-2">
            </div>
            <div class="col-lg-8">
            	<div class="banner">
                <img  class="img-responsive" alt="厦门大学管理学院" src="../image/topimage.jpg"/>
                </div>
            </div>
            <div class="col-lg-2">
            </div>
        </div>
        <!--end of banner -->
        
        <!--start of loginbox -->
        <section class="loginbox">
        <div class="row">
        	
        
        
        
        	<div class="col-lg-3">
            </div>
        	<div class="col-lg-6">
            	<form id="defaultForm" method="post" class="form-horizontal" action=""><!-- 修改action-->
                 <div class="leftloginbox">
                    	<div class="text-center" style="font-size:18px;">
                          <div class="leftloginboxbar">
                        	        <strong>实验管理系统</strong>
                          </div>
                     	</div>
                        	<div class="alert alert-success" style="display: none;"></div>
                        	<div class="form-group">
                        		<div class="leftinputbox">
                            		<label class="col-lg-3 control-label"><span class="glyphicon glyphicon-user"></span> </label>
                            		<div class="col-lg-6">
                                		<input type="text" class="form-control" id="" name="students_id" placeholder="请输入您的学工号" />
                            		</div>
                            	</div>
                        	</div>
                        	<div class="form-group">
                        		<div class="leftinputbox">
                            		<label class="col-lg-3 control-label"><span class="glyphicon glyphicon-lock"></span></label>
                            		<div class="col-lg-6">
                                	<input type="password" class="form-control" id="" name="students_password" placeholder="请输入您的密码"/><a href="#">忘记密码？</a><br/>
                                    <div class="radio-inline">
                                	<label class="radio-inline">
                                    <input type="radio" name="1" id="" checked>教师
                                    </label>
                                    </div>
                                    <div class="radio-inline">
                                    <label class="radio-inline">
                                    <input type="radio" name="1" id="">学生
                                    </label>
                                    </div>
                                    <div class="radio-inline">
                                    <label class="radio-inline">
                                    <input type="radio" name="1" id="">管理员	
                                    </label>
                                    </div>
                            		</div>
                            	</div>
                        	</div>
               				<div class="form-group">
                            	<div class="leftinputbox">
                                	<div class="col-lg-2">
                                    </div>
                            		<div class="col-lg-4">
                                	<button type="submit" class="btn btn-info btn-block">登录</button>
                       				</div>
                                    <div class="col-lg-4">
                                	<button type="submit" class="btn btn-info btn-block" onc>注册</button>
                       				</div> 
                                    <div class="col-lg-2">
                                    </div>
                                </div>
                        	</div>
                            </div>  <!-- left loginbox end -->
                 </form>
                        
          </div> <!--col 8 end -->
          <div class="col-lg-3">
          </div>
  		</div><!-- row end-->
        </div><!--loginbox end -->
   </section>
   <!--end of loginbox -->
   
   
   	<!-- footer-->
   		<div class="footer">
        	<div class="text-center">
        	<address>
            	Email questions tomking15@qq.com<br/>
                Copyright &copy; 1997-2017 sm.cumt.edu 
            </address> 
        	</div>
        </div>
    <!-- end of footer -->



</div><!-- container end-->
<style>
/*
<script type="text/javascript">
$(document).ready(function() {
    $('#defaultForm')
        .bootstrapValidator({
            message: 'This value is not valid',
            //live: 'submitted',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                username: {
                    message: 'The username is not valid',
                    validators: {
                        notEmpty: {
                            message: '用户名不能为空'
                        },
                        stringLength: {
                            min: 6,
                            max: 30,
                            message: '用户名不得少于6个字符且不得多于30个字符'
                        },
       
                        regexp: {
                            regexp: /^[a-zA-Z0-9_\.]+$/,
                            message: '用户名只能由数字、字母组成'
                        }
                    }
                },
                password: {
                    validators: {
                        notEmpty: {
                            message: '密码不能为空'
                        },
						stringLength: {
                            min: 6,
                            max: 30,
                            message: '密码不得少于6个字符且不得多于30个字符'
                        },
                    }
                }
            }
        })
});
</script>
*/
</style>
</body>
</html>