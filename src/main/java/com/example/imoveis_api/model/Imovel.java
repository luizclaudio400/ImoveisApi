package com.example.imoveis_api.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cep;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String descricao;
    private Double valor;
    private Double areaUtil;
    private Double areaTotal;
    private Integer qtdeQuartos;
    private Integer qtdeSuites;
    private Integer qtdeBanheiros;
    private Integer qtdeVagas;
    private Boolean piscina;
    private Boolean academia;
    private Boolean churrasqueira;
    private Boolean salaoFestas;
    private Boolean portaria;

    @Enumerated(EnumType.STRING)
    private TipoImovel tipoImovel;
    
    @Enumerated(EnumType.STRING)
    private TipoNegocio tipoNegocio;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Imovel(String cep, String endereco, String bairro, String cidade, String estado, String descricao,
            Double valor, Double areaUtil, Double areaTotal, Integer qtdeQuartos, Integer qtdeSuites,
            Integer qtdeBanheiros, Integer qtdeVagas, Boolean piscina, Boolean academia, Boolean churrasqueira,
            Boolean salaoFestas, Boolean portaria, TipoImovel tipoImovel, TipoNegocio tipoNegocio) {
        this.cep = cep;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.descricao = descricao;
        this.valor = valor;
        this.areaUtil = areaUtil;
        this.areaTotal = areaTotal;
        this.qtdeQuartos = qtdeQuartos;
        this.qtdeSuites = qtdeSuites;
        this.qtdeBanheiros = qtdeBanheiros;
        this.qtdeVagas = qtdeVagas;
        this.piscina = piscina;
        this.academia = academia;
        this.churrasqueira = churrasqueira;
        this.salaoFestas = salaoFestas;
        this.portaria = portaria;
        this.tipoImovel = tipoImovel;
        this.tipoNegocio = tipoNegocio;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getAreaUtil() {
        return areaUtil;
    }

    public void setAreaUtil(Double areaUtil) {
        this.areaUtil = areaUtil;
    }

    public Double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(Double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public Integer getQtdeQuartos() {
        return qtdeQuartos;
    }

    public void setQtdeQuartos(Integer qtdeQuartos) {
        this.qtdeQuartos = qtdeQuartos;
    }

    public Integer getQtdeSuites() {
        return qtdeSuites;
    }

    public void setQtdeSuites(Integer qtdeSuites) {
        this.qtdeSuites = qtdeSuites;
    }

    public Integer getQtdeBanheiros() {
        return qtdeBanheiros;
    }

    public void setQtdeBanheiros(Integer qtdeBanheiros) {
        this.qtdeBanheiros = qtdeBanheiros;
    }

    public Integer getQtdeVagas() {
        return qtdeVagas;
    }

    public void setQtdeVagas(Integer qtdeVagas) {
        this.qtdeVagas = qtdeVagas;
    }

    public Boolean getPiscina() {
        return piscina;
    }

    public void setPiscina(Boolean piscina) {
        this.piscina = piscina;
    }

    public Boolean getAcademia() {
        return academia;
    }

    public void setAcademia(Boolean academia) {
        this.academia = academia;
    }

    public Boolean getChurrasqueira() {
        return churrasqueira;
    }

    public void setChurrasqueira(Boolean churrasqueira) {
        this.churrasqueira = churrasqueira;
    }

    public Boolean getSalaoFestas() {
        return salaoFestas;
    }

    public void setSalaoFestas(Boolean salaoFestas) {
        this.salaoFestas = salaoFestas;
    }

    public Boolean getPortaria() {
        return portaria;
    }

    public void setPortaria(Boolean portaria) {
        this.portaria = portaria;
    }
    
    public TipoImovel getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(TipoImovel tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public TipoNegocio getTipoNegocio() {
        return tipoNegocio;
    }

    public void setTipoNegocio(TipoNegocio tipoNegocio) {
        this.tipoNegocio = tipoNegocio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
