# java-bdd-cucumber

Referências:

    https://cucumber.io/
    https://cucumber.io/docs/cucumber/checking-assertions/
    
    Cucumber com Lambda Expression:
        https://gist.github.com/steppat/64eae8b2005345c71f23b78941bf2a2e

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


03 - Mais cenários e parâmetros:

    - Cucumber expressions podem ser substituidas por REGEX
    - Também existem os hooks @BeforeStep e @AfterStep. 
        - Como o nome já indica, nessas anotações o evento é a execução de um step. 
        - Ou seja, cada vez que um métodos anotado com @Dado @Quando ou @Entao é chamado, será chamado o hook.
    
    O que aprendemos nessa aula:
        - um arquivo .feature pode ter vários cenários e passos (steps)
        - os métodos associado aos passos são reaproveitados entre cenários
            - podemos passar parâmetros do cenário ao método
        - Cucumber possui anotações para inicializar (@Before) e finalizar (@After) o cenários
            - os métodos anotados com @Before e @After são chamados de Hooks
            - cuidado, pois os Hooks não são visíveis no arquivo .feature

04 - DataTables e Exemplos

    O que aprendemos nessa aula:
        - Como usar Exemplos para alimentar o mesmo teste com dados diferentes
        - Como usar DataTables para passar vários dados ao teste de uma vez só
        - Usar o plugin do “Cucumber” no Eclipse



05 - Integração com Selenium

    O que aprendemos nessa aula:
        - que PageObject é um padrão de projeto para encapsular o acesso a uma pagina da aplicação
            - todo o código especifico da interface com Selenium fica dentro do PageObject
        - não devemos usar Selenium diretamente nas classe de "steps" do Cucumber
        - o teste, mesmo com Selenium, deve sempre começar a partir de estado "limpo"
        - a melhor estrategia de buscar um elemento na interface é usar a ID

06 - Tags e Contexto

    O que aprendemos nessa aula:
        - como usar de tags para marcar ou agrupar funcionalidades e cenários
            - tags podemos ser escolhidas pela anotação @CucumberOptions ou na linha de comando
    - como definir um contexto (Background) no arquivo .feature
        - um contexto define um passo comum entre todos os cenários dessa funcionalidade