package br.gov.iphan.sisgep.ws.clientsample;

import br.gov.iphan.sisgep.ws.*;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        ConsultaSIAPE_Service service1 = new ConsultaSIAPE_Service();
	        System.out.println("Create Web Service...");
	        ConsultaSIAPE port1 = service1.getConsultaSIAPEHttpPort();
	        System.out.println("Call Web Service Operation...");
	        /*
	        System.out.println("Server said: " + port1.consultaDadosDocumentacao(args[0],args[1],args[2],args[3],args[4],args[5],args[6]));
	        System.out.println("Server said: " + port1.listaServidores(args[7],args[8],args[9],args[10],args[11],args[12]));
	        System.out.println("Server said: " + port1.consultaDadosFinanceiros(args[13],args[14],args[15],args[16],args[17],args[18],args[19]));
	        System.out.println("Server said: " + port1.consultaDadosSICAJ(args[20],args[21],args[22],args[23],args[24],args[25],args[26]));
	        System.out.println("Server said: " + port1.consultaDadosFuncionais(args[27],args[28],args[29],args[30],args[31],args[32],args[33]));
	        System.out.println("Server said: " + port1.getPensionista(args[34],args[35],args[36],args[37],args[38]));
	        System.out.println("Server said: " + port1.consultaDadosEscolares(args[39],args[40],args[41],args[42],args[43],args[44],args[45]));
	        System.out.println("Server said: " + port1.consultaDadosBancarios(args[46],args[47],args[48],args[49],args[50],args[51],args[52]));
	        System.out.println("Server said: " + port1.consultaDadosEnderecoResidencial(args[53],args[54],args[55],args[56],args[57],args[58],args[59]));
	        System.out.println("Server said: " + port1.consultaDadosAfastamento(args[60],args[61],args[62],args[63],args[64],args[65],args[66]));
	        System.out.println("Server said: " + port1.consultaDadosRepresentanteLegal(args[67],args[68],args[69],args[70],args[71],args[72],args[73]));
	        System.out.println("Server said: " + port1.consultaDadosCurriculo(args[74],args[75],args[76],args[77],args[78],args[79],args[80]));
	        System.out.println("Server said: " + port1.consultaDadosUorg(args[81],args[82],args[83],args[84],args[85],args[86],args[87]));
	        System.out.println("Server said: " + port1.consultaTotalizadorVagasOrgao(args[88],args[89],args[90],args[91],args[92]));
	        System.out.println("Server said: " + port1.dadosUorg(args[93],args[94],args[95],args[96],args[97],args[98]));
	        System.out.println("Server said: " + port1.consultaDadosDependentes(args[99],args[100],args[101],args[102],args[103],args[104],args[105]));
	        System.out.println("Server said: " + port1.consultaDadosPA(args[106],args[107],args[108],args[109],args[110],args[111],args[112]));
	        System.out.println("Server said: " + port1.listaUorgs(args[113],args[114],args[115],args[116],args[117],args[118]));
	        System.out.println("Server said: " + port1.consultaDadosPessoais(args[119],args[120],args[121],args[122],args[123],args[124],args[125]));
	        System.out.println("Server said: " + port1.consultaPensaoRecebida(args[126],args[127],args[128],args[129],args[130],args[131],args[132]));
	        System.out.println("Server said: " + port1.obterVersao(args[133]));
	        System.out.println("Server said: " + port1.consultaPensoesInstituidas(args[134],args[135],args[136],args[137],args[138],args[139],args[140]));
	        */
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
