package br.edu.ifg.luziania.controller;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("")
public class Cliente {
    private final Template cliente;

    public Cliente(Template cliente) {
        this.cliente = cliente;
    }
    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/cliente")
    public TemplateInstance cliente(){
        return cliente.instance();
    }
}
