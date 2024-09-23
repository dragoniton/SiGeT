# Sistema de Gestão de Tarefas

Aplicação criada para a atividade de seleção estágio ESIG GROUP "Pessoa Desenvolvedora Fullstack".

Link para o respositório do frontend: https://github.com/dragoniton/SiGeT-frontend

A aplicação utiliza Java 17.0.7, Springboot 3.3.4 e Maven 3.13.0 e utiliza postgreSQL como database no backend.
 No frontend, foi utilizado Angular 17.3.7. 
 
 Utilizar `http://localhost:8080/` para acessar backend, `http://localhost:8080/swagger-ui/` para acessar a documentação em Swagger e `http://localhost:4200/` para acessar o frontend em Angular.

Dos itens extras:

e) Persistência JPA automática do springboot com bando de dados PostgreSQL com configurações especificadas em "SiGeT/src/main/resources
/application.properties", tendo o nome da database "backenddb", com usuário "postgres" e senha "test". Foi utilizado Docker para inicializar a database com postgres versão 16, com o seguinte comando:

`docker run -d -e POSTGRES_HOST_AUTH_METHOD=trust -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=test -e POSTGRES_DB=backenddb -p 5432:5432 postgres:16`

g) API documentada com Swagger, acessível em `http://localhost:8080/swagger-ui/`

Recomenda-se criar a database com o comando do docker, certificando-se que o docker esteja inicializado no background, então utilizar `mvn clean install` e `mvn spring-boot:run` para inicializar o backend, e depois `ng serve` para inicializar o frontend.
