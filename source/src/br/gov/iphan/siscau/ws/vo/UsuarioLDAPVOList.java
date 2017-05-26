package br.gov.iphan.siscau.ws.vo;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;


import br.gov.iphan.siscau.ws.vo.UsuarioLDAPVO;


@XStreamAlias("list")
public class UsuarioLDAPVOList {
	
	@XStreamImplicit
	private List<UsuarioLDAPVO> list;
	
	
    public UsuarioLDAPVOList(){
    	list = new ArrayList<UsuarioLDAPVO>();
    }

    public void add(UsuarioLDAPVO p){
        list.add(p);
    }
    public List<UsuarioLDAPVO> getList(){
    	return list;
    }
}