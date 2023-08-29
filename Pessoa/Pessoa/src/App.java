import classes.*;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        pessoa.alterarNome("Bob Esponja");

        System.out.println(pessoa.pegarNome());
    }
}
