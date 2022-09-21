package com.example.provatassiop1nativo.model.entity;

public class Notice {
    private Integer codigo;
    private String title;
    private String descricao;
    private String hour;

    public Notice(Integer codigo, String title, String descricao, String hour) {
        this.codigo = codigo;
        this.title = title;
        this.descricao = descricao;
        this.hour = hour;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
}
