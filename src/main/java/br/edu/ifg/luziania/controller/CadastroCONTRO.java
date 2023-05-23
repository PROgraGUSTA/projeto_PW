package br.edu.ifg.luziania.controller;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("")
public class CadastroCONTRO {
    private final Template cadastro;

    public CadastroCONTRO(Template cadastro) {
        this.cadastro = cadastro;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/cadastro")
    public TemplateInstance cadastro() {
        return cadastro.instance();
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Path("/cadastro")
    public String processarFormulario(@FormParam("campo1") String campo1,
                                      @FormParam("campo2") String campo2,
                                      @FormParam("campo3") String campo3) {
        // Aqui você pode realizar as operações necessárias para cadastrar os dados
        // por exemplo, salvar em um banco de dados ou realizar algum processamento

        // Retorna uma resposta
        return "Dados cadastrados com sucesso: Campo1=" + campo1 + ", Campo2=" + campo2 + ", Campo3=" + campo3;
    }
}
