for(var i = 0; i < 25; i++) { var scriptId = 'u' + i; window[scriptId] = document.getElementById(scriptId); }

$axure.eventManager.pageLoad(
function (e) {

});

u21.style.cursor = 'pointer';
if (bIE) u21.attachEvent("onclick", ClickLinkToReferencePageu21);
else u21.addEventListener("click", ClickLinkToReferencePageu21, true);
function ClickLinkToReferencePageu21(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor___Cargo_Fun_ao___Incluir.html');
}

x = 0;
y = 17;
InsertAfterBegin(u21ann, "<img src='resources/images/newwindow.gif' id='u21PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u21PagePopup = document.getElementById('u21PagePopup');
if (bIE) u21PagePopup.attachEvent("onclick", u21PagePopupHandler);
else u21PagePopup.addEventListener("click", u21PagePopupHandler, true);

function u21PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor___Cargo_Fun_ao___Incluir.html'));
}
gv_vAlignTable['u16'] = 'center';gv_vAlignTable['u12'] = 'center';gv_vAlignTable['u4'] = 'center';gv_vAlignTable['u8'] = 'center';gv_vAlignTable['u19'] = 'center';gv_vAlignTable['u10'] = 'center';gv_vAlignTable['u22'] = 'center';gv_vAlignTable['u1'] = 'center';
u9.style.cursor = 'pointer';
if (bIE) u9.attachEvent("onclick", ClickLinkToReferencePageu9);
else u9.addEventListener("click", ClickLinkToReferencePageu9, true);
function ClickLinkToReferencePageu9(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor___Dados_Funcionais___Incluir.html');
}

x = 0;
y = 16;
InsertAfterBegin(u9ann, "<img src='resources/images/newwindow.gif' id='u9PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u9PagePopup = document.getElementById('u9PagePopup');
if (bIE) u9PagePopup.attachEvent("onclick", u9PagePopupHandler);
else u9PagePopup.addEventListener("click", u9PagePopupHandler, true);

function u9PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor___Dados_Funcionais___Incluir.html'));
}
gv_vAlignTable['u14'] = 'center';gv_vAlignTable['u6'] = 'center';gv_vAlignTable['u2'] = 'top';
u11.style.cursor = 'pointer';
if (bIE) u11.attachEvent("onclick", ClickLinkToReferencePageu11);
else u11.addEventListener("click", ClickLinkToReferencePageu11, true);
function ClickLinkToReferencePageu11(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor.html');
}

x = 0;
y = 16;
InsertAfterBegin(u11ann, "<img src='resources/images/newwindow.gif' id='u11PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u11PagePopup = document.getElementById('u11PagePopup');
if (bIE) u11PagePopup.attachEvent("onclick", u11PagePopupHandler);
else u11PagePopup.addEventListener("click", u11PagePopupHandler, true);

function u11PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor.html'));
}
gv_vAlignTable['u24'] = 'center';
u7.style.cursor = 'pointer';
if (bIE) u7.attachEvent("onclick", ClickLinkToReferencePageu7);
else u7.addEventListener("click", ClickLinkToReferencePageu7, true);
function ClickLinkToReferencePageu7(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Pesquisar_Pessoa___Listar_Pessoa.html');
}

x = 0;
y = 16;
InsertAfterBegin(u7ann, "<img src='resources/images/newwindow.gif' id='u7PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u7PagePopup = document.getElementById('u7PagePopup');
if (bIE) u7PagePopup.attachEvent("onclick", u7PagePopupHandler);
else u7PagePopup.addEventListener("click", u7PagePopupHandler, true);

function u7PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Pesquisar_Pessoa___Listar_Pessoa.html'));
}
