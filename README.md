# Bootcamp-Santander-Dio-Sistema-Controle-Acesso-Ponto

API Rest para controle de ponto e acesso dos usuários de uma empresa

## Tecnologias utilizadas
- Java
- Sring Boot
- Hibernate Envers
- Lombok
- Swagger.

## Como rodar
- No direitório `resource` acesse o arquivo application.properties
- No arquivo `application.properties` insira o path da path do seu projeto (spring.datasource.url=jdbc:h2:file: insira aqui o path do seu projeto)
- Rode o projeto a partir da classe ControlePontoAcessoApplication
- Insira no browser o endereço http://localhost:8081/h2
- Na tela de login em JDBC URL insira o mesmo path utilizado na propriedade `spring.datasource.url` do arquivo `application.properties`.
- O banco de dados será criado automaticamente e você poderá utilizar o Postman ou outro software de sua preferências para testar as funções do CRUD.
- ​
