# java-bdd-cucumber

Referências:

    https://cucumber.io/
    https://cucumber.io/docs/cucumber/checking-assertions/

Incluir imagines aqui: 


01 - Introdução ao BDD:

    O que é BDD (o Behaviour Driven Development)
        BDD tenta melhorar a comunicação e colaboração
        BDD tenta aproximar o negócio e criar um entendimento   melhor como a aplicação deveria funcionar
    Existem vários tipos e níveis de testes, como por exemplo:
        testes de unidade
        testes de integração
        testes ponta a ponta (end-to-end)


02 - Escrevendo Features com Cucumber:

    Como integrar a biblioteca Cucumber na aplicação
    Cucumber pode ser inicializado a partir do junit4 (@RunWith)
    Os arquivos .feature são analisados pelo Gherkin e Cucumber
        Gerkin é uma linguagem para definir os .feature
        Cucumber gera e roda os passos (steps) associados ao .feature
    Dentro do .feature escrevemos a funcionalidade e os critérios de aceitação
    Um critério de aceitação segue a estrutura de um teste (passos ou steps)
        os passos são Given-When-Then ou Dado-Quando-Entao
    Cada passo será implementado por um método anotado (step)