for(var i = 0; i < 17; i++) { var scriptId = 'u' + i; window[scriptId] = document.getElementById(scriptId); }

$axure.eventManager.pageLoad(
function (e) {

});
gv_vAlignTable['u16'] = 'center';gv_vAlignTable['u12'] = 'top';
u15.style.cursor = 'pointer';
if (bIE) u15.attachEvent("onclick", ClickLinkToReferencePageu15);
else u15.addEventListener("click", ClickLinkToReferencePageu15, true);
function ClickLinkToReferencePageu15(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor.html');
}

x = 0;
y = 56;
InsertAfterBegin(u15ann, "<img src='resources/images/newwindow.gif' id='u15PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u15PagePopup = document.getElementById('u15PagePopup');
if (bIE) u15PagePopup.attachEvent("onclick", u15PagePopupHandler);
else u15PagePopup.addEventListener("click", u15PagePopupHandler, true);

function u15PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor.html'));
}
gv_vAlignTable['u4'] = 'center';gv_vAlignTable['u8'] = 'center';gv_vAlignTable['u10'] = 'center';gv_vAlignTable['u1'] = 'center';gv_vAlignTable['u14'] = 'center';gv_vAlignTable['u6'] = 'center';
u13.style.cursor = 'pointer';
if (bIE) u13.attachEvent("onclick", ClickLinkToReferencePageu13);
else u13.addEventListener("click", ClickLinkToReferencePageu13, true);
function ClickLinkToReferencePageu13(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor.html');
}

x = 0;
y = 56;
InsertAfterBegin(u13ann, "<img src='resources/images/newwindow.gif' id='u13PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u13PagePopup = document.getElementById('u13PagePopup');
if (bIE) u13PagePopup.attachEvent("onclick", u13PagePopupHandler);
else u13PagePopup.addEventListener("click", u13PagePopupHandler, true);

function u13PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor.html'));
}
