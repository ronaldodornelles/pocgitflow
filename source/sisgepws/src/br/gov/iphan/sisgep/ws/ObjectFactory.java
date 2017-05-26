
package br.gov.iphan.sisgep.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.iphan.sisgep.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SQLException_QNAME = new QName("http://sql.java", "sQLException");
    private final static QName _AlimentadosPANomeAlimentado_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeAlimentado");
    private final static QName _AlimentadosPACodVinculoServidor_QNAME = new QName("http://tipo.servico.wssiapenet", "codVinculoServidor");
    private final static QName _AlimentadosPANomeVinculoServidor_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeVinculoServidor");
    private final static QName _DadosBancariosCodOrgao_QNAME = new QName("http://tipo.servico.wssiapenet", "codOrgao");
    private final static QName _DadosBancariosBanco_QNAME = new QName("http://tipo.servico.wssiapenet", "banco");
    private final static QName _DadosBancariosContaCorrente_QNAME = new QName("http://tipo.servico.wssiapenet", "contaCorrente");
    private final static QName _DadosBancariosMatricula_QNAME = new QName("http://tipo.servico.wssiapenet", "matricula");
    private final static QName _DadosBancariosAgencia_QNAME = new QName("http://tipo.servico.wssiapenet", "agencia");
    private final static QName _VagasOrgaoFuncoesOrgao_QNAME = new QName("http://tipo.servico.wssiapenet", "funcoesOrgao");
    private final static QName _VagasOrgaoQuantVagaFuncaoLivre_QNAME = new QName("http://tipo.servico.wssiapenet", "quantVagaFuncaoLivre");
    private final static QName _VagasOrgaoQuantVagaFuncaoOcupada_QNAME = new QName("http://tipo.servico.wssiapenet", "quantVagaFuncaoOcupada");
    private final static QName _TipoParticipacaoComissoesNome_QNAME = new QName("http://entidade.wssiapenet", "nome");
    private final static QName _TipoParticipacaoComissoesCodigo_QNAME = new QName("http://entidade.wssiapenet", "codigo");
    private final static QName _FormacaoAcademicaInstituicao_QNAME = new QName("http://entidade.wssiapenet", "instituicao");
    private final static QName _FormacaoAcademicaDataConclusao_QNAME = new QName("http://entidade.wssiapenet", "dataConclusao");
    private final static QName _FormacaoAcademicaSituacao_QNAME = new QName("http://entidade.wssiapenet", "situacao");
    private final static QName _FormacaoAcademicaNivelEscolaridade_QNAME = new QName("http://entidade.wssiapenet", "nivelEscolaridade");
    private final static QName _FormacaoAcademicaCurso_QNAME = new QName("http://entidade.wssiapenet", "curso");
    private final static QName _FormacaoAcademicaIdentificUnica_QNAME = new QName("http://entidade.wssiapenet", "identificUnica");
    private final static QName _PensaoRecebidaNomeParentesco_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeParentesco");
    private final static QName _PensaoRecebidaOrgao_QNAME = new QName("http://tipo.servico.wssiapenet", "orgao");
    private final static QName _PensaoRecebidaNomeInstituidor_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeInstituidor");
    private final static QName _PensaoRecebidaConta_QNAME = new QName("http://tipo.servico.wssiapenet", "conta");
    private final static QName _PensaoRecebidaNaturezaPensao_QNAME = new QName("http://tipo.servico.wssiapenet", "naturezaPensao");
    private final static QName _PensaoRecebidaNomeRepresentanteLegal_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeRepresentanteLegal");
    private final static QName _PensaoRecebidaTipoPensao_QNAME = new QName("http://tipo.servico.wssiapenet", "tipoPensao");
    private final static QName _PensaoRecebidaCodParentesco_QNAME = new QName("http://tipo.servico.wssiapenet", "codParentesco");
    private final static QName _PensaoRecebidaCpfIntituidor_QNAME = new QName("http://tipo.servico.wssiapenet", "cpfIntituidor");
    private final static QName _PensaoRecebidaArrayFichaFinanceira_QNAME = new QName("http://tipo.servico.wssiapenet", "arrayFichaFinanceira");
    private final static QName _PensaoRecebidaNomeTipoPensao_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeTipoPensao");
    private final static QName _PensaoRecebidaCpfRepresentanteLegal_QNAME = new QName("http://tipo.servico.wssiapenet", "cpfRepresentanteLegal");
    private final static QName _PensaoRecebidaCotaPensao_QNAME = new QName("http://tipo.servico.wssiapenet", "cotaPensao");
    private final static QName _DadosSICAJStatusAcaoTabela_QNAME = new QName("http://tipo.servico.wssiapenet", "statusAcaoTabela");
    private final static QName _DadosSICAJStatusAcaoSICAJ_QNAME = new QName("http://tipo.servico.wssiapenet", "statusAcaoSICAJ");
    private final static QName _DadosSICAJUfAcao_QNAME = new QName("http://tipo.servico.wssiapenet", "ufAcao");
    private final static QName _DadosSICAJNumAcao_QNAME = new QName("http://tipo.servico.wssiapenet", "numAcao");
    private final static QName _DadosSICAJDataAjuizamento_QNAME = new QName("http://tipo.servico.wssiapenet", "dataAjuizamento");
    private final static QName _DadosSICAJDataTransitoJulgamento_QNAME = new QName("http://tipo.servico.wssiapenet", "dataTransitoJulgamento");
    private final static QName _DadosSICAJIndicadorExclusao_QNAME = new QName("http://tipo.servico.wssiapenet", "indicadorExclusao");
    private final static QName _DadosSICAJCodAcao_QNAME = new QName("http://tipo.servico.wssiapenet", "codAcao");
    private final static QName _DadosSICAJValorBeneficiarioAcao_QNAME = new QName("http://tipo.servico.wssiapenet", "valorBeneficiarioAcao");
    private final static QName _DadosSICAJIndicadorSituacaoAcao_QNAME = new QName("http://tipo.servico.wssiapenet", "indicadorSituacaoAcao");
    private final static QName _TotalVagasOrgaoCodNatJuridica_QNAME = new QName("http://tipo.servico.wssiapenet", "codNatJuridica");
    private final static QName _TotalVagasOrgaoNomeNatJuridica_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeNatJuridica");
    private final static QName _TotalVagasOrgaoVagasPorOrgao_QNAME = new QName("http://tipo.servico.wssiapenet", "vagasPorOrgao");
    private final static QName _ArrayDadosAfastamentoDadosAfastamentoPorMatricula_QNAME = new QName("http://tipo.servico.wssiapenet", "dadosAfastamentoPorMatricula");
    private final static QName _ArrayDadosAfastamentoDadosAfastamentoPorCPF_QNAME = new QName("http://tipo.servico.wssiapenet", "dadosAfastamentoPorCPF");
    private final static QName _ArrayDadosRepresentanteLegalDadosRepresentanteLegal_QNAME = new QName("http://tipo.servico.wssiapenet", "dadosRepresentanteLegal");
    private final static QName _DadosOcorrenciasCodOcorrencia_QNAME = new QName("http://tipo.servico.wssiapenet", "codOcorrencia");
    private final static QName _DadosOcorrenciasDataFim_QNAME = new QName("http://tipo.servico.wssiapenet", "dataFim");
    private final static QName _DadosOcorrenciasDataIni_QNAME = new QName("http://tipo.servico.wssiapenet", "dataIni");
    private final static QName _DadosOcorrenciasDescOcorrencia_QNAME = new QName("http://tipo.servico.wssiapenet", "descOcorrencia");
    private final static QName _CursoCargaHoraria_QNAME = new QName("http://entidade.wssiapenet", "cargaHoraria");
    private final static QName _CursoNomeCurso_QNAME = new QName("http://entidade.wssiapenet", "nomeCurso");
    private final static QName _CursoArea_QNAME = new QName("http://entidade.wssiapenet", "area");
    private final static QName _CursoCodCurso_QNAME = new QName("http://entidade.wssiapenet", "codCurso");
    private final static QName _CursoTipoEvento_QNAME = new QName("http://entidade.wssiapenet", "tipoEvento");
    private final static QName _DadosAfastamentoPorMatriculaGrMatricula_QNAME = new QName("http://tipo.servico.wssiapenet", "grMatricula");
    private final static QName _DadosAfastamentoPorMatriculaOcorrencias_QNAME = new QName("http://tipo.servico.wssiapenet", "ocorrencias");
    private final static QName _DadosAfastamentoPorMatriculaReclusao_QNAME = new QName("http://tipo.servico.wssiapenet", "reclusao");
    private final static QName _DadosAfastamentoPorMatriculaFerias_QNAME = new QName("http://tipo.servico.wssiapenet", "ferias");
    private final static QName _DadosAfastamentoPorMatriculaLpa_QNAME = new QName("http://tipo.servico.wssiapenet", "lpa");
    private final static QName _ArrayDadosFinanceirosDadosFinanceiros_QNAME = new QName("http://tipo.servico.wssiapenet", "dadosFinanceiros");
    private final static QName _ArrayDadosFinanceirosMesAnoPagamento_QNAME = new QName("http://tipo.servico.wssiapenet", "mesAnoPagamento");
    private final static QName _DadosEnderecoResidencialUf_QNAME = new QName("http://tipo.servico.wssiapenet", "uf");
    private final static QName _DadosEnderecoResidencialComplemento_QNAME = new QName("http://tipo.servico.wssiapenet", "complemento");
    private final static QName _DadosEnderecoResidencialNumero_QNAME = new QName("http://tipo.servico.wssiapenet", "numero");
    private final static QName _DadosEnderecoResidencialBairro_QNAME = new QName("http://tipo.servico.wssiapenet", "bairro");
    private final static QName _DadosEnderecoResidencialLogradouro_QNAME = new QName("http://tipo.servico.wssiapenet", "logradouro");
    private final static QName _DadosEnderecoResidencialNumTelefone_QNAME = new QName("http://tipo.servico.wssiapenet", "numTelefone");
    private final static QName _DadosEnderecoResidencialDddTelefone_QNAME = new QName("http://tipo.servico.wssiapenet", "dddTelefone");
    private final static QName _DadosEnderecoResidencialCep_QNAME = new QName("http://tipo.servico.wssiapenet", "cep");
    private final static QName _DadosEnderecoResidencialCodMunicipio_QNAME = new QName("http://tipo.servico.wssiapenet", "codMunicipio");
    private final static QName _DadosEnderecoResidencialNomeMunicipio_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeMunicipio");
    private final static QName _ArrayDadosFuncionaisDadosFuncionais_QNAME = new QName("http://tipo.servico.wssiapenet", "dadosFuncionais");
    private final static QName _DadosRepresentanteLegalCpf_QNAME = new QName("http://tipo.servico.wssiapenet", "cpf");
    private final static QName _DadosRepresentanteLegalNome_QNAME = new QName("http://tipo.servico.wssiapenet", "nome");
    private final static QName _DadosTitulacaoCodMatricula_QNAME = new QName("http://tipo.servico.wssiapenet", "codMatricula");
    private final static QName _DadosTitulacaoCodTitulacao_QNAME = new QName("http://tipo.servico.wssiapenet", "codTitulacao");
    private final static QName _DadosTitulacaoNomeTitulacao_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeTitulacao");
    private final static QName _DadosDocumentacaoUfCarteiraTrabalho_QNAME = new QName("http://tipo.servico.wssiapenet", "ufCarteiraTrabalho");
    private final static QName _DadosDocumentacaoNumeroCarteiraMotorista_QNAME = new QName("http://tipo.servico.wssiapenet", "numeroCarteiraMotorista");
    private final static QName _DadosDocumentacaoSerieCarteiraTrabalho_QNAME = new QName("http://tipo.servico.wssiapenet", "serieCarteiraTrabalho");
    private final static QName _DadosDocumentacaoZonaTituloEleitor_QNAME = new QName("http://tipo.servico.wssiapenet", "zonaTituloEleitor");
    private final static QName _DadosDocumentacaoDataCarteiraIdentidade_QNAME = new QName("http://tipo.servico.wssiapenet", "dataCarteiraIdentidade");
    private final static QName _DadosDocumentacaoRegistroCarteiraMotorista_QNAME = new QName("http://tipo.servico.wssiapenet", "registroCarteiraMotorista");
    private final static QName _DadosDocumentacaoDataValidadeCarteiraMotorista_QNAME = new QName("http://tipo.servico.wssiapenet", "dataValidadeCarteiraMotorista");
    private final static QName _DadosDocumentacaoPassaporte_QNAME = new QName("http://tipo.servico.wssiapenet", "passaporte");
    private final static QName _DadosDocumentacaoDataComprovanteMilitar_QNAME = new QName("http://tipo.servico.wssiapenet", "dataComprovanteMilitar");
    private final static QName _DadosDocumentacaoDataTituloEleitor_QNAME = new QName("http://tipo.servico.wssiapenet", "dataTituloEleitor");
    private final static QName _DadosDocumentacaoNumeroComprovanteMilitar_QNAME = new QName("http://tipo.servico.wssiapenet", "numeroComprovanteMilitar");
    private final static QName _DadosDocumentacaoUfCarteiraIdentidade_QNAME = new QName("http://tipo.servico.wssiapenet", "ufCarteiraIdentidade");
    private final static QName _DadosDocumentacaoUfCarteiraMotorista_QNAME = new QName("http://tipo.servico.wssiapenet", "ufCarteiraMotorista");
    private final static QName _DadosDocumentacaoSecaoTituloEleitor_QNAME = new QName("http://tipo.servico.wssiapenet", "secaoTituloEleitor");
    private final static QName _DadosDocumentacaoNumeroCarteiraIdentidade_QNAME = new QName("http://tipo.servico.wssiapenet", "numeroCarteiraIdentidade");
    private final static QName _DadosDocumentacaoSerieComprovanteMilitar_QNAME = new QName("http://tipo.servico.wssiapenet", "serieComprovanteMilitar");
    private final static QName _DadosDocumentacaoDataPrimExpedCarteiraMotorista_QNAME = new QName("http://tipo.servico.wssiapenet", "dataPrimExpedCarteiraMotorista");
    private final static QName _DadosDocumentacaoOrgaoComprovanteMilitar_QNAME = new QName("http://tipo.servico.wssiapenet", "orgaoComprovanteMilitar");
    private final static QName _DadosDocumentacaoCategoriaCarteiraMotorista_QNAME = new QName("http://tipo.servico.wssiapenet", "categoriaCarteiraMotorista");
    private final static QName _DadosDocumentacaoNumCPF_QNAME = new QName("http://tipo.servico.wssiapenet", "numCPF");
    private final static QName _DadosDocumentacaoDataExpedicaoCarteiraMotorista_QNAME = new QName("http://tipo.servico.wssiapenet", "dataExpedicaoCarteiraMotorista");
    private final static QName _DadosDocumentacaoOrgaoCarteiraIdentidade_QNAME = new QName("http://tipo.servico.wssiapenet", "orgaoCarteiraIdentidade");
    private final static QName _DadosDocumentacaoUfTituloEleitor_QNAME = new QName("http://tipo.servico.wssiapenet", "ufTituloEleitor");
    private final static QName _DadosDocumentacaoNumPisPasep_QNAME = new QName("http://tipo.servico.wssiapenet", "numPisPasep");
    private final static QName _DadosDocumentacaoNumeroCarteiraTrabalho_QNAME = new QName("http://tipo.servico.wssiapenet", "numeroCarteiraTrabalho");
    private final static QName _DadosDocumentacaoNumeroTituloEleitor_QNAME = new QName("http://tipo.servico.wssiapenet", "numeroTituloEleitor");
    private final static QName _DadosFuncionaisDataIniOcorrPSS_QNAME = new QName("http://tipo.servico.wssiapenet", "dataIniOcorrPSS");
    private final static QName _DadosFuncionaisNomeOrgao_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeOrgao");
    private final static QName _DadosFuncionaisNomeClasse_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeClasse");
    private final static QName _DadosFuncionaisCodUpag_QNAME = new QName("http://tipo.servico.wssiapenet", "codUpag");
    private final static QName _DadosFuncionaisNomeUorgLotacao_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeUorgLotacao");
    private final static QName _DadosFuncionaisNomeOcorrIngressoServPublico_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeOcorrIngressoServPublico");
    private final static QName _DadosFuncionaisDataIngressoFuncao_QNAME = new QName("http://tipo.servico.wssiapenet", "dataIngressoFuncao");
    private final static QName _DadosFuncionaisCodOcorrAposentadoria_QNAME = new QName("http://tipo.servico.wssiapenet", "codOcorrAposentadoria");
    private final static QName _DadosFuncionaisCodSitFuncional_QNAME = new QName("http://tipo.servico.wssiapenet", "codSitFuncional");
    private final static QName _DadosFuncionaisDataOcorrIngressoServPublico_QNAME = new QName("http://tipo.servico.wssiapenet", "dataOcorrIngressoServPublico");
    private final static QName _DadosFuncionaisDataIngressoNovaFuncao_QNAME = new QName("http://tipo.servico.wssiapenet", "dataIngressoNovaFuncao");
    private final static QName _DadosFuncionaisTipoValeAR_QNAME = new QName("http://tipo.servico.wssiapenet", "tipoValeAR");
    private final static QName _DadosFuncionaisNomeNovaFuncao_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeNovaFuncao");
    private final static QName _DadosFuncionaisNomeOcorrExclusao_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeOcorrExclusao");
    private final static QName _DadosFuncionaisCodOcorrExclusao_QNAME = new QName("http://tipo.servico.wssiapenet", "codOcorrExclusao");
    private final static QName _DadosFuncionaisEmailServidor_QNAME = new QName("http://tipo.servico.wssiapenet", "emailServidor");
    private final static QName _DadosFuncionaisNomeAtivFun_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeAtivFun");
    private final static QName _DadosFuncionaisSiglaRegimeJuridico_QNAME = new QName("http://tipo.servico.wssiapenet", "siglaRegimeJuridico");
    private final static QName _DadosFuncionaisCodUorgLotacao_QNAME = new QName("http://tipo.servico.wssiapenet", "codUorgLotacao");
    private final static QName _DadosFuncionaisDataOcorrExclusao_QNAME = new QName("http://tipo.servico.wssiapenet", "dataOcorrExclusao");
    private final static QName _DadosFuncionaisCodValeTransporte_QNAME = new QName("http://tipo.servico.wssiapenet", "codValeTransporte");
    private final static QName _DadosFuncionaisNomeChefeUorg_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeChefeUorg");
    private final static QName _DadosFuncionaisNomeRegimeJuridico_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeRegimeJuridico");
    private final static QName _DadosFuncionaisCodOcorrPSS_QNAME = new QName("http://tipo.servico.wssiapenet", "codOcorrPSS");
    private final static QName _DadosFuncionaisSiglaUpag_QNAME = new QName("http://tipo.servico.wssiapenet", "siglaUpag");
    private final static QName _DadosFuncionaisCodFuncao_QNAME = new QName("http://tipo.servico.wssiapenet", "codFuncao");
    private final static QName _DadosFuncionaisCodOcorrIsencaoIR_QNAME = new QName("http://tipo.servico.wssiapenet", "codOcorrIsencaoIR");
    private final static QName _DadosFuncionaisNomeOcorrIngressoOrgao_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeOcorrIngressoOrgao");
    private final static QName _DadosFuncionaisDataOcorrIngressoOrgao_QNAME = new QName("http://tipo.servico.wssiapenet", "dataOcorrIngressoOrgao");
    private final static QName _DadosFuncionaisNomeOcorrPSS_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeOcorrPSS");
    private final static QName _DadosFuncionaisCodUorgExercicio_QNAME = new QName("http://tipo.servico.wssiapenet", "codUorgExercicio");
    private final static QName _DadosFuncionaisDataFimOcorrIsencaoIR_QNAME = new QName("http://tipo.servico.wssiapenet", "dataFimOcorrIsencaoIR");
    private final static QName _DadosFuncionaisPontuacaoDesempenho_QNAME = new QName("http://tipo.servico.wssiapenet", "pontuacaoDesempenho");
    private final static QName _DadosFuncionaisDataIniOcorrIsencaoIR_QNAME = new QName("http://tipo.servico.wssiapenet", "dataIniOcorrIsencaoIR");
    private final static QName _DadosFuncionaisPercentualTS_QNAME = new QName("http://tipo.servico.wssiapenet", "percentualTS");
    private final static QName _DadosFuncionaisCodAtivFun_QNAME = new QName("http://tipo.servico.wssiapenet", "codAtivFun");
    private final static QName _DadosFuncionaisNomeUorgExercicio_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeUorgExercicio");
    private final static QName _DadosFuncionaisIdentUnica_QNAME = new QName("http://tipo.servico.wssiapenet", "identUnica");
    private final static QName _DadosFuncionaisCodCargo_QNAME = new QName("http://tipo.servico.wssiapenet", "codCargo");
    private final static QName _DadosFuncionaisCodOcorrIngressoOrgao_QNAME = new QName("http://tipo.servico.wssiapenet", "codOcorrIngressoOrgao");
    private final static QName _DadosFuncionaisCodPadrao_QNAME = new QName("http://tipo.servico.wssiapenet", "codPadrao");
    private final static QName _DadosFuncionaisCodJornada_QNAME = new QName("http://tipo.servico.wssiapenet", "codJornada");
    private final static QName _DadosFuncionaisDataFimValeAR_QNAME = new QName("http://tipo.servico.wssiapenet", "dataFimValeAR");
    private final static QName _DadosFuncionaisNomeJornada_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeJornada");
    private final static QName _DadosFuncionaisSiglaUorgExercicio_QNAME = new QName("http://tipo.servico.wssiapenet", "siglaUorgExercicio");
    private final static QName _DadosFuncionaisCodNovaFuncao_QNAME = new QName("http://tipo.servico.wssiapenet", "codNovaFuncao");
    private final static QName _DadosFuncionaisSiglaUorgLotacao_QNAME = new QName("http://tipo.servico.wssiapenet", "siglaUorgLotacao");
    private final static QName _DadosFuncionaisEmailChefiaImediata_QNAME = new QName("http://tipo.servico.wssiapenet", "emailChefiaImediata");
    private final static QName _DadosFuncionaisNomeCargo_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeCargo");
    private final static QName _DadosFuncionaisValorValeTransporte_QNAME = new QName("http://tipo.servico.wssiapenet", "valorValeTransporte");
    private final static QName _DadosFuncionaisNomeOcorrIsencaoIR_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeOcorrIsencaoIR");
    private final static QName _DadosFuncionaisNomeFuncao_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeFuncao");
    private final static QName _DadosFuncionaisCodOcorrIngressoServPublico_QNAME = new QName("http://tipo.servico.wssiapenet", "codOcorrIngressoServPublico");
    private final static QName _DadosFuncionaisDataFimOcorrPSS_QNAME = new QName("http://tipo.servico.wssiapenet", "dataFimOcorrPSS");
    private final static QName _DadosFuncionaisDataOcorrAposentadoria_QNAME = new QName("http://tipo.servico.wssiapenet", "dataOcorrAposentadoria");
    private final static QName _DadosFuncionaisSiglaOrgao_QNAME = new QName("http://tipo.servico.wssiapenet", "siglaOrgao");
    private final static QName _DadosFuncionaisMatriculaSiape_QNAME = new QName("http://tipo.servico.wssiapenet", "matriculaSiape");
    private final static QName _DadosFuncionaisNomeUpag_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeUpag");
    private final static QName _DadosFuncionaisCodClasse_QNAME = new QName("http://tipo.servico.wssiapenet", "codClasse");
    private final static QName _DadosFuncionaisNomeSitFuncional_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeSitFuncional");
    private final static QName _DadosFuncionaisCpfChefiaImediata_QNAME = new QName("http://tipo.servico.wssiapenet", "cpfChefiaImediata");
    private final static QName _DadosFuncionaisDataIniValeAR_QNAME = new QName("http://tipo.servico.wssiapenet", "dataIniValeAR");
    private final static QName _DadosFuncionaisNomeOcorrAposentadoria_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeOcorrAposentadoria");
    private final static QName _ArrayDadosPADadosPA_QNAME = new QName("http://tipo.servico.wssiapenet", "dadosPA");
    private final static QName _PensionistaMatriculaBeneficiario_QNAME = new QName("http://entidade.wssiapenet", "matriculaBeneficiario");
    private final static QName _PensionistaCep_QNAME = new QName("http://entidade.wssiapenet", "cep");
    private final static QName _PensionistaSexo_QNAME = new QName("http://entidade.wssiapenet", "sexo");
    private final static QName _PensionistaCidade_QNAME = new QName("http://entidade.wssiapenet", "cidade");
    private final static QName _PensionistaFaixaEtaria_QNAME = new QName("http://entidade.wssiapenet", "faixaEtaria");
    private final static QName _PensionistaOrgao_QNAME = new QName("http://entidade.wssiapenet", "orgao");
    private final static QName _PensionistaUf_QNAME = new QName("http://entidade.wssiapenet", "uf");
    private final static QName _PensionistaBairro_QNAME = new QName("http://entidade.wssiapenet", "bairro");
    private final static QName _PensionistaLogradouro_QNAME = new QName("http://entidade.wssiapenet", "logradouro");
    private final static QName _PensionistaUpag_QNAME = new QName("http://entidade.wssiapenet", "upag");
    private final static QName _PensionistaNumero_QNAME = new QName("http://entidade.wssiapenet", "numero");
    private final static QName _DadosPANomeBeneficiario_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeBeneficiario");
    private final static QName _DadosPAContaBeneficiario_QNAME = new QName("http://tipo.servico.wssiapenet", "contaBeneficiario");
    private final static QName _DadosPACpfBeneficiario_QNAME = new QName("http://tipo.servico.wssiapenet", "cpfBeneficiario");
    private final static QName _DadosPAValorUltimaPensao_QNAME = new QName("http://tipo.servico.wssiapenet", "valorUltimaPensao");
    private final static QName _DadosPAArrayAlimentadosPA_QNAME = new QName("http://tipo.servico.wssiapenet", "arrayAlimentadosPA");
    private final static QName _DadosPAAgenciaBeneficiario_QNAME = new QName("http://tipo.servico.wssiapenet", "agenciaBeneficiario");
    private final static QName _DadosPABancoBeneficiario_QNAME = new QName("http://tipo.servico.wssiapenet", "bancoBeneficiario");
    private final static QName _DadosUorgComplementoUorg_QNAME = new QName("http://tipo.servico.wssiapenet", "complementoUorg");
    private final static QName _DadosUorgNomeUorg_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeUorg");
    private final static QName _DadosUorgNomeMunicipioUorg_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeMunicipioUorg");
    private final static QName _DadosUorgCepUorg_QNAME = new QName("http://tipo.servico.wssiapenet", "cepUorg");
    private final static QName _DadosUorgEmailUorg_QNAME = new QName("http://tipo.servico.wssiapenet", "emailUorg");
    private final static QName _DadosUorgLogradouroUorg_QNAME = new QName("http://tipo.servico.wssiapenet", "logradouroUorg");
    private final static QName _DadosUorgCodMunicipioUorg_QNAME = new QName("http://tipo.servico.wssiapenet", "codMunicipioUorg");
    private final static QName _DadosUorgUfUorg_QNAME = new QName("http://tipo.servico.wssiapenet", "ufUorg");
    private final static QName _DadosUorgBairroUorg_QNAME = new QName("http://tipo.servico.wssiapenet", "bairroUorg");
    private final static QName _DadosUorgSiglaUorg_QNAME = new QName("http://tipo.servico.wssiapenet", "siglaUorg");
    private final static QName _DadosUorgNumFaxUorg_QNAME = new QName("http://tipo.servico.wssiapenet", "numFaxUorg");
    private final static QName _DadosUorgCodOrgaoUorg_QNAME = new QName("http://tipo.servico.wssiapenet", "codOrgaoUorg");
    private final static QName _DadosUorgEndUorg_QNAME = new QName("http://tipo.servico.wssiapenet", "endUorg");
    private final static QName _DadosUorgNumTelefoneUorg_QNAME = new QName("http://tipo.servico.wssiapenet", "numTelefoneUorg");
    private final static QName _DadosUorgNumeroUorg_QNAME = new QName("http://tipo.servico.wssiapenet", "numeroUorg");
    private final static QName _ExperienciaProfissionalDataInicio_QNAME = new QName("http://entidade.wssiapenet", "dataInicio");
    private final static QName _ExperienciaProfissionalCargo_QNAME = new QName("http://entidade.wssiapenet", "cargo");
    private final static QName _ExperienciaProfissionalProjeto_QNAME = new QName("http://entidade.wssiapenet", "projeto");
    private final static QName _ExperienciaProfissionalTipoAtuacao_QNAME = new QName("http://entidade.wssiapenet", "tipoAtuacao");
    private final static QName _ExperienciaProfissionalDataFim_QNAME = new QName("http://entidade.wssiapenet", "dataFim");
    private final static QName _ExperienciaProfissionalNomeOrgaoEmpresa_QNAME = new QName("http://entidade.wssiapenet", "nomeOrgaoEmpresa");
    private final static QName _DadosDependentesCodGrauParentesco_QNAME = new QName("http://tipo.servico.wssiapenet", "codGrauParentesco");
    private final static QName _DadosDependentesArrayBeneficios_QNAME = new QName("http://tipo.servico.wssiapenet", "arrayBeneficios");
    private final static QName _DadosDependentesNomeGrauParentesco_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeGrauParentesco");
    private final static QName _DadosDependentesCodCondicao_QNAME = new QName("http://tipo.servico.wssiapenet", "codCondicao");
    private final static QName _DadosDependentesNomeCondicao_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeCondicao");
    private final static QName _UorgDataUltimaTransacao_QNAME = new QName("http://entidade.wssiapenet", "dataUltimaTransacao");
    private final static QName _DadosEscolaresCodEscolaridade_QNAME = new QName("http://tipo.servico.wssiapenet", "codEscolaridade");
    private final static QName _DadosEscolaresArrayCursos_QNAME = new QName("http://tipo.servico.wssiapenet", "arrayCursos");
    private final static QName _DadosEscolaresNomeEscolaridade_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeEscolaridade");
    private final static QName _DadosEscolaresArrayTitulacao_QNAME = new QName("http://tipo.servico.wssiapenet", "arrayTitulacao");
    private final static QName _ArrayDadosBancariosDadosBancarios_QNAME = new QName("http://tipo.servico.wssiapenet", "dadosBancarios");
    private final static QName _ArrayPensoesInstituidasPensoesInstituidas_QNAME = new QName("http://tipo.servico.wssiapenet", "pensoesInstituidas");
    private final static QName _BeneficioCodBeneficio_QNAME = new QName("http://tipo.servico.wssiapenet", "codBeneficio");
    private final static QName _BeneficioDataInicio_QNAME = new QName("http://tipo.servico.wssiapenet", "dataInicio");
    private final static QName _BeneficioNomeBeneficio_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeBeneficio");
    private final static QName _UorgDadosCodUorgPai_QNAME = new QName("http://entidade.wssiapenet", "codUorgPai");
    private final static QName _UorgDadosCodOrgao_QNAME = new QName("http://entidade.wssiapenet", "codOrgao");
    private final static QName _UorgDadosNomeAreaAtuaUorg_QNAME = new QName("http://entidade.wssiapenet", "nomeAreaAtuaUorg");
    private final static QName _UorgDadosCodUorg_QNAME = new QName("http://entidade.wssiapenet", "codUorg");
    private final static QName _UorgDadosIdentificacaoAntecedentesUorg_QNAME = new QName("http://entidade.wssiapenet", "identificacaoAntecedentesUorg");
    private final static QName _UorgDadosCodSiorg_QNAME = new QName("http://entidade.wssiapenet", "codSiorg");
    private final static QName _UorgDadosNomeMunicipio_QNAME = new QName("http://entidade.wssiapenet", "nomeMunicipio");
    private final static QName _UorgDadosDataCriacaoUorg_QNAME = new QName("http://entidade.wssiapenet", "dataCriacaoUorg");
    private final static QName _UorgDadosCnpjLocalizador_QNAME = new QName("http://entidade.wssiapenet", "cnpjLocalizador");
    private final static QName _UorgDadosIndicadorUorgDestIntegracao_QNAME = new QName("http://entidade.wssiapenet", "indicadorUorgDestIntegracao");
    private final static QName _UorgDadosSiglaOrgao_QNAME = new QName("http://entidade.wssiapenet", "siglaOrgao");
    private final static QName _UorgDadosCodUnidadeSiafi_QNAME = new QName("http://entidade.wssiapenet", "codUnidadeSiafi");
    private final static QName _UorgDadosSiglaUorg_QNAME = new QName("http://entidade.wssiapenet", "siglaUorg");
    private final static QName _UorgDadosCodUorgPagadora_QNAME = new QName("http://entidade.wssiapenet", "codUorgPagadora");
    private final static QName _UorgDadosIndicadorUorgRegimenta_QNAME = new QName("http://entidade.wssiapenet", "indicadorUorgRegimenta");
    private final static QName _UorgDadosIndicadorUorgAdministrativa_QNAME = new QName("http://entidade.wssiapenet", "indicadorUorgAdministrativa");
    private final static QName _UorgDadosCodAreaAtuaUorg_QNAME = new QName("http://entidade.wssiapenet", "codAreaAtuaUorg");
    private final static QName _UorgDadosNomeUorg_QNAME = new QName("http://entidade.wssiapenet", "nomeUorg");
    private final static QName _UorgDadosCnpjUpag_QNAME = new QName("http://entidade.wssiapenet", "cnpjUpag");
    private final static QName _UorgDadosIndicadorUorgPessoal_QNAME = new QName("http://entidade.wssiapenet", "indicadorUorgPessoal");
    private final static QName _UorgDadosCodMunicipio_QNAME = new QName("http://entidade.wssiapenet", "codMunicipio");
    private final static QName _UorgDadosCodSiorgOrgao_QNAME = new QName("http://entidade.wssiapenet", "codSiorgOrgao");
    private final static QName _UorgDadosDiplomaLegalCriacaoUorg_QNAME = new QName("http://entidade.wssiapenet", "diplomaLegalCriacaoUorg");
    private final static QName _UorgDadosIndicadorUorgUpag_QNAME = new QName("http://entidade.wssiapenet", "indicadorUorgUpag");
    private final static QName _UorgDadosCodUorgPessoal_QNAME = new QName("http://entidade.wssiapenet", "codUorgPessoal");
    private final static QName _UorgDadosNomeExtendido_QNAME = new QName("http://entidade.wssiapenet", "nomeExtendido");
    private final static QName _UorgDadosNomeUorgMaiusculo_QNAME = new QName("http://entidade.wssiapenet", "nomeUorgMaiusculo");
    private final static QName _SQLExceptionSQLState_QNAME = new QName("http://sql.java", "SQLState");
    private final static QName _SQLExceptionNextException_QNAME = new QName("http://sql.java", "nextException");
    private final static QName _ServidorCpf_QNAME = new QName("http://entidade.wssiapenet", "cpf");
    private final static QName _DadosPessoaisNomeMunicipNasc_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeMunicipNasc");
    private final static QName _DadosPessoaisNomeSexo_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeSexo");
    private final static QName _DadosPessoaisNomeCor_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeCor");
    private final static QName _DadosPessoaisCodNacionalidade_QNAME = new QName("http://tipo.servico.wssiapenet", "codNacionalidade");
    private final static QName _DadosPessoaisNomeNacionalidade_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeNacionalidade");
    private final static QName _DadosPessoaisCodCor_QNAME = new QName("http://tipo.servico.wssiapenet", "codCor");
    private final static QName _DadosPessoaisGrupoSanguineo_QNAME = new QName("http://tipo.servico.wssiapenet", "grupoSanguineo");
    private final static QName _DadosPessoaisDataChegBrasil_QNAME = new QName("http://tipo.servico.wssiapenet", "dataChegBrasil");
    private final static QName _DadosPessoaisNomeEstadoCivil_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeEstadoCivil");
    private final static QName _DadosPessoaisUfNascimento_QNAME = new QName("http://tipo.servico.wssiapenet", "ufNascimento");
    private final static QName _DadosPessoaisCodDefFisica_QNAME = new QName("http://tipo.servico.wssiapenet", "codDefFisica");
    private final static QName _DadosPessoaisNomePai_QNAME = new QName("http://tipo.servico.wssiapenet", "nomePai");
    private final static QName _DadosPessoaisCodSexo_QNAME = new QName("http://tipo.servico.wssiapenet", "codSexo");
    private final static QName _DadosPessoaisDataNascimento_QNAME = new QName("http://tipo.servico.wssiapenet", "dataNascimento");
    private final static QName _DadosPessoaisCodEstadoCivil_QNAME = new QName("http://tipo.servico.wssiapenet", "codEstadoCivil");
    private final static QName _DadosPessoaisNomeDefFisica_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeDefFisica");
    private final static QName _DadosPessoaisNomeMae_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeMae");
    private final static QName _DadosPessoaisNomePais_QNAME = new QName("http://tipo.servico.wssiapenet", "nomePais");
    private final static QName _ArrayFichaFinanceiraData_QNAME = new QName("http://tipo.servico.wssiapenet", "data");
    private final static QName _ArrayFichaFinanceiraFichaFinaceiraBeneficiario_QNAME = new QName("http://tipo.servico.wssiapenet", "fichaFinaceiraBeneficiario");
    private final static QName _DadosCursoNomeCurso_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeCurso");
    private final static QName _DadosCursoCodCurso_QNAME = new QName("http://tipo.servico.wssiapenet", "codCurso");
    private final static QName _ArrayDadosSICAJDadosSICAJ_QNAME = new QName("http://tipo.servico.wssiapenet", "dadosSICAJ");
    private final static QName _ArrayPensaoRecebidaPensaoRecebida_QNAME = new QName("http://tipo.servico.wssiapenet", "pensaoRecebida");
    private final static QName _PensoesInstituidasOrgaoPensionista_QNAME = new QName("http://tipo.servico.wssiapenet", "orgaoPensionista");
    private final static QName _PensoesInstituidasNomePensionista_QNAME = new QName("http://tipo.servico.wssiapenet", "nomePensionista");
    private final static QName _PensoesInstituidasMatriculaPensionista_QNAME = new QName("http://tipo.servico.wssiapenet", "matriculaPensionista");
    private final static QName _PensoesInstituidasCpfPensionista_QNAME = new QName("http://tipo.servico.wssiapenet", "cpfPensionista");
    private final static QName _ArrayDadosDependentesDadosDependentes_QNAME = new QName("http://tipo.servico.wssiapenet", "dadosDependentes");
    private final static QName _DadosFinanceirosCodRubrica_QNAME = new QName("http://tipo.servico.wssiapenet", "codRubrica");
    private final static QName _DadosFinanceirosDataAnoMesRubrica_QNAME = new QName("http://tipo.servico.wssiapenet", "dataAnoMesRubrica");
    private final static QName _DadosFinanceirosIndicadorRD_QNAME = new QName("http://tipo.servico.wssiapenet", "indicadorRD");
    private final static QName _DadosFinanceirosPeRubrica_QNAME = new QName("http://tipo.servico.wssiapenet", "peRubrica");
    private final static QName _DadosFinanceirosValorRubrica_QNAME = new QName("http://tipo.servico.wssiapenet", "valorRubrica");
    private final static QName _DadosFinanceirosIndicadorMovSupl_QNAME = new QName("http://tipo.servico.wssiapenet", "indicadorMovSupl");
    private final static QName _DadosFinanceirosPzRubrica_QNAME = new QName("http://tipo.servico.wssiapenet", "pzRubrica");
    private final static QName _DadosFinanceirosNomeRubrica_QNAME = new QName("http://tipo.servico.wssiapenet", "nomeRubrica");
    private final static QName _DadosFinanceirosNumeroSeq_QNAME = new QName("http://tipo.servico.wssiapenet", "numeroSeq");
    private final static QName _ParticipacaoComissoesInfoAdicionais_QNAME = new QName("http://entidade.wssiapenet", "infoAdicionais");
    private final static QName _ParticipacaoComissoesTipoParticipacaoComissoes_QNAME = new QName("http://entidade.wssiapenet", "tipoParticipacaoComissoes");
    private final static QName _ParticipacaoComissoesTipoDesc_QNAME = new QName("http://entidade.wssiapenet", "tipoDesc");
    private final static QName _IdiomasIdiomasFala_QNAME = new QName("http://entidade.wssiapenet", "idiomasFala");
    private final static QName _IdiomasIdiomasLe_QNAME = new QName("http://entidade.wssiapenet", "idiomasLe");
    private final static QName _IdiomasIdiomasDesc_QNAME = new QName("http://entidade.wssiapenet", "idiomasDesc");
    private final static QName _IdiomasIdiomasEscreve_QNAME = new QName("http://entidade.wssiapenet", "idiomasEscreve");
    private final static QName _FichaFinaceiraBeneficiarioCodSistemaClassifCempFuncao_QNAME = new QName("http://tipo.servico.wssiapenet", "codSistemaClassifCempFuncao");
    private final static QName _FichaFinaceiraBeneficiarioCodigoAssunto_QNAME = new QName("http://tipo.servico.wssiapenet", "codigoAssunto");
    private final static QName _FichaFinaceiraBeneficiarioCodIdentCempFuncao_QNAME = new QName("http://tipo.servico.wssiapenet", "codIdentCempFuncao");
    private final static QName _ArrayDadosUorgUorgs_QNAME = new QName("http://tipo.servico.wssiapenet", "uorgs");
    private final static QName _DadosCurriculoListaFormacaoAcademica_QNAME = new QName("http://entidade.wssiapenet", "listaFormacaoAcademica");
    private final static QName _DadosCurriculoListaCurso_QNAME = new QName("http://entidade.wssiapenet", "listaCurso");
    private final static QName _DadosCurriculoListaIdiomas_QNAME = new QName("http://entidade.wssiapenet", "listaIdiomas");
    private final static QName _DadosCurriculoListaParticipacaoComissoes_QNAME = new QName("http://entidade.wssiapenet", "listaParticipacaoComissoes");
    private final static QName _DadosCurriculoListaExperienciaProfissional_QNAME = new QName("http://entidade.wssiapenet", "listaExperienciaProfissional");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.iphan.sisgep.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfDadosUorg }
     * 
     */
    public ArrayOfDadosUorg createArrayOfDadosUorg() {
        return new ArrayOfDadosUorg();
    }

    /**
     * Create an instance of {@link VagasOrgao }
     * 
     */
    public VagasOrgao createVagasOrgao() {
        return new VagasOrgao();
    }

    /**
     * Create an instance of {@link DadosBancarios }
     * 
     */
    public DadosBancarios createDadosBancarios() {
        return new DadosBancarios();
    }

    /**
     * Create an instance of {@link AlimentadosPA }
     * 
     */
    public AlimentadosPA createAlimentadosPA() {
        return new AlimentadosPA();
    }

    /**
     * Create an instance of {@link ArrayOfPensaoRecebida }
     * 
     */
    public ArrayOfPensaoRecebida createArrayOfPensaoRecebida() {
        return new ArrayOfPensaoRecebida();
    }

    /**
     * Create an instance of {@link TipoParticipacaoComissoes }
     * 
     */
    public TipoParticipacaoComissoes createTipoParticipacaoComissoes() {
        return new TipoParticipacaoComissoes();
    }

    /**
     * Create an instance of {@link ArrayOfParticipacaoComissoes }
     * 
     */
    public ArrayOfParticipacaoComissoes createArrayOfParticipacaoComissoes() {
        return new ArrayOfParticipacaoComissoes();
    }

    /**
     * Create an instance of {@link FormacaoAcademica }
     * 
     */
    public FormacaoAcademica createFormacaoAcademica() {
        return new FormacaoAcademica();
    }

    /**
     * Create an instance of {@link ArrayOfVagasOrgao }
     * 
     */
    public ArrayOfVagasOrgao createArrayOfVagasOrgao() {
        return new ArrayOfVagasOrgao();
    }

    /**
     * Create an instance of {@link PensaoRecebida }
     * 
     */
    public PensaoRecebida createPensaoRecebida() {
        return new PensaoRecebida();
    }

    /**
     * Create an instance of {@link TipoEvento }
     * 
     */
    public TipoEvento createTipoEvento() {
        return new TipoEvento();
    }

    /**
     * Create an instance of {@link TotalVagasOrgao }
     * 
     */
    public TotalVagasOrgao createTotalVagasOrgao() {
        return new TotalVagasOrgao();
    }

    /**
     * Create an instance of {@link DadosSICAJ }
     * 
     */
    public DadosSICAJ createDadosSICAJ() {
        return new DadosSICAJ();
    }

    /**
     * Create an instance of {@link IdiomasDesc }
     * 
     */
    public IdiomasDesc createIdiomasDesc() {
        return new IdiomasDesc();
    }

    /**
     * Create an instance of {@link ArrayOfDadosLpa }
     * 
     */
    public ArrayOfDadosLpa createArrayOfDadosLpa() {
        return new ArrayOfDadosLpa();
    }

    /**
     * Create an instance of {@link ArrayOfUorg }
     * 
     */
    public ArrayOfUorg createArrayOfUorg() {
        return new ArrayOfUorg();
    }

    /**
     * Create an instance of {@link ArrayDadosRepresentanteLegal }
     * 
     */
    public ArrayDadosRepresentanteLegal createArrayDadosRepresentanteLegal() {
        return new ArrayDadosRepresentanteLegal();
    }

    /**
     * Create an instance of {@link ArrayDadosAfastamento }
     * 
     */
    public ArrayDadosAfastamento createArrayDadosAfastamento() {
        return new ArrayDadosAfastamento();
    }

    /**
     * Create an instance of {@link IdiomasDominio }
     * 
     */
    public IdiomasDominio createIdiomasDominio() {
        return new IdiomasDominio();
    }

    /**
     * Create an instance of {@link Area }
     * 
     */
    public Area createArea() {
        return new Area();
    }

    /**
     * Create an instance of {@link ArrayOfFichaFinaceiraBeneficiario }
     * 
     */
    public ArrayOfFichaFinaceiraBeneficiario createArrayOfFichaFinaceiraBeneficiario() {
        return new ArrayOfFichaFinaceiraBeneficiario();
    }

    /**
     * Create an instance of {@link DadosOcorrencias }
     * 
     */
    public DadosOcorrencias createDadosOcorrencias() {
        return new DadosOcorrencias();
    }

    /**
     * Create an instance of {@link ArrayOfCurso }
     * 
     */
    public ArrayOfCurso createArrayOfCurso() {
        return new ArrayOfCurso();
    }

    /**
     * Create an instance of {@link Curso }
     * 
     */
    public Curso createCurso() {
        return new Curso();
    }

    /**
     * Create an instance of {@link ArrayOfDadosAfastamentoPorCpf }
     * 
     */
    public ArrayOfDadosAfastamentoPorCpf createArrayOfDadosAfastamentoPorCpf() {
        return new ArrayOfDadosAfastamentoPorCpf();
    }

    /**
     * Create an instance of {@link ArrayOfDadosOcorrencias }
     * 
     */
    public ArrayOfDadosOcorrencias createArrayOfDadosOcorrencias() {
        return new ArrayOfDadosOcorrencias();
    }

    /**
     * Create an instance of {@link DadosEnderecoResidencial }
     * 
     */
    public DadosEnderecoResidencial createDadosEnderecoResidencial() {
        return new DadosEnderecoResidencial();
    }

    /**
     * Create an instance of {@link ArrayDadosFinanceiros }
     * 
     */
    public ArrayDadosFinanceiros createArrayDadosFinanceiros() {
        return new ArrayDadosFinanceiros();
    }

    /**
     * Create an instance of {@link DadosAfastamentoPorMatricula }
     * 
     */
    public DadosAfastamentoPorMatricula createDadosAfastamentoPorMatricula() {
        return new DadosAfastamentoPorMatricula();
    }

    /**
     * Create an instance of {@link ArrayDadosFuncionais }
     * 
     */
    public ArrayDadosFuncionais createArrayDadosFuncionais() {
        return new ArrayDadosFuncionais();
    }

    /**
     * Create an instance of {@link DadosReclusao }
     * 
     */
    public DadosReclusao createDadosReclusao() {
        return new DadosReclusao();
    }

    /**
     * Create an instance of {@link ArrayOfDadosDependentes }
     * 
     */
    public ArrayOfDadosDependentes createArrayOfDadosDependentes() {
        return new ArrayOfDadosDependentes();
    }

    /**
     * Create an instance of {@link DadosRepresentanteLegal }
     * 
     */
    public DadosRepresentanteLegal createDadosRepresentanteLegal() {
        return new DadosRepresentanteLegal();
    }

    /**
     * Create an instance of {@link DadosFerias }
     * 
     */
    public DadosFerias createDadosFerias() {
        return new DadosFerias();
    }

    /**
     * Create an instance of {@link TipoAtuacao }
     * 
     */
    public TipoAtuacao createTipoAtuacao() {
        return new TipoAtuacao();
    }

    /**
     * Create an instance of {@link ArrayOfDadosPA }
     * 
     */
    public ArrayOfDadosPA createArrayOfDadosPA() {
        return new ArrayOfDadosPA();
    }

    /**
     * Create an instance of {@link DadosTitulacao }
     * 
     */
    public DadosTitulacao createDadosTitulacao() {
        return new DadosTitulacao();
    }

    /**
     * Create an instance of {@link DadosDocumentacao }
     * 
     */
    public DadosDocumentacao createDadosDocumentacao() {
        return new DadosDocumentacao();
    }

    /**
     * Create an instance of {@link ArrayOfIdiomas }
     * 
     */
    public ArrayOfIdiomas createArrayOfIdiomas() {
        return new ArrayOfIdiomas();
    }

    /**
     * Create an instance of {@link DadosFuncionais }
     * 
     */
    public DadosFuncionais createDadosFuncionais() {
        return new DadosFuncionais();
    }

    /**
     * Create an instance of {@link ArrayOfDadosFinanceiros }
     * 
     */
    public ArrayOfDadosFinanceiros createArrayOfDadosFinanceiros() {
        return new ArrayOfDadosFinanceiros();
    }

    /**
     * Create an instance of {@link ArrayDadosPA }
     * 
     */
    public ArrayDadosPA createArrayDadosPA() {
        return new ArrayDadosPA();
    }

    /**
     * Create an instance of {@link ArrayOfServidor }
     * 
     */
    public ArrayOfServidor createArrayOfServidor() {
        return new ArrayOfServidor();
    }

    /**
     * Create an instance of {@link ArrayOfDadosTitulacao }
     * 
     */
    public ArrayOfDadosTitulacao createArrayOfDadosTitulacao() {
        return new ArrayOfDadosTitulacao();
    }

    /**
     * Create an instance of {@link Pensionista }
     * 
     */
    public Pensionista createPensionista() {
        return new Pensionista();
    }

    /**
     * Create an instance of {@link DadosUorg }
     * 
     */
    public DadosUorg createDadosUorg() {
        return new DadosUorg();
    }

    /**
     * Create an instance of {@link DadosPA }
     * 
     */
    public DadosPA createDadosPA() {
        return new DadosPA();
    }

    /**
     * Create an instance of {@link NivelEscolaridade }
     * 
     */
    public NivelEscolaridade createNivelEscolaridade() {
        return new NivelEscolaridade();
    }

    /**
     * Create an instance of {@link ExperienciaProfissional }
     * 
     */
    public ExperienciaProfissional createExperienciaProfissional() {
        return new ExperienciaProfissional();
    }

    /**
     * Create an instance of {@link DadosDependentes }
     * 
     */
    public DadosDependentes createDadosDependentes() {
        return new DadosDependentes();
    }

    /**
     * Create an instance of {@link ArrayOfExperienciaProfissional }
     * 
     */
    public ArrayOfExperienciaProfissional createArrayOfExperienciaProfissional() {
        return new ArrayOfExperienciaProfissional();
    }

    /**
     * Create an instance of {@link ArrayOfFormacaoAcademica }
     * 
     */
    public ArrayOfFormacaoAcademica createArrayOfFormacaoAcademica() {
        return new ArrayOfFormacaoAcademica();
    }

    /**
     * Create an instance of {@link Situacao }
     * 
     */
    public Situacao createSituacao() {
        return new Situacao();
    }

    /**
     * Create an instance of {@link Uorg }
     * 
     */
    public Uorg createUorg() {
        return new Uorg();
    }

    /**
     * Create an instance of {@link ArrayOfDadosFuncionais }
     * 
     */
    public ArrayOfDadosFuncionais createArrayOfDadosFuncionais() {
        return new ArrayOfDadosFuncionais();
    }

    /**
     * Create an instance of {@link DadosEscolares }
     * 
     */
    public DadosEscolares createDadosEscolares() {
        return new DadosEscolares();
    }

    /**
     * Create an instance of {@link ArrayDadosBancarios }
     * 
     */
    public ArrayDadosBancarios createArrayDadosBancarios() {
        return new ArrayDadosBancarios();
    }

    /**
     * Create an instance of {@link ArrayPensoesInstituidas }
     * 
     */
    public ArrayPensoesInstituidas createArrayPensoesInstituidas() {
        return new ArrayPensoesInstituidas();
    }

    /**
     * Create an instance of {@link DadosLpa }
     * 
     */
    public DadosLpa createDadosLpa() {
        return new DadosLpa();
    }

    /**
     * Create an instance of {@link ArrayOfAlimentadosPA }
     * 
     */
    public ArrayOfAlimentadosPA createArrayOfAlimentadosPA() {
        return new ArrayOfAlimentadosPA();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link Beneficio }
     * 
     */
    public Beneficio createBeneficio() {
        return new Beneficio();
    }

    /**
     * Create an instance of {@link UorgDados }
     * 
     */
    public UorgDados createUorgDados() {
        return new UorgDados();
    }

    /**
     * Create an instance of {@link SQLException }
     * 
     */
    public SQLException createSQLException() {
        return new SQLException();
    }

    /**
     * Create an instance of {@link DadosPessoais }
     * 
     */
    public DadosPessoais createDadosPessoais() {
        return new DadosPessoais();
    }

    /**
     * Create an instance of {@link Servidor }
     * 
     */
    public Servidor createServidor() {
        return new Servidor();
    }

    /**
     * Create an instance of {@link ArrayFichaFinanceira }
     * 
     */
    public ArrayFichaFinanceira createArrayFichaFinanceira() {
        return new ArrayFichaFinanceira();
    }

    /**
     * Create an instance of {@link DadosCurso }
     * 
     */
    public DadosCurso createDadosCurso() {
        return new DadosCurso();
    }

    /**
     * Create an instance of {@link ArrayOfDadosAfastamentoPorMatricula }
     * 
     */
    public ArrayOfDadosAfastamentoPorMatricula createArrayOfDadosAfastamentoPorMatricula() {
        return new ArrayOfDadosAfastamentoPorMatricula();
    }

    /**
     * Create an instance of {@link ArrayDadosSICAJ }
     * 
     */
    public ArrayDadosSICAJ createArrayDadosSICAJ() {
        return new ArrayDadosSICAJ();
    }

    /**
     * Create an instance of {@link ArrayOfDadosRepresentanteLegal }
     * 
     */
    public ArrayOfDadosRepresentanteLegal createArrayOfDadosRepresentanteLegal() {
        return new ArrayOfDadosRepresentanteLegal();
    }

    /**
     * Create an instance of {@link ArrayOfDadosFerias }
     * 
     */
    public ArrayOfDadosFerias createArrayOfDadosFerias() {
        return new ArrayOfDadosFerias();
    }

    /**
     * Create an instance of {@link ArrayOfDadosSICAJ }
     * 
     */
    public ArrayOfDadosSICAJ createArrayOfDadosSICAJ() {
        return new ArrayOfDadosSICAJ();
    }

    /**
     * Create an instance of {@link ArrayPensaoRecebida }
     * 
     */
    public ArrayPensaoRecebida createArrayPensaoRecebida() {
        return new ArrayPensaoRecebida();
    }

    /**
     * Create an instance of {@link PensoesInstituidas }
     * 
     */
    public PensoesInstituidas createPensoesInstituidas() {
        return new PensoesInstituidas();
    }

    /**
     * Create an instance of {@link ArrayOfPensoesInstituidas }
     * 
     */
    public ArrayOfPensoesInstituidas createArrayOfPensoesInstituidas() {
        return new ArrayOfPensoesInstituidas();
    }

    /**
     * Create an instance of {@link ArrayDadosDependentes }
     * 
     */
    public ArrayDadosDependentes createArrayDadosDependentes() {
        return new ArrayDadosDependentes();
    }

    /**
     * Create an instance of {@link ArrayOfBeneficio }
     * 
     */
    public ArrayOfBeneficio createArrayOfBeneficio() {
        return new ArrayOfBeneficio();
    }

    /**
     * Create an instance of {@link DadosFinanceiros }
     * 
     */
    public DadosFinanceiros createDadosFinanceiros() {
        return new DadosFinanceiros();
    }

    /**
     * Create an instance of {@link ParticipacaoComissoes }
     * 
     */
    public ParticipacaoComissoes createParticipacaoComissoes() {
        return new ParticipacaoComissoes();
    }

    /**
     * Create an instance of {@link Idiomas }
     * 
     */
    public Idiomas createIdiomas() {
        return new Idiomas();
    }

    /**
     * Create an instance of {@link FichaFinaceiraBeneficiario }
     * 
     */
    public FichaFinaceiraBeneficiario createFichaFinaceiraBeneficiario() {
        return new FichaFinaceiraBeneficiario();
    }

    /**
     * Create an instance of {@link ArrayOfDadosBancarios }
     * 
     */
    public ArrayOfDadosBancarios createArrayOfDadosBancarios() {
        return new ArrayOfDadosBancarios();
    }

    /**
     * Create an instance of {@link ArrayOfDadosCurso }
     * 
     */
    public ArrayOfDadosCurso createArrayOfDadosCurso() {
        return new ArrayOfDadosCurso();
    }

    /**
     * Create an instance of {@link ArrayDadosUorg }
     * 
     */
    public ArrayDadosUorg createArrayDadosUorg() {
        return new ArrayDadosUorg();
    }

    /**
     * Create an instance of {@link ArrayOfDadosReclusao }
     * 
     */
    public ArrayOfDadosReclusao createArrayOfDadosReclusao() {
        return new ArrayOfDadosReclusao();
    }

    /**
     * Create an instance of {@link DadosAfastamentoPorCpf }
     * 
     */
    public DadosAfastamentoPorCpf createDadosAfastamentoPorCpf() {
        return new DadosAfastamentoPorCpf();
    }

    /**
     * Create an instance of {@link DadosCurriculo }
     * 
     */
    public DadosCurriculo createDadosCurriculo() {
        return new DadosCurriculo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SQLException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sql.java", name = "sQLException")
    public JAXBElement<SQLException> createSQLException(SQLException value) {
        return new JAXBElement<SQLException>(_SQLException_QNAME, SQLException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeAlimentado", scope = AlimentadosPA.class)
    public JAXBElement<String> createAlimentadosPANomeAlimentado(String value) {
        return new JAXBElement<String>(_AlimentadosPANomeAlimentado_QNAME, String.class, AlimentadosPA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codVinculoServidor", scope = AlimentadosPA.class)
    public JAXBElement<String> createAlimentadosPACodVinculoServidor(String value) {
        return new JAXBElement<String>(_AlimentadosPACodVinculoServidor_QNAME, String.class, AlimentadosPA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeVinculoServidor", scope = AlimentadosPA.class)
    public JAXBElement<String> createAlimentadosPANomeVinculoServidor(String value) {
        return new JAXBElement<String>(_AlimentadosPANomeVinculoServidor_QNAME, String.class, AlimentadosPA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codOrgao", scope = DadosBancarios.class)
    public JAXBElement<String> createDadosBancariosCodOrgao(String value) {
        return new JAXBElement<String>(_DadosBancariosCodOrgao_QNAME, String.class, DadosBancarios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "banco", scope = DadosBancarios.class)
    public JAXBElement<String> createDadosBancariosBanco(String value) {
        return new JAXBElement<String>(_DadosBancariosBanco_QNAME, String.class, DadosBancarios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "contaCorrente", scope = DadosBancarios.class)
    public JAXBElement<String> createDadosBancariosContaCorrente(String value) {
        return new JAXBElement<String>(_DadosBancariosContaCorrente_QNAME, String.class, DadosBancarios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "matricula", scope = DadosBancarios.class)
    public JAXBElement<String> createDadosBancariosMatricula(String value) {
        return new JAXBElement<String>(_DadosBancariosMatricula_QNAME, String.class, DadosBancarios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "agencia", scope = DadosBancarios.class)
    public JAXBElement<String> createDadosBancariosAgencia(String value) {
        return new JAXBElement<String>(_DadosBancariosAgencia_QNAME, String.class, DadosBancarios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "funcoesOrgao", scope = VagasOrgao.class)
    public JAXBElement<String> createVagasOrgaoFuncoesOrgao(String value) {
        return new JAXBElement<String>(_VagasOrgaoFuncoesOrgao_QNAME, String.class, VagasOrgao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "quantVagaFuncaoLivre", scope = VagasOrgao.class)
    public JAXBElement<String> createVagasOrgaoQuantVagaFuncaoLivre(String value) {
        return new JAXBElement<String>(_VagasOrgaoQuantVagaFuncaoLivre_QNAME, String.class, VagasOrgao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "quantVagaFuncaoOcupada", scope = VagasOrgao.class)
    public JAXBElement<String> createVagasOrgaoQuantVagaFuncaoOcupada(String value) {
        return new JAXBElement<String>(_VagasOrgaoQuantVagaFuncaoOcupada_QNAME, String.class, VagasOrgao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "nome", scope = TipoParticipacaoComissoes.class)
    public JAXBElement<String> createTipoParticipacaoComissoesNome(String value) {
        return new JAXBElement<String>(_TipoParticipacaoComissoesNome_QNAME, String.class, TipoParticipacaoComissoes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "codigo", scope = TipoParticipacaoComissoes.class)
    public JAXBElement<Integer> createTipoParticipacaoComissoesCodigo(Integer value) {
        return new JAXBElement<Integer>(_TipoParticipacaoComissoesCodigo_QNAME, Integer.class, TipoParticipacaoComissoes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "instituicao", scope = FormacaoAcademica.class)
    public JAXBElement<String> createFormacaoAcademicaInstituicao(String value) {
        return new JAXBElement<String>(_FormacaoAcademicaInstituicao_QNAME, String.class, FormacaoAcademica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "dataConclusao", scope = FormacaoAcademica.class)
    public JAXBElement<String> createFormacaoAcademicaDataConclusao(String value) {
        return new JAXBElement<String>(_FormacaoAcademicaDataConclusao_QNAME, String.class, FormacaoAcademica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "codigo", scope = FormacaoAcademica.class)
    public JAXBElement<Integer> createFormacaoAcademicaCodigo(Integer value) {
        return new JAXBElement<Integer>(_TipoParticipacaoComissoesCodigo_QNAME, Integer.class, FormacaoAcademica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Situacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "situacao", scope = FormacaoAcademica.class)
    public JAXBElement<Situacao> createFormacaoAcademicaSituacao(Situacao value) {
        return new JAXBElement<Situacao>(_FormacaoAcademicaSituacao_QNAME, Situacao.class, FormacaoAcademica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NivelEscolaridade }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "nivelEscolaridade", scope = FormacaoAcademica.class)
    public JAXBElement<NivelEscolaridade> createFormacaoAcademicaNivelEscolaridade(NivelEscolaridade value) {
        return new JAXBElement<NivelEscolaridade>(_FormacaoAcademicaNivelEscolaridade_QNAME, NivelEscolaridade.class, FormacaoAcademica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Curso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "curso", scope = FormacaoAcademica.class)
    public JAXBElement<Curso> createFormacaoAcademicaCurso(Curso value) {
        return new JAXBElement<Curso>(_FormacaoAcademicaCurso_QNAME, Curso.class, FormacaoAcademica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "identificUnica", scope = FormacaoAcademica.class)
    public JAXBElement<String> createFormacaoAcademicaIdentificUnica(String value) {
        return new JAXBElement<String>(_FormacaoAcademicaIdentificUnica_QNAME, String.class, FormacaoAcademica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "nome", scope = TipoEvento.class)
    public JAXBElement<String> createTipoEventoNome(String value) {
        return new JAXBElement<String>(_TipoParticipacaoComissoesNome_QNAME, String.class, TipoEvento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "codigo", scope = TipoEvento.class)
    public JAXBElement<Integer> createTipoEventoCodigo(Integer value) {
        return new JAXBElement<Integer>(_TipoParticipacaoComissoesCodigo_QNAME, Integer.class, TipoEvento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeParentesco", scope = PensaoRecebida.class)
    public JAXBElement<String> createPensaoRecebidaNomeParentesco(String value) {
        return new JAXBElement<String>(_PensaoRecebidaNomeParentesco_QNAME, String.class, PensaoRecebida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "orgao", scope = PensaoRecebida.class)
    public JAXBElement<String> createPensaoRecebidaOrgao(String value) {
        return new JAXBElement<String>(_PensaoRecebidaOrgao_QNAME, String.class, PensaoRecebida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "banco", scope = PensaoRecebida.class)
    public JAXBElement<String> createPensaoRecebidaBanco(String value) {
        return new JAXBElement<String>(_DadosBancariosBanco_QNAME, String.class, PensaoRecebida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeInstituidor", scope = PensaoRecebida.class)
    public JAXBElement<String> createPensaoRecebidaNomeInstituidor(String value) {
        return new JAXBElement<String>(_PensaoRecebidaNomeInstituidor_QNAME, String.class, PensaoRecebida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "conta", scope = PensaoRecebida.class)
    public JAXBElement<String> createPensaoRecebidaConta(String value) {
        return new JAXBElement<String>(_PensaoRecebidaConta_QNAME, String.class, PensaoRecebida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "naturezaPensao", scope = PensaoRecebida.class)
    public JAXBElement<String> createPensaoRecebidaNaturezaPensao(String value) {
        return new JAXBElement<String>(_PensaoRecebidaNaturezaPensao_QNAME, String.class, PensaoRecebida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeRepresentanteLegal", scope = PensaoRecebida.class)
    public JAXBElement<String> createPensaoRecebidaNomeRepresentanteLegal(String value) {
        return new JAXBElement<String>(_PensaoRecebidaNomeRepresentanteLegal_QNAME, String.class, PensaoRecebida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "tipoPensao", scope = PensaoRecebida.class)
    public JAXBElement<String> createPensaoRecebidaTipoPensao(String value) {
        return new JAXBElement<String>(_PensaoRecebidaTipoPensao_QNAME, String.class, PensaoRecebida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "agencia", scope = PensaoRecebida.class)
    public JAXBElement<String> createPensaoRecebidaAgencia(String value) {
        return new JAXBElement<String>(_DadosBancariosAgencia_QNAME, String.class, PensaoRecebida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codParentesco", scope = PensaoRecebida.class)
    public JAXBElement<String> createPensaoRecebidaCodParentesco(String value) {
        return new JAXBElement<String>(_PensaoRecebidaCodParentesco_QNAME, String.class, PensaoRecebida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "cpfIntituidor", scope = PensaoRecebida.class)
    public JAXBElement<String> createPensaoRecebidaCpfIntituidor(String value) {
        return new JAXBElement<String>(_PensaoRecebidaCpfIntituidor_QNAME, String.class, PensaoRecebida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayFichaFinanceira }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "arrayFichaFinanceira", scope = PensaoRecebida.class)
    public JAXBElement<ArrayFichaFinanceira> createPensaoRecebidaArrayFichaFinanceira(ArrayFichaFinanceira value) {
        return new JAXBElement<ArrayFichaFinanceira>(_PensaoRecebidaArrayFichaFinanceira_QNAME, ArrayFichaFinanceira.class, PensaoRecebida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeTipoPensao", scope = PensaoRecebida.class)
    public JAXBElement<String> createPensaoRecebidaNomeTipoPensao(String value) {
        return new JAXBElement<String>(_PensaoRecebidaNomeTipoPensao_QNAME, String.class, PensaoRecebida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "cpfRepresentanteLegal", scope = PensaoRecebida.class)
    public JAXBElement<String> createPensaoRecebidaCpfRepresentanteLegal(String value) {
        return new JAXBElement<String>(_PensaoRecebidaCpfRepresentanteLegal_QNAME, String.class, PensaoRecebida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "matricula", scope = PensaoRecebida.class)
    public JAXBElement<String> createPensaoRecebidaMatricula(String value) {
        return new JAXBElement<String>(_DadosBancariosMatricula_QNAME, String.class, PensaoRecebida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "cotaPensao", scope = PensaoRecebida.class)
    public JAXBElement<String> createPensaoRecebidaCotaPensao(String value) {
        return new JAXBElement<String>(_PensaoRecebidaCotaPensao_QNAME, String.class, PensaoRecebida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codOrgao", scope = DadosSICAJ.class)
    public JAXBElement<String> createDadosSICAJCodOrgao(String value) {
        return new JAXBElement<String>(_DadosBancariosCodOrgao_QNAME, String.class, DadosSICAJ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "statusAcaoTabela", scope = DadosSICAJ.class)
    public JAXBElement<String> createDadosSICAJStatusAcaoTabela(String value) {
        return new JAXBElement<String>(_DadosSICAJStatusAcaoTabela_QNAME, String.class, DadosSICAJ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "statusAcaoSICAJ", scope = DadosSICAJ.class)
    public JAXBElement<String> createDadosSICAJStatusAcaoSICAJ(String value) {
        return new JAXBElement<String>(_DadosSICAJStatusAcaoSICAJ_QNAME, String.class, DadosSICAJ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "ufAcao", scope = DadosSICAJ.class)
    public JAXBElement<String> createDadosSICAJUfAcao(String value) {
        return new JAXBElement<String>(_DadosSICAJUfAcao_QNAME, String.class, DadosSICAJ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "numAcao", scope = DadosSICAJ.class)
    public JAXBElement<String> createDadosSICAJNumAcao(String value) {
        return new JAXBElement<String>(_DadosSICAJNumAcao_QNAME, String.class, DadosSICAJ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataAjuizamento", scope = DadosSICAJ.class)
    public JAXBElement<String> createDadosSICAJDataAjuizamento(String value) {
        return new JAXBElement<String>(_DadosSICAJDataAjuizamento_QNAME, String.class, DadosSICAJ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataTransitoJulgamento", scope = DadosSICAJ.class)
    public JAXBElement<String> createDadosSICAJDataTransitoJulgamento(String value) {
        return new JAXBElement<String>(_DadosSICAJDataTransitoJulgamento_QNAME, String.class, DadosSICAJ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "indicadorExclusao", scope = DadosSICAJ.class)
    public JAXBElement<String> createDadosSICAJIndicadorExclusao(String value) {
        return new JAXBElement<String>(_DadosSICAJIndicadorExclusao_QNAME, String.class, DadosSICAJ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "matricula", scope = DadosSICAJ.class)
    public JAXBElement<String> createDadosSICAJMatricula(String value) {
        return new JAXBElement<String>(_DadosBancariosMatricula_QNAME, String.class, DadosSICAJ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codAcao", scope = DadosSICAJ.class)
    public JAXBElement<String> createDadosSICAJCodAcao(String value) {
        return new JAXBElement<String>(_DadosSICAJCodAcao_QNAME, String.class, DadosSICAJ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "valorBeneficiarioAcao", scope = DadosSICAJ.class)
    public JAXBElement<String> createDadosSICAJValorBeneficiarioAcao(String value) {
        return new JAXBElement<String>(_DadosSICAJValorBeneficiarioAcao_QNAME, String.class, DadosSICAJ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "indicadorSituacaoAcao", scope = DadosSICAJ.class)
    public JAXBElement<String> createDadosSICAJIndicadorSituacaoAcao(String value) {
        return new JAXBElement<String>(_DadosSICAJIndicadorSituacaoAcao_QNAME, String.class, DadosSICAJ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codNatJuridica", scope = TotalVagasOrgao.class)
    public JAXBElement<String> createTotalVagasOrgaoCodNatJuridica(String value) {
        return new JAXBElement<String>(_TotalVagasOrgaoCodNatJuridica_QNAME, String.class, TotalVagasOrgao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeNatJuridica", scope = TotalVagasOrgao.class)
    public JAXBElement<String> createTotalVagasOrgaoNomeNatJuridica(String value) {
        return new JAXBElement<String>(_TotalVagasOrgaoNomeNatJuridica_QNAME, String.class, TotalVagasOrgao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVagasOrgao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "vagasPorOrgao", scope = TotalVagasOrgao.class)
    public JAXBElement<ArrayOfVagasOrgao> createTotalVagasOrgaoVagasPorOrgao(ArrayOfVagasOrgao value) {
        return new JAXBElement<ArrayOfVagasOrgao>(_TotalVagasOrgaoVagasPorOrgao_QNAME, ArrayOfVagasOrgao.class, TotalVagasOrgao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "nome", scope = IdiomasDesc.class)
    public JAXBElement<String> createIdiomasDescNome(String value) {
        return new JAXBElement<String>(_TipoParticipacaoComissoesNome_QNAME, String.class, IdiomasDesc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "codigo", scope = IdiomasDesc.class)
    public JAXBElement<Integer> createIdiomasDescCodigo(Integer value) {
        return new JAXBElement<Integer>(_TipoParticipacaoComissoesCodigo_QNAME, Integer.class, IdiomasDesc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDadosAfastamentoPorMatricula }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dadosAfastamentoPorMatricula", scope = ArrayDadosAfastamento.class)
    public JAXBElement<ArrayOfDadosAfastamentoPorMatricula> createArrayDadosAfastamentoDadosAfastamentoPorMatricula(ArrayOfDadosAfastamentoPorMatricula value) {
        return new JAXBElement<ArrayOfDadosAfastamentoPorMatricula>(_ArrayDadosAfastamentoDadosAfastamentoPorMatricula_QNAME, ArrayOfDadosAfastamentoPorMatricula.class, ArrayDadosAfastamento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDadosAfastamentoPorCpf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dadosAfastamentoPorCPF", scope = ArrayDadosAfastamento.class)
    public JAXBElement<ArrayOfDadosAfastamentoPorCpf> createArrayDadosAfastamentoDadosAfastamentoPorCPF(ArrayOfDadosAfastamentoPorCpf value) {
        return new JAXBElement<ArrayOfDadosAfastamentoPorCpf>(_ArrayDadosAfastamentoDadosAfastamentoPorCPF_QNAME, ArrayOfDadosAfastamentoPorCpf.class, ArrayDadosAfastamento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDadosRepresentanteLegal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dadosRepresentanteLegal", scope = ArrayDadosRepresentanteLegal.class)
    public JAXBElement<ArrayOfDadosRepresentanteLegal> createArrayDadosRepresentanteLegalDadosRepresentanteLegal(ArrayOfDadosRepresentanteLegal value) {
        return new JAXBElement<ArrayOfDadosRepresentanteLegal>(_ArrayDadosRepresentanteLegalDadosRepresentanteLegal_QNAME, ArrayOfDadosRepresentanteLegal.class, ArrayDadosRepresentanteLegal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "nome", scope = Area.class)
    public JAXBElement<String> createAreaNome(String value) {
        return new JAXBElement<String>(_TipoParticipacaoComissoesNome_QNAME, String.class, Area.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "codigo", scope = Area.class)
    public JAXBElement<Integer> createAreaCodigo(Integer value) {
        return new JAXBElement<Integer>(_TipoParticipacaoComissoesCodigo_QNAME, Integer.class, Area.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "nome", scope = IdiomasDominio.class)
    public JAXBElement<String> createIdiomasDominioNome(String value) {
        return new JAXBElement<String>(_TipoParticipacaoComissoesNome_QNAME, String.class, IdiomasDominio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "codigo", scope = IdiomasDominio.class)
    public JAXBElement<Integer> createIdiomasDominioCodigo(Integer value) {
        return new JAXBElement<Integer>(_TipoParticipacaoComissoesCodigo_QNAME, Integer.class, IdiomasDominio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codOcorrencia", scope = DadosOcorrencias.class)
    public JAXBElement<String> createDadosOcorrenciasCodOcorrencia(String value) {
        return new JAXBElement<String>(_DadosOcorrenciasCodOcorrencia_QNAME, String.class, DadosOcorrencias.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataFim", scope = DadosOcorrencias.class)
    public JAXBElement<String> createDadosOcorrenciasDataFim(String value) {
        return new JAXBElement<String>(_DadosOcorrenciasDataFim_QNAME, String.class, DadosOcorrencias.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataIni", scope = DadosOcorrencias.class)
    public JAXBElement<String> createDadosOcorrenciasDataIni(String value) {
        return new JAXBElement<String>(_DadosOcorrenciasDataIni_QNAME, String.class, DadosOcorrencias.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "descOcorrencia", scope = DadosOcorrencias.class)
    public JAXBElement<String> createDadosOcorrenciasDescOcorrencia(String value) {
        return new JAXBElement<String>(_DadosOcorrenciasDescOcorrencia_QNAME, String.class, DadosOcorrencias.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "instituicao", scope = Curso.class)
    public JAXBElement<String> createCursoInstituicao(String value) {
        return new JAXBElement<String>(_FormacaoAcademicaInstituicao_QNAME, String.class, Curso.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "dataConclusao", scope = Curso.class)
    public JAXBElement<String> createCursoDataConclusao(String value) {
        return new JAXBElement<String>(_FormacaoAcademicaDataConclusao_QNAME, String.class, Curso.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "cargaHoraria", scope = Curso.class)
    public JAXBElement<Short> createCursoCargaHoraria(Short value) {
        return new JAXBElement<Short>(_CursoCargaHoraria_QNAME, Short.class, Curso.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "nomeCurso", scope = Curso.class)
    public JAXBElement<String> createCursoNomeCurso(String value) {
        return new JAXBElement<String>(_CursoNomeCurso_QNAME, String.class, Curso.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Area }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "area", scope = Curso.class)
    public JAXBElement<Area> createCursoArea(Area value) {
        return new JAXBElement<Area>(_CursoArea_QNAME, Area.class, Curso.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "codCurso", scope = Curso.class)
    public JAXBElement<Integer> createCursoCodCurso(Integer value) {
        return new JAXBElement<Integer>(_CursoCodCurso_QNAME, Integer.class, Curso.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEvento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "tipoEvento", scope = Curso.class)
    public JAXBElement<TipoEvento> createCursoTipoEvento(TipoEvento value) {
        return new JAXBElement<TipoEvento>(_CursoTipoEvento_QNAME, TipoEvento.class, Curso.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "grMatricula", scope = DadosAfastamentoPorMatricula.class)
    public JAXBElement<String> createDadosAfastamentoPorMatriculaGrMatricula(String value) {
        return new JAXBElement<String>(_DadosAfastamentoPorMatriculaGrMatricula_QNAME, String.class, DadosAfastamentoPorMatricula.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDadosOcorrencias }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "ocorrencias", scope = DadosAfastamentoPorMatricula.class)
    public JAXBElement<ArrayOfDadosOcorrencias> createDadosAfastamentoPorMatriculaOcorrencias(ArrayOfDadosOcorrencias value) {
        return new JAXBElement<ArrayOfDadosOcorrencias>(_DadosAfastamentoPorMatriculaOcorrencias_QNAME, ArrayOfDadosOcorrencias.class, DadosAfastamentoPorMatricula.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDadosReclusao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "reclusao", scope = DadosAfastamentoPorMatricula.class)
    public JAXBElement<ArrayOfDadosReclusao> createDadosAfastamentoPorMatriculaReclusao(ArrayOfDadosReclusao value) {
        return new JAXBElement<ArrayOfDadosReclusao>(_DadosAfastamentoPorMatriculaReclusao_QNAME, ArrayOfDadosReclusao.class, DadosAfastamentoPorMatricula.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDadosFerias }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "ferias", scope = DadosAfastamentoPorMatricula.class)
    public JAXBElement<ArrayOfDadosFerias> createDadosAfastamentoPorMatriculaFerias(ArrayOfDadosFerias value) {
        return new JAXBElement<ArrayOfDadosFerias>(_DadosAfastamentoPorMatriculaFerias_QNAME, ArrayOfDadosFerias.class, DadosAfastamentoPorMatricula.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDadosLpa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "lpa", scope = DadosAfastamentoPorMatricula.class)
    public JAXBElement<ArrayOfDadosLpa> createDadosAfastamentoPorMatriculaLpa(ArrayOfDadosLpa value) {
        return new JAXBElement<ArrayOfDadosLpa>(_DadosAfastamentoPorMatriculaLpa_QNAME, ArrayOfDadosLpa.class, DadosAfastamentoPorMatricula.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDadosFinanceiros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dadosFinanceiros", scope = ArrayDadosFinanceiros.class)
    public JAXBElement<ArrayOfDadosFinanceiros> createArrayDadosFinanceirosDadosFinanceiros(ArrayOfDadosFinanceiros value) {
        return new JAXBElement<ArrayOfDadosFinanceiros>(_ArrayDadosFinanceirosDadosFinanceiros_QNAME, ArrayOfDadosFinanceiros.class, ArrayDadosFinanceiros.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "mesAnoPagamento", scope = ArrayDadosFinanceiros.class)
    public JAXBElement<String> createArrayDadosFinanceirosMesAnoPagamento(String value) {
        return new JAXBElement<String>(_ArrayDadosFinanceirosMesAnoPagamento_QNAME, String.class, ArrayDadosFinanceiros.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "uf", scope = DadosEnderecoResidencial.class)
    public JAXBElement<String> createDadosEnderecoResidencialUf(String value) {
        return new JAXBElement<String>(_DadosEnderecoResidencialUf_QNAME, String.class, DadosEnderecoResidencial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "complemento", scope = DadosEnderecoResidencial.class)
    public JAXBElement<String> createDadosEnderecoResidencialComplemento(String value) {
        return new JAXBElement<String>(_DadosEnderecoResidencialComplemento_QNAME, String.class, DadosEnderecoResidencial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "numero", scope = DadosEnderecoResidencial.class)
    public JAXBElement<String> createDadosEnderecoResidencialNumero(String value) {
        return new JAXBElement<String>(_DadosEnderecoResidencialNumero_QNAME, String.class, DadosEnderecoResidencial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "bairro", scope = DadosEnderecoResidencial.class)
    public JAXBElement<String> createDadosEnderecoResidencialBairro(String value) {
        return new JAXBElement<String>(_DadosEnderecoResidencialBairro_QNAME, String.class, DadosEnderecoResidencial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "logradouro", scope = DadosEnderecoResidencial.class)
    public JAXBElement<String> createDadosEnderecoResidencialLogradouro(String value) {
        return new JAXBElement<String>(_DadosEnderecoResidencialLogradouro_QNAME, String.class, DadosEnderecoResidencial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "numTelefone", scope = DadosEnderecoResidencial.class)
    public JAXBElement<String> createDadosEnderecoResidencialNumTelefone(String value) {
        return new JAXBElement<String>(_DadosEnderecoResidencialNumTelefone_QNAME, String.class, DadosEnderecoResidencial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dddTelefone", scope = DadosEnderecoResidencial.class)
    public JAXBElement<String> createDadosEnderecoResidencialDddTelefone(String value) {
        return new JAXBElement<String>(_DadosEnderecoResidencialDddTelefone_QNAME, String.class, DadosEnderecoResidencial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "cep", scope = DadosEnderecoResidencial.class)
    public JAXBElement<String> createDadosEnderecoResidencialCep(String value) {
        return new JAXBElement<String>(_DadosEnderecoResidencialCep_QNAME, String.class, DadosEnderecoResidencial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codMunicipio", scope = DadosEnderecoResidencial.class)
    public JAXBElement<String> createDadosEnderecoResidencialCodMunicipio(String value) {
        return new JAXBElement<String>(_DadosEnderecoResidencialCodMunicipio_QNAME, String.class, DadosEnderecoResidencial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeMunicipio", scope = DadosEnderecoResidencial.class)
    public JAXBElement<String> createDadosEnderecoResidencialNomeMunicipio(String value) {
        return new JAXBElement<String>(_DadosEnderecoResidencialNomeMunicipio_QNAME, String.class, DadosEnderecoResidencial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataFim", scope = DadosReclusao.class)
    public JAXBElement<String> createDadosReclusaoDataFim(String value) {
        return new JAXBElement<String>(_DadosOcorrenciasDataFim_QNAME, String.class, DadosReclusao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataIni", scope = DadosReclusao.class)
    public JAXBElement<String> createDadosReclusaoDataIni(String value) {
        return new JAXBElement<String>(_DadosOcorrenciasDataIni_QNAME, String.class, DadosReclusao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDadosFuncionais }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dadosFuncionais", scope = ArrayDadosFuncionais.class)
    public JAXBElement<ArrayOfDadosFuncionais> createArrayDadosFuncionaisDadosFuncionais(ArrayOfDadosFuncionais value) {
        return new JAXBElement<ArrayOfDadosFuncionais>(_ArrayDadosFuncionaisDadosFuncionais_QNAME, ArrayOfDadosFuncionais.class, ArrayDadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codOrgao", scope = DadosRepresentanteLegal.class)
    public JAXBElement<String> createDadosRepresentanteLegalCodOrgao(String value) {
        return new JAXBElement<String>(_DadosBancariosCodOrgao_QNAME, String.class, DadosRepresentanteLegal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "banco", scope = DadosRepresentanteLegal.class)
    public JAXBElement<String> createDadosRepresentanteLegalBanco(String value) {
        return new JAXBElement<String>(_DadosBancariosBanco_QNAME, String.class, DadosRepresentanteLegal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "contaCorrente", scope = DadosRepresentanteLegal.class)
    public JAXBElement<String> createDadosRepresentanteLegalContaCorrente(String value) {
        return new JAXBElement<String>(_DadosBancariosContaCorrente_QNAME, String.class, DadosRepresentanteLegal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "cpf", scope = DadosRepresentanteLegal.class)
    public JAXBElement<String> createDadosRepresentanteLegalCpf(String value) {
        return new JAXBElement<String>(_DadosRepresentanteLegalCpf_QNAME, String.class, DadosRepresentanteLegal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "matricula", scope = DadosRepresentanteLegal.class)
    public JAXBElement<String> createDadosRepresentanteLegalMatricula(String value) {
        return new JAXBElement<String>(_DadosBancariosMatricula_QNAME, String.class, DadosRepresentanteLegal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nome", scope = DadosRepresentanteLegal.class)
    public JAXBElement<String> createDadosRepresentanteLegalNome(String value) {
        return new JAXBElement<String>(_DadosRepresentanteLegalNome_QNAME, String.class, DadosRepresentanteLegal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "agencia", scope = DadosRepresentanteLegal.class)
    public JAXBElement<String> createDadosRepresentanteLegalAgencia(String value) {
        return new JAXBElement<String>(_DadosBancariosAgencia_QNAME, String.class, DadosRepresentanteLegal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataFim", scope = DadosFerias.class)
    public JAXBElement<String> createDadosFeriasDataFim(String value) {
        return new JAXBElement<String>(_DadosOcorrenciasDataFim_QNAME, String.class, DadosFerias.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataIni", scope = DadosFerias.class)
    public JAXBElement<String> createDadosFeriasDataIni(String value) {
        return new JAXBElement<String>(_DadosOcorrenciasDataIni_QNAME, String.class, DadosFerias.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "nome", scope = TipoAtuacao.class)
    public JAXBElement<String> createTipoAtuacaoNome(String value) {
        return new JAXBElement<String>(_TipoParticipacaoComissoesNome_QNAME, String.class, TipoAtuacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "codigo", scope = TipoAtuacao.class)
    public JAXBElement<Integer> createTipoAtuacaoCodigo(Integer value) {
        return new JAXBElement<Integer>(_TipoParticipacaoComissoesCodigo_QNAME, Integer.class, TipoAtuacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codOrgao", scope = DadosTitulacao.class)
    public JAXBElement<String> createDadosTitulacaoCodOrgao(String value) {
        return new JAXBElement<String>(_DadosBancariosCodOrgao_QNAME, String.class, DadosTitulacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codMatricula", scope = DadosTitulacao.class)
    public JAXBElement<String> createDadosTitulacaoCodMatricula(String value) {
        return new JAXBElement<String>(_DadosTitulacaoCodMatricula_QNAME, String.class, DadosTitulacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codTitulacao", scope = DadosTitulacao.class)
    public JAXBElement<String> createDadosTitulacaoCodTitulacao(String value) {
        return new JAXBElement<String>(_DadosTitulacaoCodTitulacao_QNAME, String.class, DadosTitulacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeTitulacao", scope = DadosTitulacao.class)
    public JAXBElement<String> createDadosTitulacaoNomeTitulacao(String value) {
        return new JAXBElement<String>(_DadosTitulacaoNomeTitulacao_QNAME, String.class, DadosTitulacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "ufCarteiraTrabalho", scope = DadosDocumentacao.class)
    public JAXBElement<String> createDadosDocumentacaoUfCarteiraTrabalho(String value) {
        return new JAXBElement<String>(_DadosDocumentacaoUfCarteiraTrabalho_QNAME, String.class, DadosDocumentacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "numeroCarteiraMotorista", scope = DadosDocumentacao.class)
    public JAXBElement<String> createDadosDocumentacaoNumeroCarteiraMotorista(String value) {
        return new JAXBElement<String>(_DadosDocumentacaoNumeroCarteiraMotorista_QNAME, String.class, DadosDocumentacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "serieCarteiraTrabalho", scope = DadosDocumentacao.class)
    public JAXBElement<String> createDadosDocumentacaoSerieCarteiraTrabalho(String value) {
        return new JAXBElement<String>(_DadosDocumentacaoSerieCarteiraTrabalho_QNAME, String.class, DadosDocumentacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "zonaTituloEleitor", scope = DadosDocumentacao.class)
    public JAXBElement<String> createDadosDocumentacaoZonaTituloEleitor(String value) {
        return new JAXBElement<String>(_DadosDocumentacaoZonaTituloEleitor_QNAME, String.class, DadosDocumentacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataCarteiraIdentidade", scope = DadosDocumentacao.class)
    public JAXBElement<String> createDadosDocumentacaoDataCarteiraIdentidade(String value) {
        return new JAXBElement<String>(_DadosDocumentacaoDataCarteiraIdentidade_QNAME, String.class, DadosDocumentacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "registroCarteiraMotorista", scope = DadosDocumentacao.class)
    public JAXBElement<String> createDadosDocumentacaoRegistroCarteiraMotorista(String value) {
        return new JAXBElement<String>(_DadosDocumentacaoRegistroCarteiraMotorista_QNAME, String.class, DadosDocumentacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataValidadeCarteiraMotorista", scope = DadosDocumentacao.class)
    public JAXBElement<String> createDadosDocumentacaoDataValidadeCarteiraMotorista(String value) {
        return new JAXBElement<String>(_DadosDocumentacaoDataValidadeCarteiraMotorista_QNAME, String.class, DadosDocumentacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "passaporte", scope = DadosDocumentacao.class)
    public JAXBElement<String> createDadosDocumentacaoPassaporte(String value) {
        return new JAXBElement<String>(_DadosDocumentacaoPassaporte_QNAME, String.class, DadosDocumentacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataComprovanteMilitar", scope = DadosDocumentacao.class)
    public JAXBElement<String> createDadosDocumentacaoDataComprovanteMilitar(String value) {
        return new JAXBElement<String>(_DadosDocumentacaoDataComprovanteMilitar_QNAME, String.class, DadosDocumentacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataTituloEleitor", scope = DadosDocumentacao.class)
    public JAXBElement<String> createDadosDocumentacaoDataTituloEleitor(String value) {
        return new JAXBElement<String>(_DadosDocumentacaoDataTituloEleitor_QNAME, String.class, DadosDocumentacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "numeroComprovanteMilitar", scope = DadosDocumentacao.class)
    public JAXBElement<String> createDadosDocumentacaoNumeroComprovanteMilitar(String value) {
        return new JAXBElement<String>(_DadosDocumentacaoNumeroComprovanteMilitar_QNAME, String.class, DadosDocumentacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "ufCarteiraIdentidade", scope = DadosDocumentacao.class)
    public JAXBElement<String> createDadosDocumentacaoUfCarteiraIdentidade(String value) {
        return new JAXBElement<String>(_DadosDocumentacaoUfCarteiraIdentidade_QNAME, String.class, DadosDocumentacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "ufCarteiraMotorista", scope = DadosDocumentacao.class)
    public JAXBElement<String> createDadosDocumentacaoUfCarteiraMotorista(String value) {
        return new JAXBElement<String>(_DadosDocumentacaoUfCarteiraMotorista_QNAME, String.class, DadosDocumentacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "secaoTituloEleitor", scope = DadosDocumentacao.class)
    public JAXBElement<String> createDadosDocumentacaoSecaoTituloEleitor(String value) {
        return new JAXBElement<String>(_DadosDocumentacaoSecaoTituloEleitor_QNAME, String.class, DadosDocumentacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "numeroCarteiraIdentidade", scope = DadosDocumentacao.class)
    public JAXBElement<String> createDadosDocumentacaoNumeroCarteiraIdentidade(String value) {
        return new JAXBElement<String>(_DadosDocumentacaoNumeroCarteiraIdentidade_QNAME, String.class, DadosDocumentacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "serieComprovanteMilitar", scope = DadosDocumentacao.class)
    public JAXBElement<String> createDadosDocumentacaoSerieComprovanteMilitar(String value) {
        return new JAXBElement<String>(_DadosDocumentacaoSerieComprovanteMilitar_QNAME, String.class, DadosDocumentacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataPrimExpedCarteiraMotorista", scope = DadosDocumentacao.class)
    public JAXBElement<String> createDadosDocumentacaoDataPrimExpedCarteiraMotorista(String value) {
        return new JAXBElement<String>(_DadosDocumentacaoDataPrimExpedCarteiraMotorista_QNAME, String.class, DadosDocumentacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "orgaoComprovanteMilitar", scope = DadosDocumentacao.class)
    public JAXBElement<String> createDadosDocumentacaoOrgaoComprovanteMilitar(String value) {
        return new JAXBElement<String>(_DadosDocumentacaoOrgaoComprovanteMilitar_QNAME, String.class, DadosDocumentacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "categoriaCarteiraMotorista", scope = DadosDocumentacao.class)
    public JAXBElement<String> createDadosDocumentacaoCategoriaCarteiraMotorista(String value) {
        return new JAXBElement<String>(_DadosDocumentacaoCategoriaCarteiraMotorista_QNAME, String.class, DadosDocumentacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "numCPF", scope = DadosDocumentacao.class)
    public JAXBElement<String> createDadosDocumentacaoNumCPF(String value) {
        return new JAXBElement<String>(_DadosDocumentacaoNumCPF_QNAME, String.class, DadosDocumentacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataExpedicaoCarteiraMotorista", scope = DadosDocumentacao.class)
    public JAXBElement<String> createDadosDocumentacaoDataExpedicaoCarteiraMotorista(String value) {
        return new JAXBElement<String>(_DadosDocumentacaoDataExpedicaoCarteiraMotorista_QNAME, String.class, DadosDocumentacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "orgaoCarteiraIdentidade", scope = DadosDocumentacao.class)
    public JAXBElement<String> createDadosDocumentacaoOrgaoCarteiraIdentidade(String value) {
        return new JAXBElement<String>(_DadosDocumentacaoOrgaoCarteiraIdentidade_QNAME, String.class, DadosDocumentacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "ufTituloEleitor", scope = DadosDocumentacao.class)
    public JAXBElement<String> createDadosDocumentacaoUfTituloEleitor(String value) {
        return new JAXBElement<String>(_DadosDocumentacaoUfTituloEleitor_QNAME, String.class, DadosDocumentacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "numPisPasep", scope = DadosDocumentacao.class)
    public JAXBElement<String> createDadosDocumentacaoNumPisPasep(String value) {
        return new JAXBElement<String>(_DadosDocumentacaoNumPisPasep_QNAME, String.class, DadosDocumentacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "numeroCarteiraTrabalho", scope = DadosDocumentacao.class)
    public JAXBElement<String> createDadosDocumentacaoNumeroCarteiraTrabalho(String value) {
        return new JAXBElement<String>(_DadosDocumentacaoNumeroCarteiraTrabalho_QNAME, String.class, DadosDocumentacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "numeroTituloEleitor", scope = DadosDocumentacao.class)
    public JAXBElement<String> createDadosDocumentacaoNumeroTituloEleitor(String value) {
        return new JAXBElement<String>(_DadosDocumentacaoNumeroTituloEleitor_QNAME, String.class, DadosDocumentacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataIniOcorrPSS", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisDataIniOcorrPSS(String value) {
        return new JAXBElement<String>(_DadosFuncionaisDataIniOcorrPSS_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeOrgao", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisNomeOrgao(String value) {
        return new JAXBElement<String>(_DadosFuncionaisNomeOrgao_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeClasse", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisNomeClasse(String value) {
        return new JAXBElement<String>(_DadosFuncionaisNomeClasse_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codUpag", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisCodUpag(String value) {
        return new JAXBElement<String>(_DadosFuncionaisCodUpag_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeUorgLotacao", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisNomeUorgLotacao(String value) {
        return new JAXBElement<String>(_DadosFuncionaisNomeUorgLotacao_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeOcorrIngressoServPublico", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisNomeOcorrIngressoServPublico(String value) {
        return new JAXBElement<String>(_DadosFuncionaisNomeOcorrIngressoServPublico_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataIngressoFuncao", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisDataIngressoFuncao(String value) {
        return new JAXBElement<String>(_DadosFuncionaisDataIngressoFuncao_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codOcorrAposentadoria", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisCodOcorrAposentadoria(String value) {
        return new JAXBElement<String>(_DadosFuncionaisCodOcorrAposentadoria_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codSitFuncional", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisCodSitFuncional(String value) {
        return new JAXBElement<String>(_DadosFuncionaisCodSitFuncional_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataOcorrIngressoServPublico", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisDataOcorrIngressoServPublico(String value) {
        return new JAXBElement<String>(_DadosFuncionaisDataOcorrIngressoServPublico_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataIngressoNovaFuncao", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisDataIngressoNovaFuncao(String value) {
        return new JAXBElement<String>(_DadosFuncionaisDataIngressoNovaFuncao_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "tipoValeAR", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisTipoValeAR(String value) {
        return new JAXBElement<String>(_DadosFuncionaisTipoValeAR_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeNovaFuncao", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisNomeNovaFuncao(String value) {
        return new JAXBElement<String>(_DadosFuncionaisNomeNovaFuncao_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeOcorrExclusao", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisNomeOcorrExclusao(String value) {
        return new JAXBElement<String>(_DadosFuncionaisNomeOcorrExclusao_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codOcorrExclusao", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisCodOcorrExclusao(String value) {
        return new JAXBElement<String>(_DadosFuncionaisCodOcorrExclusao_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "emailServidor", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisEmailServidor(String value) {
        return new JAXBElement<String>(_DadosFuncionaisEmailServidor_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeAtivFun", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisNomeAtivFun(String value) {
        return new JAXBElement<String>(_DadosFuncionaisNomeAtivFun_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "siglaRegimeJuridico", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisSiglaRegimeJuridico(String value) {
        return new JAXBElement<String>(_DadosFuncionaisSiglaRegimeJuridico_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codUorgLotacao", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisCodUorgLotacao(String value) {
        return new JAXBElement<String>(_DadosFuncionaisCodUorgLotacao_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataOcorrExclusao", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisDataOcorrExclusao(String value) {
        return new JAXBElement<String>(_DadosFuncionaisDataOcorrExclusao_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codValeTransporte", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisCodValeTransporte(String value) {
        return new JAXBElement<String>(_DadosFuncionaisCodValeTransporte_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeChefeUorg", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisNomeChefeUorg(String value) {
        return new JAXBElement<String>(_DadosFuncionaisNomeChefeUorg_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeRegimeJuridico", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisNomeRegimeJuridico(String value) {
        return new JAXBElement<String>(_DadosFuncionaisNomeRegimeJuridico_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codOcorrPSS", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisCodOcorrPSS(String value) {
        return new JAXBElement<String>(_DadosFuncionaisCodOcorrPSS_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "siglaUpag", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisSiglaUpag(String value) {
        return new JAXBElement<String>(_DadosFuncionaisSiglaUpag_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codFuncao", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisCodFuncao(String value) {
        return new JAXBElement<String>(_DadosFuncionaisCodFuncao_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codOcorrIsencaoIR", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisCodOcorrIsencaoIR(String value) {
        return new JAXBElement<String>(_DadosFuncionaisCodOcorrIsencaoIR_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeOcorrIngressoOrgao", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisNomeOcorrIngressoOrgao(String value) {
        return new JAXBElement<String>(_DadosFuncionaisNomeOcorrIngressoOrgao_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataOcorrIngressoOrgao", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisDataOcorrIngressoOrgao(String value) {
        return new JAXBElement<String>(_DadosFuncionaisDataOcorrIngressoOrgao_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeOcorrPSS", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisNomeOcorrPSS(String value) {
        return new JAXBElement<String>(_DadosFuncionaisNomeOcorrPSS_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codUorgExercicio", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisCodUorgExercicio(String value) {
        return new JAXBElement<String>(_DadosFuncionaisCodUorgExercicio_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataFimOcorrIsencaoIR", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisDataFimOcorrIsencaoIR(String value) {
        return new JAXBElement<String>(_DadosFuncionaisDataFimOcorrIsencaoIR_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "pontuacaoDesempenho", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisPontuacaoDesempenho(String value) {
        return new JAXBElement<String>(_DadosFuncionaisPontuacaoDesempenho_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataIniOcorrIsencaoIR", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisDataIniOcorrIsencaoIR(String value) {
        return new JAXBElement<String>(_DadosFuncionaisDataIniOcorrIsencaoIR_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "percentualTS", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisPercentualTS(String value) {
        return new JAXBElement<String>(_DadosFuncionaisPercentualTS_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codAtivFun", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisCodAtivFun(String value) {
        return new JAXBElement<String>(_DadosFuncionaisCodAtivFun_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeUorgExercicio", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisNomeUorgExercicio(String value) {
        return new JAXBElement<String>(_DadosFuncionaisNomeUorgExercicio_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "identUnica", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisIdentUnica(String value) {
        return new JAXBElement<String>(_DadosFuncionaisIdentUnica_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codCargo", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisCodCargo(String value) {
        return new JAXBElement<String>(_DadosFuncionaisCodCargo_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codOcorrIngressoOrgao", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisCodOcorrIngressoOrgao(String value) {
        return new JAXBElement<String>(_DadosFuncionaisCodOcorrIngressoOrgao_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codPadrao", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisCodPadrao(String value) {
        return new JAXBElement<String>(_DadosFuncionaisCodPadrao_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codJornada", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisCodJornada(String value) {
        return new JAXBElement<String>(_DadosFuncionaisCodJornada_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codOrgao", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisCodOrgao(String value) {
        return new JAXBElement<String>(_DadosBancariosCodOrgao_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataFimValeAR", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisDataFimValeAR(String value) {
        return new JAXBElement<String>(_DadosFuncionaisDataFimValeAR_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeJornada", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisNomeJornada(String value) {
        return new JAXBElement<String>(_DadosFuncionaisNomeJornada_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "siglaUorgExercicio", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisSiglaUorgExercicio(String value) {
        return new JAXBElement<String>(_DadosFuncionaisSiglaUorgExercicio_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codNovaFuncao", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisCodNovaFuncao(String value) {
        return new JAXBElement<String>(_DadosFuncionaisCodNovaFuncao_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "siglaUorgLotacao", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisSiglaUorgLotacao(String value) {
        return new JAXBElement<String>(_DadosFuncionaisSiglaUorgLotacao_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "emailChefiaImediata", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisEmailChefiaImediata(String value) {
        return new JAXBElement<String>(_DadosFuncionaisEmailChefiaImediata_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeCargo", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisNomeCargo(String value) {
        return new JAXBElement<String>(_DadosFuncionaisNomeCargo_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "valorValeTransporte", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisValorValeTransporte(String value) {
        return new JAXBElement<String>(_DadosFuncionaisValorValeTransporte_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeOcorrIsencaoIR", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisNomeOcorrIsencaoIR(String value) {
        return new JAXBElement<String>(_DadosFuncionaisNomeOcorrIsencaoIR_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeFuncao", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisNomeFuncao(String value) {
        return new JAXBElement<String>(_DadosFuncionaisNomeFuncao_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codOcorrIngressoServPublico", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisCodOcorrIngressoServPublico(String value) {
        return new JAXBElement<String>(_DadosFuncionaisCodOcorrIngressoServPublico_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataFimOcorrPSS", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisDataFimOcorrPSS(String value) {
        return new JAXBElement<String>(_DadosFuncionaisDataFimOcorrPSS_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataOcorrAposentadoria", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisDataOcorrAposentadoria(String value) {
        return new JAXBElement<String>(_DadosFuncionaisDataOcorrAposentadoria_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "siglaOrgao", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisSiglaOrgao(String value) {
        return new JAXBElement<String>(_DadosFuncionaisSiglaOrgao_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "matriculaSiape", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisMatriculaSiape(String value) {
        return new JAXBElement<String>(_DadosFuncionaisMatriculaSiape_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeUpag", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisNomeUpag(String value) {
        return new JAXBElement<String>(_DadosFuncionaisNomeUpag_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codClasse", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisCodClasse(String value) {
        return new JAXBElement<String>(_DadosFuncionaisCodClasse_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeSitFuncional", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisNomeSitFuncional(String value) {
        return new JAXBElement<String>(_DadosFuncionaisNomeSitFuncional_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "cpfChefiaImediata", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisCpfChefiaImediata(String value) {
        return new JAXBElement<String>(_DadosFuncionaisCpfChefiaImediata_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataIniValeAR", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisDataIniValeAR(String value) {
        return new JAXBElement<String>(_DadosFuncionaisDataIniValeAR_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeOcorrAposentadoria", scope = DadosFuncionais.class)
    public JAXBElement<String> createDadosFuncionaisNomeOcorrAposentadoria(String value) {
        return new JAXBElement<String>(_DadosFuncionaisNomeOcorrAposentadoria_QNAME, String.class, DadosFuncionais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDadosPA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dadosPA", scope = ArrayDadosPA.class)
    public JAXBElement<ArrayOfDadosPA> createArrayDadosPADadosPA(ArrayOfDadosPA value) {
        return new JAXBElement<ArrayOfDadosPA>(_ArrayDadosPADadosPA_QNAME, ArrayOfDadosPA.class, ArrayDadosPA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "nome", scope = Pensionista.class)
    public JAXBElement<String> createPensionistaNome(String value) {
        return new JAXBElement<String>(_TipoParticipacaoComissoesNome_QNAME, String.class, Pensionista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "matriculaBeneficiario", scope = Pensionista.class)
    public JAXBElement<String> createPensionistaMatriculaBeneficiario(String value) {
        return new JAXBElement<String>(_PensionistaMatriculaBeneficiario_QNAME, String.class, Pensionista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "cep", scope = Pensionista.class)
    public JAXBElement<String> createPensionistaCep(String value) {
        return new JAXBElement<String>(_PensionistaCep_QNAME, String.class, Pensionista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "sexo", scope = Pensionista.class)
    public JAXBElement<String> createPensionistaSexo(String value) {
        return new JAXBElement<String>(_PensionistaSexo_QNAME, String.class, Pensionista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "cidade", scope = Pensionista.class)
    public JAXBElement<String> createPensionistaCidade(String value) {
        return new JAXBElement<String>(_PensionistaCidade_QNAME, String.class, Pensionista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "faixaEtaria", scope = Pensionista.class)
    public JAXBElement<String> createPensionistaFaixaEtaria(String value) {
        return new JAXBElement<String>(_PensionistaFaixaEtaria_QNAME, String.class, Pensionista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "orgao", scope = Pensionista.class)
    public JAXBElement<ArrayOfString> createPensionistaOrgao(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_PensionistaOrgao_QNAME, ArrayOfString.class, Pensionista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "uf", scope = Pensionista.class)
    public JAXBElement<String> createPensionistaUf(String value) {
        return new JAXBElement<String>(_PensionistaUf_QNAME, String.class, Pensionista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "bairro", scope = Pensionista.class)
    public JAXBElement<String> createPensionistaBairro(String value) {
        return new JAXBElement<String>(_PensionistaBairro_QNAME, String.class, Pensionista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "logradouro", scope = Pensionista.class)
    public JAXBElement<String> createPensionistaLogradouro(String value) {
        return new JAXBElement<String>(_PensionistaLogradouro_QNAME, String.class, Pensionista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "upag", scope = Pensionista.class)
    public JAXBElement<ArrayOfString> createPensionistaUpag(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_PensionistaUpag_QNAME, ArrayOfString.class, Pensionista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "numero", scope = Pensionista.class)
    public JAXBElement<String> createPensionistaNumero(String value) {
        return new JAXBElement<String>(_PensionistaNumero_QNAME, String.class, Pensionista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "nome", scope = NivelEscolaridade.class)
    public JAXBElement<String> createNivelEscolaridadeNome(String value) {
        return new JAXBElement<String>(_TipoParticipacaoComissoesNome_QNAME, String.class, NivelEscolaridade.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "codigo", scope = NivelEscolaridade.class)
    public JAXBElement<Integer> createNivelEscolaridadeCodigo(Integer value) {
        return new JAXBElement<Integer>(_TipoParticipacaoComissoesCodigo_QNAME, Integer.class, NivelEscolaridade.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codOrgao", scope = DadosPA.class)
    public JAXBElement<String> createDadosPACodOrgao(String value) {
        return new JAXBElement<String>(_DadosBancariosCodOrgao_QNAME, String.class, DadosPA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeBeneficiario", scope = DadosPA.class)
    public JAXBElement<String> createDadosPANomeBeneficiario(String value) {
        return new JAXBElement<String>(_DadosPANomeBeneficiario_QNAME, String.class, DadosPA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "contaBeneficiario", scope = DadosPA.class)
    public JAXBElement<String> createDadosPAContaBeneficiario(String value) {
        return new JAXBElement<String>(_DadosPAContaBeneficiario_QNAME, String.class, DadosPA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "cpfBeneficiario", scope = DadosPA.class)
    public JAXBElement<String> createDadosPACpfBeneficiario(String value) {
        return new JAXBElement<String>(_DadosPACpfBeneficiario_QNAME, String.class, DadosPA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "valorUltimaPensao", scope = DadosPA.class)
    public JAXBElement<String> createDadosPAValorUltimaPensao(String value) {
        return new JAXBElement<String>(_DadosPAValorUltimaPensao_QNAME, String.class, DadosPA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "matricula", scope = DadosPA.class)
    public JAXBElement<String> createDadosPAMatricula(String value) {
        return new JAXBElement<String>(_DadosBancariosMatricula_QNAME, String.class, DadosPA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAlimentadosPA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "arrayAlimentadosPA", scope = DadosPA.class)
    public JAXBElement<ArrayOfAlimentadosPA> createDadosPAArrayAlimentadosPA(ArrayOfAlimentadosPA value) {
        return new JAXBElement<ArrayOfAlimentadosPA>(_DadosPAArrayAlimentadosPA_QNAME, ArrayOfAlimentadosPA.class, DadosPA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "agenciaBeneficiario", scope = DadosPA.class)
    public JAXBElement<String> createDadosPAAgenciaBeneficiario(String value) {
        return new JAXBElement<String>(_DadosPAAgenciaBeneficiario_QNAME, String.class, DadosPA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "bancoBeneficiario", scope = DadosPA.class)
    public JAXBElement<String> createDadosPABancoBeneficiario(String value) {
        return new JAXBElement<String>(_DadosPABancoBeneficiario_QNAME, String.class, DadosPA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codOrgao", scope = DadosUorg.class)
    public JAXBElement<String> createDadosUorgCodOrgao(String value) {
        return new JAXBElement<String>(_DadosBancariosCodOrgao_QNAME, String.class, DadosUorg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "complementoUorg", scope = DadosUorg.class)
    public JAXBElement<String> createDadosUorgComplementoUorg(String value) {
        return new JAXBElement<String>(_DadosUorgComplementoUorg_QNAME, String.class, DadosUorg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codMatricula", scope = DadosUorg.class)
    public JAXBElement<String> createDadosUorgCodMatricula(String value) {
        return new JAXBElement<String>(_DadosTitulacaoCodMatricula_QNAME, String.class, DadosUorg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeUorg", scope = DadosUorg.class)
    public JAXBElement<String> createDadosUorgNomeUorg(String value) {
        return new JAXBElement<String>(_DadosUorgNomeUorg_QNAME, String.class, DadosUorg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeMunicipioUorg", scope = DadosUorg.class)
    public JAXBElement<String> createDadosUorgNomeMunicipioUorg(String value) {
        return new JAXBElement<String>(_DadosUorgNomeMunicipioUorg_QNAME, String.class, DadosUorg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "cepUorg", scope = DadosUorg.class)
    public JAXBElement<String> createDadosUorgCepUorg(String value) {
        return new JAXBElement<String>(_DadosUorgCepUorg_QNAME, String.class, DadosUorg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "emailUorg", scope = DadosUorg.class)
    public JAXBElement<String> createDadosUorgEmailUorg(String value) {
        return new JAXBElement<String>(_DadosUorgEmailUorg_QNAME, String.class, DadosUorg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "logradouroUorg", scope = DadosUorg.class)
    public JAXBElement<String> createDadosUorgLogradouroUorg(String value) {
        return new JAXBElement<String>(_DadosUorgLogradouroUorg_QNAME, String.class, DadosUorg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codMunicipioUorg", scope = DadosUorg.class)
    public JAXBElement<String> createDadosUorgCodMunicipioUorg(String value) {
        return new JAXBElement<String>(_DadosUorgCodMunicipioUorg_QNAME, String.class, DadosUorg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "ufUorg", scope = DadosUorg.class)
    public JAXBElement<String> createDadosUorgUfUorg(String value) {
        return new JAXBElement<String>(_DadosUorgUfUorg_QNAME, String.class, DadosUorg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "bairroUorg", scope = DadosUorg.class)
    public JAXBElement<String> createDadosUorgBairroUorg(String value) {
        return new JAXBElement<String>(_DadosUorgBairroUorg_QNAME, String.class, DadosUorg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "siglaUorg", scope = DadosUorg.class)
    public JAXBElement<String> createDadosUorgSiglaUorg(String value) {
        return new JAXBElement<String>(_DadosUorgSiglaUorg_QNAME, String.class, DadosUorg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "numFaxUorg", scope = DadosUorg.class)
    public JAXBElement<String> createDadosUorgNumFaxUorg(String value) {
        return new JAXBElement<String>(_DadosUorgNumFaxUorg_QNAME, String.class, DadosUorg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codOrgaoUorg", scope = DadosUorg.class)
    public JAXBElement<String> createDadosUorgCodOrgaoUorg(String value) {
        return new JAXBElement<String>(_DadosUorgCodOrgaoUorg_QNAME, String.class, DadosUorg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "endUorg", scope = DadosUorg.class)
    public JAXBElement<String> createDadosUorgEndUorg(String value) {
        return new JAXBElement<String>(_DadosUorgEndUorg_QNAME, String.class, DadosUorg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "numTelefoneUorg", scope = DadosUorg.class)
    public JAXBElement<String> createDadosUorgNumTelefoneUorg(String value) {
        return new JAXBElement<String>(_DadosUorgNumTelefoneUorg_QNAME, String.class, DadosUorg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "numeroUorg", scope = DadosUorg.class)
    public JAXBElement<String> createDadosUorgNumeroUorg(String value) {
        return new JAXBElement<String>(_DadosUorgNumeroUorg_QNAME, String.class, DadosUorg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "dataInicio", scope = ExperienciaProfissional.class)
    public JAXBElement<String> createExperienciaProfissionalDataInicio(String value) {
        return new JAXBElement<String>(_ExperienciaProfissionalDataInicio_QNAME, String.class, ExperienciaProfissional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "cargo", scope = ExperienciaProfissional.class)
    public JAXBElement<String> createExperienciaProfissionalCargo(String value) {
        return new JAXBElement<String>(_ExperienciaProfissionalCargo_QNAME, String.class, ExperienciaProfissional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "codigo", scope = ExperienciaProfissional.class)
    public JAXBElement<Integer> createExperienciaProfissionalCodigo(Integer value) {
        return new JAXBElement<Integer>(_TipoParticipacaoComissoesCodigo_QNAME, Integer.class, ExperienciaProfissional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "projeto", scope = ExperienciaProfissional.class)
    public JAXBElement<String> createExperienciaProfissionalProjeto(String value) {
        return new JAXBElement<String>(_ExperienciaProfissionalProjeto_QNAME, String.class, ExperienciaProfissional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Area }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "area", scope = ExperienciaProfissional.class)
    public JAXBElement<Area> createExperienciaProfissionalArea(Area value) {
        return new JAXBElement<Area>(_CursoArea_QNAME, Area.class, ExperienciaProfissional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "identificUnica", scope = ExperienciaProfissional.class)
    public JAXBElement<String> createExperienciaProfissionalIdentificUnica(String value) {
        return new JAXBElement<String>(_FormacaoAcademicaIdentificUnica_QNAME, String.class, ExperienciaProfissional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoAtuacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "tipoAtuacao", scope = ExperienciaProfissional.class)
    public JAXBElement<TipoAtuacao> createExperienciaProfissionalTipoAtuacao(TipoAtuacao value) {
        return new JAXBElement<TipoAtuacao>(_ExperienciaProfissionalTipoAtuacao_QNAME, TipoAtuacao.class, ExperienciaProfissional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "dataFim", scope = ExperienciaProfissional.class)
    public JAXBElement<String> createExperienciaProfissionalDataFim(String value) {
        return new JAXBElement<String>(_ExperienciaProfissionalDataFim_QNAME, String.class, ExperienciaProfissional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "nomeOrgaoEmpresa", scope = ExperienciaProfissional.class)
    public JAXBElement<String> createExperienciaProfissionalNomeOrgaoEmpresa(String value) {
        return new JAXBElement<String>(_ExperienciaProfissionalNomeOrgaoEmpresa_QNAME, String.class, ExperienciaProfissional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codGrauParentesco", scope = DadosDependentes.class)
    public JAXBElement<String> createDadosDependentesCodGrauParentesco(String value) {
        return new JAXBElement<String>(_DadosDependentesCodGrauParentesco_QNAME, String.class, DadosDependentes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codOrgao", scope = DadosDependentes.class)
    public JAXBElement<String> createDadosDependentesCodOrgao(String value) {
        return new JAXBElement<String>(_DadosBancariosCodOrgao_QNAME, String.class, DadosDependentes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBeneficio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "arrayBeneficios", scope = DadosDependentes.class)
    public JAXBElement<ArrayOfBeneficio> createDadosDependentesArrayBeneficios(ArrayOfBeneficio value) {
        return new JAXBElement<ArrayOfBeneficio>(_DadosDependentesArrayBeneficios_QNAME, ArrayOfBeneficio.class, DadosDependentes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeGrauParentesco", scope = DadosDependentes.class)
    public JAXBElement<String> createDadosDependentesNomeGrauParentesco(String value) {
        return new JAXBElement<String>(_DadosDependentesNomeGrauParentesco_QNAME, String.class, DadosDependentes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "cpf", scope = DadosDependentes.class)
    public JAXBElement<String> createDadosDependentesCpf(String value) {
        return new JAXBElement<String>(_DadosRepresentanteLegalCpf_QNAME, String.class, DadosDependentes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "matricula", scope = DadosDependentes.class)
    public JAXBElement<String> createDadosDependentesMatricula(String value) {
        return new JAXBElement<String>(_DadosBancariosMatricula_QNAME, String.class, DadosDependentes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nome", scope = DadosDependentes.class)
    public JAXBElement<String> createDadosDependentesNome(String value) {
        return new JAXBElement<String>(_DadosRepresentanteLegalNome_QNAME, String.class, DadosDependentes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codCondicao", scope = DadosDependentes.class)
    public JAXBElement<String> createDadosDependentesCodCondicao(String value) {
        return new JAXBElement<String>(_DadosDependentesCodCondicao_QNAME, String.class, DadosDependentes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeCondicao", scope = DadosDependentes.class)
    public JAXBElement<String> createDadosDependentesNomeCondicao(String value) {
        return new JAXBElement<String>(_DadosDependentesNomeCondicao_QNAME, String.class, DadosDependentes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "nome", scope = Uorg.class)
    public JAXBElement<String> createUorgNome(String value) {
        return new JAXBElement<String>(_TipoParticipacaoComissoesNome_QNAME, String.class, Uorg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "codigo", scope = Uorg.class)
    public JAXBElement<String> createUorgCodigo(String value) {
        return new JAXBElement<String>(_TipoParticipacaoComissoesCodigo_QNAME, String.class, Uorg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "dataUltimaTransacao", scope = Uorg.class)
    public JAXBElement<String> createUorgDataUltimaTransacao(String value) {
        return new JAXBElement<String>(_UorgDataUltimaTransacao_QNAME, String.class, Uorg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "nome", scope = Situacao.class)
    public JAXBElement<String> createSituacaoNome(String value) {
        return new JAXBElement<String>(_TipoParticipacaoComissoesNome_QNAME, String.class, Situacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "codigo", scope = Situacao.class)
    public JAXBElement<Integer> createSituacaoCodigo(Integer value) {
        return new JAXBElement<Integer>(_TipoParticipacaoComissoesCodigo_QNAME, Integer.class, Situacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codEscolaridade", scope = DadosEscolares.class)
    public JAXBElement<String> createDadosEscolaresCodEscolaridade(String value) {
        return new JAXBElement<String>(_DadosEscolaresCodEscolaridade_QNAME, String.class, DadosEscolares.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDadosCurso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "arrayCursos", scope = DadosEscolares.class)
    public JAXBElement<ArrayOfDadosCurso> createDadosEscolaresArrayCursos(ArrayOfDadosCurso value) {
        return new JAXBElement<ArrayOfDadosCurso>(_DadosEscolaresArrayCursos_QNAME, ArrayOfDadosCurso.class, DadosEscolares.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeEscolaridade", scope = DadosEscolares.class)
    public JAXBElement<String> createDadosEscolaresNomeEscolaridade(String value) {
        return new JAXBElement<String>(_DadosEscolaresNomeEscolaridade_QNAME, String.class, DadosEscolares.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDadosTitulacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "arrayTitulacao", scope = DadosEscolares.class)
    public JAXBElement<ArrayOfDadosTitulacao> createDadosEscolaresArrayTitulacao(ArrayOfDadosTitulacao value) {
        return new JAXBElement<ArrayOfDadosTitulacao>(_DadosEscolaresArrayTitulacao_QNAME, ArrayOfDadosTitulacao.class, DadosEscolares.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDadosBancarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dadosBancarios", scope = ArrayDadosBancarios.class)
    public JAXBElement<ArrayOfDadosBancarios> createArrayDadosBancariosDadosBancarios(ArrayOfDadosBancarios value) {
        return new JAXBElement<ArrayOfDadosBancarios>(_ArrayDadosBancariosDadosBancarios_QNAME, ArrayOfDadosBancarios.class, ArrayDadosBancarios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataFim", scope = DadosLpa.class)
    public JAXBElement<String> createDadosLpaDataFim(String value) {
        return new JAXBElement<String>(_DadosOcorrenciasDataFim_QNAME, String.class, DadosLpa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataIni", scope = DadosLpa.class)
    public JAXBElement<String> createDadosLpaDataIni(String value) {
        return new JAXBElement<String>(_DadosOcorrenciasDataIni_QNAME, String.class, DadosLpa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPensoesInstituidas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "pensoesInstituidas", scope = ArrayPensoesInstituidas.class)
    public JAXBElement<ArrayOfPensoesInstituidas> createArrayPensoesInstituidasPensoesInstituidas(ArrayOfPensoesInstituidas value) {
        return new JAXBElement<ArrayOfPensoesInstituidas>(_ArrayPensoesInstituidasPensoesInstituidas_QNAME, ArrayOfPensoesInstituidas.class, ArrayPensoesInstituidas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataFim", scope = Beneficio.class)
    public JAXBElement<String> createBeneficioDataFim(String value) {
        return new JAXBElement<String>(_DadosOcorrenciasDataFim_QNAME, String.class, Beneficio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codBeneficio", scope = Beneficio.class)
    public JAXBElement<String> createBeneficioCodBeneficio(String value) {
        return new JAXBElement<String>(_BeneficioCodBeneficio_QNAME, String.class, Beneficio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataInicio", scope = Beneficio.class)
    public JAXBElement<String> createBeneficioDataInicio(String value) {
        return new JAXBElement<String>(_BeneficioDataInicio_QNAME, String.class, Beneficio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeBeneficio", scope = Beneficio.class)
    public JAXBElement<String> createBeneficioNomeBeneficio(String value) {
        return new JAXBElement<String>(_BeneficioNomeBeneficio_QNAME, String.class, Beneficio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "codUorgPai", scope = UorgDados.class)
    public JAXBElement<String> createUorgDadosCodUorgPai(String value) {
        return new JAXBElement<String>(_UorgDadosCodUorgPai_QNAME, String.class, UorgDados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "codOrgao", scope = UorgDados.class)
    public JAXBElement<String> createUorgDadosCodOrgao(String value) {
        return new JAXBElement<String>(_UorgDadosCodOrgao_QNAME, String.class, UorgDados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "nomeAreaAtuaUorg", scope = UorgDados.class)
    public JAXBElement<String> createUorgDadosNomeAreaAtuaUorg(String value) {
        return new JAXBElement<String>(_UorgDadosNomeAreaAtuaUorg_QNAME, String.class, UorgDados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "codUorg", scope = UorgDados.class)
    public JAXBElement<String> createUorgDadosCodUorg(String value) {
        return new JAXBElement<String>(_UorgDadosCodUorg_QNAME, String.class, UorgDados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "identificacaoAntecedentesUorg", scope = UorgDados.class)
    public JAXBElement<String> createUorgDadosIdentificacaoAntecedentesUorg(String value) {
        return new JAXBElement<String>(_UorgDadosIdentificacaoAntecedentesUorg_QNAME, String.class, UorgDados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "codSiorg", scope = UorgDados.class)
    public JAXBElement<String> createUorgDadosCodSiorg(String value) {
        return new JAXBElement<String>(_UorgDadosCodSiorg_QNAME, String.class, UorgDados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "nomeMunicipio", scope = UorgDados.class)
    public JAXBElement<String> createUorgDadosNomeMunicipio(String value) {
        return new JAXBElement<String>(_UorgDadosNomeMunicipio_QNAME, String.class, UorgDados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "dataCriacaoUorg", scope = UorgDados.class)
    public JAXBElement<String> createUorgDadosDataCriacaoUorg(String value) {
        return new JAXBElement<String>(_UorgDadosDataCriacaoUorg_QNAME, String.class, UorgDados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "cnpjLocalizador", scope = UorgDados.class)
    public JAXBElement<String> createUorgDadosCnpjLocalizador(String value) {
        return new JAXBElement<String>(_UorgDadosCnpjLocalizador_QNAME, String.class, UorgDados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "indicadorUorgDestIntegracao", scope = UorgDados.class)
    public JAXBElement<String> createUorgDadosIndicadorUorgDestIntegracao(String value) {
        return new JAXBElement<String>(_UorgDadosIndicadorUorgDestIntegracao_QNAME, String.class, UorgDados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "siglaOrgao", scope = UorgDados.class)
    public JAXBElement<String> createUorgDadosSiglaOrgao(String value) {
        return new JAXBElement<String>(_UorgDadosSiglaOrgao_QNAME, String.class, UorgDados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "codUnidadeSiafi", scope = UorgDados.class)
    public JAXBElement<String> createUorgDadosCodUnidadeSiafi(String value) {
        return new JAXBElement<String>(_UorgDadosCodUnidadeSiafi_QNAME, String.class, UorgDados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "siglaUorg", scope = UorgDados.class)
    public JAXBElement<String> createUorgDadosSiglaUorg(String value) {
        return new JAXBElement<String>(_UorgDadosSiglaUorg_QNAME, String.class, UorgDados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "codUorgPagadora", scope = UorgDados.class)
    public JAXBElement<String> createUorgDadosCodUorgPagadora(String value) {
        return new JAXBElement<String>(_UorgDadosCodUorgPagadora_QNAME, String.class, UorgDados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "indicadorUorgRegimenta", scope = UorgDados.class)
    public JAXBElement<String> createUorgDadosIndicadorUorgRegimenta(String value) {
        return new JAXBElement<String>(_UorgDadosIndicadorUorgRegimenta_QNAME, String.class, UorgDados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "indicadorUorgAdministrativa", scope = UorgDados.class)
    public JAXBElement<String> createUorgDadosIndicadorUorgAdministrativa(String value) {
        return new JAXBElement<String>(_UorgDadosIndicadorUorgAdministrativa_QNAME, String.class, UorgDados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "codAreaAtuaUorg", scope = UorgDados.class)
    public JAXBElement<String> createUorgDadosCodAreaAtuaUorg(String value) {
        return new JAXBElement<String>(_UorgDadosCodAreaAtuaUorg_QNAME, String.class, UorgDados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "nomeUorg", scope = UorgDados.class)
    public JAXBElement<String> createUorgDadosNomeUorg(String value) {
        return new JAXBElement<String>(_UorgDadosNomeUorg_QNAME, String.class, UorgDados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "cnpjUpag", scope = UorgDados.class)
    public JAXBElement<String> createUorgDadosCnpjUpag(String value) {
        return new JAXBElement<String>(_UorgDadosCnpjUpag_QNAME, String.class, UorgDados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "indicadorUorgPessoal", scope = UorgDados.class)
    public JAXBElement<String> createUorgDadosIndicadorUorgPessoal(String value) {
        return new JAXBElement<String>(_UorgDadosIndicadorUorgPessoal_QNAME, String.class, UorgDados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "codMunicipio", scope = UorgDados.class)
    public JAXBElement<String> createUorgDadosCodMunicipio(String value) {
        return new JAXBElement<String>(_UorgDadosCodMunicipio_QNAME, String.class, UorgDados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "codSiorgOrgao", scope = UorgDados.class)
    public JAXBElement<String> createUorgDadosCodSiorgOrgao(String value) {
        return new JAXBElement<String>(_UorgDadosCodSiorgOrgao_QNAME, String.class, UorgDados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "diplomaLegalCriacaoUorg", scope = UorgDados.class)
    public JAXBElement<String> createUorgDadosDiplomaLegalCriacaoUorg(String value) {
        return new JAXBElement<String>(_UorgDadosDiplomaLegalCriacaoUorg_QNAME, String.class, UorgDados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "indicadorUorgUpag", scope = UorgDados.class)
    public JAXBElement<String> createUorgDadosIndicadorUorgUpag(String value) {
        return new JAXBElement<String>(_UorgDadosIndicadorUorgUpag_QNAME, String.class, UorgDados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "codUorgPessoal", scope = UorgDados.class)
    public JAXBElement<String> createUorgDadosCodUorgPessoal(String value) {
        return new JAXBElement<String>(_UorgDadosCodUorgPessoal_QNAME, String.class, UorgDados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "nomeExtendido", scope = UorgDados.class)
    public JAXBElement<String> createUorgDadosNomeExtendido(String value) {
        return new JAXBElement<String>(_UorgDadosNomeExtendido_QNAME, String.class, UorgDados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "nomeUorgMaiusculo", scope = UorgDados.class)
    public JAXBElement<String> createUorgDadosNomeUorgMaiusculo(String value) {
        return new JAXBElement<String>(_UorgDadosNomeUorgMaiusculo_QNAME, String.class, UorgDados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sql.java", name = "SQLState", scope = SQLException.class)
    public JAXBElement<String> createSQLExceptionSQLState(String value) {
        return new JAXBElement<String>(_SQLExceptionSQLState_QNAME, String.class, SQLException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SQLException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sql.java", name = "nextException", scope = SQLException.class)
    public JAXBElement<SQLException> createSQLExceptionNextException(SQLException value) {
        return new JAXBElement<SQLException>(_SQLExceptionNextException_QNAME, SQLException.class, SQLException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "cpf", scope = Servidor.class)
    public JAXBElement<String> createServidorCpf(String value) {
        return new JAXBElement<String>(_ServidorCpf_QNAME, String.class, Servidor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "dataUltimaTransacao", scope = Servidor.class)
    public JAXBElement<String> createServidorDataUltimaTransacao(String value) {
        return new JAXBElement<String>(_UorgDataUltimaTransacao_QNAME, String.class, Servidor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeMunicipNasc", scope = DadosPessoais.class)
    public JAXBElement<String> createDadosPessoaisNomeMunicipNasc(String value) {
        return new JAXBElement<String>(_DadosPessoaisNomeMunicipNasc_QNAME, String.class, DadosPessoais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeSexo", scope = DadosPessoais.class)
    public JAXBElement<String> createDadosPessoaisNomeSexo(String value) {
        return new JAXBElement<String>(_DadosPessoaisNomeSexo_QNAME, String.class, DadosPessoais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeCor", scope = DadosPessoais.class)
    public JAXBElement<String> createDadosPessoaisNomeCor(String value) {
        return new JAXBElement<String>(_DadosPessoaisNomeCor_QNAME, String.class, DadosPessoais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codNacionalidade", scope = DadosPessoais.class)
    public JAXBElement<String> createDadosPessoaisCodNacionalidade(String value) {
        return new JAXBElement<String>(_DadosPessoaisCodNacionalidade_QNAME, String.class, DadosPessoais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nome", scope = DadosPessoais.class)
    public JAXBElement<String> createDadosPessoaisNome(String value) {
        return new JAXBElement<String>(_DadosRepresentanteLegalNome_QNAME, String.class, DadosPessoais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeNacionalidade", scope = DadosPessoais.class)
    public JAXBElement<String> createDadosPessoaisNomeNacionalidade(String value) {
        return new JAXBElement<String>(_DadosPessoaisNomeNacionalidade_QNAME, String.class, DadosPessoais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "numPisPasep", scope = DadosPessoais.class)
    public JAXBElement<String> createDadosPessoaisNumPisPasep(String value) {
        return new JAXBElement<String>(_DadosDocumentacaoNumPisPasep_QNAME, String.class, DadosPessoais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codCor", scope = DadosPessoais.class)
    public JAXBElement<String> createDadosPessoaisCodCor(String value) {
        return new JAXBElement<String>(_DadosPessoaisCodCor_QNAME, String.class, DadosPessoais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "grupoSanguineo", scope = DadosPessoais.class)
    public JAXBElement<String> createDadosPessoaisGrupoSanguineo(String value) {
        return new JAXBElement<String>(_DadosPessoaisGrupoSanguineo_QNAME, String.class, DadosPessoais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataChegBrasil", scope = DadosPessoais.class)
    public JAXBElement<String> createDadosPessoaisDataChegBrasil(String value) {
        return new JAXBElement<String>(_DadosPessoaisDataChegBrasil_QNAME, String.class, DadosPessoais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeEstadoCivil", scope = DadosPessoais.class)
    public JAXBElement<String> createDadosPessoaisNomeEstadoCivil(String value) {
        return new JAXBElement<String>(_DadosPessoaisNomeEstadoCivil_QNAME, String.class, DadosPessoais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "ufNascimento", scope = DadosPessoais.class)
    public JAXBElement<String> createDadosPessoaisUfNascimento(String value) {
        return new JAXBElement<String>(_DadosPessoaisUfNascimento_QNAME, String.class, DadosPessoais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codDefFisica", scope = DadosPessoais.class)
    public JAXBElement<String> createDadosPessoaisCodDefFisica(String value) {
        return new JAXBElement<String>(_DadosPessoaisCodDefFisica_QNAME, String.class, DadosPessoais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomePai", scope = DadosPessoais.class)
    public JAXBElement<String> createDadosPessoaisNomePai(String value) {
        return new JAXBElement<String>(_DadosPessoaisNomePai_QNAME, String.class, DadosPessoais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codSexo", scope = DadosPessoais.class)
    public JAXBElement<String> createDadosPessoaisCodSexo(String value) {
        return new JAXBElement<String>(_DadosPessoaisCodSexo_QNAME, String.class, DadosPessoais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataNascimento", scope = DadosPessoais.class)
    public JAXBElement<String> createDadosPessoaisDataNascimento(String value) {
        return new JAXBElement<String>(_DadosPessoaisDataNascimento_QNAME, String.class, DadosPessoais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codEstadoCivil", scope = DadosPessoais.class)
    public JAXBElement<String> createDadosPessoaisCodEstadoCivil(String value) {
        return new JAXBElement<String>(_DadosPessoaisCodEstadoCivil_QNAME, String.class, DadosPessoais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeDefFisica", scope = DadosPessoais.class)
    public JAXBElement<String> createDadosPessoaisNomeDefFisica(String value) {
        return new JAXBElement<String>(_DadosPessoaisNomeDefFisica_QNAME, String.class, DadosPessoais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeMae", scope = DadosPessoais.class)
    public JAXBElement<String> createDadosPessoaisNomeMae(String value) {
        return new JAXBElement<String>(_DadosPessoaisNomeMae_QNAME, String.class, DadosPessoais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomePais", scope = DadosPessoais.class)
    public JAXBElement<String> createDadosPessoaisNomePais(String value) {
        return new JAXBElement<String>(_DadosPessoaisNomePais_QNAME, String.class, DadosPessoais.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "data", scope = ArrayFichaFinanceira.class)
    public JAXBElement<String> createArrayFichaFinanceiraData(String value) {
        return new JAXBElement<String>(_ArrayFichaFinanceiraData_QNAME, String.class, ArrayFichaFinanceira.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFichaFinaceiraBeneficiario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "fichaFinaceiraBeneficiario", scope = ArrayFichaFinanceira.class)
    public JAXBElement<ArrayOfFichaFinaceiraBeneficiario> createArrayFichaFinanceiraFichaFinaceiraBeneficiario(ArrayOfFichaFinaceiraBeneficiario value) {
        return new JAXBElement<ArrayOfFichaFinaceiraBeneficiario>(_ArrayFichaFinanceiraFichaFinaceiraBeneficiario_QNAME, ArrayOfFichaFinaceiraBeneficiario.class, ArrayFichaFinanceira.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeCurso", scope = DadosCurso.class)
    public JAXBElement<String> createDadosCursoNomeCurso(String value) {
        return new JAXBElement<String>(_DadosCursoNomeCurso_QNAME, String.class, DadosCurso.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codCurso", scope = DadosCurso.class)
    public JAXBElement<String> createDadosCursoCodCurso(String value) {
        return new JAXBElement<String>(_DadosCursoCodCurso_QNAME, String.class, DadosCurso.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDadosSICAJ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dadosSICAJ", scope = ArrayDadosSICAJ.class)
    public JAXBElement<ArrayOfDadosSICAJ> createArrayDadosSICAJDadosSICAJ(ArrayOfDadosSICAJ value) {
        return new JAXBElement<ArrayOfDadosSICAJ>(_ArrayDadosSICAJDadosSICAJ_QNAME, ArrayOfDadosSICAJ.class, ArrayDadosSICAJ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPensaoRecebida }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "pensaoRecebida", scope = ArrayPensaoRecebida.class)
    public JAXBElement<ArrayOfPensaoRecebida> createArrayPensaoRecebidaPensaoRecebida(ArrayOfPensaoRecebida value) {
        return new JAXBElement<ArrayOfPensaoRecebida>(_ArrayPensaoRecebidaPensaoRecebida_QNAME, ArrayOfPensaoRecebida.class, ArrayPensaoRecebida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeParentesco", scope = PensoesInstituidas.class)
    public JAXBElement<String> createPensoesInstituidasNomeParentesco(String value) {
        return new JAXBElement<String>(_PensaoRecebidaNomeParentesco_QNAME, String.class, PensoesInstituidas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "orgaoPensionista", scope = PensoesInstituidas.class)
    public JAXBElement<String> createPensoesInstituidasOrgaoPensionista(String value) {
        return new JAXBElement<String>(_PensoesInstituidasOrgaoPensionista_QNAME, String.class, PensoesInstituidas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomePensionista", scope = PensoesInstituidas.class)
    public JAXBElement<String> createPensoesInstituidasNomePensionista(String value) {
        return new JAXBElement<String>(_PensoesInstituidasNomePensionista_QNAME, String.class, PensoesInstituidas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "banco", scope = PensoesInstituidas.class)
    public JAXBElement<String> createPensoesInstituidasBanco(String value) {
        return new JAXBElement<String>(_DadosBancariosBanco_QNAME, String.class, PensoesInstituidas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "conta", scope = PensoesInstituidas.class)
    public JAXBElement<String> createPensoesInstituidasConta(String value) {
        return new JAXBElement<String>(_PensaoRecebidaConta_QNAME, String.class, PensoesInstituidas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "naturezaPensao", scope = PensoesInstituidas.class)
    public JAXBElement<String> createPensoesInstituidasNaturezaPensao(String value) {
        return new JAXBElement<String>(_PensaoRecebidaNaturezaPensao_QNAME, String.class, PensoesInstituidas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeRepresentanteLegal", scope = PensoesInstituidas.class)
    public JAXBElement<String> createPensoesInstituidasNomeRepresentanteLegal(String value) {
        return new JAXBElement<String>(_PensaoRecebidaNomeRepresentanteLegal_QNAME, String.class, PensoesInstituidas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "tipoPensao", scope = PensoesInstituidas.class)
    public JAXBElement<String> createPensoesInstituidasTipoPensao(String value) {
        return new JAXBElement<String>(_PensaoRecebidaTipoPensao_QNAME, String.class, PensoesInstituidas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "agencia", scope = PensoesInstituidas.class)
    public JAXBElement<String> createPensoesInstituidasAgencia(String value) {
        return new JAXBElement<String>(_DadosBancariosAgencia_QNAME, String.class, PensoesInstituidas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codParentesco", scope = PensoesInstituidas.class)
    public JAXBElement<String> createPensoesInstituidasCodParentesco(String value) {
        return new JAXBElement<String>(_PensaoRecebidaCodParentesco_QNAME, String.class, PensoesInstituidas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "matriculaPensionista", scope = PensoesInstituidas.class)
    public JAXBElement<String> createPensoesInstituidasMatriculaPensionista(String value) {
        return new JAXBElement<String>(_PensoesInstituidasMatriculaPensionista_QNAME, String.class, PensoesInstituidas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayFichaFinanceira }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "arrayFichaFinanceira", scope = PensoesInstituidas.class)
    public JAXBElement<ArrayFichaFinanceira> createPensoesInstituidasArrayFichaFinanceira(ArrayFichaFinanceira value) {
        return new JAXBElement<ArrayFichaFinanceira>(_PensaoRecebidaArrayFichaFinanceira_QNAME, ArrayFichaFinanceira.class, PensoesInstituidas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeTipoPensao", scope = PensoesInstituidas.class)
    public JAXBElement<String> createPensoesInstituidasNomeTipoPensao(String value) {
        return new JAXBElement<String>(_PensaoRecebidaNomeTipoPensao_QNAME, String.class, PensoesInstituidas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "cpfRepresentanteLegal", scope = PensoesInstituidas.class)
    public JAXBElement<String> createPensoesInstituidasCpfRepresentanteLegal(String value) {
        return new JAXBElement<String>(_PensaoRecebidaCpfRepresentanteLegal_QNAME, String.class, PensoesInstituidas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "cpfPensionista", scope = PensoesInstituidas.class)
    public JAXBElement<String> createPensoesInstituidasCpfPensionista(String value) {
        return new JAXBElement<String>(_PensoesInstituidasCpfPensionista_QNAME, String.class, PensoesInstituidas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "cotaPensao", scope = PensoesInstituidas.class)
    public JAXBElement<String> createPensoesInstituidasCotaPensao(String value) {
        return new JAXBElement<String>(_PensaoRecebidaCotaPensao_QNAME, String.class, PensoesInstituidas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDadosDependentes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dadosDependentes", scope = ArrayDadosDependentes.class)
    public JAXBElement<ArrayOfDadosDependentes> createArrayDadosDependentesDadosDependentes(ArrayOfDadosDependentes value) {
        return new JAXBElement<ArrayOfDadosDependentes>(_ArrayDadosDependentesDadosDependentes_QNAME, ArrayOfDadosDependentes.class, ArrayDadosDependentes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codRubrica", scope = DadosFinanceiros.class)
    public JAXBElement<String> createDadosFinanceirosCodRubrica(String value) {
        return new JAXBElement<String>(_DadosFinanceirosCodRubrica_QNAME, String.class, DadosFinanceiros.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataAnoMesRubrica", scope = DadosFinanceiros.class)
    public JAXBElement<String> createDadosFinanceirosDataAnoMesRubrica(String value) {
        return new JAXBElement<String>(_DadosFinanceirosDataAnoMesRubrica_QNAME, String.class, DadosFinanceiros.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "indicadorRD", scope = DadosFinanceiros.class)
    public JAXBElement<String> createDadosFinanceirosIndicadorRD(String value) {
        return new JAXBElement<String>(_DadosFinanceirosIndicadorRD_QNAME, String.class, DadosFinanceiros.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "peRubrica", scope = DadosFinanceiros.class)
    public JAXBElement<String> createDadosFinanceirosPeRubrica(String value) {
        return new JAXBElement<String>(_DadosFinanceirosPeRubrica_QNAME, String.class, DadosFinanceiros.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "valorRubrica", scope = DadosFinanceiros.class)
    public JAXBElement<String> createDadosFinanceirosValorRubrica(String value) {
        return new JAXBElement<String>(_DadosFinanceirosValorRubrica_QNAME, String.class, DadosFinanceiros.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "indicadorMovSupl", scope = DadosFinanceiros.class)
    public JAXBElement<String> createDadosFinanceirosIndicadorMovSupl(String value) {
        return new JAXBElement<String>(_DadosFinanceirosIndicadorMovSupl_QNAME, String.class, DadosFinanceiros.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "pzRubrica", scope = DadosFinanceiros.class)
    public JAXBElement<String> createDadosFinanceirosPzRubrica(String value) {
        return new JAXBElement<String>(_DadosFinanceirosPzRubrica_QNAME, String.class, DadosFinanceiros.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeRubrica", scope = DadosFinanceiros.class)
    public JAXBElement<String> createDadosFinanceirosNomeRubrica(String value) {
        return new JAXBElement<String>(_DadosFinanceirosNomeRubrica_QNAME, String.class, DadosFinanceiros.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "numeroSeq", scope = DadosFinanceiros.class)
    public JAXBElement<String> createDadosFinanceirosNumeroSeq(String value) {
        return new JAXBElement<String>(_DadosFinanceirosNumeroSeq_QNAME, String.class, DadosFinanceiros.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "dataInicio", scope = ParticipacaoComissoes.class)
    public JAXBElement<String> createParticipacaoComissoesDataInicio(String value) {
        return new JAXBElement<String>(_ExperienciaProfissionalDataInicio_QNAME, String.class, ParticipacaoComissoes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "infoAdicionais", scope = ParticipacaoComissoes.class)
    public JAXBElement<String> createParticipacaoComissoesInfoAdicionais(String value) {
        return new JAXBElement<String>(_ParticipacaoComissoesInfoAdicionais_QNAME, String.class, ParticipacaoComissoes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "codigo", scope = ParticipacaoComissoes.class)
    public JAXBElement<Integer> createParticipacaoComissoesCodigo(Integer value) {
        return new JAXBElement<Integer>(_TipoParticipacaoComissoesCodigo_QNAME, Integer.class, ParticipacaoComissoes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoParticipacaoComissoes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "tipoParticipacaoComissoes", scope = ParticipacaoComissoes.class)
    public JAXBElement<TipoParticipacaoComissoes> createParticipacaoComissoesTipoParticipacaoComissoes(TipoParticipacaoComissoes value) {
        return new JAXBElement<TipoParticipacaoComissoes>(_ParticipacaoComissoesTipoParticipacaoComissoes_QNAME, TipoParticipacaoComissoes.class, ParticipacaoComissoes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "identificUnica", scope = ParticipacaoComissoes.class)
    public JAXBElement<String> createParticipacaoComissoesIdentificUnica(String value) {
        return new JAXBElement<String>(_FormacaoAcademicaIdentificUnica_QNAME, String.class, ParticipacaoComissoes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "tipoDesc", scope = ParticipacaoComissoes.class)
    public JAXBElement<String> createParticipacaoComissoesTipoDesc(String value) {
        return new JAXBElement<String>(_ParticipacaoComissoesTipoDesc_QNAME, String.class, ParticipacaoComissoes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "dataFim", scope = ParticipacaoComissoes.class)
    public JAXBElement<String> createParticipacaoComissoesDataFim(String value) {
        return new JAXBElement<String>(_ExperienciaProfissionalDataFim_QNAME, String.class, ParticipacaoComissoes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdiomasDominio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "idiomasFala", scope = Idiomas.class)
    public JAXBElement<IdiomasDominio> createIdiomasIdiomasFala(IdiomasDominio value) {
        return new JAXBElement<IdiomasDominio>(_IdiomasIdiomasFala_QNAME, IdiomasDominio.class, Idiomas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdiomasDominio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "idiomasLe", scope = Idiomas.class)
    public JAXBElement<IdiomasDominio> createIdiomasIdiomasLe(IdiomasDominio value) {
        return new JAXBElement<IdiomasDominio>(_IdiomasIdiomasLe_QNAME, IdiomasDominio.class, Idiomas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdiomasDesc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "idiomasDesc", scope = Idiomas.class)
    public JAXBElement<IdiomasDesc> createIdiomasIdiomasDesc(IdiomasDesc value) {
        return new JAXBElement<IdiomasDesc>(_IdiomasIdiomasDesc_QNAME, IdiomasDesc.class, Idiomas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "codigo", scope = Idiomas.class)
    public JAXBElement<Integer> createIdiomasCodigo(Integer value) {
        return new JAXBElement<Integer>(_TipoParticipacaoComissoesCodigo_QNAME, Integer.class, Idiomas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdiomasDominio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "idiomasEscreve", scope = Idiomas.class)
    public JAXBElement<IdiomasDominio> createIdiomasIdiomasEscreve(IdiomasDominio value) {
        return new JAXBElement<IdiomasDominio>(_IdiomasIdiomasEscreve_QNAME, IdiomasDominio.class, Idiomas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "identificUnica", scope = Idiomas.class)
    public JAXBElement<String> createIdiomasIdentificUnica(String value) {
        return new JAXBElement<String>(_FormacaoAcademicaIdentificUnica_QNAME, String.class, Idiomas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codRubrica", scope = FichaFinaceiraBeneficiario.class)
    public JAXBElement<String> createFichaFinaceiraBeneficiarioCodRubrica(String value) {
        return new JAXBElement<String>(_DadosFinanceirosCodRubrica_QNAME, String.class, FichaFinaceiraBeneficiario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "dataAnoMesRubrica", scope = FichaFinaceiraBeneficiario.class)
    public JAXBElement<String> createFichaFinaceiraBeneficiarioDataAnoMesRubrica(String value) {
        return new JAXBElement<String>(_DadosFinanceirosDataAnoMesRubrica_QNAME, String.class, FichaFinaceiraBeneficiario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "indicadorRD", scope = FichaFinaceiraBeneficiario.class)
    public JAXBElement<String> createFichaFinaceiraBeneficiarioIndicadorRD(String value) {
        return new JAXBElement<String>(_DadosFinanceirosIndicadorRD_QNAME, String.class, FichaFinaceiraBeneficiario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "peRubrica", scope = FichaFinaceiraBeneficiario.class)
    public JAXBElement<String> createFichaFinaceiraBeneficiarioPeRubrica(String value) {
        return new JAXBElement<String>(_DadosFinanceirosPeRubrica_QNAME, String.class, FichaFinaceiraBeneficiario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "valorRubrica", scope = FichaFinaceiraBeneficiario.class)
    public JAXBElement<String> createFichaFinaceiraBeneficiarioValorRubrica(String value) {
        return new JAXBElement<String>(_DadosFinanceirosValorRubrica_QNAME, String.class, FichaFinaceiraBeneficiario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "indicadorMovSupl", scope = FichaFinaceiraBeneficiario.class)
    public JAXBElement<String> createFichaFinaceiraBeneficiarioIndicadorMovSupl(String value) {
        return new JAXBElement<String>(_DadosFinanceirosIndicadorMovSupl_QNAME, String.class, FichaFinaceiraBeneficiario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "pzRubrica", scope = FichaFinaceiraBeneficiario.class)
    public JAXBElement<String> createFichaFinaceiraBeneficiarioPzRubrica(String value) {
        return new JAXBElement<String>(_DadosFinanceirosPzRubrica_QNAME, String.class, FichaFinaceiraBeneficiario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codSistemaClassifCempFuncao", scope = FichaFinaceiraBeneficiario.class)
    public JAXBElement<String> createFichaFinaceiraBeneficiarioCodSistemaClassifCempFuncao(String value) {
        return new JAXBElement<String>(_FichaFinaceiraBeneficiarioCodSistemaClassifCempFuncao_QNAME, String.class, FichaFinaceiraBeneficiario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codigoAssunto", scope = FichaFinaceiraBeneficiario.class)
    public JAXBElement<String> createFichaFinaceiraBeneficiarioCodigoAssunto(String value) {
        return new JAXBElement<String>(_FichaFinaceiraBeneficiarioCodigoAssunto_QNAME, String.class, FichaFinaceiraBeneficiario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "nomeRubrica", scope = FichaFinaceiraBeneficiario.class)
    public JAXBElement<String> createFichaFinaceiraBeneficiarioNomeRubrica(String value) {
        return new JAXBElement<String>(_DadosFinanceirosNomeRubrica_QNAME, String.class, FichaFinaceiraBeneficiario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "numeroSeq", scope = FichaFinaceiraBeneficiario.class)
    public JAXBElement<String> createFichaFinaceiraBeneficiarioNumeroSeq(String value) {
        return new JAXBElement<String>(_DadosFinanceirosNumeroSeq_QNAME, String.class, FichaFinaceiraBeneficiario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "codIdentCempFuncao", scope = FichaFinaceiraBeneficiario.class)
    public JAXBElement<String> createFichaFinaceiraBeneficiarioCodIdentCempFuncao(String value) {
        return new JAXBElement<String>(_FichaFinaceiraBeneficiarioCodIdentCempFuncao_QNAME, String.class, FichaFinaceiraBeneficiario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDadosUorg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "uorgs", scope = ArrayDadosUorg.class)
    public JAXBElement<ArrayOfDadosUorg> createArrayDadosUorgUorgs(ArrayOfDadosUorg value) {
        return new JAXBElement<ArrayOfDadosUorg>(_ArrayDadosUorgUorgs_QNAME, ArrayOfDadosUorg.class, ArrayDadosUorg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDadosOcorrencias }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "ocorrencias", scope = DadosAfastamentoPorCpf.class)
    public JAXBElement<ArrayOfDadosOcorrencias> createDadosAfastamentoPorCpfOcorrencias(ArrayOfDadosOcorrencias value) {
        return new JAXBElement<ArrayOfDadosOcorrencias>(_DadosAfastamentoPorMatriculaOcorrencias_QNAME, ArrayOfDadosOcorrencias.class, DadosAfastamentoPorCpf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDadosReclusao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tipo.servico.wssiapenet", name = "reclusao", scope = DadosAfastamentoPorCpf.class)
    public JAXBElement<ArrayOfDadosReclusao> createDadosAfastamentoPorCpfReclusao(ArrayOfDadosReclusao value) {
        return new JAXBElement<ArrayOfDadosReclusao>(_DadosAfastamentoPorMatriculaReclusao_QNAME, ArrayOfDadosReclusao.class, DadosAfastamentoPorCpf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "cpf", scope = DadosCurriculo.class)
    public JAXBElement<String> createDadosCurriculoCpf(String value) {
        return new JAXBElement<String>(_ServidorCpf_QNAME, String.class, DadosCurriculo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFormacaoAcademica }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "listaFormacaoAcademica", scope = DadosCurriculo.class)
    public JAXBElement<ArrayOfFormacaoAcademica> createDadosCurriculoListaFormacaoAcademica(ArrayOfFormacaoAcademica value) {
        return new JAXBElement<ArrayOfFormacaoAcademica>(_DadosCurriculoListaFormacaoAcademica_QNAME, ArrayOfFormacaoAcademica.class, DadosCurriculo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCurso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "listaCurso", scope = DadosCurriculo.class)
    public JAXBElement<ArrayOfCurso> createDadosCurriculoListaCurso(ArrayOfCurso value) {
        return new JAXBElement<ArrayOfCurso>(_DadosCurriculoListaCurso_QNAME, ArrayOfCurso.class, DadosCurriculo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIdiomas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "listaIdiomas", scope = DadosCurriculo.class)
    public JAXBElement<ArrayOfIdiomas> createDadosCurriculoListaIdiomas(ArrayOfIdiomas value) {
        return new JAXBElement<ArrayOfIdiomas>(_DadosCurriculoListaIdiomas_QNAME, ArrayOfIdiomas.class, DadosCurriculo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfParticipacaoComissoes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "listaParticipacaoComissoes", scope = DadosCurriculo.class)
    public JAXBElement<ArrayOfParticipacaoComissoes> createDadosCurriculoListaParticipacaoComissoes(ArrayOfParticipacaoComissoes value) {
        return new JAXBElement<ArrayOfParticipacaoComissoes>(_DadosCurriculoListaParticipacaoComissoes_QNAME, ArrayOfParticipacaoComissoes.class, DadosCurriculo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExperienciaProfissional }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "listaExperienciaProfissional", scope = DadosCurriculo.class)
    public JAXBElement<ArrayOfExperienciaProfissional> createDadosCurriculoListaExperienciaProfissional(ArrayOfExperienciaProfissional value) {
        return new JAXBElement<ArrayOfExperienciaProfissional>(_DadosCurriculoListaExperienciaProfissional_QNAME, ArrayOfExperienciaProfissional.class, DadosCurriculo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidade.wssiapenet", name = "identificUnica", scope = DadosCurriculo.class)
    public JAXBElement<Integer> createDadosCurriculoIdentificUnica(Integer value) {
        return new JAXBElement<Integer>(_FormacaoAcademicaIdentificUnica_QNAME, Integer.class, DadosCurriculo.class, value);
    }

}
