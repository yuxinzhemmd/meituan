window.onload=function(){
			var btn=document.getElementById("btn");
			var username;
			var pw;
			btn.onclick=function(){
				username=document.getElementById("username").value;
				pw=document.getElementById("password").value;
				var info=document.getElementById("info");
				if(username=="" && pw==""){
				info.style.visibility="visible";
					info.innerHTML="请输入账号和密码";
				}else if(username==""){
				info.style.visibility="visible";
					info.innerHTML="请输入账号";
				}else if(pw==""){
				info.style.visibility="visible";
					info.innerHTML="请输入密码";
				}else {
					var xmlHttp ;
					if(window.ActiveXObject){
		      			 xmlHttp = new ActiveXObject("Microsoft.XMLHTTP") ;
		     		 }
		      		else if(window.XMLHttpRequest){
		       			 xmlHttp = new XMLHttpRequest() ;
		     		 }
		      		 xmlHttp.open("POST",'/user/login',true) ;
				 xmlHttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
		     		 xmlHttp.send('username='+username+'&password='+pw) ;
				xmlHttp.onreadystatechange =function(){
						if(xmlHttp.readyState == 4){
  		        			if(xmlHttp.status == 200){
        						var result = xmlHttp.responseText;// 在页面上显示返回的结果
								var obj=JSON.parse(result);
								if(obj.status==400){
									info.style.visibility="visible";
									info.innerHTML=obj.msg;
								}else {
									location.href='index.html';
								}
	}
						}
				}
					}				
			}			
				
}
