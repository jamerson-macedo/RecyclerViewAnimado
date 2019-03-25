package com.organizze.jmdevelopers.recyclerviewanimado;

public class Item {
    String conteudo,titulo,data;
    int userfoto;

    public Item() {
    }

    public int getUserfoto() {
        return userfoto;
    }

    public void setUserfoto(int userfoto) {
        this.userfoto = userfoto;
    }

    public Item(String conteudo, String titulo, String data) {
        this.conteudo = conteudo;
        this.titulo = titulo;
        this.data = data;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
