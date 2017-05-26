/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  javax.faces.component.UIComponent
 *  javax.faces.context.FacesContext
 *  javax.faces.convert.Converter
 *  org.apache.commons.lang3.StringUtils
 */
package br.gov.iphan.autenticador;

import java.io.Serializable;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import org.apache.commons.lang3.StringUtils;

public abstract class AbstractConverter
implements Converter,
Serializable {
    private static final long serialVersionUID = 1;
    private static final String noSelectionValue = "org.jboss.seam.ui.NoSelectionConverter.noSelectionValue";

    public Object getAsObject(FacesContext ctx, UIComponent ui, String valor) {
        if (StringUtils.isEmpty((CharSequence)valor)) {
            return null;
        }
        if (valor != null && valor.equals("org.jboss.seam.ui.NoSelectionConverter.noSelectionValue")) {
            return null;
        }
        return this.getAsObject(valor);
    }

    public abstract Object getAsObject(String var1);

    public String getAsString(FacesContext ctx, UIComponent ui, Object valor) {
        return this.getAsString(valor);
    }

    public String getAsString(Object valor) {
        return valor.toString();
    }
}

