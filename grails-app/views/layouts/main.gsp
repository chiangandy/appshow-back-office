<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title><g:layoutTitle default="Grails"/></title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon">
		<link rel="apple-touch-icon" href="${resource(dir: 'images', file: 'apple-touch-icon.png')}">
		<link rel="apple-touch-icon" sizes="114x114" href="${resource(dir: 'images', file: 'apple-touch-icon-retina.png')}">
		<link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}" type="text/css">
		<link rel="stylesheet" href="${resource(dir: 'css', file: 'mobile.css')}" type="text/css">
		<link rel="stylesheet" media="screen" href="${resource(dir: 'css', file: 'superfish.css')}" type="text/css"> 
		<link rel="stylesheet" media="screen" href="${resource(dir: 'css', file: 'superfish-navbar.css')}" type="text/css"> 
		<link rel="stylesheet" media="screen" href="${resource(dir: 'css', file: 'jquery.jqplot.min.css')}" type="text/css"> 
		
		<g:layoutHead/>
		<g:javascript library="application"/>
		<g:javascript library="superfish"/>	

		<g:javascript library="jquery"/>
		<g:javascript library="jqplot"/>	

		
		<r:layoutResources />
	</head>
	<body>
		<div  align="right" style="background-color:#abbf78"><g:link controller="auth" action="signOut">登出</g:link></div>
		<div id="grailsLogo" role="banner">
			<g:link url="/${meta(name: 'app.name')}"><img src="${resource(dir: 'images', file: 'mtgo_logo.png')}" alt="Mobile Traking Go"/></g:link>
			<font size="5">行動軟件設定後台系統 V1.0 </font>
			 
		</div>
		<shiro:authenticated>
		<g:if test="${params.controller != 'public'}">    %{-- public 網頁不應該有選單 --}% 
		<div id="navigation" class="header"  role="banner">
                <ul class="sf-menu" id="example">
                    <li class="current">
                       <g:link controller="public" action="index">外部推廣網頁</g:link>         
                    </li>
                    <li class="current">   
                   		<g:link controller="dashboard" action="index">營運分析</g:link>   
	                    <ul>
		                	<li class="current"><g:link controller="dashboard" action="index">每日成效分析</g:link></li> 
		               		<li class="current"><g:link controller="dashboard" action="index">月成效分析</g:link></li> 
		         			<li class="current"><g:link controller="dashboard" action="index">App成效分析</g:link></li>	                    
		               </ul>
                    <li>
                        <a href="http://grails.org">APP項目管理</a>           
                        <ul>
                            <li class="current"><g:link controller="appcategory" action="index">App目錄設定</g:link></li>
                            <li class="current"><g:link controller="appsubcategory" action="index">App子目錄設定</g:link></li>
                            <li class="current"><g:link controller="mtgoapp" action="index">App項目設定</g:link></li>
                        </ul>                    
                    </li>
                    <li>
                        <a href="http://grails.org">視頻內容管理</a>           
                        <ul>
                            <li class="current"><g:link controller="dtcategory" action="index">視頻項目目錄設定</g:link></li>
                            <li class="current"><g:link controller="dtsubcategory" action="index">視頻項目子目錄設定</g:link></li>
                            <li class="current"><g:link controller="vditems" action="index">視頻項目設定</g:link></li>
                            <li class="current"><g:link controller="vdcomments" action="index">回應意見管理</g:link></li>
                            <li class="current"><g:link controller="dashboard" action="index">視頻成效分析</g:link></li>
                        </ul>                    
                    </li>
                    <li>
                        <a href="http://grails.org">App推廣下載管理</a>           
                        <ul>
                            <li class="current"><g:link controller="Appdownload" action="index">推廣管理</g:link></li>
                            <li class="current"><g:link controller="dashboard" action="index">推廣成效分析</g:link></li>
                            <li class="current"><g:link controller="Appdownloadlog" action="index">推廣記錄檢視</g:link></li>
                        </ul>                     
                    </li>                                       
                    <li>
                        <a href="http://grails.org">活動平台管理</a>           
                        <ul>
                            <li class="current"><g:link controller="Dtpromote" action="index">活動頁面設定</g:link></li>
                            <li class="current"><g:link controller="Bullletin" action="index">公告管理</g:link></li>
                        </ul>                     
                    </li>                                       
                    <li>
                    	<g:link controller="shiroUser" action="index">系統設定</g:link>
                        <ul>
                            <li class="current"><g:link controller="User" action="index">使用者管理</g:link></li>
                            <li class="current"><g:link controller="User" action="create">新增使用者</g:link></li>
                            <li class="current"><g:link controller="Bonus" action="index">點數管理</g:link></li>
                            <!--  li class="current"><g:link controller="User" action="index">手機使用者管理</g:link></li -->
                        </ul>
                    </li>                   
                    <li>
                    	<g:link controller="auth" action="signOut">登出</g:link>
                    </li>                  
                </ul>
        </div>   
        <img src="${resource(dir: 'images', file: 'blank.png')}" height="42" width="42"/>
        <br/>
  		</g:if>
  		</shiro:authenticated>
		<g:layoutBody/>
		<div class="footer" role="contentinfo"></div>
		<div id="spinner" class="spinner" style="display:none;"><g:message code="spinner.alt" default="Loading&hellip;"/></div>
		<r:layoutResources />
	</body>
</html>
