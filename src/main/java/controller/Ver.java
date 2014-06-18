package controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Noticia;
import model.NoticiaService;

public class Ver extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NoticiaService noticiaService = NoticiaService.getNoticiaService();
		String categoria = (String)request.getParameter("categoria");
		List<Noticia> noticias = noticiaService.obterCategoriaNoticias(categoria);
		request.setAttribute("noticias", noticias);
		request.getRequestDispatcher(categoria+"/index.jsp").forward(request, response);;
	}

}