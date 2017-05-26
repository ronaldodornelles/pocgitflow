for(var i = 0; i < 15; i++) { var scriptId = 'u' + i; window[scriptId] = document.getElementById(scriptId); }

$axure.eventManager.pageLoad(
function (e) {

});
gv_vAlignTable['u12'] = 'center';gv_vAlignTable['u4'] = 'center';gv_vAlignTable['u8'] = 'center';gv_vAlignTable['u10'] = 'center';gv_vAlignTable['u1'] = 'center';gv_vAlignTable['u14'] = 'center';gv_vAlignTable['u6'] = 'center';gv_vAlignTable['u2'] = 'top';
u13.style.cursor = 'pointer';
if (bIE) u13.attachEvent("onclick", ClickLinkToReferencePageu13);
else u13.addEventListener("click", ClickLinkToReferencePageu13, true);
function ClickLinkToReferencePageu13(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor___Dados_Pessoais___Incluir.html');
}

x = 0;
y = 56;
InsertAfterBegin(u13ann, "<img src='resources/images/newwindow.gif' id='u13PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u13PagePopup = document.getElementById('u13PagePopup');
if (bIE) u13PagePopup.attachEvent("onclick", u13PagePopupHandler);
else u13PagePopup.addEventListener("click", u13PagePopupHandler, true);

function u13PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor___Dados_Pessoais___Incluir.html'));
}
