var str = "Js variable";

$(document).ready(function () {
	$("#somebutton").click(function () {
		servletCall();
	});
});

function servletCall() {
	var varia = document.getElementById("text").innerText;  //Работает только в нутри функции
	$.post(
		"GetInfo",
		{
			name: varia,
			str: str
		},//meaasge you want to send
		function (result) {
			$('#somediv').html('Here is your result : <strong>' + result + '</strong>'); //message you want to show
		});
};
