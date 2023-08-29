import classes.*;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Bob Esponja");
        pessoa.setIdade(25);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
