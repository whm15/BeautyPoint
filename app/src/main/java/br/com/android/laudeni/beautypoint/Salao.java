package br.com.android.laudeni.beautypoint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.Serializable;

public class Salao implements Serializable {

    private String nome;
    private String descricao;
    private int assetImg;
    private String urlImg;
    private String endereço;
    private String nomeFuncionario;


    public Salao(String nome, String descricao, int assetImg, String urlImg, String endereço, String nomeFuncionario) {
        this.nome = nome;
        this.descricao = descricao;
        this.assetImg = assetImg;
        this.urlImg = urlImg;
        this.endereço = endereço;
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAssetImg() {
        return assetImg;
    }

    public void setAssetImg(int assetImg) {
        this.assetImg = assetImg;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }
}
