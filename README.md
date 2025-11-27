# 🧩 Projeto SpringBoot web Services

Este projeto foi desenvolvido com **Spring Boot** com o objetivo de estudar e praticar os principais conceitos do **Java com JPA/Hibernate**, **camadas REST**, **injeção de dependência**, e **persistência de dados**.  
Os testes e requisições foram realizados com o auxílio da ferramenta **Postman**.

---

## 🚀 Tecnologias utilizadas

- **Java 21+**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **H2 Database (perfil de teste)**
- **Maven**
- **Postman (para requisições REST)**

---

## 🧠 Conceitos aplicados

- Estrutura de projeto com **camadas** (entities, repositories, resources e config);
- **Mapeamento objeto-relacional (ORM)** com JPA/Hibernate;
- Relacionamentos entre entidades:
  - `@OneToMany`
  - `@ManyToOne`
  - `@ManyToMany`
  - `@OneToOne`
- Uso de **chaves compostas** com `@EmbeddedId`;
- **Injeção de dependência** com `@Autowired`;
- **Configuração de perfil de teste** usando `@Profile("test")` e `CommandLineRunner`;
- **Enumeração personalizada** (`orderStatus`);
- Serialização JSON com **Jackson** e uso de `@JsonIgnore` para evitar loops de referência;
- Testes de endpoints REST com o **Postman**.

---

## 🧩 Estrutura do projeto

├── CourseSpringBootApplication.java # Classe principal
│
├── config
│ └── TestConfig.java # Configuração de perfil de teste e inserção de dados iniciais
│
├── entities
│ ├── Category.java
│ ├── Product.java
│ ├── User.java
│ ├── Order.java
│ ├── OrderItem.java
│ ├── Payment.java
│ ├── enums
│ │ └── orderStatus.java # Enum com os status de pedido
│ └── pk
│ └── OrderItemPK.java # Classe auxiliar para chave composta
│
├── repositories
│ ├── CategoryRepository.java
│ ├── ProductRepository.java
│ ├── UserRepository.java
│ ├── OrderRepository.java
│ └── OrderItemRepository.java
│
└── resources
├── UserResource.java
├── ProductResource.java
├── CategoryResource.java
├── OrderResource.java
└── ... # Demais controladores REST

## 🌐 Endpoints principais (via Postman)

| Método | Endpoint | Descrição |
|---------|-----------|-----------|
| `GET` | `/users` | Lista todos os usuários |
| `GET` | `/users/{id}` | Busca usuário por ID |
| `POST` | `/users` | Cria um novo usuário |
| `GET` | `/products` | Lista todos os produtos |
| `GET` | `/categories` | Lista todas as categorias |
| `GET` | `/orders` | Lista todos os pedidos |
| `GET` | `/orders/{id}` | Busca pedido por ID |

💡 Os endpoints podem variar conforme a implementação dos *resources*, mas seguem o padrão REST.

Durante o perfil de teste, é utilizado o banco de dados H2 em memória.
A interface web do H2 pode ser acessada em:
http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

User: sa

Password: (vazio)

Observação importante

📝 Este projeto foi desenvolvido durante as aulas do curso de Java Completo da Udemy, ministrado pelo professor Nelio Alves, como parte do aprendizado em Spring Boot, JPA e arquitetura RESTful.



