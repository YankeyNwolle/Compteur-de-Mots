# Compteur de Mots 📄

Ce projet Java est une application console permettant de compter le nombre total de mots dans un fichier texte, même volumineux.
Il a été réalisé dans le cadre d’un exercice pratique de programmation.

## Objectif

Lire un fichier texte ligne par ligne et calculer le **nombre total de mots** qu’il contient.

## Fonctionnalités

* Lecture de fichiers texte (même volumineux)
* Traitement ligne par ligne pour optimiser la mémoire
* Séparation des mots à l’aide d’un délimiteur (espace)
* Comptage du nombre de mots par ligne
* Calcul du nombre total de mots

## Principe de fonctionnement

1. Le programme ouvre un fichier texte avec un `Scanner`
2. Il lit chaque ligne du fichier
3. Chaque ligne est divisée en mots avec la méthode `split(" ")`
4. Le nombre de mots est calculé pour chaque ligne
5. Le total est accumulé et affiché à la fin

## Structure du projet

* `Main.java` : point d’entrée du programme contenant la logique de lecture et de comptage

## Version de Java

Ce projet a été développé avec **Java 21**.

## Installation et exécution

### 1. Cloner le dépôt

```bash id="x1a7b9"
git clone https://github.com/YankeyNwolle/compteur-de-mots.git
```

### 2. Accéder au dossier du projet

```bash id="n8k4r2"
cd compteur-de-mots
```

### 3. Ouvrir le projet

Ouvrez le projet avec IntelliJ IDEA ou tout autre IDE Java.

### 4. Préparer un fichier texte

Ajoutez un fichier texte dans le projet (exemple : `test.txt`).

### 5. Exécuter le programme

Lancez le fichier `Main.java`.

## Exemple d’exécution

```text id="3e9k2f"
Nombre total de mots : 109
```

## Améliorations possibles

* Gérer plusieurs types de délimiteurs (ponctuation, tabulations, etc.)
* Ignorer les espaces multiples
* Compter les mots uniques
* Afficher les mots les plus fréquents

## Auteur

Yankey N'wollé Ange Christian
