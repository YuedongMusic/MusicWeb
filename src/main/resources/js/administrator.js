

$(function() {
	$("#administrator-index").click(function() {
		document.getElementById("register-iframe").src='administratorindex.jsp';
	});
	$("#music-manage").click(function() {
		document.getElementById("register-iframe").src='musicmanage.jsp';
	});
	$("#singer-manage").click(function() {
		document.getElementById("register-iframe").src='singermanage.jsp';
	});
	$("#delete-user").click(function() {
		document.getElementById("register-iframe").src='deleteuser.jsp';
	});
	
	$("#change-pass").click(function() {
		document.getElementById("register-iframe").src='changepass.jsp';
	});
});