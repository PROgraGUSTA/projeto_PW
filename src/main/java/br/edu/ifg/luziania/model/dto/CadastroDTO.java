package br.edu.ifg.luziania.model.dto;

public class CadastroDTO {

    private String nome;
    private String email;
    private String senha;

    public CadastroDTO() {
        // construtor vazio necessário para deserialização
    }

    public CadastroDTO(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // getters e setters omitidos para brevidade
}
