
var interval;
var minutes = 15;
var seconds = 0;

window.onload = function() {
    countdown('countdown');
};

function countdown(element) {
    interval = setInterval(function() {
        var el = document.getElementById(element);
        if ( el != undefined ){
	        if(seconds == -1) {
	            if(minutes == 0) {
	                el.innerHTML = "expirou!";
	                alert('Sua sessão expirou!');
	                parent.location.href = parent.document.URL;
	                clearInterval(interval);
	                return;
	            } else {
	                minutes--;
	                seconds = 59;
	            }
	        }
	        if(minutes > 0) {
	            var minute_text = minutes + (minutes > 1 ? 'm' : 'm');
	        } else {
	            var minute_text = '';
	        }
	        var second_text = seconds > 1 ? 's' : 's';
	        el.innerHTML = minute_text + ' ' + seconds +  '' + second_text;
	        seconds--;
        };
    }, 1000);
}
