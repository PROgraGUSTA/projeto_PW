function validar_formulario() {
    if(document.getElementById('username').value === "") {
        alert("campo username em branco")

        return false;
    }

    if(document.getElementById('password').value === "") {
        alert("campo password em branco");

        return false;

    }

    return true;
}

function validacaoLogin() {
    if (validar_formulario()){
        var requisicao = criarRequisicao(document.getElementById("username").value,
            document.getElementById("password").value);
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

                if (json.mensagem === 'Usuário autenticado!')
                    window.location.href = window.location.origin+'/principal';
            });
    } else
        alert('Os campos e-mail e senha são obrigatórios! Verifique o formulário.')
}

function criarRequisicao(username, password) {
    return new Request("/autenticar", {
        method: "POST",
        headers: {
            "Accept": "application/json",
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            "password": password,
            "username": username
        }),
    });
}
