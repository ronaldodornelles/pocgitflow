﻿for(var i = 0; i < 17; i++) { var scriptId = 'u' + i; window[scriptId] = document.getElementById(scriptId); }

$axure.eventManager.pageLoad(
function (e) {

});

u3.style.cursor = 'pointer';
if (bIE) u3.attachEvent("onclick", ClickLinkToReferencePageu3);
else u3.addEventListener("click", ClickLinkToReferencePageu3, true);
function ClickLinkToReferencePageu3(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Pesquisar_Institui_ao_de_Ensino.html');
}

x = 0;
y = 20;
InsertAfterBegin(u3ann, "<img src='resources/images/newwindow.gif' id='u3PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u3PagePopup = document.getElementById('u3PagePopup');
if (bIE) u3PagePopup.attachEvent("onclick", u3PagePopupHandler);
else u3PagePopup.addEventListener("click", u3PagePopupHandler, true);

function u3PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Pesquisar_Institui_ao_de_Ensino.html'));
}
gv_vAlignTable['u12'] = 'center';gv_vAlignTable['u15'] = 'center';gv_vAlignTable['u4'] = 'center';gv_vAlignTable['u8'] = 'center';gv_vAlignTable['u10'] = 'center';
u5.style.cursor = 'pointer';
if (bIE) u5.attachEvent("onclick", ClickLinkToReferencePageu5);
else u5.addEventListener("click", ClickLinkToReferencePageu5, true);
function ClickLinkToReferencePageu5(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Pesquisar_Institui_ao_de_Ensino.html');
}

x = 0;
y = 20;
InsertAfterBegin(u5ann, "<img src='resources/images/newwindow.gif' id='u5PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u5PagePopup = document.getElementById('u5PagePopup');
if (bIE) u5PagePopup.attachEvent("onclick", u5PagePopupHandler);
else u5PagePopup.addEventListener("click", u5PagePopupHandler, true);

function u5PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Pesquisar_Institui_ao_de_Ensino.html'));
}
gv_vAlignTable['u1'] = 'center';gv_vAlignTable['u6'] = 'center';gv_vAlignTable['u2'] = 'top';