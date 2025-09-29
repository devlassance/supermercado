
# Supermercado Online — Projeto de Estudo

Este é um projeto de estudo desenvolvido em **Java** e **Spring Boot** com o objetivo de explorar ao máximo os recursos do ecossistema Spring, além de aprimorar conceitos avançados de Java.

O projeto simula um **supermercado online**, com funcionalidades como cadastro de produtos, categorias, gestão de estoque, autenticação, compras e relatórios.

---

## 🎯 Objetivos de Aprendizado

Este projeto serve como laboratório para aprender e aplicar:

- Conceitos avançados de **Java** (OOP, Generics, Streams, Collections, Design Patterns)
- **Spring Boot** (REST API, JPA/Hibernate, Security, Validation, Exception Handling)
- **Spring Data JPA** para acesso a dados
- **Spring Security** com JWT
- **Spring Validation**
- Arquitetura de camadas (Controller → Service → Repository)
- Uso de DTOs e Views
- Testes unitários e de integração com **JUnit 5** e **Mockito**
- Configuração e uso de **H2 Database** para testes
- Gerenciamento de dependências com **Maven**
- Boas práticas de Git e versionamento

---

## 🛠 Tecnologias Usadas

- Java 17+
- Spring Boot
- Spring Data JPA
- Spring Security + JWT
- Hibernate
- Maven
- H2 Database
- Lombok
- JUnit 5 + Mockito
- Git
- IDE IntelliJ IDEA / Eclipse / VS Code
- Postman (para testar APIs)

---

## 📂 Estrutura do Projeto

```
supermercado-online/
├── src/
│   ├── main/
│   │   ├── java/com/supermercado/api/
│   │   │   ├── controller/    ← Controllers REST
│   │   │   ├── service/       ← Lógica de negócio
│   │   │   ├── repository/    ← Repositórios JPA
│   │   │   ├── model/         ← Entidades e modelos
│   │   │   ├── dto/           ← DTOs para API
│   │   │   ├── config/        ← Configurações Spring
│   │   │   └── exception/     ← Tratamento de erros
│   │   └── resources/
│   │       ├── application.yml
│   │       └── data.sql
├── .gitignore
├── pom.xml
└── README.md
```

---

## 🚀 Funcionalidades Planejadas

- CRUD de produtos
- CRUD de categorias
- Gestão de estoque
- Cadastro e autenticação de usuários
- Controle de permissões via roles (ADMIN, USER)
- Consulta de produtos por categoria
- Compras simuladas
- Relatórios de vendas
- Testes unitários e integração

---

## 📦 Rodando o Projeto

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/supermercado-online.git
   ```

2. Entre na pasta do projeto:
   ```bash
   cd supermercado
   ```

3. Rode o projeto usando Maven:
   ```bash
   mvn spring-boot:run
   ```

4. Acesse a API em:
   ```
   http://localhost:8080
   ```

---

## 🧪 Testes

- Rodar testes unitários:
  ```bash
  mvn test
  ```

---

## 📌 Notas

Este projeto é para fins educacionais e será constantemente atualizado com novas funcionalidades para aprimorar o aprendizado de Java e Spring Boot.

---

## 📚 Referências

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Spring Security Documentation](https://spring.io/projects/spring-security)
- [Baeldung — Spring Tutorials](https://www.baeldung.com/)
- [Java Documentation](https://docs.oracle.com/en/java/)

---

## 📝 Licença

Este projeto está sob a licença MIT.