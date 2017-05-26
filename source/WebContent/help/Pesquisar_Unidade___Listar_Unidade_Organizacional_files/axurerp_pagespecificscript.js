for(var i = 0; i < 19; i++) { var scriptId = 'u' + i; window[scriptId] = document.getElementById(scriptId); }

$axure.eventManager.pageLoad(
function (e) {

});
gv_vAlignTable['u16'] = 'center';gv_vAlignTable['u12'] = 'center';gv_vAlignTable['u4'] = 'center';gv_vAlignTable['u8'] = 'center';gv_vAlignTable['u10'] = 'center';
u17.style.cursor = 'pointer';
if (bIE) u17.attachEvent("onclick", ClickLinkToReferencePageu17);
else u17.addEventListener("click", ClickLinkToReferencePageu17, true);
function ClickLinkToReferencePageu17(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Editar_Unidade_Organizacional.html');
}

x = 0;
y = 56;
InsertAfterBegin(u17ann, "<img src='resources/images/newwindow.gif' id='u17PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u17PagePopup = document.getElementById('u17PagePopup');
if (bIE) u17PagePopup.attachEvent("onclick", u17PagePopupHandler);
else u17PagePopup.addEventListener("click", u17PagePopupHandler, true);

function u17PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Editar_Unidade_Organizacional.html'));
}
gv_vAlignTable['u1'] = 'center';gv_vAlignTable['u14'] = 'center';gv_vAlignTable['u6'] = 'center';gv_vAlignTable['u2'] = 'top';gv_vAlignTable['u18'] = 'center';