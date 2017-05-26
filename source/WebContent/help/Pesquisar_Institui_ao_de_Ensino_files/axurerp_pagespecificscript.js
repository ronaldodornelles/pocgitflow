for(var i = 0; i < 24; i++) { var scriptId = 'u' + i; window[scriptId] = document.getElementById(scriptId); }

$axure.eventManager.pageLoad(
function (e) {

});
gv_vAlignTable['u3'] = 'center';gv_vAlignTable['u21'] = 'center';gv_vAlignTable['u16'] = 'center';gv_vAlignTable['u12'] = 'center';gv_vAlignTable['u4'] = 'top';gv_vAlignTable['u8'] = 'center';gv_vAlignTable['u10'] = 'center';
u22.style.cursor = 'pointer';
if (bIE) u22.attachEvent("onclick", ClickLinkToReferencePageu22);
else u22.addEventListener("click", ClickLinkToReferencePageu22, true);
function ClickLinkToReferencePageu22(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Listar_Institui_ao_de_Ensino.html');
}

x = 0;
y = 56;
InsertAfterBegin(u22ann, "<img src='resources/images/newwindow.gif' id='u22PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u22PagePopup = document.getElementById('u22PagePopup');
if (bIE) u22PagePopup.attachEvent("onclick", u22PagePopupHandler);
else u22PagePopup.addEventListener("click", u22PagePopupHandler, true);

function u22PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Listar_Institui_ao_de_Ensino.html'));
}
gv_vAlignTable['u1'] = 'center';gv_vAlignTable['u14'] = 'center';
u20.style.cursor = 'pointer';
if (bIE) u20.attachEvent("onclick", ClickLinkToReferencePageu20);
else u20.addEventListener("click", ClickLinkToReferencePageu20, true);
function ClickLinkToReferencePageu20(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Incluir_Institui_ao_de_Ensino.html');
}

x = 0;
y = 56;
InsertAfterBegin(u20ann, "<img src='resources/images/newwindow.gif' id='u20PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u20PagePopup = document.getElementById('u20PagePopup');
if (bIE) u20PagePopup.attachEvent("onclick", u20PagePopupHandler);
else u20PagePopup.addEventListener("click", u20PagePopupHandler, true);

function u20PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Incluir_Institui_ao_de_Ensino.html'));
}
gv_vAlignTable['u6'] = 'center';gv_vAlignTable['u23'] = 'center';gv_vAlignTable['u18'] = 'center';