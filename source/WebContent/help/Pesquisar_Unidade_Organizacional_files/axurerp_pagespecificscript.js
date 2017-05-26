for(var i = 0; i < 24; i++) { var scriptId = 'u' + i; window[scriptId] = document.getElementById(scriptId); }

$axure.eventManager.pageLoad(
function (e) {

});
gv_vAlignTable['u3'] = 'center';gv_vAlignTable['u22'] = 'center';gv_vAlignTable['u15'] = 'center';
u19.style.cursor = 'pointer';
if (bIE) u19.attachEvent("onclick", ClickLinkToReferencePageu19);
else u19.addEventListener("click", ClickLinkToReferencePageu19, true);
function ClickLinkToReferencePageu19(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Listar_Unidade_Organizacional.html');
}

x = 0;
y = 56;
InsertAfterBegin(u19ann, "<img src='resources/images/newwindow.gif' id='u19PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u19PagePopup = document.getElementById('u19PagePopup');
if (bIE) u19PagePopup.attachEvent("onclick", u19PagePopupHandler);
else u19PagePopup.addEventListener("click", u19PagePopupHandler, true);

function u19PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Listar_Unidade_Organizacional.html'));
}
gv_vAlignTable['u17'] = 'center';gv_vAlignTable['u5'] = 'center';gv_vAlignTable['u1'] = 'center';gv_vAlignTable['u9'] = 'center';gv_vAlignTable['u20'] = 'center';gv_vAlignTable['u11'] = 'center';gv_vAlignTable['u13'] = 'center';gv_vAlignTable['u18'] = 'top';gv_vAlignTable['u7'] = 'center';