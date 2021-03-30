# Descrição do desafio

## Criar uma aplicação Selenium para testar o site Tricentis
### Caso de teste 1
Acessar o site da Gama Academy e navegar pelo site

**Cenario:** Acessar o site da Gama Academy<br>
    Dado que eu acesso o site da Gama Academy "https://www.gama.academy"
    E clico para fechar propaganda<br>
    E clico na opcao quem somos<br>
    Entao devo ver o intem do "MANIFESTO"<br>

### Caso de teste 2
Acessar o site da gama academy e navegar pelo site

**Cenario:** Acessar o site da Gama Academy Product Owner
    Dado que eu acesso o site da Gama Academy "https://pages.gama.academy/curso-de-product-management/"
    E clico no botao transformadores
    Entao devo ver a foto Ronaldo Marciano
    
**Cenario:** Acessar o site da Gama Academy 
    Dado que eu acesso o site da Gama Academy "https://www.gama.academy"
    E clico para fechar propaganda
    E clico no botao dev fullstack 
    Entao devo ver as opcoes
- [x] |Crie seu portfólio!|
- [x] |Acompanhamento de Carreira|
- [x] |Professores de surf que sabem surfar!|
- [x] |Estude na Melhor Startup de Educação|
		
---------------------------------------------------------------------------

## Tecnologias utilizadas
:white_check_mark: Java
Linguagem de programação para desenvolvimento da aplicação

:white_check_mark: Maven
Gerenciador de dependências para o Java

:white_check_mark: Cucumber
Framework responsável por traduzir uma linguagem humana em código Java

:white_check_mark: Selenium
Framework responsável por fazer a integração do código java com a linguagem Gherkin(Cucumber) abrindo o browser fazendo o teste de comportamento

-----------------------------------------------------------------------------

## Como utilizar
### Pré requisitos

* Instalar o java: https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR

* Instalar jdk https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html

* Verificar se o JAVA_HOME está configurado em seu computador

* Fazer clone do projeto
```
https://github.com/VeronicaBertozzi/ExerciciosBDD.git
```
* Entrando na pasta do projeto
```
cd ExerciciosBDD
```
* Configurando selenium em seu computador - Fazer o download do Chrome Webdriver e trocar o arquivo descompactado dentro da pasta driver na raiz do projeto:
https://chromedriver.chromium.org/downloads
Exemplo:
```
cd driver
curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
rm -rf chromedriver_linux64.zip
cd ../driver
```
* Limpando e validando maven Unix
```
./mvnw clean
```
* Limpando e validando maven Windows
```
mvnw.cmd clean
```
* Executando teste no Unix
```
./test.sh
```
* Executando teste no Windows
```
test.bat
```
----------------------------------------------------------------------
## Estrutura de arquivos
```
  driver 

      |-- chromedriver -- Este é o arquivo do selenium webdriver, substitua este arquivo com a versão da sua máquina

  mvnw

  mvnw.cmd

  pom.xml

  src

    |-- test

    |  |-- java

    |  |  |-- io

    |  |  |  |-- cucumber

    |  |  |  |  |-- Veronica

    |  |  |  |  |  |-- servico -- Pasta para colocar Classes em Java para usar nos arquivos Steps
    
    |  |  |  |  |  |  |-- Configuracao -- Conjunto de classes em java para facilitar o processo das Steps

    |  |  |  |  |  |-- CasoDeTeste1Steps -- Passos escritos em java com selenium abrindo o site e navegando por ele
 
    |  |  |  |  |  |-- CasoDeTeste2Steps -- Passos escritos em java com selenium abrindo o site e navegando por ele
    
    |  |  |  |  |  |-- CompartilhandoSteps -- Passos escritos em java com selenium em comum entre os cenários 
    
    |  |  |  |  |  |-- RunCucumberTest.java -- Arquivo que configura a inicialização do Java test(Caso utilize o editor de código Eclipse sera necessario rodar o test nesse arquivo primeiro)

    |  |-- resources

    |  |  |-- io

    |  |  |  |-- cucumber

    |  |  |  |  |-- Veronica

    |  |  |  |  |  |-- casoDeTeste1.feature -- Gherkin com os cenários de teste de acordo com o meu cliente

    |  |  |  |  |  |-- CasoDeTeste2.feature -- Gherkin com os cenários de teste de acordo com o meu cliente

  test.bat -- Arquivo para rodar teste no Windows
  
  test.sh -- Arquivo para rodar teste no Unix
```

