# DesafioVia
Como executar via ide Junit:
1. Importar na ide de preferencia o projeto como maven java
2. Abrir o arquivo RunnerTest.java e executar via Junit

2.1 Ou executar o projeto como Junit

Como executar via cucumber feature:
1. selecionar o arquivo em src/test/resources/feature/
2. executar como cucumber feature

Como executar via linha de comando utilizando maven(necessario ter o maven configurado na maquina):
1. Abrir o terminal no diretorio do projeto
2. Executar o comando: mvn test

Como executar via linha de comando utilizando maven, para gerar relatorio(necessario ter o maven configurado na maquina):
1. Abrir o terminal no diretorio do projeto
2. Executar o comando: mvn install
3. abrir o arquivo: \target\reports\cucumber-html-reports\overview-features.html

# Estrutura do Projeto
Pacotes:

	Core:
		Pacote responsavel pela parte do core da automação, como acesso ao driver e ações dos elementos

	Enums:
		Pacote responsavel para guardar qualquer Enum que seja necessário criar

	Maps:
		Pacote responsavel pela parte dos mapeamentos dos campos, onde os objetos dos campos são instanciadas utilizando a classe Element de core

	Pages:
		Pacote responsavel pela parte das ações das paginas, como preenchimento, cliques, retornos de conteudos.

	Runner:
		Pacote responsavel pela parte das classes de execuções utilizando JUnit e RunWith Cucumber.class

	Utils:
		Pacote responsavel para guardar todas as classes que contenham metodos que possam ser usadas por varios métodos ou classes

	Steps:
		Pacote responsavel para guardar as Classes de Steps, as quais são geradas pelo cucumber. Nessas classes são chamadas as ações das paginas
			Através das pages e validações.

	features:
		Diretório responsável para guardar os arquivos .feature, onde estão gravados os arquivos relacionados ao cucumber e as escrita em gherkin
	 	ris17h58h23mAtivid