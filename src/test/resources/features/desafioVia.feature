#language:pt
@DesafioVia
Funcionalidade: Desafio Via
	Contexto:
		Dado que esteja na pagina "http://www.lourencodemonaco.com.br/vvtest/"
    

  Cenario: Preencher pesquisa com dados obrigatorios validos
	Dado que eu acesse a página da VV Test
	E acesse o menu "Pesquisa – QA"
	Quando eu preencher todos os campos obrigatorios 
	Entao deve ser direcionado para uma pagina de sucesso