package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.ConexaoDao;

public class NoticiaDao {
	private static NoticiaDao noticiaDao;
	
	private NoticiaDao(){
		
	}

	public static NoticiaDao getInstance(){
		if(noticiaDao == null){
			noticiaDao = new NoticiaDao();
		}
		return noticiaDao;
	}
	
	public Noticia getNoticia(Integer id){
		try{
			Noticia noticia = new Noticia();
			Connection con = ConexaoDao.getInstancia().getConexao();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from noticias where id="+id+"");
			while(rs.next()){
			noticia.setId(rs.getInt("id"));
			noticia.setNome(rs.getString("nome"));
			noticia.setResumo(rs.getString("resumo"));
			noticia.setAssunto(rs.getString("assunto"));
			noticia.setCategoria(rs.getString("categoria"));
			noticia.setFonte(rs.getString("fonte"));
			noticia.setData(rs.getString("data"));
			noticia.setImagem(rs.getString("imagem"));
			noticia.setConteudo(rs.getString("conteudo"));
			}
			return noticia;
		}catch(SQLException e){
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public void salvarNoticia(Noticia noticia){
		try{
			Connection con = ConexaoDao.getInstancia().getConexao();
			Statement st = con.createStatement();
			st.execute("INSERT INTO NOTICIAS(nome, resumo, assunto, categoria, fonte, data, imagem, conteudo)"
			   + "VALUES ('"+noticia.getNome()+"', '"+noticia.getResumo()+"', '"+noticia.getAssunto()+"',"
							+ "'"+noticia.getCategoria()+"', '"+noticia.getFonte()+"', '"+noticia.getData()+"', '"+noticia.getImagem()+"',"
							+ "'"+noticia.getConteudo()+"')");
		}catch(SQLException e){
			System.err.println(e.getMessage());
		}
	}
	
	public void updateNoticia(Noticia noticia){
		try{
			Connection con = ConexaoDao.getInstancia().getConexao();
			Statement st = con.createStatement();
			st.executeUpdate("UPDATE noticias"
					+  "SET nome='"+noticia.getNome()+"', resumo='"+noticia.getResumo()+"',"
					+  "assunto='"+noticia.getAssunto()+"', fonte='"+noticia.getFonte()+"',"
					+  "data='"+noticia.getData()+"', conteudo='"+noticia.getConteudo()+"'"
					+  "WHERE id='"+noticia.getId()+"'");
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void excluirNoticia(Integer id){
		try{
			Connection con = ConexaoDao.getInstancia().getConexao();
			Statement st = con.createStatement();
			st.execute("delete from noticias where id="+id+"");
		}catch(SQLException e){
			System.err.println(e.getMessage());
		}
	}
	
	public List<Noticia> obterTodasNoticas(){
		List<Noticia> noticias = new ArrayList<Noticia>();
		try{
			Connection con = ConexaoDao.getInstancia().getConexao();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from noticias");
		while (rs.next()){
			Noticia noticia = new Noticia();
			noticia.setId(rs.getInt("id"));
			noticia.setNome(rs.getString("nome"));
			noticia.setResumo(rs.getString("resumo"));
			noticia.setAssunto(rs.getString("assunto"));
			noticia.setCategoria(rs.getString("categoria"));
			noticia.setFonte(rs.getString("fonte"));
			noticia.setData(rs.getString("data"));
			noticia.setImagem(rs.getString("imagem"));
			noticia.setConteudo(rs.getString("conteudo"));
			noticias.add(noticia);
		}
		}catch(SQLException e){
			System.err.println(e.getMessage());
		}
		return noticias;
	}
	
}
