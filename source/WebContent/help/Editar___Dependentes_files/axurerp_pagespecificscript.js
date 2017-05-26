for(var i = 0; i < 13; i++) { var scriptId = 'u' + i; window[scriptId] = document.getElementById(scriptId); }

$axure.eventManager.pageLoad(
function (e) {

});
gv_vAlignTable['u12'] = 'center';gv_vAlignTable['u4'] = 'center';gv_vAlignTable['u8'] = 'center';gv_vAlignTable['u10'] = 'center';gv_vAlignTable['u1'] = 'center';
u9.style.cursor = 'pointer';
if (bIE) u9.attachEvent("onclick", ClickLinkToReferencePageu9);
else u9.addEventListener("click", ClickLinkToReferencePageu9, true);
function ClickLinkToReferencePageu9(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor___Dependentes.html');
}

x = 0;
y = 56;
InsertAfterBegin(u9ann, "<img src='resources/images/newwindow.gif' id='u9PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u9PagePopup = document.getElementById('u9PagePopup');
if (bIE) u9PagePopup.attachEvent("onclick", u9PagePopupHandler);
else u9PagePopup.addEventListener("click", u9PagePopupHandler, true);

function u9PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor___Dependentes.html'));
}
gv_vAlignTable['u6'] = 'center';gv_vAlignTable['u2'] = 'top';