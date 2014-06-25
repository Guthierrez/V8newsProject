package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
			PreparedStatement st = con.prepareStatement("select * from noticias where id=?");
			st.setInt(1, id);
			ResultSet rs = st.executeQuery();
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
			PreparedStatement st = con.prepareStatement("INSERT INTO NOTICIAS(nome, resumo, assunto, categoria, fonte, data, imagem, conteudo) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
			st.setString(1, noticia.getNome());
			st.setString(2, noticia.getResumo());
			st.setString(3, noticia.getAssunto());
			st.setString(4, noticia.getCategoria());
			st.setString(5, noticia.getFonte());
			st.setString(6, noticia.getData());
			st.setString(7, noticia.getImagem());
			st.setString(8, noticia.getConteudo());
			st.executeUpdate();
		}catch(SQLException e){
			System.err.println(e.getMessage());
		}
	}
	
	public void updateNoticia(Noticia noticia){
		try{
			Connection con = ConexaoDao.getInstancia().getConexao();
			PreparedStatement st = con.prepareStatement("UPDATE noticias set nome=?, resumo=?, assunto=?, fonte=?,"
					+ " data=?, conteudo=? where id=?");
			st.setString(1, noticia.getNome());
			st.setString(2, noticia.getResumo());
			st.setString(3, noticia.getAssunto());
			st.setString(4, noticia.getFonte());
			st.setString(5, noticia.getData());
			st.setString(6, noticia.getConteudo());
			st.setInt(7, noticia.getId());
			st.executeUpdate();
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void excluirNoticia(Integer id){
		try{
			Connection con = ConexaoDao.getInstancia().getConexao();
			PreparedStatement st = con.prepareStatement("delete from noticias where id=?");
			st.setInt(1, id);
			st.executeUpdate();
		}catch(SQLException e){
			System.err.println(e.getMessage());
		}
	}
	
	public List<Noticia> obterTodasNoticas(){
		List<Noticia> noticias = new ArrayList<Noticia>();
		try{
			Connection con = ConexaoDao.getInstancia().getConexao();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from noticias order by ID DESC");
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
	
	public List<Noticia> obterCategoriaNoticias(String categoria){
		List<Noticia> noticias = new ArrayList<Noticia>();
		try{
			Connection con = ConexaoDao.getInstancia().getConexao();
			PreparedStatement stm = con.prepareStatement("select * from noticias where categoria=? order by ID DESC");
			stm.setString(1, categoria);
			ResultSet rs = stm.executeQuery();
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
