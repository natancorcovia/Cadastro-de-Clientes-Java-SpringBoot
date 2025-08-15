# 📋 CRUD de Cadastro de Clientes - Spring Boot

Este é um projeto simples de **CRUD** (Create, Read, Update, Delete) para gerenciar clientes, desenvolvido com **Java 21** e **Spring Boot 3.5.4**.  
Os dados são armazenados em um banco **H2** em memória, ideal para testes e aprendizado.

## 🚀 Funcionalidades

- ➕ **Cadastrar** um novo cliente
- 📄 **Listar** todos os clientes
- 🔍 **Buscar** cliente por ID
- ✏️ **Atualizar** dados de um cliente
- 🗑️ **Excluir** cliente do sistema

## 🛠️ Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3.5.4**
- **Spring Web**
- **Spring Data JPA**
- **H2 Database** (banco de dados em memória)
- **Lombok** (para reduzir código boilerplate)

## 📦 Estrutura de Pastas

```plaintext
📁 user-registration
 ├── 📁 src
 │   ├── 📁 main
 │   │   ├── 📁 java/com/natancorcovia/user_registration
 │   │   │   ├── controller/   # Endpoints da API
 │   │   │   ├── service/      # Regras de negócio
 │   │   │   ├── repository/   # Interface de acesso ao banco
 │   │   │   └── entity/       # Entidades (modelos)
 │   │   └── 📁 resources
 │   │       ├── application.properties # Configuração do banco H2
 │   │       └── data.sql                # (opcional) Dados iniciais
 ├── 📄 pom.xml
 ├── 📄 README.md
 └── ...
