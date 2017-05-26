/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  org.jboss.seam.annotations.Name
 *  org.jboss.seam.annotations.faces.Converter
 *  org.jboss.seam.annotations.intercept.BypassInterceptors
 */
package br.gov.iphan.autenticador;

import br.gov.iphan.autenticador.AbstractConverter;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.faces.Converter;
import org.jboss.seam.annotations.intercept.BypassInterceptors;

@Converter
@Name(value="emptyStringToNullConverter")
@BypassInterceptors
public class EmptyStringToNullConverter
extends AbstractConverter {
    private static final long serialVersionUID = 1;

    @Override
    public Object getAsObject(String valor) {
        return valor;
    }
}

