package model;

public class Noticia {

	private Integer id;
	private String nome;
	private String resumo; 
	private String assunto;
	private String categoria;
	private String fonte;
	private String data;
	private String imagem;
	private String conteudo;
	
	public Noticia(){
		
	}
	
	public Noticia(String nome, String resumo, String assunto, String categoria, String fonte, String data, String imagem, String conteudo){
		this.nome=nome;
		this.resumo=resumo;
		this.assunto=assunto;
		this.categoria=categoria;
		this.fonte=fonte;
		this.data=data;
		this.imagem=imagem;
		this.conteudo=conteudo;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getFonte() {
		return fonte;
	}

	public void setFonte(String fonte) {
		this.fonte = fonte;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

}