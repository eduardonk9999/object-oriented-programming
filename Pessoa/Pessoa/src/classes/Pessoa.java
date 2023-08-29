package classes;

public class Pessoa {
    private String nome = "Edu";
    private int idade;
    private double altura;

    // <modificador-acesso> <retorno> nomeDoMetodo()
    public String pegarNome() {
        return nome;
    }

    public void alterarNome(String nome) {
        // com o this podemos chamar o proprio atributo da classe pessoa.
        this.nome = nome;
    }

}
