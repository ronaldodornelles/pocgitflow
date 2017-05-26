for(var i = 0; i < 13; i++) { var scriptId = 'u' + i; window[scriptId] = document.getElementById(scriptId); }

$axure.eventManager.pageLoad(
function (e) {

});

u3.style.cursor = 'pointer';
if (bIE) u3.attachEvent("onclick", ClickLinkToReferencePageu3);
else u3.addEventListener("click", ClickLinkToReferencePageu3, true);
function ClickLinkToReferencePageu3(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor.html');
}

x = 0;
y = 38;
InsertAfterBegin(u3ann, "<img src='resources/images/newwindow.gif' id='u3PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u3PagePopup = document.getElementById('u3PagePopup');
if (bIE) u3PagePopup.attachEvent("onclick", u3PagePopupHandler);
else u3PagePopup.addEventListener("click", u3PagePopupHandler, true);

function u3PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor.html'));
}
gv_vAlignTable['u4'] = 'center';gv_vAlignTable['u8'] = 'center';gv_vAlignTable['u1'] = 'center';gv_vAlignTable['u6'] = 'center';gv_vAlignTable['u2'] = 'top';gv_vAlignTable['u11'] = 'center';