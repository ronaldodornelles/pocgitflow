for(var i = 0; i < 23; i++) { var scriptId = 'u' + i; window[scriptId] = document.getElementById(scriptId); }

$axure.eventManager.pageLoad(
function (e) {

});
gv_vAlignTable['u21'] = 'center';gv_vAlignTable['u16'] = 'center';gv_vAlignTable['u12'] = 'center';
u15.style.cursor = 'pointer';
if (bIE) u15.attachEvent("onclick", ClickLinkToReferencePageu15);
else u15.addEventListener("click", ClickLinkToReferencePageu15, true);
function ClickLinkToReferencePageu15(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Incluir_Institui_ao_de_Ensino.html');
}

x = 0;
y = 21;
InsertAfterBegin(u15ann, "<img src='resources/images/newwindow.gif' id='u15PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u15PagePopup = document.getElementById('u15PagePopup');
if (bIE) u15PagePopup.attachEvent("onclick", u15PagePopupHandler);
else u15PagePopup.addEventListener("click", u15PagePopupHandler, true);

function u15PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Incluir_Institui_ao_de_Ensino.html'));
}
gv_vAlignTable['u4'] = 'center';gv_vAlignTable['u8'] = 'center';gv_vAlignTable['u10'] = 'center';gv_vAlignTable['u1'] = 'center';gv_vAlignTable['u14'] = 'center';gv_vAlignTable['u6'] = 'center';gv_vAlignTable['u2'] = 'top';
u11.style.cursor = 'pointer';
if (bIE) u11.attachEvent("onclick", ClickLinkToReferencePageu11);
else u11.addEventListener("click", ClickLinkToReferencePageu11, true);
function ClickLinkToReferencePageu11(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Editar_Institui_ao_de_Ensino.html');
}

x = 0;
y = 25;
InsertAfterBegin(u11ann, "<img src='resources/images/newwindow.gif' id='u11PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u11PagePopup = document.getElementById('u11PagePopup');
if (bIE) u11PagePopup.attachEvent("onclick", u11PagePopupHandler);
else u11PagePopup.addEventListener("click", u11PagePopupHandler, true);

function u11PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Editar_Institui_ao_de_Ensino.html'));
}

u13.style.cursor = 'pointer';
if (bIE) u13.attachEvent("onclick", ClickLinkToReferencePageu13);
else u13.addEventListener("click", ClickLinkToReferencePageu13, true);
function ClickLinkToReferencePageu13(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Visualizar_Institui_ao_de_Ensino.html');
}

x = 0;
y = 20;
InsertAfterBegin(u13ann, "<img src='resources/images/newwindow.gif' id='u13PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u13PagePopup = document.getElementById('u13PagePopup');
if (bIE) u13PagePopup.attachEvent("onclick", u13PagePopupHandler);
else u13PagePopup.addEventListener("click", u13PagePopupHandler, true);

function u13PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Visualizar_Institui_ao_de_Ensino.html'));
}
gv_vAlignTable['u18'] = 'center';