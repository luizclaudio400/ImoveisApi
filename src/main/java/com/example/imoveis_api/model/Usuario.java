package com.example.imoveis_api.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private String profissao;
    private String email;
    private String ddd;
    private String telefone;
    private String senha;
    private Boolean whatsapp;
    private Boolean recebeInfo;
    private Boolean divulgaImovel;

    public Usuario() {}

    public Usuario(String nome, String sobrenome, LocalDate dataNascimento, String profissao, String email,
                   String ddd, String telefone, String senha, Boolean whatsapp, Boolean recebeInfo,
                   Boolean divulgaImovel) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.profissao = profissao;
        this.email = email;
        this.ddd = ddd;
        this.telefone = telefone;
        this.senha = senha;
        this.whatsapp = whatsapp;
        this.recebeInfo = recebeInfo;
        this.divulgaImovel = divulgaImovel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(Boolean whatsapp) {
        this.whatsapp = whatsapp;
    }

    public Boolean getRecebeInfo() {
        return recebeInfo;
    }

    public void setRecebeInfo(Boolean recebeInfo) {
        this.recebeInfo = recebeInfo;
    }

    public Boolean getDivulgaImovel() {
        return divulgaImovel;
    }

    public void setDivulgaImovel(Boolean divulgaImovel) {
        this.divulgaImovel = divulgaImovel;
    }
}
