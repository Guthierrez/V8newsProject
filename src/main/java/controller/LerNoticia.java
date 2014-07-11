package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Noticia;
import model.NoticiaService;

public class LerNoticia extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NoticiaService noticiaService = NoticiaService.getNoticiaService();
		Integer ID = Integer.parseInt(request.getParameter("ID"));
		Noticia noticia = noticiaService.lerNoticia(ID);
		List<Noticia> noticias = noticiaService.obterNoticias(noticia.getCategoria());
		List<Noticia> maisLidas = noticiaService.obterMaisLidas(noticia.getCategoria());
		request.setAttribute("noticia", noticia);
		request.setAttribute("noticias", noticias);
		request.setAttribute("maisLidas", maisLidas);
		request.getRequestDispatcher(noticia.getCategoria()+"/ler"+noticia.getCategoria()+".jsp").forward(request, response);
	}

}
