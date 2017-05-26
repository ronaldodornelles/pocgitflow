for(var i = 0; i < 9; i++) { var scriptId = 'u' + i; window[scriptId] = document.getElementById(scriptId); }

$axure.eventManager.pageLoad(
function (e) {

});
gv_vAlignTable['u4'] = 'center';gv_vAlignTable['u6'] = 'center';
u7.style.cursor = 'pointer';
if (bIE) u7.attachEvent("onclick", ClickLinkToReferencePageu7);
else u7.addEventListener("click", ClickLinkToReferencePageu7, true);
function ClickLinkToReferencePageu7(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor___Cessao_Requisi_ao.html');
}

x = 0;
y = 25;
InsertAfterBegin(u7ann, "<img src='resources/images/newwindow.gif' id='u7PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u7PagePopup = document.getElementById('u7PagePopup');
if (bIE) u7PagePopup.attachEvent("onclick", u7PagePopupHandler);
else u7PagePopup.addEventListener("click", u7PagePopupHandler, true);

function u7PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor___Cessao_Requisi_ao.html'));
}
gv_vAlignTable['u8'] = 'center';gv_vAlignTable['u1'] = 'center';gv_vAlignTable['u2'] = 'top';