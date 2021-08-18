# f3270-poc
Prova de conceito para a utilização da biblioteca [f3270](https://github.com/vebqa/f3270), para a automação de testes para Alta Plataforma (Terminais 3270 e 5250).

## Pré-condições para a execução dos testes
* Sistema operacional Windows, para a utilização do executável s3270.
* JDK instalado e configurado. Vide [link para download](https://jdk.java.net/java-se-ri/11) e [instruções para a instalação](https://www.codejava.net/java-se/download-and-install-java-11-openjdk-and-oracle-jdk) para maiores detalhes.
* Maven instalado e configurado. Vide [link para download](http://maven.apache.org/download.cgi) e [instruções para a instalação](https://www.codejava.net/java-se/download-and-install-java-11-openjdk-and-oracle-jdk) para maiores detalhes.
* Download do pacote wc3270, pacote de programas que contém o s3270. [Link para download](https://x3270.miraheze.org/wiki/Downloads)
* Configuração do emulador Sim390, explicado no item "Preparação do ambiente".

## Preparação do ambiente para os testes
* Baixar o Sim390 [neste link](https://www.canpub.com/teammpg/de/sim390/sim390_17.zip), e descompactar os arquivos para o diretório ```C:\sim390dm```
* Baixar o MUSIC/SP [neste link](https://www.canpub.com/teammpg/de/mcgweb/musdemo_b.zip), e descompactar os arquivos para o mesmo diretório ```C:\sim390dm```
* Alterar as seguintes linhas contidas no arquivo ```musicxdm.cfg```:
```text
* Retirar o comentário da linha abaixo:
autoipl 201 blankcmd
* Alterar a porta listada abaixo para a porta "23"
remote3270port 23
```
* Acessar o Prompt de Comando, entrar no diretório ```C:\sim390dm``` e executar o comando ```sim390_17 musicxdm.cfg```

## Execução dos testes
Executar o seguinte comando no Prompt de Comando:
```text
mvn clean test
```