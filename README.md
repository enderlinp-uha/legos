# Legos

## Démarrer le projet

Dans la ligne de commande, saisissez ```mvn spring-boot:run``` pour démarrer le projet.

## Organisation des packages et classes

Le projet est organisé en packages, détaillé comme suit :
* java/
    * fr.uha.legos/
        * controller/      # Définit les routes (API REST)
        * model/           # Contient les entités (JPA)
        * repository/      # Interfaces pour accéder à la base de données
        * service/         # Logique métier
        * LegosApplication # Classe principale de l'application Spring Boot
* resources/
  * application.properties # Configuration de l’application (DB, logs, ports…)