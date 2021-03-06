package com.bibmovel.client.model.vo;

import com.google.gson.annotations.SerializedName;

public class Livro {

    @SerializedName("titulo") private String titulo;
    @SerializedName("isbn") private String isbn;
    @SerializedName("nomeArquivo") private String nomeArquivo;
    @SerializedName("genero") private String genero;
    @SerializedName("anoPublicacao") private Short anoPublicacao;
    @SerializedName("editora") private String editora;
    @SerializedName("classificacaoMedia") private Float classificacaoMedia;
    @SerializedName("autor") private String autor;
    private boolean downloaded;

    public Livro() {
    }

    public Livro(String titulo, String nomeArquivo, String autor, Float classificacaoMedia) {
        this.titulo = titulo;
        this.nomeArquivo = nomeArquivo;
        this.autor = autor;
        this.classificacaoMedia = classificacaoMedia;
        this.downloaded = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Short getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Short anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Float getClassificacaoMedia() {
        return classificacaoMedia;
    }

    public void setClassificacaoMedia(Float classificacaoMedia) {
        this.classificacaoMedia = classificacaoMedia;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDownloaded() {
        return downloaded;
    }

    public void setDownloaded(boolean downloaded) {
        this.downloaded = downloaded;
    }
}
