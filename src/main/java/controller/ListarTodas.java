package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Noticia;
import model.NoticiaService;

@WebServlet("/PainelAdmin")
public class ListarTodas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NoticiaService service = NoticiaService.getNoticiaService();
		List<Noticia> noticias = service.obterTodasNoticias();
		request.setAttribute("noticias", noticias);
		request.getRequestDispatcher("menuAdmin.jsp").forward(request, response);
	}

}
