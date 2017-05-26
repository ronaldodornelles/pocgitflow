for(var i = 0; i < 21; i++) { var scriptId = 'u' + i; window[scriptId] = document.getElementById(scriptId); }

$axure.eventManager.pageLoad(
function (e) {

});
gv_vAlignTable['u3'] = 'center';
u16.style.cursor = 'pointer';
if (bIE) u16.attachEvent("onclick", ClickLinkToReferencePageu16);
else u16.addEventListener("click", ClickLinkToReferencePageu16, true);
function ClickLinkToReferencePageu16(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor___Dados_Pessoais___Incluir.html');
}

x = 0;
y = 17;
InsertAfterBegin(u16ann, "<img src='resources/images/newwindow.gif' id='u16PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u16PagePopup = document.getElementById('u16PagePopup');
if (bIE) u16PagePopup.attachEvent("onclick", u16PagePopupHandler);
else u16PagePopup.addEventListener("click", u16PagePopupHandler, true);

function u16PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor___Dados_Pessoais___Incluir.html'));
}

u12.style.cursor = 'pointer';
if (bIE) u12.attachEvent("onclick", ClickLinkToReferencePageu12);
else u12.addEventListener("click", ClickLinkToReferencePageu12, true);
function ClickLinkToReferencePageu12(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Visualizar___Dados_Pessoais.html');
}

x = 0;
y = 16;
InsertAfterBegin(u12ann, "<img src='resources/images/newwindow.gif' id='u12PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u12PagePopup = document.getElementById('u12PagePopup');
if (bIE) u12PagePopup.attachEvent("onclick", u12PagePopupHandler);
else u12PagePopup.addEventListener("click", u12PagePopupHandler, true);

function u12PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Visualizar___Dados_Pessoais.html'));
}
gv_vAlignTable['u15'] = 'center';gv_vAlignTable['u19'] = 'center';gv_vAlignTable['u17'] = 'center';gv_vAlignTable['u5'] = 'top';gv_vAlignTable['u1'] = 'center';gv_vAlignTable['u9'] = 'center';
u14.style.cursor = 'pointer';
if (bIE) u14.attachEvent("onclick", ClickLinkToReferencePageu14);
else u14.addEventListener("click", ClickLinkToReferencePageu14, true);
function ClickLinkToReferencePageu14(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Editar___Dados_Pessoais.html');
}

x = 0;
y = 18;
InsertAfterBegin(u14ann, "<img src='resources/images/newwindow.gif' id='u14PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u14PagePopup = document.getElementById('u14PagePopup');
if (bIE) u14PagePopup.attachEvent("onclick", u14PagePopupHandler);
else u14PagePopup.addEventListener("click", u14PagePopupHandler, true);

function u14PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Editar___Dados_Pessoais.html'));
}
gv_vAlignTable['u11'] = 'center';gv_vAlignTable['u13'] = 'center';gv_vAlignTable['u7'] = 'center';