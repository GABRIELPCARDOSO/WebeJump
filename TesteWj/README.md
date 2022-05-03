# Projeto WebJump#

Esse projeto ilustra a estrutura de teste gerada através da utilização do padrão Page Objects, com arquitetura simples para testar as funcionalidades do sistema de forma automatizada.

### Configuração do Ambiente ###

Foi configurado o ambiente para um projeto Maven, utilizando a IDE juntamente com os frameworks Junit e Selenium.
Para preparar o ambiente será preciso ter o Java instalado.
A versão JDK 13.0.2 foi a utilizada (siga com a instalação padrão) e também será preciso o Eclipse IDE, versão utilizada [version:2020-03 (4.15.0)].
Não é preciso instalar, basta descompactá-lo e abrir o executável.
Será preciso o driver do Firefox (GeckoDriver), foi utilizada a versão v0.25.0, escolha o driver correspondente ao do sistema operacional.
O driver não precisa ser instalado, basta descompactá-lo em uma pasta e usar a referência para ele ao longo dos testes.
Adicionar o caminho a pasta onde se encontra o Gecko Driver no path do sistema operacional.
O arquivo de configuração do Maven [pom.xml] contém as configurações das bibliotecas do Junit [versão v.4-12], Selenium [v.3.10] e Commons-io [v.2.6] para baixar todas suas dependências.

Para executar o projeto, é necessário utilizar o Eclipse, para que o mesmo identifique as dependências necessárias para a execução no repositório .m2 do Maven. Uma vez importado o projeto, a classe SuiteGeral será a classe principal de execução das classes de teste de todas as funcionalidades em conjunto.

## Começando

Para executar o projeto, será necessário instalar os seguintes programas:

- [JDK 13: Necessário para executar o projeto Java](https://www.oracle.com/java/technologies/javase-jdk13-downloads.html)
- [Eclipse: Para desenvolvimento do projeto](https://www.eclipse.org/downloads/packages/release/2020-03/r/eclipse-ide-java-developers)
- [GeckoDriver: driver do Firefox](https://github.com/mozilla/geckodriver/releases/tag/v0.25.0)
- [ChromeDriver: driver do Chrome versio 80.0.3987.106 Supports Chrome version 80](https://chromedriver.storage.googleapis.com/index.html?path=80.0.3987.106/)
- [Link](https://www.linkedin.com/in/gabriel-primo-369616231/)

