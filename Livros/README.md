# Avaliação: APIs REST com Spring Boot

## Autor
- **Nome:** Diego Ugioni Pinto

---

## Descrição do Projeto
Este repositório contém o desenvolvimento de duas APIs RESTful como parte de uma avaliação de conhecimentos em Spring Boot. O projeto aplica os conceitos de arquitetura em camadas (Model, Repository, Service, Controller) e integração com banco de dados MySQL via Spring Data JPA.

O projeto está dividido em dois módulos principais:
1.  **E-commerce:** Uma API para gerenciamento de um catálogo de produtos.
2.  **Biblioteca:** Uma API para controle de livros, incluindo empréstimos e devoluções.

---

## Tecnologias Utilizadas
- Java 24
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven

---

## Como Executar o Projeto
1.  Clone o repositório:
    ```bash
    git clone https://github.com/BravoRealDev/avaliacaospringboot
    ```
2.  Configure o banco de dados no arquivo `src/main/resources/application.properties` com suas credenciais do MySQL.
3.  Execute o projeto usando sua IDE (IntelliJ, Eclipse) ou via linha de comando com o Maven:
    ```bash
    ./mvnw spring-boot:run
    ```
4. A aplicação estará disponível em `http://localhost:8080`.

---

## Endpoints da API

### Módulo de E-commerce (`/produtos`)
- `POST /produtos`: Cria um novo produto.
- `GET /produtos`: Lista todos os produtos.
- `GET /produtos/{id}`: Busca um produto por ID.
- `PUT /produtos/{id}`: Atualiza um produto existente.
- `DELETE /produtos/{id}`: Exclui um produto.

### Módulo de Biblioteca (`/livros`)
- `POST /livros`: Cadastra um novo livro.
- `GET /livros`: Lista todos os livros.
- `GET /livros/{id}`: Busca um livro por ID.
- `PUT /livros/{id}`: Atualiza os dados de um livro.
- `DELETE /livros/{id}`: Exclui um livro.
- `PATCH /livros/{id}/emprestar`: Marca um livro como emprestado (indisponível).
- `PATCH /livros/{id}/devolver`: Marca um livro como devolvido (disponível).
