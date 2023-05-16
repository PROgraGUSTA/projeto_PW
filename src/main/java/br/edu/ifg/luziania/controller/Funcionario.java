package br.edu.ifg.luziania.controller;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("")
public class Funcionario {
    private final Template funcionario;

    public Funcionario(Template funcionario) {
        this.funcionario = funcionario;
    }
    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/funcionario")
    public TemplateInstance funcionario(){
        return funcionario.instance();
    }
}
