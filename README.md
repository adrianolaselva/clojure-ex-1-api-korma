# Exemplo de apis em clojure para cadastro de usuários persistindo com korma

## Running

inicializar aplicação:

```sh
lein ring server
```

## Rodar

```sh
curl -X POST localhost:3000/posts -H "Content-Type: application/json" -d '{"name":"Clojure com o Simbal", "category":"cool-posts"}'
```

```sh
curl -X GET localhost:3000/posts
```

```sh
curl -X PUT localhost:3000/posts/1 -H "Content-Type: application/json" -d '{"name":"Clojure com o Greg", "category":"other-posts"}'
```

```sh
curl -X GET localhost:3000/posts/1
```

```sh
curl -X DELETE localhost:3000/posts/1
```


