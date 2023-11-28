# Aplicativo de Desenho em Java Swing

## Visão Geral

Este projeto é um aplicativo de desenho baseado em Java Swing que demonstra a utilização de vários padrões de projeto, incluindo Model-View-Controller (MVC), Strategy, Composite e Observer. O aplicativo permite aos usuários criar e exibir formas geométricas simples, com a flexibilidade para estender a funcionalidade para cenários de desenho mais complexos.

## Diagrama UML

![mvc_uml](https://github.com/WallaceHS20/Bertoti/assets/101594950/e32ac7a3-d14c-433f-a110-62d1ef584cef)

## Padrões de Projeto

### MVC (Model-View-Controller)

Este padrão arquitetural separa o aplicativo em três componentes interconectados. O objetivo é separar as representações internas da informação das maneiras como a informação é apresentada e aceita pelo usuário.

- **Model**: A classe `CompositeShape` atua como um composto de objetos `Shape`. Ela mantém as formas e notifica a view de quaisquer alterações em seu estado.

### Strategy

O padrão Strategy permite que o algoritmo de desenho seja selecionado e alterado em tempo de execução. Isso é alcançado através da definição de uma família de algoritmos, encapsulando cada um e tornando-os intercambiáveis.

- **Strategy Interface**: A interface `DrawingStrategy` define um contrato para os algoritmos de desenho.
- **Concrete Strategies**: Classes como `CircleStrategy` e `RectangleStrategy` implementam a interface `DrawingStrategy` e fornecem a lógica específica para desenhar formas particulares.

### Composite

Este padrão é usado para tratar grupos de objetos de maneira similar a objetos individuais. No nosso caso, `CompositeShape` pode conter qualquer número de objetos `Shape`, permitindo que o grupo de formas seja tratado como uma única forma.

### Observer

Utilizamos o padrão Observer para criar uma relação de subscrição entre o modelo (`CompositeShape`) e as views (`DrawingView`), onde a view pode reagir a mudanças no modelo sem necessidade de acoplamento direto.

## Funcionalidades

- Desenho de formas geométricas básicas como círculos e retângulos.
- Interface de usuário gráfica para interação simples e intuitiva.
- Extensibilidade para adicionar novas formas e estratégias de desenho.
