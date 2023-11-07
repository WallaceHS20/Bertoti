package facade;

public class SistemaAudio {
    public void ligar() {
        System.out.println("Sistema de áudio ligado");
    }

    public void desligar() {
        System.out.println("Sistema de áudio desligado");
    }

    public void ajustarVolume(int volume) {
        System.out.println("Volume ajustado para " + volume);
    }
}
