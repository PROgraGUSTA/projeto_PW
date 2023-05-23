import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("")
public class ClienteCONTRO {
    private final Template cliente;

    public ClienteCONTRO(Template cliente) {
        this.cliente = cliente;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/cliente")
    public TemplateInstance cliente() {
        return cliente.instance();
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Path("/cliente")
    public String processarFormulario(@FormParam("nome") String nome,
                                      @FormParam("email") String email,
                                      @FormParam("telefone") String telefone) {
        // Aqui você pode realizar as operações necessárias com os dados recebidos
        // por exemplo, salvar em um banco de dados ou realizar algum processamento

        // Retorna uma resposta
        return "Dados do cliente recebidos com sucesso: Nome=" + nome + ", Email=" + email + ", Telefone=" + telefone;
    }
}
