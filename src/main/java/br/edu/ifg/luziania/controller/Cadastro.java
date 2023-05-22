package br.edu.ifg.luziania.controller;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("")
public class Cadastro {
    private final Template cadastro;

    public Cadastro(Template cadastro){
        this.cadastro = cadastro;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/bs-cadastro")
    public TemplateInstance login(){
        return cadastro.instance();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Path("/bs-cadastro")

    public Response CadastroDTO(@FormParam("nome") String nome, @FormParam("email") String email, @FormParam("senha") String senha){
        // Aqui você pode usar os dados recebidos para salvar o cadastro no banco de dados ou fazer outras operações
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Senha: " + senha);

        Response build = Response.ok().build();
        return build;
    }

}
