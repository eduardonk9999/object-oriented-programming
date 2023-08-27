public class App {
    public static void main(String[] args) throws Exception {
        FestaVip festa = new FestaVip();
        festa.quantidadeCafe = 100;
        festa.beberCafe();
        System.out.println(festa.quantidadeCafe);
    }
}
