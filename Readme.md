# Travail effectué
## Partie I: Utilsation de Maven
### Création d'un projet Maven
- Done, voir GitHub 

### Couverture des Tests
Les rapports sont créés dans target\site\cobertura
Selon cette analyse, 0% du code est couvert par les tests:
ceci est peut-etre du au fait que les tests n'ont pas été fait :)

## Partie II: Intégration Continue
### Installation Sonar
- Done, Telechargement, Lancement Serveur
- Lancement Project avec Sonar
- mvn sonar:sonar
- Quality Profiles: changer règles de qualité:
Inheritance tree of classes should not be too deep
--> Desactivé --> -1 code smells

### Intégration avec Jenkins
Done, cette fois-ci utilisé serveur de la fac, job
M1_SS_SP_NightlyBuild sur https://mass-dev.univ-tlse2.fr/jenkins/
(boule bleu!)
### Tests par Maven
Installation Plugin SureFire, done
Lancement de test par mvn test, done
-------------------------------------------------------------------------------
Test set: com.devops.mavenproject.AppTest
-------------------------------------------------------------------------------
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.015 sec

Création d'archives: Installation plugin: done



