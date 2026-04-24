# JSF Primefaces Essencial
### Projeto Java Web com Apache Tomcat

Este projeto faz parte de um curso prático de desenvolvimento Java Web utilizando Apache Tomcat.

## Curso utilizado

O projeto está sendo desenvolvido com base no seguinte curso do YouTube:

https://www.youtube.com/watch?v=ezwgBvsd6Ps&t=18940s

---

## Configuração do Ambiente

### Download do Tomcat

Baixe o Apache Tomcat na versão utilizada no curso:

https://archive.apache.org/dist/tomcat/tomcat-8/v8.5.99/bin/

Versão utilizada: Tomcat 8.5.99

---

## Configuração de Memória

Ao configurar o servidor (por exemplo, no Eclipse), adicione os seguintes argumentos de memória:

```id="mem01"
-Xms256m -Xmx512m
```

* -Xms: memória inicial
* -Xmx: memória máxima

---

## Configuração do Servidor (Eclipse)

Durante a configuração do Tomcat no Eclipse:

Habilitar:

* Use Tomcat installation (takes control of Tomcat installation)

Desabilitar:

* Modules auto reload by default

---

## Banco de Dados com Docker

O projeto utiliza MySQL rodando em container Docker.

### Como subir o banco de dados

1. Certifique-se de ter o Docker e o Docker Compose instalados.
2. Na raiz do projeto, execute:

```id="dock02"
docker-compose up -d
```

3. Verifique se o container está rodando:

```id="dock03"
docker ps
```

4. Para parar o container:

```id="dock04"
docker-compose down
```

---

## Acesso ao Banco

* Host: localhost
* Porta: 3306
* Usuário: root
* Senha: root
* Banco: cursojsfprimefaces

---

## Observações

* O volume `mysql_data` garante a persistência dos dados.
* Caso a porta 3306 esteja em uso, altere no arquivo docker-compose.yml.
* Aguarde alguns segundos após subir o container até o MySQL estar pronto para conexões.

---

## Status do Projeto

Em desenvolvimento, seguindo as aulas do curso.

---

## Autor

Projeto criado para fins de estudo.
