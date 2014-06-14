package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Noticia;
import model.NoticiaService;

@WebServlet("/EditarNoticia")
public class EditarNoticia extends HttpServlet {
	private static final long serialVersionUID = 1L;
	NoticiaService noticiaService = NoticiaService.getNoticiaService();
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Noticia noticia;
		Integer id = Integer.parseInt(request.getParameter("ID"));
		noticia = noticiaService.getNoticia(id);
		request.setAttribute("noticia", noticia);
		request.getRequestDispatcher("editarNoticia.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		Integer id = (Integer) request.getAttribute("ID");
		String nome = (String) request.getAttribute("nome");
		String resumo = (String) request.getAttribute("resumo");
		String assunto = (String) request.getAttribute("assunto");
		String fonte = (String) request.getAttribute("fonte");
		String data = (String) request.getAttribute("data");
		String conteudo = (String) request.getAttribute("conteudo");
		Noticia noticia = new Noticia();
		noticia.setId(id);
		noticia.setNome(nome);
		noticia.setResumo(resumo);
		noticia.setAssunto(assunto);
		noticia.setFonte(fonte);
		noticia.setData(data);
		noticia.setConteudo(conteudo);
		noticiaService.updateNoticia(noticia);
		response.sendRedirect("ListarTodas");
	}
}
