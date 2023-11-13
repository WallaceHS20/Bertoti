package facade;

public class SistemaAudioFacade {
    private SistemaAudio sistemaAudio;

    public SistemaAudioFacade() {
        this.sistemaAudio = new SistemaAudio();
    }

    public void ligar() {
        sistemaAudio.ligar();
    }

    public void desligar() {
        sistemaAudio.desligar();
    }

    public void ajustarVolume(int volume) {
        sistemaAudio.ajustarVolume(volume);
    }
}
