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
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		Noticia noticia = new Noticia();
		try{
			con = ConexaoDao.createConnection();
			st = con.prepareStatement("select * from noticias where id=?");
			st.setInt(1, id);
			rs = st.executeQuery();
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
		finally{
			ConexaoDao.close(con, st, rs);
		}
	}
	
	public Noticia lerNoticia(Integer id){
		Connection con = null;
		PreparedStatement st = null;
		Noticia noticia = this.getNoticia(id);
		try{
			con = ConexaoDao.createConnection();
			st = con.prepareStatement("UPDATE noticias SET qtdViews=qtdViews+? where id=?");
			st.setInt(1, 1);
			st.setInt(2, noticia.getId());
			st.executeUpdate();
			return noticia;
		}catch(SQLException e){
			System.err.println(e.getMessage());
			return null;
		}
		finally{
			ConexaoDao.close(con, st, null);
		}
	}
	
	public void salvarNoticia(Noticia noticia){
		Connection con = null;
		PreparedStatement st = null;
		try{
			con = ConexaoDao.createConnection();
			st = con.prepareStatement("INSERT INTO NOTICIAS(nome, resumo, assunto, categoria, fonte, data, imagem, conteudo) "
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
			ConexaoDao.close(con, st, null);
		}catch(SQLException e){
			System.err.println(e.getMessage());
		}
		finally{
			ConexaoDao.close(con, st, null);
		}
	}
	
	public void updateNoticia(Noticia noticia){
		try{
			Connection con = ConexaoDao.createConnection();
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
			ConexaoDao.close(con, st, null);
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void excluirNoticia(Integer id){
		try{
			Connection con = ConexaoDao.createConnection();
			PreparedStatement st = con.prepareStatement("delete from noticias where id=?");
			st.setInt(1, id);
			st.executeUpdate();
			ConexaoDao.close(con, st, null);
		}catch(SQLException e){
			System.err.println(e.getMessage());
		}
	}
	
	public List<Noticia> obterNoticias(){
		List<Noticia> noticias = new ArrayList<Noticia>();
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try{
			con = ConexaoDao.createConnection();
			st = con.createStatement();
			rs = st.executeQuery("select * from noticias order by ID DESC");
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
		ConexaoDao.close(con, st, null);
		}catch(SQLException e){
			System.err.println(e.getMessage());
		}
		finally{
			ConexaoDao.close(con, st, rs);
		}
		return noticias;
	}
	
	public List<Noticia> obterNoticias(String categoria){
		List<Noticia> noticias = new ArrayList<Noticia>();
		Connection con = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try{
			con = ConexaoDao.createConnection();
			stm = con.prepareStatement("select * from noticias where categoria=? order by ID DESC");
			stm.setString(1, categoria);
			rs = stm.executeQuery();
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
		finally{
			ConexaoDao.close(con, stm, rs);
		}
		return noticias;
	}
	
	public List<Noticia> obterMaisLidas(String categoria){
		List<Noticia> noticias = new ArrayList<Noticia>();
		Connection con = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try{
			con = ConexaoDao.createConnection();
			stm = con.prepareStatement("select * from noticias where categoria=? order by qtdViews DESC");
			stm.setString(1, categoria);
			rs = stm.executeQuery();
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
		finally{
			ConexaoDao.close(con, stm, rs);
		}
		return noticias;
	}
	
	public List<Noticia> obterMaisLidas(){
		List<Noticia> noticias = new ArrayList<Noticia>();
		Connection con = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try{
			con = ConexaoDao.createConnection();
			stm = con.prepareStatement("select * from noticias order by qtdViews DESC");
			rs = stm.executeQuery();
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
		finally{
			ConexaoDao.close(con, stm, rs);
		}
		return noticias;
	}
	
}
