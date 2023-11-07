package facade;

public class Aplicacao {
    public static void main(String[] args) {
        SistemaAudioFacade audioFacade = new SistemaAudioFacade();
        audioFacade.ligar();
        audioFacade.ajustarVolume(50);
        audioFacade.desligar();
    }
}
