package br.edu.ifg.luziania.controller;

import br.edu.ifg.luziania.model.dto.AutenticacaoDTO;
import br.edu.ifg.luziania.model.dto.RetornoAutenticacaoDTO;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//Este código representa uma classe Java chamada "Login".
// Ela recebe um objeto "Template" como argumento em seu construtor.
//A anotação "@Path" é usada para especificar o caminho base da URL para o recurso, neste caso,
// o caminho está vazio, o que significa que ele será acessado pela raiz do contexto da aplicação.
//A anotação "@GET" indica que este método irá processar solicitações HTTP do tipo GET.
// A anotação "@Produces" é usada para especificar o tipo de mídia da resposta HTTP, neste caso, o tipo de mídia é HTML.
//O método "login" é acessado pela URL raiz ("/bs-login") e retorna uma instância de um "Template".
// A instância do Template é retornada como um "TemplateInstance", que é um objeto que pode ser usado para renderizar o conteúdo HTML em tempo de execução.
//Em resumo, este código representa uma classe Java que lida com solicitações HTTP GET para a URL raiz e retorna uma instância de um objeto "Template".

@Path("")
public class LoginCONTRO {
    private final Template login;

    public LoginCONTRO(Template login){
        this.login = login;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/bs-login")
    public TemplateInstance login(){
        return login.instance();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/autenticar")

    //O método autenticar recebe um objeto AutenticacaoDTO como parâmetro, que contém as informações de e-mail e senha do usuário que está tentando se autenticar.
    // A partir dessas informações, o método verifica se o e-mail e senha correspondem a um usuário válido, que neste caso é "will@ifg.edu.br" com a senha "123".
    //Se as informações de autenticação forem válidas, o método cria um objeto RetornoAutenticacaoDTO com uma mensagem de sucesso e retorna uma resposta HTTP 200 OK com esse objeto em formato JSON.
    // Caso contrário, um objeto RetornoAutenticacaoDTO com uma mensagem de falha é criado e a resposta HTTP também é um 200 OK com o objeto em formato JSON.
    //O objetivo deste código é ilustrar o processo de autenticação e demonstrar como é possível construir uma resposta HTTP com um objeto JSON utilizando a biblioteca JAX-RS.

    public Response autenticar(AutenticacaoDTO autenticacaoDTO){
        RetornoAutenticacaoDTO retorno = new RetornoAutenticacaoDTO();
        if (autenticacaoDTO.getEmailUsuario().equals("will@ifg.edu.br") && autenticacaoDTO.getSenhaUsuario().equals("123")) {
            retorno.setMensagem("Usuário autenticado!");
            return Response.ok(MediaType.APPLICATION_JSON).build();
        }

        else {
            retorno.setMensagem("Usuário não autenticado!");
            return Response.ok(MediaType.APPLICATION_JSON).build();
        }
    }
}
