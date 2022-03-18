#language: pt

@qualquer
Funcionalidade: funcionalidade qualquer

  @automated @chrome
  Cenario: primeiro cenario
	Dado que o usuário acessou o SeleniumEasy
	Quando o conteúdo da página principal é mostrado
	Então o usuário visualiza que o nome do site é "Selenium Easy"

  @ts22 @crud
  Cenario: segundo cenario
	Dado que o usuário acessou o SeleniumEasy
	Quando o conteúdo da página principal é mostrado
	Então o usuário visualiza que o nome do site é "Selenium Easy"


  @automated @cadastroProduto
  Cenario: terceiro cenario
	Dado que o usuário acessou o SeleniumEasy
	Quando o conteúdo da página principal é mostrado
	Então o usuário visualiza que o nome do site é "Selenium Easy"


#	Esquema do Cenario: Cenario: cenário qualquer
#	  Dado que o usuário acessou a página x
#	  Quando o usuário adiciona <quantidadeProdutos> produtos
#	  Então o usuário visualiza a mensagem "<textoMensagem>"
#	  Exemplos:
#	  | quantidadeProdutos | textoMensagem |
#	  | 3                  | Obrigada      |
#	  | 4                  | lalalala      |
