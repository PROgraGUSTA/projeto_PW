package br.edu.ifg.luziania.model.dto;


//Este código representa uma classe Java chamada "AutenticacaoDTO". 
//É uma classe de objeto de transferência de dados (DTO), que é usada para transferir dados entre camadas em uma aplicação.
//A classe possui dois campos privados "emailUsuario" e "senhaUsuario", ambos com o tipo "String".
//Esses campos representam o e-mail e a senha do usuário que estão sendo autenticados.
//A classe também possui um método "getEmailUsuario()" que retorna o valor do campo "emailUsuario" e um método "getSenhaUsuario()" que retorna o valor do campo "senhaUsuario".
//Esses métodos são usados para acessar os valores dos campos privados.
//Além disso, a classe também possui dois métodos "setEmailUsuario()" e "setSenhaUsuario()" que permitem definir os valores dos campos privados "emailUsuario" e "senhaUsuario", respectivamente.
//Em resumo, esta classe representa um objeto DTO que é usado para transferir dados relacionados à autenticação de usuário em uma aplicação Java.
public class AutenticacaoDTO {
    private String emailUsuario;
    private String senhaUsuario;

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }
}

