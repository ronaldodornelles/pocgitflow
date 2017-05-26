for(var i = 0; i < 13; i++) { var scriptId = 'u' + i; window[scriptId] = document.getElementById(scriptId); }

$axure.eventManager.pageLoad(
function (e) {

});
gv_vAlignTable['u3'] = 'center';gv_vAlignTable['u12'] = 'center';gv_vAlignTable['u8'] = 'center';gv_vAlignTable['u10'] = 'center';gv_vAlignTable['u5'] = 'center';gv_vAlignTable['u1'] = 'center';
u9.style.cursor = 'pointer';
if (bIE) u9.attachEvent("onclick", ClickLinkToReferencePageu9);
else u9.addEventListener("click", ClickLinkToReferencePageu9, true);
function ClickLinkToReferencePageu9(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor___Forma_ao_Academica.html');
}

x = 0;
y = 56;
InsertAfterBegin(u9ann, "<img src='resources/images/newwindow.gif' id='u9PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u9PagePopup = document.getElementById('u9PagePopup');
if (bIE) u9PagePopup.attachEvent("onclick", u9PagePopupHandler);
else u9PagePopup.addEventListener("click", u9PagePopupHandler, true);

function u9PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor___Forma_ao_Academica.html'));
}
gv_vAlignTable['u6'] = 'top';
u11.style.cursor = 'pointer';
if (bIE) u11.attachEvent("onclick", ClickLinkToReferencePageu11);
else u11.addEventListener("click", ClickLinkToReferencePageu11, true);
function ClickLinkToReferencePageu11(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Incluir_Institui_ao_de_Ensino.html');
}

x = 0;
y = 14;
InsertAfterBegin(u11ann, "<img src='resources/images/newwindow.gif' id='u11PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u11PagePopup = document.getElementById('u11PagePopup');
if (bIE) u11PagePopup.attachEvent("onclick", u11PagePopupHandler);
else u11PagePopup.addEventListener("click", u11PagePopupHandler, true);

function u11PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Incluir_Institui_ao_de_Ensino.html'));
}
