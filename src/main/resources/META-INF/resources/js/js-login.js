function validarLogin() {
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;
    if (email !== "" && password !== "") {
        // Se o login for válido, redireciona o usuário para outra página
        window.location.href = 'http://localhost:8080/';
    } else {
        // Se o login for inválido, exibe uma mensagem de erro
        alert('Nome de usuário ou senha inválidos.')
    }
}
