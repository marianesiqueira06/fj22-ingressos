package br.com.caelum.ingresso.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DetalhesDoFilme	{
	
		@JsonProperty("Title")
		private	String	titulo;
		
		@JsonProperty("Year")
		private	String	ano;
		
		@JsonProperty("Poster")
		private	String		imagem;
		
		@JsonProperty("Director")
		private	String	diretores;
		
		@JsonProperty("Writer")
		private	String	escritores;
		
		@JsonProperty("Actors")
		private	String	atores;
		
		@JsonProperty("Plot")
		private	String	descricao;
		
		@JsonProperty("imdbRating")
		private	Double	avaliacao;
		
		//	criar	getters	e	setters
		
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getAno() {
			return ano;
		}
		public void setAno(String ano) {
			this.ano = ano;
		}
		public String getImagem() {
			return imagem;
		}
		public void setImagem(String imagem) {
			this.imagem = imagem;
		}
		public String getDiretores() {
			return diretores;
		}
		public void setDiretores(String diretores) {
			this.diretores = diretores;
		}
}
