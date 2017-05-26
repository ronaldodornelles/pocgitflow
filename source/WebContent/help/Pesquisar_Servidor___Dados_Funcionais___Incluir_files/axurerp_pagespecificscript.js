for(var i = 0; i < 25; i++) { var scriptId = 'u' + i; window[scriptId] = document.getElementById(scriptId); }

$axure.eventManager.pageLoad(
function (e) {

});
gv_vAlignTable['u16'] = 'center';gv_vAlignTable['u12'] = 'center';gv_vAlignTable['u4'] = 'center';gv_vAlignTable['u8'] = 'center';gv_vAlignTable['u19'] = 'center';gv_vAlignTable['u10'] = 'center';gv_vAlignTable['u22'] = 'center';gv_vAlignTable['u1'] = 'center';gv_vAlignTable['u14'] = 'center';gv_vAlignTable['u6'] = 'center';gv_vAlignTable['u2'] = 'top';
u11.style.cursor = 'pointer';
if (bIE) u11.attachEvent("onclick", ClickLinkToReferencePageu11);
else u11.addEventListener("click", ClickLinkToReferencePageu11, true);
function ClickLinkToReferencePageu11(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Pesquisar_Unidade___Listar_Unidade_Organizacional.html');
}

x = 0;
y = 35;
InsertAfterBegin(u11ann, "<img src='resources/images/newwindow.gif' id='u11PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u11PagePopup = document.getElementById('u11PagePopup');
if (bIE) u11PagePopup.attachEvent("onclick", u11PagePopupHandler);
else u11PagePopup.addEventListener("click", u11PagePopupHandler, true);

function u11PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Pesquisar_Unidade___Listar_Unidade_Organizacional.html'));
}

u23.style.cursor = 'pointer';
if (bIE) u23.attachEvent("onclick", ClickLinkToReferencePageu23);
else u23.addEventListener("click", ClickLinkToReferencePageu23, true);
function ClickLinkToReferencePageu23(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor___Cargo_Fun_ao___Incluir.html');
}

x = 0;
y = 21;
InsertAfterBegin(u23ann, "<img src='resources/images/newwindow.gif' id='u23PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u23PagePopup = document.getElementById('u23PagePopup');
if (bIE) u23PagePopup.attachEvent("onclick", u23PagePopupHandler);
else u23PagePopup.addEventListener("click", u23PagePopupHandler, true);

function u23PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor___Cargo_Fun_ao___Incluir.html'));
}
gv_vAlignTable['u24'] = 'center';
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
