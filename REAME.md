# 🎓 Sistema de Gerenciamento de Cursos Online

API RESTful desenvolvida em **Java com Spring Boot**, projetada para gerenciar cursos, instrutores, alunos e matrículas em uma plataforma de ensino online.

---

## 🧩 Objetivo

O objetivo deste projeto é criar uma API robusta e escalável para permitir o gerenciamento completo de cursos online, com foco em boas práticas de desenvolvimento backend e relacionamentos entre entidades.

---

## 🗂️ Entidades Principais

### 📘 Curso
- `id`: Long
- `nome`: String
- `descricao`: String
- `cargaHoraria`: Integer

### 👨‍🏫 Instrutor
- `id`: Long
- `nome`: String
- `email`: String
- `especialidade`: String

### 👨‍🎓 Aluno
- `id`: Long
- `nome`: String
- `email`: String
- `dataNascimento`: LocalDate

### 📝 Matrícula
- `id`: Long
- `aluno`: Relacionamento com Aluno
- `curso`: Relacionamento com Curso
- `dataMatricula`: LocalDate

---

## 📌 Funcionalidades

- CRUD completo para Curso, Instrutor e Aluno
- Um **Instrutor** pode ministrar vários **Cursos**
- Um **Aluno** pode se matricular em vários **Cursos**
- Impedir matrícula duplicada do mesmo aluno no mesmo curso
- Endpoint para listar todos os cursos de um aluno (por `id`)
- Endpoint para listar todos os alunos de um curso (por `id`)
- Respostas padronizadas (evitar retorno direto das entidades JPA)
- Paginação e ordenação nos endpoints de listagem

---

## 💽 Tecnologias e Ferramentas

- ☕ **Java 17+**
- 🌱 **Spring Boot**
- 📦 **Spring Data JPA**
- 🐘 **PostgreSQL**
- 🐳 **Docker** (para ambiente de desenvolvimento e banco)
- ⚙️ **Maven**
- 📌 **Lombok** (para reduzir boilerplate)

---

## 🚀 Como Executar

### Pré-requisitos

- Java 17+
- Maven
- Docker e Docker Compose

### Passos para rodar o projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/MayaVictDias/gerenciamento-cursos-online.git
   cd gerenciamento-cursos-online

2. Crie o arquivo docker-compose.yml na raiz do projeto com o seguinte conteúdo:

    ```yaml
   version: '3.8'
    services:
      db:
        image: postgres:14
        environment:
          POSTGRES_DB: cursosdb
          POSTGRES_USER: postgres
          POSTGRES_PASSWORD: sua_senha
        ports:
          - "5432:5432"
        volumes:
          - pgdata:/var/lib/postgresql/data
    
    volumes:
      pgdata:

3. Suba o container do banco PostgreSQL com Docker:
    ```bash
   docker-compose up -d

4. Configure o arquivo src/main/resources/application.yml com as informações para conexão ao banco:
    ```yaml
   spring:
      datasource:
        url: jdbc:postgresql://localhost:5432/cursosdb
        username: postgres
        password: sua_senha
      jpa:
        hibernate:
          ddl-auto: update
        properties:
          hibernate:
            format_sql: true

5. Execute a aplicação:
    ```bash
   ./mvnw spring-boot:run
   
### 🔧 Estrutura do Projeto

```pgsql
src/
├── main/
│   ├── java/
│   │   └── com.exemplo.cursos/
│   │       ├── controller/
│   │       ├── service/
│   │       ├── model/
│   │       ├── repository/
│   └── resources/
│       ├── application.yml
│       └── data.sql

```