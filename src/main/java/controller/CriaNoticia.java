package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Noticia;
import model.NoticiaService;

@WebServlet("/CriaNoticias")
public class CriaNoticia extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		NoticiaService noticiaService = NoticiaService.getNoticiaService();
		
		String nome = (String) request.getAttribute("nome");
		String resumo = (String) request.getAttribute("resumo");
		String assunto = (String) request.getAttribute("assunto");
		String categoria = (String) request.getAttribute("categoria");
		String fonte = (String) request.getAttribute("fonte");
		String data = (String) request.getAttribute("data");
		String imagem = (String) request.getAttribute("caminhoImg");
		String conteudo = (String) request.getAttribute("conteudo");
		
		Noticia noticia = new Noticia(nome,resumo,assunto,categoria,fonte,data,imagem,conteudo);
		noticiaService.salvaNoticia(noticia);
		response.sendRedirect("PainelAdmin");
	}
}
