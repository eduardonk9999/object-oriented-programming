package classes;

public class Pessoa {
    private String nome = "Edu";
    private int idade;
    private double altura;

    // <modificador-acesso> <retorno> nomeDoMetodo()
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        // com o this podemos chamar o proprio atributo da classe pessoa.
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
