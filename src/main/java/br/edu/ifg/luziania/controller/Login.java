package br.edu.ifg.luziania.controller;

import br.edu.ifg.luziania.model.dto.AutenticacaoDTO;
import br.edu.ifg.luziania.model.dto.RetornoAutenticacaoDTO;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("")
public class Login {
    private final Template login;

    public Login(Template login){
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
    public Response autenticar( AutenticacaoDTO autenticacaoDTO){
        RetornoAutenticacaoDTO retorno = new RetornoAutenticacaoDTO();
        if (autenticacaoDTO.getUsername().equals("will@ifg.edu.br") && autenticacaoDTO.getPassword().equals("123")) {
            retorno.setMensagem("Usuário autenticado!");
            return Response.ok(retorno, MediaType.APPLICATION_JSON).build();
        }

        else {
            retorno.setMensagem("Usuário não autenticado!");
            return Response.ok(retorno, MediaType.APPLICATION_JSON).build();
        }
    }
}
