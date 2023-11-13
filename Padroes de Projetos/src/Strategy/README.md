# Padrão de Projeto Strategy

## Visão Geral

O padrão de projeto Strategy é um padrão de design comportamental que permite definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis. O Strategy permite que o algoritmo varie independentemente dos clientes que o utilizam.

## Diagrama UML


![MicrosoftTeams-image](https://github.com/WallaceHS20/Bertoti/assets/101594950/42d153a0-a157-437e-a72d-988e638a228a)

## Componentes

### Locomocao (Interface)

Define a interface comum para todas as estratégias de locomoção dos insetos. Cada estratégia concreta implementará o método `locomover(String): Locomocao`.

### Inseto (Classe)

- **-nome:** Atributo para armazenar o nome do inseto.
- **-locomocao:** Atributo para armazenar a estratégia de locomoção.
- **+realizarLocomocao(String):** Método que executa a ação de locomoção.
- **+setNome(String):** Método para definir o nome do inseto.

### Rastejo e Voo (Classes Concretas)

Implementações concretas da interface `Locomocao`. Cada uma destas classes fornece uma implementação diferente do método `locomover`, representando diferentes maneiras de locomoção (rastejar ou voar).

## Funcionamento

1. A classe `Inseto` mantém uma referência a um objeto `Locomocao` que é uma instância de uma das estratégias de locomoção.
2. O método `realizarLocomocao` da classe `Inseto` é chamado para executar uma ação de locomoção.
3. A chamada ao método `locomover` é delegada ao objeto de estratégia de locomoção referenciado.

## Conclusão

O padrão Strategy é útil quando temos várias maneiras de realizar uma operação e queremos alternar entre elas em tempo de execução. Ele oferece flexibilidade e uma maneira elegante de incorporar diferentes comportamentos a uma classe.

