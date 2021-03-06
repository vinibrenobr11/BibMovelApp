package com.bibmovel.client.model.vo;

import com.google.gson.annotations.SerializedName;

public class Classificacao {

    private Usuario usuario;
    private Livro livro;
    @SerializedName("classificacao") private Float classificacao;
    @SerializedName("comentario") private String comentario;

    public Classificacao() {
    }

    public Classificacao(Usuario usuario, Livro livro, Float classificacao, String comentario) {
        this.usuario = usuario;
        this.livro = livro;
        this.classificacao = classificacao;
        this.comentario = comentario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Float getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Float classificacao) {
        this.classificacao = classificacao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
