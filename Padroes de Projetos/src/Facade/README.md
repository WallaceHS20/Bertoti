# Padrão de Projeto Facade

## Visão Geral

O padrão de projeto Facade fornece uma interface unificada para um conjunto de interfaces em um subsistema. Facade define uma interface de nível mais alto que torna o subsistema mais fácil de ser usado.

## Diagrama UML

![facade](https://github.com/WallaceHS20/Bertoti/assets/101594950/4b162c48-ee8d-445d-8181-eeb34314d198)

## Componentes

### SistemaAudio (Classe)

Esta classe representa um subsistema complexo e pode ter múltiplas operações como ligar, desligar e ajustar o volume.

- **+ligar():** Método para ligar o sistema de áudio.
- **+desligar():** Método para desligar o sistema de áudio.
- **+ajustarVolume():** Método para ajustar o volume do sistema de áudio.

### SistemaAudioFacade (Classe)

A Facade que simplifica a interface para o uso do subsistema `SistemaAudio`.

- **-sistemaAudio: SistemaAudio:** Referência para o subsistema de áudio.
- **+ligar():** Método para ligar o sistema de áudio.
- **+desligar():** Método para desligar o sistema de áudio.
- **+ajustarVolume():** Método para ajustar o volume do sistema de áudio.

## Funcionamento

1. A classe `SistemaAudioFacade` fornece uma interface simplificada que delega as chamadas de métodos para os métodos apropriados na classe `SistemaAudio`.
2. O cliente interage apenas com a `SistemaAudioFacade`, sem precisar entender ou interagir diretamente com o subsistema `SistemaAudio`.

## Implementação

```java
public class SistemaAudio {
    public void ligar() {
        // Implementação para ligar o sistema de áudio
    }
    
    public void desligar() {
        // Implementação para desligar o sistema de áudio
    }
    
    public void ajustarVolume() {
        // Implementação para ajustar o volume do sistema de áudio
    }
}

public class SistemaAudioFacade {
    private SistemaAudio sistemaAudio = new SistemaAudio();
    
    public void ligar() {
        sistemaAudio.ligar();
    }
    
    public void desligar() {
        sistemaAudio.desligar();
    }
    
    public void ajustarVolume() {
        sistemaAudio.ajustarVolume();
    }
}
