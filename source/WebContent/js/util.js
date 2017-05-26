function PrintContent(divElement, css) {
	var DocumentContainer = document.getElementById(divElement);
	var WindowObject = window
			.open(
					"",
					"PrintWindow",
					"width=750,height=650,top=50,left=50,toolbars=no,scrollbars=yes,status=no,resizable=yes");
	WindowObject.document.writeln("<head>");
	WindowObject.document
			.writeln("<link rel='stylesheet' type='text/css' href='" + css
					+ "' />");
	WindowObject.document.writeln("</head>");
	WindowObject.document.writeln("<body>");
	WindowObject.document.writeln(DocumentContainer.innerHTML);
	WindowObject.document.writeln("</body>");
	WindowObject.document.close();
	WindowObject.focus();
	WindowObject.print();
	WindowObject.close();
}

function maxTextArea(evt, txt, max) {
	if (evt.which && evt.which == 8) {
		return true;
	} else {
		return (txt.value.length < max);
	}
}

