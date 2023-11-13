# Padrão de Projeto Singleton

## Visão Geral

O padrão de projeto Singleton garante que uma classe tenha apenas uma instância e fornece um ponto de acesso global para essa instância.

## Diagrama UML

![singleton drawio (1)](https://github.com/WallaceHS20/Bertoti/assets/101594950/957d200a-d9da-43d0-9f12-0a5cc19c742a)


## Componentes

### BancoDeDados (Classe)

- **-instance:** Um atributo privado estático que mantém a única instância da classe `BancoDeDados`.
- **-BancoDeDados():** Construtor privado que impede a instanciação externa da classe.
- **+getInstance():** Método público estático que retorna a única instância da classe, criando-a se necessário.

## Funcionamento

1. Quando o método `getInstance()` é chamado, a classe primeiro verifica se a instância privada estática já foi criada.
2. Se a instância não existe, o método `getInstance()` a cria invocando o construtor privado.
3. Se a instância já existe, o método simplesmente retorna a referência a essa instância.
4. O acesso ao construtor é privado, então novas instâncias não podem ser criadas diretamente com o operador `new`.

## Implementação

```java
public class BancoDeDados {
    private static BancoDeDados instance;

    private BancoDeDados() {
        // Construtor privado
    }

    public static BancoDeDados getInstance() {
        if (instance == null) {
            instance = new BancoDeDados();
        }
        return instance;
    }
}
