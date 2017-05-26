for(var i = 0; i < 32; i++) { var scriptId = 'u' + i; window[scriptId] = document.getElementById(scriptId); }

$axure.eventManager.pageLoad(
function (e) {

});
gv_vAlignTable['u31'] = 'center';gv_vAlignTable['u16'] = 'center';gv_vAlignTable['u28'] = 'center';gv_vAlignTable['u8'] = 'center';
u30.style.cursor = 'pointer';
if (bIE) u30.attachEvent("onclick", ClickLinkToReferencePageu30);
else u30.addEventListener("click", ClickLinkToReferencePageu30, true);
function ClickLinkToReferencePageu30(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Listar_Servidor.html');
}

x = 0;
y = 56;
InsertAfterBegin(u30ann, "<img src='resources/images/newwindow.gif' id='u30PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u30PagePopup = document.getElementById('u30PagePopup');
if (bIE) u30PagePopup.attachEvent("onclick", u30PagePopupHandler);
else u30PagePopup.addEventListener("click", u30PagePopupHandler, true);

function u30PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Listar_Servidor.html'));
}
gv_vAlignTable['u6'] = 'center';gv_vAlignTable['u14'] = 'center';gv_vAlignTable['u4'] = 'top';gv_vAlignTable['u1'] = 'center';gv_vAlignTable['u26'] = 'center';gv_vAlignTable['u10'] = 'center';gv_vAlignTable['u3'] = 'center';gv_vAlignTable['u12'] = 'center';gv_vAlignTable['u24'] = 'center';
u25.style.cursor = 'pointer';
if (bIE) u25.attachEvent("onclick", ClickLinkToReferencePageu25);
else u25.addEventListener("click", ClickLinkToReferencePageu25, true);
function ClickLinkToReferencePageu25(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor___Dados_Pessoais___Incluir.html');
}

x = 0;
y = 56;
InsertAfterBegin(u25ann, "<img src='resources/images/newwindow.gif' id='u25PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u25PagePopup = document.getElementById('u25PagePopup');
if (bIE) u25PagePopup.attachEvent("onclick", u25PagePopupHandler);
else u25PagePopup.addEventListener("click", u25PagePopupHandler, true);

function u25PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor___Dados_Pessoais___Incluir.html'));
}
gv_vAlignTable['u18'] = 'center';gv_vAlignTable['u20'] = 'center';gv_vAlignTable['u22'] = 'center';