
# Estudo sobre Controllers e Anotações no Java  

Este repositório é dedicado à primeira aula sobre desenvolvimento em Java utilizando o Spring Framework, com foco em Controllers e anotações fundamentais.  

## Objetivos da Aula  

- Compreender o papel dos Controllers no padrão arquitetural MVC.  
- Aprender sobre as principais anotações usadas no Spring.  
- Criar um exemplo básico de um Controller REST.  

## O que é um Controller?  

Os Controllers gerenciam as requisições e respostas da aplicação, atuando como intermediários entre o frontend e o backend, processando entradas do usuário e retornando as saídas corretas.  

## Atualizações do Projeto Anterior  

Este repositório é uma atualização de um projeto anterior, incluindo:  
- Adição de novas funcionalidades  
- Melhoria na estrutura de código  
- Inclusão de novas dependências  

## Estudos e Aprendizados  

1. **Injeção de Dependência**: Utilizamos o [Spring Framework](https://spring.io/projects/spring-framework) para gerenciar dependências, facilitando a manutenção do código.  
2. **Postman**: Testamos nossas APIs e disponibilizamos uma coleção de requisições na pasta `/docs`.  
3. **ORM (Object-Relational Mapping)**: Utilizamos o [Hibernate](https://hibernate.org/) para mapear objetos Java a tabelas de banco de dados.  

## Manuseio de Respostas com `ResponseEntity`  

Utilizamos `ResponseEntity` do Spring para controlar o status das respostas nas operações:  

- **GET**: Recupera recursos (200 OK).  
- **POST**: Cria novos recursos (201 Created).  
- **PUT**: Atualiza recursos existentes (204 No Content).  

### Exemplos de Uso  

#### Exemplo de Requisição GET  

```http  
GET /api/recursos HTTP/1.1  
Host: localhost:8080
