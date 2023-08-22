package strategy;

public class Inseto {

    private String nome;

    private boolean voar;

    private Locomocao locomocao;

    public void setLocomocao(Locomocao loc)
    { //Argumento polimorfico!!!! Forma de Voo, forma de Nado e etc
        locomocao = loc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVoar() {
        return voar;
    }

    public void setVoar(boolean voar) {
        this.voar = voar;
    }

    public Locomocao getLocomocao() {
        return locomocao;
    }

    public void realizarLocomocao(String string) {
        locomocao.locomover(nome);
    }


}
