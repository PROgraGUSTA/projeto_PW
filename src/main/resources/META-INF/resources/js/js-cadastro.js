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
    if (document.getElementById("senhaUsuario").value == "") {
        alert("O campo Senha é obrigatório!");
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
        if (document.getElementById("opcaoNao").checked) {
            celula.innerText = "Funcionário";

            location.href = '/funcionario'
        }

        if (document.getElementById("opcaoSim").checked){
            celula.innerText = "Cliente";
            location.href = `/bs-pagprin`
        }
        celula = linha.insertCell();
        celula.innerText = document.getElementById("senhaUsuario").value;
    }
}

function validarCampos() {
    // Verifica se os campos anteriores foram preenchidos
    if (document.getElementById('nomeUsuario').value !== "" && document.getElementById('emailUsiario').value !== "" && document.getElementById('senhaUsuario').value !== "") {
        // Se os campos foram preenchidos, redireciona o usuário para a próxima página
        window.location.href = window.location.origin+"/bs-pagprin";
    } else {
        // Se algum dos campos não foi preenchido, exibe uma mensagem de erro
        alert('Por favor, preencha todos os campos para que possa acessar a página inicial do site');
    }
}
