package controller;

import java.util.List;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Noticia;
import model.NoticiaService;


public class Inicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NoticiaService noticiaService = NoticiaService.getNoticiaService();
		List<Noticia> noticias = noticiaService.obterTodasNoticias();
		request.setAttribute("noticias", noticias);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
