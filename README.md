# Curso_ADS

Projeto rodando usando a extensão Spring Boot Dashboard.

Para executar, clonar o repositório e abrir a pasta Rest_SpringBoot_course no VScode.
Executar o RUN em LojaApplication.java para que possa subir o projeto.

Requests testados no arquivo test.http que está dentro desse repositório.

```
### Testar o endpoint de listagem
GET http://localhost:8080/produtos
### Criar produto
POST http://localhost:8080/produtos
Content-Type: application/json

{
 "nome": "Teclado Mecânico",
 "preco": 299.90
}

### Deletar produto
DELETE http://localhost:8080/produtos/1

### Atualizar registro de produto
PUT http://localhost:8080/produtos/1
Content-Type: application/json

{
  "nome": "Teclado Digital",
  "preco": 300.00
}
```
