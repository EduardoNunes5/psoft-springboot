package com.exemplo.enums.dto;

import com.exemplo.enums.model.Pessoa;

public class PessoaDTO {

    private Long id;
    private String nome;
    private String statusTrabalho;

    public PessoaDTO() {
    }

    public PessoaDTO(Long id, String nome, String statusTrabalho) {
        this.id = id;
        this.nome = nome;
        this.statusTrabalho = statusTrabalho;
    }

    public PessoaDTO(Pessoa entidade){
        this.id = entidade.getId();
        this.nome = entidade.getNome();
        this.statusTrabalho = entidade.getStatusTrabalho().getTrabalha();
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

    public String getStatusTrabalho() {
        return statusTrabalho;
    }

    public void setStatusTrabalho(String statusTrabalho) {
        this.statusTrabalho = statusTrabalho;
    }
}
