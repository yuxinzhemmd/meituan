window.onload = function() {
	getSeller();
	getcart();
	getDelInf();

}

function getcart() {
	var cart = document.getElementById("cart");
	var carthtml = "";
	var sum = 6;
	var i = 0;
	carthtml += "<li><span>菜品</span><span style='float: right'>价格/份数</span></li>";
	ajax(
			"/order/cart",
			function(result) {
				var obj1 = JSON.parse(result);
				while (obj1.data.length > i) {
					carthtml += "<li><span class='caipin'>"
							+ obj1.data[i].dname + "</span>";
					carthtml += "<span class='jiage'   style='float: right'>"
							+ obj1.data[i].price + "*" + obj1.data[i].num
							+ "</span></li>";
					sum += parseInt(obj1.data[i].price)
							* parseInt(obj1.data[i].num);// 计算总价
					i++;
				}
				carthtml += "<li><span class='caipin'>配送费</span><span class='jiage'   style='float: right'>￥6</span></li>";
				carthtml += "<li><span class='heji'>合计</span>";
				carthtml += "<span class='totalprice'   style='float: right'>"
						+ sum + "</span></li>";
				cart.innerHTML = carthtml;
			});
}

function getDelInf() {
	alert("1");
	ajax(
			"/order/del/" + uid,
			function(result) {
				var obj1 = JSON.parse(result);
				if (obj1.data.length == 0) {
					return;
				} else {
					var h3 = document.getElementById("h3");
					h3.innerHTML = "送餐详情<span style='float: right;' onclick='show();'><span class='addjia'>+</span> <span class='addnewAddress'>添加新地址</span></span> ";
					var AddressContainer = document
							.getElementById("Address-container");
					AddressContainer.innerHTML = "";
					var html = "";
					html += "<ul class='dizhikuang'>";
					var gender;
					var i = 0;
					var j = 0;
					var k = 0;
					while (obj1.data.length > i) { // 为了遍历是否有session中的did等于json中的did,当session的did存在则将配送信息放在第一个盒子。
						if (did == obj1.data[i].did) {
							k = 1;
							if(obj1.data[i].dgender == 0){
								gender = "先生";
							}else gender = "女士";
							html += "<li class='userAddress'>";
							html += "<p><span>" + obj1.data[i].dname
									+ "</span><span>" + gender
									+ "：</span><span>" + obj1.data[i].dphone
									+ "</span></p>";
							html += "<p><span>" + obj1.data[i].daddress
									+ "</span></p></li>";
							break;
						}
						i++;
					}
					while (obj1.data.length > j) { // 遍历剩下的盒子。
						if(obj1.data[j].dgender == 0){
							gender = "先生";
						}else gender = "女士";
						if (did != obj1.data[j].did && k < 2 ) { // 当json中的did不等于session的did时，且盒子少于两个时（用k判断），不隐藏。
							html += "<li class='userAddress'>";
							html += "<p><span>" + obj1.data[j].dname
									+ "</span><span>" + gender
									+ "：</span><span>" + obj1.data[j].dphone
									+ "</span></p>";
							html += "<p><span>" + obj1.data[j].daddress
									+ "</span></p></li>";
							k++;
						} else if (did != obj1.data[j].did && k >= 2) { // 当json中的did不等于session的did时，且盒子等于或大于于两个时（用k判断），隐藏。
							if(obj1.data[j].dgender == 0){
								gender = "先生";
							}else gender = "女士";
							html += "<li class='userAddress' style='display: none;' >";
							html += "<p><span>" + obj1.data[j].dname
									+ "</span><span>" + gender
									+ "：</span><span>" + obj1.data[j].dphone
									+ "</span></p>";
							html += "<p><span>" + obj1.data[j].daddress
									+ "</span></p></li>";
							if (j == obj1.data.length - 1) {
								html += "<div class='showall' id='showall'>";
								html += "<span id='showAll'>显示所有地址 &nbsp;▽</span></div>";
							}
						}
						j++;
					}
					html += "</ul>";
					AddressContainer.innerHTML = html;
					// 写点击展开框和点击收缩框。
					var showall = document.getElementById("showall");
					showall.style.display = "block";
					var showAll = document.getElementById("showAll");
					var state = 1;
					var lis = document.getElementsByClassName("userAddress");
					showAll.onclick = function() {
						if (state == 1) {
							state = 2;

							for (var q = 2; q < lis.length; q++) {
								lis[q].style.display = "block";
							}
							showAll.innerHTML = "收起所有地址 &nbsp;△";
							showAll.style.color = "#F79100";
							showAll.style.border = "1px solid #FF8A15";
							showAll.style.borderTop = "1px solid #FFF";
							showall.style.borderTop = "1px solid #FF8A15";
						}

						else {
							state = 1;
							for (var q = 2; q < lis.length; q++) {
								lis[q].style.display = "none";
							}
							showAll.innerHTML = "显示所有地址 &nbsp;▽";
							showAll.style.color = "";
							showAll.style.border = "1px solid #E5E5E5";
							showAll.style.borderTop = "1px solid #FFF";
							showall.style.borderTop = "1px solid #E5E5E5";
						}

					}

				}

			});
}

function addDelInf() {
	var dname = document.getElementById("dname");
	var dgender;
	var dphone = document.getElementById("dphone");
	var daddress = document.getElementById("daddress");
	var address = document.getElementById("address");
	var dgenders = document.getElementsByName("dgender");
	for (var r = 0; r < dgenders.length; r++) {
		if (dgenders[r].checked) {
			if(dgenders[r].value == "先生"){
				dgender = 0;
			}else dgender = 1;
		}
	}
	var xmlHttp;
	if (window.ActiveXObject) {
		xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
	} else if (window.XMLHttpRequest) {
		xmlHttp = new XMLHttpRequest();
	}
	xmlHttp.open("POST", '/order/adddel/' + uid, true);
	xmlHttp.setRequestHeader("Content-Type",
			"application/x-www-form-urlencoded");
	xmlHttp.send('dname=' + dname.value + '&dphone=' + dphone.value
			+ '&dgender=' + dgender + '&daddress=' + daddress.value
			+ '&address=' + address.value);
	xmlHttp.onreadystatechange = function() {
		if (xmlHttp.readyState == 4) {
			if (xmlHttp.status == 200) {
				var result = xmlHttp.responseText;// 在页面上显示返回的结果
				var obj = JSON.parse(result);
				if (obj.status == 200) {
				}
			}
			/*
			 * $.post("/order/adddel/"+uid,$("#deliver").serialize(),
			 * function(data){ if(data.status == 200){ alert("保存成功"); } else {
			 * alert("保存失败"); } });
			 */
		}
	}
}

function getSeller() {
	var sname = document.getElementById("sname");
	ajax("/seller/find/" + sid, function(result) {
		var obj1 = JSON.parse(result);
		sname.innerHTML = obj1.data.sname;
	});
}