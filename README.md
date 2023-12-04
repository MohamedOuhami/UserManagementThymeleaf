# Projet UserThymeleaf

## Description
Il s'agit d'un projet Spring Boot simple pour gérer les informations utilisateur à l'aide de modèles Thymeleaf.

## Prérequis
- Kit de développement Java (JDK) 8 ou ultérieur
- Maven
- Base de données MySQL

## Configuration

### Configuration de la base de données
1. Ouvrez `src/main/resources/application.properties`.
2. Mettez à jour les propriétés de configuration de la base de données, y compris l'URL, le nom d'utilisateur et le mot de passe.
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3310/thymeleaf?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
   spring.datasource.username=<votre-nom-d'utilisateur-de-base-de-données>
   spring.datasource.password=<votre-mot-de-passe-de-base-de-données>

## Construction et Exécution
Exécutez les commandes suivantes pour construire et exécuter le projet :

# Construire le projet
mvn clean install

# Exécuter l'application
java -jar target/userthymeleaf-1.0.0.jar

## Video Demonstration

https://github.com/MohamedOuhami/UserManagementThymeleaf/assets/60238938/9422f272-5da6-496a-b358-505a9933a2a0

## Utilisation
Ouvrez votre navigateur et accédez à http://localhost:8080/signup pour ajouter un nouvel utilisateur.
Explorez les autres fonctionnalités via l'interface utilisateur.
## Contribution
Les contributions sont les bienvenues ! Veuillez forker le dépôt et créer une demande d'extraction avec vos améliorations.
