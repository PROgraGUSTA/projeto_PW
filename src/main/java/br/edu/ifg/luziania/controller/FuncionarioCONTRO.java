import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("")
public class FuncionarioCONTRO {
    private final Template funcionario;

    public FuncionarioCONTRO(Template funcionario) {
        this.funcionario = funcionario;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/funcionario")
    public TemplateInstance funcionario() {
        return funcionario.instance();
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Path("/funcionario")
    public String processarFormulario(@FormParam("nome") String nome,
                                      @FormParam("idade") int idade) {
        // Aqui você pode realizar as operações necessárias com os dados recebidos
        // por exemplo, salvar em um banco de dados ou realizar algum processamento

        // Retorna uma resposta
        return "Dados do funcionário recebidos com sucesso: Nome=" + nome + ", Idade=" + idade;
    }
}