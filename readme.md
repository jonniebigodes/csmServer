# CSM Servidor


Este repositorio contem a implementacao do servidor CSM (Crime Scene Magicians) 

# Methodologia usada
Em termos de metodologia usada usei a seguinte estrutura:
  - /src/
    - Contem os ficheiros da aplicacao.
      
  - /src/main/java/csm/Controllers
    - Dentro desta pasta estao contidos todos os Controladores para redirecionar os pedidos da aplicacao.
  - /src/main/java/csm/DAO/
    - Dentro desta pasta estao contidos todos as classes representativas dos dados da aplicacao.
  - /src/main/java/csm/DAO/DTO
    - Esta pasta contem as classes para conter as respostas customizadas para o utilizador a serem enviadas.
  - /src/main/java/csm/DAO/Mappings
    - Esta pasta contem as classes que irão mapear os dados vindos da base de dados para uma representação definida pelas classes *DAO.
  - /src/main/java/csm/Repositories
    - Esta pasta contem as classes para servir de repositorio dos dados vindos da base dados.
 - /src/main/resources
    - Esta pasta contem os ficheiros de configuracao.
 
    
### Tech
Esta aplicação usa um numero algo grande de bibliotecas open source para funcionar corretamente:
* [Gradle] - Excelente biblioteca para gerar builds java e nao só
* [Springboot] - Biblioteca Java para gerar aplicações quer web quer desktop facil de configurar
* [PostgresSQL] - Self explanatory
* [JAVA]
E claro está a implementação em si esta disponivel no [git-repo-url] como open source no Gitub


### Instalação de raiz

Servidor CSM necessita [Gradle](https://gradle.org/) v4+ para funcionar.

Download and extrair a [latest pre-built release](https://github.com/jonniebigodes/csmServer/releases).



Para correr a aplicação localmente será necessario executar o que se encontra descrito abaixo
```sh
$ cd pasta 
$ gradlew (sistemas nix) ou gradlew.bat (sistemas windows) bootRun
$ npm start
Abrir url http://localhost:8090
```
License
----
MIT

**Free Software, Hell Yeah!**

[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)
   
   [Gradle]: <https://gradle.org/>
   [Springboot]: <https://projects.spring.io/spring-boot/>
   [React-Bootstrap]: <https://react-bootstrap.github.io/>
   [git-repo-url]: <https://github.com/jonniebigodes/csmServer.git>
   [PostgresSQL]: <https://www.postgresql.org/>
   [PlGh]:  <https://github.com/jonniebigodes/csmServer/tree/master/readme.md>
   
