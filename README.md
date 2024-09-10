# Alunos Instituição - Backend

Este é o backend do projeto **Alunos Instituição**, desenvolvido com **Spring Boot**. Ele fornece uma API REST que gerencia informações de alunos e instituições e se conecta a um banco de dados MySQL.

## Tecnologias Utilizadas

- **Java 8+**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**
- **Maven**

### Configuração do Banco de Dados

Crie o banco de dados MySQL e atualize as credenciais no arquivo `application.properties`:

```sql
CREATE DATABASE db_instituicao_alunos;
```

## Configuração do Projeto

1. Copie o arquivo `src/main/resources/application-example.properties` para `src/main/resources/application.properties`.
2. Preencha as informações sensíveis:
   - `spring.datasource.url`: A URL do seu banco de dados.
   - `spring.datasource.username`: Seu nome de usuário do banco de dados.
   - `spring.datasource.password`: Sua senha do banco de dados.


### Executando o Projeto

1. Navegue até o diretório:

```bash
cd alunos-instituicao
```

2. Compile e execute o projeto usando Maven:

```bash
mvn spring-boot:run
```

3. O backend estará disponível em: `http://localhost:numerodasuaporta`.

### Endpoints Disponíveis

Aqui estão os exemplos de endpoints disponíveis na API:

- `GET /api/alunos` - Retorna a lista de alunos.
- `POST /api/alunos` - Cria um novo aluno.
- `PUT /api/alunos/{id}` - Atualiza as informações de um aluno existente.
- `DELETE /api/alunos/{id}` - Remove um aluno.