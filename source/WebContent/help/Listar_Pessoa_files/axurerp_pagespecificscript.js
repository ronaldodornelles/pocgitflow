for(var i = 0; i < 20; i++) { var scriptId = 'u' + i; window[scriptId] = document.getElementById(scriptId); }

$axure.eventManager.pageLoad(
function (e) {

});
gv_vAlignTable['u3'] = 'center';gv_vAlignTable['u16'] = 'center';gv_vAlignTable['u12'] = 'center';
u15.style.cursor = 'pointer';
if (bIE) u15.attachEvent("onclick", ClickLinkToReferencePageu15);
else u15.addEventListener("click", ClickLinkToReferencePageu15, true);
function ClickLinkToReferencePageu15(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Incluir_Pessoa.html');
}

x = 0;
y = 12;
InsertAfterBegin(u15ann, "<img src='resources/images/newwindow.gif' id='u15PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u15PagePopup = document.getElementById('u15PagePopup');
if (bIE) u15PagePopup.attachEvent("onclick", u15PagePopupHandler);
else u15PagePopup.addEventListener("click", u15PagePopupHandler, true);

function u15PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Incluir_Pessoa.html'));
}
gv_vAlignTable['u4'] = 'top';gv_vAlignTable['u8'] = 'center';gv_vAlignTable['u10'] = 'center';gv_vAlignTable['u1'] = 'center';
u9.style.cursor = 'pointer';
if (bIE) u9.attachEvent("onclick", ClickLinkToReferencePageu9);
else u9.addEventListener("click", ClickLinkToReferencePageu9, true);
function ClickLinkToReferencePageu9(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Editar_Pessoa.html');
}

x = 0;
y = 16;
InsertAfterBegin(u9ann, "<img src='resources/images/newwindow.gif' id='u9PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u9PagePopup = document.getElementById('u9PagePopup');
if (bIE) u9PagePopup.attachEvent("onclick", u9PagePopupHandler);
else u9PagePopup.addEventListener("click", u9PagePopupHandler, true);

function u9PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Editar_Pessoa.html'));
}
gv_vAlignTable['u14'] = 'center';gv_vAlignTable['u6'] = 'center';
u11.style.cursor = 'pointer';
if (bIE) u11.attachEvent("onclick", ClickLinkToReferencePageu11);
else u11.addEventListener("click", ClickLinkToReferencePageu11, true);
function ClickLinkToReferencePageu11(e)
{
    self.location.href=$axure.globalVariableProvider.getLinkUrl('Visualizar_Pessoa.html');
}

x = 0;
y = 16;
InsertAfterBegin(u11ann, "<img src='resources/images/newwindow.gif' id='u11PagePopup' style='cursor:pointer;position:absolute;z-index:500;left:" + x + ";top:" + y + "'>");

var u11PagePopup = document.getElementById('u11PagePopup');
if (bIE) u11PagePopup.attachEvent("onclick", u11PagePopupHandler);
else u11PagePopup.addEventListener("click", u11PagePopupHandler, true);

function u11PagePopupHandler(event)
{
    window.open($axure.globalVariableProvider.getLinkUrl('Visualizar_Pessoa.html'));
}
gv_vAlignTable['u18'] = 'center';