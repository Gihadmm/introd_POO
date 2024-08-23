Trabalho de introdução a programação orientada a objeto

Integrantes: 
Gihad Mohamad Mourad


Exercício: Introdução à POO - Herança, Abstração e Encapsulamento


Parte 1: Abstração
Imagine que você precisa criar um sistema para gerenciar veículos em uma empresa de aluguel de carros. Cada veículo tem certas características, como marca, modelo, ano de fabricação, e cor.

Perguntas:
1. Quais características (atributos) e comportamentos (métodos) você consideraria importantes para uma classe abstrata chamada Veículo? Liste pelo menos 4 atributos e 2 métodos que fariam parte dessa classe.


    R:   Os atributos: Marca, Modelo, Ano e Cor.

   Os metodos: Mover, e ligar.



3. Por que você acha que essa classe deveria ser abstrata? Explique o conceito de abstração com base nesse exemplo.

   R:  A classe veiculo deveria ser abstrata pois é um conceito genérico, e que vai servir como base para futuras classes mais "especificas" que são veiculos.




Parte 2: Herança
Com base na classe abstrata Veículo, você precisa criar classes específicas para tipos de veículos: Carro, Moto, e Caminhão.
Perguntas:


1. Se a classe Veiculo tem um método abstrato chamado mover(), como você implementaria esse método nas classes Carro, Moto, e Caminhao? Descreva como cada tipo de veículo se move de maneira diferente.

 
  R: O metodo mover foi feito abstrato na classe veiculos, e foi declarado em cada uma das subclasses:
    Carro: O carro se move de maneira suave e controlada
    Moto: A moto é ágil e leve
    Caminhão: O caminhão se move de forma mais lenta e robusta 


2. Qual é a vantagem de usar herança nesse caso, em vez de criar as classes Carro, Moto, e Caminhao do zero? Explique o conceito de herança com base nesse exemplo.

R: A Herença facilita a criação dessas classes mais especificas, pois os atributos e metodos já foram criados. Isso cria uma estrutura de código coesa e organizada, também evitando repetições dentro do código.




Parte 3: Encapsulamento
Para proteger as informações dos veículos, você precisa garantir que os atributos, como o número de identificação do veículo (VIN), não possam ser alterados diretamente.
Perguntas:

1. Como você implementaria o encapsulamento para proteger o atributo vin na classe Veículo? Descreva como você usaria métodos getter e setter para acessar e modificar esse atributo.


O atributo vin foi criado como "private", assim garantindo que ninguém fora da classe consiga acessar o VIN diretamente. Foi criado o metodo "getVIN()", que faz com que seja exibido o valor atribuido ao VIN. E, também, o metodo "setVIN(int VIN)", que permite com que você altere o valor do atributo, sem acessar o mesmo diretamente.


2. Por que é importante proteger os atributos de uma classe? Explique o conceito de encapsulamento com base nesse exemplo.


Proteger um atributo garante a integridade dos dados do mesmo. Gera segurança e controle de acesso, pois impede que dados privados sejam vazados ou alterados de forma incorreta.


Instruções para Resolução
•
Escreva suas respostas no papel, explicando seus pensamentos de forma clara e objetiva.
Não é necessário escrever código Java completo, apenas descreva como você abordaria cada questão usando os conceitos de POO.
Scanned with ACE Scanner
