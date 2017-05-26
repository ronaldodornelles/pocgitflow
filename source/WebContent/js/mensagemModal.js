/**
 * 
 */
function mensagemModalExclusao( stridoutputtext , stridmodal , strmodelomensagem , strtextoespecificomensagem , strtagmensagem ){
	
	if ( ( stridoutputtext == undefined ) || ( stridmodal == undefined ) || ( strmodelomensagem == undefined ) ){
		alert( 'elementos obrigatórios não informados' );
		return false;
	}
	if ( strtagmensagem == undefined ) strtagmensagem = 'MSGTAG';
	var strmensagem = strmodelomensagem.replace( strtagmensagem , strtextoespecificomensagem );
	top[0].document.getElementById(stridoutputtext).innerHTML = strmensagem; 
	top[0].document.getElementById(stridmodal).component.show(); 
	return true;
}

function mensagemModalExclusaoDefault( stridoutputtext , stridmodal , strtextoespecificomensagem ){
	
	if ( ( stridoutputtext == undefined ) || ( stridmodal == undefined ) || ( strtextoespecificomensagem == undefined ) ){
		alert( 'elementos obrigatórios não informados' );
		return false;
	}
		var strtagmensagem = 'MSGTAG';
		var strmodelomensagem = "O registro “MSGTAG” será excluído! Deseja continuar?";
		var strmensagem = strmodelomensagem.replace( strtagmensagem , strtextoespecificomensagem );
		top[0].document.getElementById(stridoutputtext).innerHTML = strmensagem; 
		top[0].document.getElementById(stridmodal).component.show(); 
		return true;
}

/**
 * 
 */
function exibirModalAvisoEdicao(booExiste , stridmodal ){
	if ( ( stridmodal == undefined ) || ( booExiste == undefined ) ){
		alert( 'elementos obrigatórios não informados' );
		return false;
	}
	
	if(booExiste == 'true'){
		top[0].document.getElementById(stridmodal).component.show();
	}
	return true;
	
}