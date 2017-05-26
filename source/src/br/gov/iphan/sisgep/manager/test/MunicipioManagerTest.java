package br.gov.iphan.sisgep.manager.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.gov.iphan.sisgep.entity.corp.Municipio;
import br.gov.iphan.sisgep.entity.corp.Uf;
import br.gov.iphan.sisgep.manager.MunicipioManager;

public class MunicipioManagerTest {

	@Test
	public final void testConsultarMunicipioPorNome() {
		Municipio municipio = new Municipio();
		municipio.setNomMunicipio("BRASILIA");
		Uf uf = new Uf();
		uf.setId(new Long(7));
		municipio.setCodUf(uf);
		
		MunicipioManager municipioManager = new MunicipioManager();
		municipioManager.consultarMunicipioPorNome(municipio);

	}

}
