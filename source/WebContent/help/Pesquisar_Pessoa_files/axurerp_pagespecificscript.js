for(var i = 0; i < 45; i++) { var scriptId = 'u' + i; window[scriptId] = document.getElementById(scriptId); }

$axure.eventManager.pageLoad(
function (e) {

});
gv_vAlignTable['u31'] = 'center';
u36.style.cursor = 'pointer';
if (bIE) u36.attachEvent("onclick", ClickLinkToReferencePageu36);
else u36.addEventListener("click", ClickLinkToReferencePageu36, true);
function ClickLinkToReferencePageu36(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Listar_Pessoa.html');
}

x = 0;
y = 16;
InsertAfterBegin(u36ann, "<img src='resources/images/newwindow.gif' id='u36PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u36PagePopup = document.getElementById('u36PagePopup');
if (bIE) u36PagePopup.attachEvent("onclick", u36PagePopupHandler);
else u36PagePopup.addEventListener("click", u36PagePopupHandler, true);

function u36PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Listar_Pessoa.html'));
}
gv_vAlignTable['u17'] = 'top';gv_vAlignTable['u29'] = 'center';gv_vAlignTable['u21'] = 'top';gv_vAlignTable['u13'] = 'top';gv_vAlignTable['u4'] = 'top';gv_vAlignTable['u43'] = 'center';
u40.style.cursor = 'pointer';
if (bIE) u40.attachEvent("onclick", ClickLinkToReferencePageu40);
else u40.addEventListener("click", ClickLinkToReferencePageu40, true);
function ClickLinkToReferencePageu40(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Incluir_Pessoa.html');
}

x = 0;
y = 12;
InsertAfterBegin(u40ann, "<img src='resources/images/newwindow.gif' id='u40PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u40PagePopup = document.getElementById('u40PagePopup');
if (bIE) u40PagePopup.attachEvent("onclick", u40PagePopupHandler);
else u40PagePopup.addEventListener("click", u40PagePopupHandler, true);

function u40PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Incluir_Pessoa.html'));
}
gv_vAlignTable['u1'] = 'center';gv_vAlignTable['u37'] = 'center';gv_vAlignTable['u41'] = 'center';gv_vAlignTable['u11'] = 'top';gv_vAlignTable['u3'] = 'center';gv_vAlignTable['u39'] = 'center';gv_vAlignTable['u9'] = 'top';gv_vAlignTable['u35'] = 'center';gv_vAlignTable['u27'] = 'center';gv_vAlignTable['u23'] = 'top';gv_vAlignTable['u25'] = 'top';gv_vAlignTable['u19'] = 'top';gv_vAlignTable['u5'] = 'top';gv_vAlignTable['u33'] = 'center';