# language: pt

Funcionalidade: Propondo lances ao leilao

  Cenario: Propondo um unico lance valido
    Dado um lance valido
    Quando propoe o lance ao leilao
    Entao o lance e aceito

  Cenario: Propondo varios lances validos
    Dado um lance de 10.0 reais do usuario "fulano"
    E um lance de 15.0 reais do usuario "beltrano"
    Quando propoe ao leilao
    Entao os lances sao aceitos
  
  Esquema do Cenario: Propondo um lance inválido
    Dado um lance de <valor> reais e do usuario '<nomeUsuario>'
    Quando propoe o lance ao leilao
    Entao o lance nao eh aceito

  Exemplos:
    | valor | nomeUsuario |
    | 0     | beltrano    |
    | -1    | ciclano     |

  Cenario: Propondo uma sequencia de lances
    Dado um dois lances
      | valor  | nomeUsuario  |
      | 10     | beltrano     |
      | 15     | beltrano     |
    Quando propoe ao leilao
    Entao o segundo lance nao eh aceito