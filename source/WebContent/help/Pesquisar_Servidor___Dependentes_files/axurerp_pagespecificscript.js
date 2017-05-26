for(var i = 0; i < 29; i++) { var scriptId = 'u' + i; window[scriptId] = document.getElementById(scriptId); }

$axure.eventManager.pageLoad(
function (e) {

});

u16.style.cursor = 'pointer';
if (bIE) u16.attachEvent("onclick", ClickLinkToReferencePageu16);
else u16.addEventListener("click", ClickLinkToReferencePageu16, true);
function ClickLinkToReferencePageu16(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Editar___Dependentes.html');
}

x = 0;
y = 56;
InsertAfterBegin(u16ann, "<img src='resources/images/newwindow.gif' id='u16PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u16PagePopup = document.getElementById('u16PagePopup');
if (bIE) u16PagePopup.attachEvent("onclick", u16PagePopupHandler);
else u16PagePopup.addEventListener("click", u16PagePopupHandler, true);

function u16PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Editar___Dependentes.html'));
}
gv_vAlignTable['u17'] = 'center';gv_vAlignTable['u28'] = 'center';gv_vAlignTable['u21'] = 'center';gv_vAlignTable['u13'] = 'center';gv_vAlignTable['u15'] = 'center';gv_vAlignTable['u1'] = 'center';gv_vAlignTable['u11'] = 'center';gv_vAlignTable['u3'] = 'center';gv_vAlignTable['u9'] = 'center';gv_vAlignTable['u7'] = 'center';gv_vAlignTable['u23'] = 'center';
u18.style.cursor = 'pointer';
if (bIE) u18.attachEvent("onclick", ClickLinkToReferencePageu18);
else u18.addEventListener("click", ClickLinkToReferencePageu18, true);
function ClickLinkToReferencePageu18(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Visualizar___Dependentes.html');
}

x = 0;
y = 56;
InsertAfterBegin(u18ann, "<img src='resources/images/newwindow.gif' id='u18PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u18PagePopup = document.getElementById('u18PagePopup');
if (bIE) u18PagePopup.attachEvent("onclick", u18PagePopupHandler);
else u18PagePopup.addEventListener("click", u18PagePopupHandler, true);

function u18PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Visualizar___Dependentes.html'));
}
gv_vAlignTable['u19'] = 'center';
u20.style.cursor = 'pointer';
if (bIE) u20.attachEvent("onclick", ClickLinkToReferencePageu20);
else u20.addEventListener("click", ClickLinkToReferencePageu20, true);
function ClickLinkToReferencePageu20(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Incluir___Dependentes.html');
}

x = 0;
y = 25;
InsertAfterBegin(u20ann, "<img src='resources/images/newwindow.gif' id='u20PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u20PagePopup = document.getElementById('u20PagePopup');
if (bIE) u20PagePopup.attachEvent("onclick", u20PagePopupHandler);
else u20PagePopup.addEventListener("click", u20PagePopupHandler, true);

function u20PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Incluir___Dependentes.html'));
}
gv_vAlignTable['u5'] = 'top';
u22.style.cursor = 'pointer';
if (bIE) u22.attachEvent("onclick", ClickLinkToReferencePageu22);
else u22.addEventListener("click", ClickLinkToReferencePageu22, true);
function ClickLinkToReferencePageu22(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor.html');
}

x = 0;
y = 16;
InsertAfterBegin(u22ann, "<img src='resources/images/newwindow.gif' id='u22PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u22PagePopup = document.getElementById('u22PagePopup');
if (bIE) u22PagePopup.attachEvent("onclick", u22PagePopupHandler);
else u22PagePopup.addEventListener("click", u22PagePopupHandler, true);

function u22PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Pesquisar_Servidor.html'));
}
gv_vAlignTable['u25'] = 'center';