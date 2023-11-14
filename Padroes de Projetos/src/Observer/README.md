# Padrão de Projeto Observer

## Visão Geral

O padrão de projeto Observer é utilizado para criar uma relação de assinatura entre objetos, de forma que quando um objeto muda de estado, todos os seus assinantes são notificados e atualizados automaticamente. Esse padrão é útil para manter a consistência entre objetos relacionados sem fazer com que eles sejam fortemente acoplados.

## Diagrama UML

![bt](https://github.com/WallaceHS20/Bertoti/assets/101594950/4eafb1ae-6263-433a-8b46-53032193072e)

## Componentes

### Observable (Interface)

Uma interface que define métodos para adicionar (`addObserver`) e notificar observadores (`notifyObservers`). Classes que implementam essa interface podem ter um ou mais observadores que são informados sobre as mudanças de estado.

### Observer (Interface)

Uma interface que define o método `update`, que é chamado quando um `Observable` notifica uma mudança. Classes que implementam essa interface atuam como observadores e respondem às notificações.

### CarroSuspeito (Classe Concreta)

Uma implementação concreta de `Observable`. Mantém um estado interno que, quando alterado pelo métodos `estacionado` ou `multado`, dispara uma notificação aos seus observadores através do método `notifyObservers`.

### AgenteDeTransito (Classe Concreta)

Uma implementação concreta de `Observer`. Reage a notificações de mudanças de estado em `CarroSuspeito`, provavelmente para tomar ações de fiscalização ou registro.

## Funcionamento

1. `CarroSuspeito` altera seu estado através de ações como `estacionado` ou `multado`.
2. Após cada alteração de estado, `CarroSuspeito` chama `notifyObservers` para informar todos os seus observadores registrados sobre a mudança.
3. `AgenteDeTransito`, que está registrado como um observador, recebe a notificação através do método `update` e pode responder de acordo.

## Implementação

1. Defina a interface `Observable` com os métodos `addObserver` e `notifyObservers`.
2. Defina a interface `Observer` com o método `update`.
3. Implemente a classe `CarroSuspeito` que possui um estado e métodos que alteram esse estado, notificando os observadores.
4. Implemente a classe `AgenteDeTransito` que define como responder às notificações.

## Conclusão

O padrão Observer facilita o desenvolvimento de sistemas onde múltiplas partes precisam ser notificadas sobre mudanças em objetos, promovendo um baixo acoplamento e alta coesão entre eles.



