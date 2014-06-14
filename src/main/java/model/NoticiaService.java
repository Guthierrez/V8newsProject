package model;

import java.util.List;

public class NoticiaService {
	private static NoticiaService noticiaService;
	private NoticiaDao noticiaDao = NoticiaDao.getInstance();
	
	
	private NoticiaService(){
		
	}
	
	public static NoticiaService getNoticiaService(){
		if(noticiaService == null){
			noticiaService = new NoticiaService();
		}
		return noticiaService;
	}
	
	public Noticia getNoticia(Integer id){
		return noticiaDao.getNoticia(id);
	}
	
	public void salvaNoticia(Noticia noticia){
		noticiaDao.salvarNoticia(noticia);
			
	}
	
	public void updateNoticia(Noticia noticia){
		noticiaDao.updateNoticia(noticia);
	}
	
	public void excluirNoticia(Integer id){
		noticiaDao.excluirNoticia(id);
	}
	
	public List<Noticia> obterTodasNoticias(){
		return noticiaDao.obterTodasNoticas();
	}
}
