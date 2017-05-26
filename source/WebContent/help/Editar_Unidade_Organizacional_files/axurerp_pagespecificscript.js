for(var i = 0; i < 25; i++) { var scriptId = 'u' + i; window[scriptId] = document.getElementById(scriptId); }

$axure.eventManager.pageLoad(
function (e) {

});
gv_vAlignTable['u16'] = 'center';gv_vAlignTable['u12'] = 'center';
u15.style.cursor = 'pointer';
if (bIE) u15.attachEvent("onclick", ClickLinkToReferencePageu15);
else u15.addEventListener("click", ClickLinkToReferencePageu15, true);
function ClickLinkToReferencePageu15(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor___Listar_Servidor.html');
}

x = 0;
y = 16;
InsertAfterBegin(u15ann, "<img src='resources/images/newwindow.gif' id='u15PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u15PagePopup = document.getElementById('u15PagePopup');
if (bIE) u15PagePopup.attachEvent("onclick", u15PagePopupHandler);
else u15PagePopup.addEventListener("click", u15PagePopupHandler, true);

function u15PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor___Listar_Servidor.html'));
}
gv_vAlignTable['u4'] = 'center';gv_vAlignTable['u8'] = 'center';gv_vAlignTable['u10'] = 'center';
u17.style.cursor = 'pointer';
if (bIE) u17.attachEvent("onclick", ClickLinkToReferencePageu17);
else u17.addEventListener("click", ClickLinkToReferencePageu17, true);
function ClickLinkToReferencePageu17(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Pesquisar_Unidade_Organizacional.html');
}

x = 0;
y = 21;
InsertAfterBegin(u17ann, "<img src='resources/images/newwindow.gif' id='u17PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u17PagePopup = document.getElementById('u17PagePopup');
if (bIE) u17PagePopup.attachEvent("onclick", u17PagePopupHandler);
else u17PagePopup.addEventListener("click", u17PagePopupHandler, true);

function u17PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Pesquisar_Unidade_Organizacional.html'));
}
gv_vAlignTable['u1'] = 'center';gv_vAlignTable['u14'] = 'center';gv_vAlignTable['u20'] = 'center';gv_vAlignTable['u6'] = 'center';gv_vAlignTable['u2'] = 'top';gv_vAlignTable['u23'] = 'center';
u13.style.cursor = 'pointer';
if (bIE) u13.attachEvent("onclick", ClickLinkToReferencePageu13);
else u13.addEventListener("click", ClickLinkToReferencePageu13, true);
function ClickLinkToReferencePageu13(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Pesquisar_Unidade___Listar_Unidade_Organizacional.html');
}

x = 0;
y = 26;
InsertAfterBegin(u13ann, "<img src='resources/images/newwindow.gif' id='u13PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u13PagePopup = document.getElementById('u13PagePopup');
if (bIE) u13PagePopup.attachEvent("onclick", u13PagePopupHandler);
else u13PagePopup.addEventListener("click", u13PagePopupHandler, true);

function u13PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Pesquisar_Unidade___Listar_Unidade_Organizacional.html'));
}
gv_vAlignTable['u18'] = 'center';
u7.style.cursor = 'pointer';
if (bIE) u7.attachEvent("onclick", ClickLinkToReferencePageu7);
else u7.addEventListener("click", ClickLinkToReferencePageu7, true);
function ClickLinkToReferencePageu7(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Pesquisar_Unidade_Organizacional.html');
}

x = 0;
y = 21;
InsertAfterBegin(u7ann, "<img src='resources/images/newwindow.gif' id='u7PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u7PagePopup = document.getElementById('u7PagePopup');
if (bIE) u7PagePopup.attachEvent("onclick", u7PagePopupHandler);
else u7PagePopup.addEventListener("click", u7PagePopupHandler, true);

function u7PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Pesquisar_Unidade_Organizacional.html'));
}
