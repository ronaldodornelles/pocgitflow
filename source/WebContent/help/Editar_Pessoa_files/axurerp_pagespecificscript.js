﻿for(var i = 0; i < 17; i++) { var scriptId = 'u' + i; window[scriptId] = document.getElementById(scriptId); }

$axure.eventManager.pageLoad(
function (e) {

});
gv_vAlignTable['u12'] = 'center';gv_vAlignTable['u15'] = 'center';gv_vAlignTable['u4'] = 'center';gv_vAlignTable['u8'] = 'center';gv_vAlignTable['u10'] = 'center';gv_vAlignTable['u1'] = 'center';
u9.style.cursor = 'pointer';
if (bIE) u9.attachEvent("onclick", ClickLinkToReferencePageu9);
else u9.addEventListener("click", ClickLinkToReferencePageu9, true);
function ClickLinkToReferencePageu9(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Pesquisar_Pessoa.html');
}

x = 0;
y = 16;
InsertAfterBegin(u9ann, "<img src='resources/images/newwindow.gif' id='u9PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u9PagePopup = document.getElementById('u9PagePopup');
if (bIE) u9PagePopup.attachEvent("onclick", u9PagePopupHandler);
else u9PagePopup.addEventListener("click", u9PagePopupHandler, true);

function u9PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Pesquisar_Pessoa.html'));
}
gv_vAlignTable['u6'] = 'center';gv_vAlignTable['u2'] = 'top';
u7.style.cursor = 'pointer';
if (bIE) u7.attachEvent("onclick", ClickLinkToReferencePageu7);
else u7.addEventListener("click", ClickLinkToReferencePageu7, true);
function ClickLinkToReferencePageu7(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Pesquisar_Pessoa.html');
}

x = 0;
y = 16;
InsertAfterBegin(u7ann, "<img src='resources/images/newwindow.gif' id='u7PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u7PagePopup = document.getElementById('u7PagePopup');
if (bIE) u7PagePopup.attachEvent("onclick", u7PagePopupHandler);
else u7PagePopup.addEventListener("click", u7PagePopupHandler, true);

function u7PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Pesquisar_Pessoa.html'));
}
