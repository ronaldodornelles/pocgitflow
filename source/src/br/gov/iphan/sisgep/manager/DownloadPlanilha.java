package br.gov.iphan.sisgep.manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;

/**
 * Servlet implementation class DownloadServlet
 */
public class DownloadPlanilha extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DownloadPlanilha() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String parameterNomeArquivo = request.getParameter("nomeArquivo");
		if (StringUtils.isBlank(parameterNomeArquivo)) {
			return;
		}
		File attributeFile = (File) request.getSession().getAttribute(parameterNomeArquivo);
		if (attributeFile == null) {
			return;
		}
		request.getSession().removeAttribute(parameterNomeArquivo);
		response.setHeader("Content-Disposition",
				"attachment;filename=Planilhas.zip");
		response.setContentLength((int) attributeFile.length());
		ServletOutputStream out = null;
		try {
			FileInputStream input = new FileInputStream(attributeFile);
			byte[] buffer = new byte[1024];
			out = response.getOutputStream();
			int i = 0;
			while ((i = input.read(buffer)) != -1) {
				out.write(buffer);
				out.flush();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException err) {
				err.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
