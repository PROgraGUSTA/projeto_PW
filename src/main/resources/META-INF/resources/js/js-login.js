//Esta é uma função JavaScript chamada "validar_formulario" que valida um formulário antes de ser enviado.
// O objetivo é verificar se os campos "emailUsuario" e "senhaUsuario" não estão vazios.
// Se o campo "emailUsuario" estiver vazio, a função exibe um alerta com a mensagem
// "campo username em branco" e retorna "false", o que indica que a submissão do formulário deve ser cancelada.
// Da mesma forma, se o campo "senhaUsuario" estiver vazio, a função exibe um alerta com a mensagem "campo password em branco" e retorna "false".
// Se ambos os campos estiverem preenchidos, a função retorna "true", indicando que o formulário pode ser enviado.
// Essa função pode ser chamada em um evento de submissão de formulário
// (por exemplo, quando o usuário clica em um botão de envio) para garantir que os campos
// obrigatórios sejam preenchidos antes que o formulário seja enviado.
function validar_formulario() {
    if(document.getElementById('emailUsuario').value === "") {
        alert("campo username em branco")

        return false;
    }

    if(document.getElementById('senhaUsuario').value === "") {
        alert("campo password em branco");

        return false;

    }

    return true;
}

//Esta é uma função JavaScript chamada "validacaoLogin" que é acionada quando o usuário clica em um botão de login em um formulário.
// A função primeiro chama a função "validar_formulario" para verificar se os campos de e-mail e senha foram preenchidos.
// Se os campos estiverem preenchidos, a função cria uma requisição HTTP para um servidor usando o método "fetch".
//Se a resposta do servidor for bem-sucedida (status 200), a função converte a resposta em um objeto JSON usando o método "json()".
// Em seguida, a função exibe uma mensagem de alerta com a mensagem JSON retornada pelo servidor e verifica se a mensagem é "Usuário autenticado!".
//Se a mensagem for "Usuário autenticado!", a função verifica se o usuário selecionou a opção "Funcionario" ou "Cliente"
// e redireciona o usuário para uma página diferente, dependendo da seleção.
//Se os campos de e-mail e senha não estiverem preenchidos, a função exibe uma mensagem de alerta informando que os campos são obrigatórios.
// Em geral, essa função é usada para verificar as credenciais de login do usuário e redirecioná-lo para a página correta após a autenticação bem-sucedida.

function validacaoLogin() {
    if (validar_formulario()){
        var requisicao = criarRequisicao(document.getElementById("emailUsuario").value,
            document.getElementById("senhaUsuario").value);
        fetch(requisicao)
            .then((response) => {
                if (response.status === 200) {
                    return response.json();
                } else {
                    throw new Error("Ocorreu algum erro no servidor!");
                }
            })
            .then(json => {
                console.log(JSON.stringify(json));
                alert(json.mensagem);

                if (json.mensagem === 'Usuário autenticado!') {
                    if (document.getElementById("opcaoNao").checked) {
                        location.href = '/funcionario'

                        //window.location.href = window.location.origin+'/principal';
                    }
                    if (document.getElementById("opcaoSim").checked){
                        location.href = `/bs-pagprin`
                    }
                }

            });
    } else
        alert('Os campos e-mail e senha são obrigatórios! Verifique o formulário.')
}
//Esta é uma função JavaScript chamada "criarRequisicao" que cria uma requisição HTTP com o método POST para autenticar um usuário no servidor.
//A função recebe o e-mail e a senha do usuário como parâmetros.
//A função usa a classe "Request" do JavaScript para criar uma nova requisição com o endpoint "/autenticar".
//A propriedade "method" é definida como "POST" para enviar os dados de e-mail e senha ao servidor.
//O cabeçalho da requisição é definido com as propriedades "Accept" e "Content-Type" para especificar que o conteúdo da requisição será JSON.
//O corpo da requisição é definido como um objeto JSON contendo a senha e o e-mail do usuário.
// A função usa o método "JSON.stringify()" para converter o objeto JSON em uma string JSON antes de enviá-lo ao servidor.
//Em resumo, essa função cria uma requisição HTTP POST com um cabeçalho e corpo JSON para autenticar um usuário no servidor.

function criarRequisicao(emailUsuario, senhaUsuario) {
    return new Request("/autenticar", {
        method: "POST",
        headers: {
            "Accept": "application/json",
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            "senhaUsuario": senhaUsuario,
            "emailUsuario": emailUsuario
        }),
    });
}
