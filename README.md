# O que são Design Patters?
### 
Design Patterns são soluções genéricas para problemas recorrentes no desenvolvimento de software. 
# Divisões Design Patters 
### Criacionais
### 
Cuidam da construção do objeto e referência fornecendo alguns mecanismos, que possibilitam a flexibilidade e reutilização de código.
#### Factory Method
##### 
Forence uma interface para criar objetos em uma superclassse e permitem subclasses alterem o tipo de objetos criados. 
#### Abstract Factory
##### 
Possibilita produção de famílias de objetos relacionados sem especificar suas classes concretas. 
#### Builder
#####
Constrói objetos complexo passo a passo. Permite produzir diferentes tipos representações de um objeto usando o mesmo código de construção. 
#### Prototype
#####
Permite copiar objetos existentes sem fazer o código ficar dependente de suas classes. 
#### Singleton
#####
Garante que uma classe tenham apenas uma instância e fornecendo um ponto de acesso global.
### Estruturais
### 
Tratam a relação entre objetos e entre si, são utilizados em objetos grandes e complexos. 
#### Adapter
#####
Padrão de projeto estrutural que permite que objetos com interfaces incompatíveis colaborarem entre si. 
#### Bridge
#####
Separa implementações de abstrações em prol da flexibilidade.
#### Composite
#####
Cria composição de objetos em estrutura de árvores, possibilitando que esses objetos trabalhem de forma individual. 
#### Decorator
#####
Possibilita adicionar novos comportamentos a objetos envolvendo em um envoltório(wrapper) de objetos com os comportamentos. 
#### Facade
#####
Fornece uma interface simplificada de conjunto complexo classes, framework e biblioteca.
#### Flyweight
#####
Compartilha pequenos recursos para economizar espaço.
#### Proxy
#####
Faz com que um objeto represente outro objeto.
### Comportamentais
### 
Padrões Comportamentais tratam algoritmos e responsabilidade entre objetos. 
#### Chain of Responsibility
#####
Possibilita repasse de pedidos por conrrente de handlers. Com isso, permite que outros objetos da cadeia tenham a oportunidade de tratar tal solicitação.
#### Command
#####
Transforma requisições em um objeto independente com conteúdo de toda informação da mesma. Possibilitando parametrização de métodos em diferentes requisições, atrase ou coloque em uma fila.  
#### Interator
#####
Percorre um conjunto de dados independentes da implementação.
#### Mediator
#####
Simplifica relacionamentos complexos entre objetos.
#### Memento
#####
Permite salvar e restaurar o estado anterior de um objeto sem expor detalhes de sua implementação. 
#### Observer
#####
Criar mecanismo de asssinatura para notificar eventos que em objetos observados.
#### State 
#####
Simplifica a troca de estados internos de objetos.
#### Strategy
#####
Possibilita definir famílias de algoritmos e separar em classes com objetos intercambiáveis. 
#### Template Mehotod
##### 
Criar um esqueleto de um algoritmo na superclasse e deixa as subclasses sobrescrever etapas específicas do algoritmo sem modicar estrutura. 
#### Visitor
#####
Define uma nova operação para uma classe sem alterá-la.

## 
O projeto contém todos os exemplos design patters mencionados. 



