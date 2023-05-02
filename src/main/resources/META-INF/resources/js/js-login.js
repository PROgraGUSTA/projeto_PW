function validacaoLogin() {
    const email = document.getElementById("username").value;
    const password = document.getElementById("password").value;
    if (email !== "" && password !== "") {
        // Se o login for válido, redireciona o usuário para outra página
        window.location.href = window.location.origin+"/bs-principal";
    } else {
        // Se o login for inválido, exibe uma mensagem de erro
        alert('Nome de usuário ou senha inválidos.')
    }
}
