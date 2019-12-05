# SPRINGBOOT x ELASTIC x H2

## La dream team du backend

Pour notre projet, les modèles Bar et Beer sont alimenté par Elasticsearch tandis que le modèle Ville par une DB H2.

# Mise en place du projet

### 1) Dans le terminal lancer à la suite ces 2 commandes

- ./gradlew bootRun

Ces commandes permettent de lanser un serveur sur le port 8030 et remplir une database H2 avec les données renseignées dans /ressource/data.sql

### 2) Dans un nouveau terminal, lancer le serveur Elastic

- cd elastisearch6.2.4
- ./bin/elasticsearch.bat

### 3) Dans un nouveau terminal, remplir le serveur Elastic grâce à Bulk

- curl -XPUT localhost:9200/\_bulk -H "Content-Type: application/json"--data-binary @beer.json
- curl -XPUT localhost:9200/\_bulk -H "Content-Type: application/json" --data-binary @bar.json

Chacune de ces requetes va créer un index dans Elastic et le remplir avec les informations fournies dans les JSON.

### 4) Ouvrir un Browser (Opera) et se rendre à l'URL http://localhost:8030

### 5) Tester les différentes requêtes et url

- /villes
- /villes/{id}
- /villes/whohasthebiggest
- /villes/add ( requiert une requete post et un JSON de la nouvelle entité )

- /beers/all
- /beers/{name} ( renvoit un liste, je consille de tester : /beers/heineken )
- /beers/beer/{id}

- /bars
- /bars/bar/{id}

Toutes ces requêtes peuvent être réalisées sur Postman ce qui est bien pratique

### Pour les curieux et les bidouilleurs : voici une liste de requetes aléatoires pour faire des test avec Elasticsearch

https://www.getpostman.com/collections/551cf8a1c0b36188b09c
