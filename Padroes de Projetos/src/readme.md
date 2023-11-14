# Resumo dos Padrões de Projeto

## Padrão Singleton

Garante que uma classe tenha apenas uma única instância e fornece um ponto de acesso global a essa instância.

- **BancoDeDados**:
  - **+getInstance():** Retorna a única instância da classe, criando-a se necessário.

## Padrão Observer

Define uma dependência um-para-muitos entre objetos, permitindo que quando um objeto muda de estado, todos os seus dependentes sejam notificados e atualizados automaticamente.

- **Observable**:
  - **+addObserver(Observer):** Adiciona um observador.
  - **+notifyObservers():** Notifica todos os observadores sobre mudanças.
  
- **Observer**:
  - **+update():** Atualiza o observador com as mudanças.

## Padrão Strategy

Permite definir uma família de algoritmos, encapsular cada um e torná-los intercambiáveis. O padrão permite que o algoritmo varie independentemente dos clientes que o utilizam.

- **Locomocao**:
  - **+locomover():** Define o método de locomoção que as estratégias concretas irão implementar.

## Padrão Composite

Composta objetos em estruturas de árvore para representar hierarquias parte-todo. Permite que clientes tratem objetos individuais e composições de objetos de maneira uniforme.

- **Component**:
  - **+operation():** Operação que deve ser implementada tanto por folhas quanto por compostos.
  
- **Leaf**:
  - Implementa comportamentos para objetos primitivos da composição.

- **Composite**:
  - Armazena componentes filhos e implementa operações relacionadas aos filhos.

## Padrão Facade

Fornece uma interface unificada para um conjunto de interfaces em um subsistema. Facade define uma interface de alto nível que torna o subsistema mais fácil de ser usado.

- **Facade**:
  - Oferece uma interface simples para a operação complexa do subsistema.

## Conclusão

Cada padrão de projeto aborda problemas específicos de design de software, facilitando a manutenção, a extensibilidade e a flexibilidade dos sistemas de software.

