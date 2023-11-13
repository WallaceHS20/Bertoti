# Padrão de Projeto Composite

## Visão Geral - Árvore

O padrão de projeto Composite é utilizado para tratar objetos individuais e composições de objetos de maneira uniforme. Este padrão estrutural compõe objetos em estruturas de árvore para representar hierarquias de parte-todo. Ele permite que clientes tratem objetos individuais e composições de objetos da mesma maneira.

## Diagrama UML

<img src="https://github.com/IgorRibeiro-S/bertoti/blob/main/PadraodeProjetos/DesingPatternJava/Composite/PatternComposite/composite.drawio.png?raw=true">

## Componentes

### FuncionarioComponent (Interface)

Esta é a abstração para todos os componentes do sistema, incluindo tanto objetos simples quanto compostos. Ela declara operações que são comuns tanto a objetos primitivos quanto a compostos, como `getNome()`, `Adicionar(FuncionarioComponent)` e `Remover(FuncionarioComponent)`.

### GestorComposite (Classe Abstrata)

Implementa a interface `FuncionarioComponent` e mantém uma lista de objetos `FuncionarioComponent`, que podem ser tanto objetos individuais quanto outros compostos. Esta classe abstrata fornece a implementação base para os métodos da interface, que podem ser herdados ou sobrescritos pelas subclasses concretas.

### Gerente (Classe Concreta)

Uma classe concreta que estende `GestorComposite`. Pode gerenciar subordinados, que podem ser outros `Gerentes` ou funcionários individuais. Implementa os métodos `getNome()`, `Adicionar(FuncionarioComponent)` e `Remover(FuncionarioComponent)` conforme necessário.

### Garcom (Classe)

Representa um objeto folha no padrão Composite. Ele não possui subordinados e contém apenas o método `getNome()`.

## Utilização

O padrão Composite é particularmente útil quando você precisa realizar operações tanto em objetos individuais quanto em grupos de objetos. Por exemplo, você pode querer calcular salários ou imprimir relatórios hierárquicos para uma estrutura organizacional de maneira uniforme.

## Implementação

1. Defina a interface `FuncionarioComponent` com operações comuns.
2. Crie uma classe abstrata `GestorComposite` que implementa a interface `FuncionarioComponent`.
3. Defina uma classe concreta `Gerente` que estende de `GestorComposite`.
4. Defina uma classe `Garcom` que representa uma folha na estrutura Composite.

## Conclusão

O padrão Composite oferece flexibilidade na forma como as estruturas são definidas e como elas podem ser trabalhadas de forma uniforme. Ele simplifica o código do cliente, pois pode tratar estruturas compostas e objetos individuais sem distinção.

