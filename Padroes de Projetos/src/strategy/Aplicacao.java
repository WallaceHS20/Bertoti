package strategy;

public class Aplicacao {
    public static void main(String[] args) {

        Inseto borboleta = new Inseto();
        borboleta.setNome("Borboleta");

        borboleta.setLocomocao(new Rastejo());

        borboleta.realizarLocomocao(borboleta.getNome().toString());

    }
}
