function validar(){

    if (document.getElementById("modeloVeiculo").value == "") {
        alert("O campo nome é obrigatório!");
        return false;
    }
    if (document.getElementById("corVeiculo").value == "") {
        alert("O email é obrigatório!");
        return false;
    }
    if (!document.getElementById("opcaoNao").checked &&
        !document.getElementById("opcaoSim").checked) {
        alert("O campo Informações é obrigatório!");
        return false;
    }
    if (document.getElementById("proprietarioVeiculo").value == "") {
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
        celula.innerText = document.getElementById("modeloVeiculo").value;

        celula = linha.insertCell();
        celula.innerText = document.getElementById("corVeiculo").value;

        celula = linha.insertCell();
        if (document.getElementById("opcaoNao").checked)
            celula.innerText = "Não";
        else
            celula.innerText = "Sim";

        celula = linha.insertCell();
        celula.innerText = document.getElementById("proprietarioVeiculo").value;
        //
        // celula.append(criarBotaoRemover());
        //
        // limparFormulario();
    }
}