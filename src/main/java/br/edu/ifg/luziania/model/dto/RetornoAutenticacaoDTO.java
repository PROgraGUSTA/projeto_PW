package br.edu.ifg.luziania.model.dto;

//Este código representa uma classe Java chamada "RetornoAutenticacaoDTO".
//É uma classe de objeto de transferência de dados (DTO), que é usada para transferir dados entre camadas em uma aplicação.
//A classe possui um campo privado "mensagem" com o tipo "String".
//Esse campo representa a mensagem de retorno da autenticação de usuário, que pode ser uma mensagem de sucesso ou de erro.
//A classe também possui um método "getMensagem()" que retorna o valor do campo "mensagem" e um método "setMensagem()" que permite definir o valor do campo "mensagem".
//Em resumo, esta classe representa um objeto DTO que é usado para transferir a mensagem de retorno da autenticação de usuário em uma aplicação Java.
public class RetornoAutenticacaoDTO {

    private String mensagem;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
