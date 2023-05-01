function validar(){

    if (document.getElementById("nomeUsuario").value == "") {
        alert("O campo nome é obrigatório!");
        return false;
    }
    if (document.getElementById("emailUsiario").value == "") {
        alert("O email é obrigatório!");
        return false;
    }
    if (!document.getElementById("opcaoNao").checked &&
        !document.getElementById("opcaoSim").checked) {
        alert("O campo Informações é obrigatório!");
        return false;
    }
    if (document.getElementById("telefoneUsuario").value == "") {
        alert("O campo telefone é obrigatório!");
        return false;
    }
    return true;
}

function inserirNaTabela(){
    if (validar()){

        // recuperando o elemento tbody da tabela
        let corpoTabela = document.getElementById("corpoTabelaVeiculos");

        //criando uma linha na tabela e guardando o elemento criado em uma variável.
        let linha = corpoTabela.insertRow();

        //criando uma celula/coluna na linha criada e gardando o elemento criado em uma variável.
        let celula = linha.insertCell();
        celula.innerText = document.getElementById("nomeUsuario").value;

        celula = linha.insertCell();
        celula.innerText = document.getElementById("emailUsiario").value;

        celula = linha.insertCell();
        if (document.getElementById("opcaoNao").checked)
            celula.innerText = "Não";
        else
            celula.innerText = "Sim";

        celula = linha.insertCell();
        celula.innerText = document.getElementById("telefoneUsuario").value;
        //
        // celula.append(criarBotaoRemover());
        //
        // limparFormulario();
    }
}

function validarCampos() {
    // Verifica se os campos anteriores foram preenchidos
    if (document.getElementById('nomeUsuario').value !== "" && document.getElementById('emailUsiario').value !== "" && document.getElementById('telefoneUsuario').value !== "") {
        // Se os campos foram preenchidos, redireciona o usuário para a próxima página
        window.location.href = 'http://localhost:8080/';
    } else {
        // Se algum dos campos não foi preenchido, exibe uma mensagem de erro
        alert('Por favor, preencha todos os campos para que possa acessar a página inicial do site');
    }
}
