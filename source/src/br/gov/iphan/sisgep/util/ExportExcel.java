package br.gov.iphan.sisgep.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;
import org.apache.poi.hssf.usermodel.HSSFPicture;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xssf.usermodel.XSSFFont;

/**
 *
 * @author
 */
public class ExportExcel
{

	private OutputStream arqSaida;
	private HSSFWorkbook workbook;
	private HSSFSheet principalSheet;
	private String titulo;
	private List<String[]> lista = new ArrayList<String[]>();
	private String[] listaCabecalho;

	public ExportExcel(String nomePlanilha, String arqSaida) throws IOException
	{
		this.arqSaida = new FileOutputStream(arqSaida);
		workbook = new HSSFWorkbook();
		principalSheet = workbook.createSheet(nomePlanilha);
	     InputStream my_banner_image = new FileInputStream("C:\\Users\\Anderson do Carmo\\Downloads\\relatorio_sincronizacao.png");
         /* Convert Image to byte array */
         byte[] bytes = IOUtils.toByteArray(my_banner_image);
         /* Add Picture to workbook and get a index for the picture */
         int my_picture_id = workbook.addPicture(bytes, Workbook.PICTURE_TYPE_PNG);
         /* Close Input Stream */
         my_banner_image.close();                
         /* Create the drawing container */
         HSSFPatriarch drawing = principalSheet.createDrawingPatriarch();
         /* Create an anchor point */
         ClientAnchor my_anchor = new HSSFClientAnchor();
         /* Define top left corner, and we can resize picture suitable from there */
         my_anchor.setCol1(0);
         my_anchor.setRow1(0);
         /* Invoke createPicture and pass the anchor point and ID */
         HSSFPicture  my_picture = drawing.createPicture(my_anchor, my_picture_id);
         /* Call resize method, which resizes the image */
         my_picture.resize();
	}

	public ExportExcel(String arqSaida) throws IOException
	{
		this("sheet1", arqSaida);
	}

	public void escreverTitulo(String dados) throws IOException
	{
		titulo = dados;
	}

	public void escreverCabecalho(String[] dados) throws IOException
	{
		listaCabecalho = dados;
	}

	public void addTodosDados(String[][] dados) throws IOException
	{
		lista.addAll(Arrays.asList(dados));
	}

	public void close() throws IOException
	{
		flush();
		arqSaida.close();
	}

	private void flush() throws IOException
	{
		String dados[] = null;
		int pularLinha = 0;
		HSSFRow row;
		HSSFCell cell;

		if (titulo != null && !titulo.equals(""))
		{
			row = principalSheet.createRow(0);
			cell = row.createCell((short) 0);
			cell.setCellValue(titulo);
			pularLinha++;
		}

		HSSFCellStyle styleTitulo = workbook.createCellStyle();
		styleTitulo.setVerticalAlignment(HSSFCellStyle.VERTICAL_JUSTIFY);
		// styleTitulo.setBorderBottom((short) 2);
		// styleTitulo.setBorderLeft((short) 2);
		// styleTitulo.setBorderRight((short) 2);
		// styleTitulo.setBorderTop((short) 2);

		HSSFFont font = workbook.createFont();
		font.setFontHeightInPoints((short) 10);
		font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
		styleTitulo.setFont(font);

		row = principalSheet.createRow(pularLinha);
		pularLinha++;
		for (int i = 0; i < listaCabecalho.length; i++)
		{
			cell = row.createCell((short) i);
			cell.setCellValue(listaCabecalho[i]);
			cell.setCellStyle(styleTitulo);
			principalSheet.setColumnWidth((short) i, (short) 8800);
		}

		String s;
		for (int linha = 0; linha < lista.size(); linha++)
		{
			dados = lista.get(linha);
			row = principalSheet.createRow(linha + pularLinha);
			for (int col = 0; col < dados.length; col++)
			{
				s = dados[col];
				cell = row.createCell((short) col);
				cell.setCellValue(s);
			}
		}

		workbook.write(arqSaida);
		arqSaida.flush();

		lista = new ArrayList<String[]>();
	}
}
