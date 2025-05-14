# Utilisation d'une image de base Java (JRE) officielle.
# Puisque votre pom.xml utilise Java 21, nous allons choisir une image compatible.
FROM eclipse-temurin:21-jre-alpine

# On se crée un répertoire de travail dans l'image Docker
WORKDIR /app

# On copie le fichier JAR construit par Maven dans l'image Docker
# Le nom du JAR peut varier légèrement en fonction de la version de votre projet.
# Assurez-vous de remplacer 'maSuperAppJava-1.0-SNAPSHOT.jar' par le nom exact de votre JAR dans le répertoire 'target'.
COPY target/maSuperAppJava-1.0-SNAPSHOT.jar app.jar

# Définition de la commande à exécuter au démarrage du conteneur.
# Ici, nous exécutons l'application Java en passant les arguments.
# Notez que les arguments 'arg1' et 'arg2' sont des exemples et devront être fournis
# lors de l'exécution du conteneur Docker.
ENTRYPOINT ["java", "-jar", "app.jar", "arg1", "arg2"]