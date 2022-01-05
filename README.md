# Projet Test

Ceci est un projet test pour avoir le lancement des tests avec cucumber
Il est très largement inspiré du [tutoriel](https://cucumber.io/docs/guides/10-minute-tutorial) officiel cucumber

Pour lancer les tests il suffit de lancer 
```
mvn test
```

Mais on peut utiliser l'option test pour séparer les fichiers tests unitaires du reste
```
mvn -Dtest=\!RunCucumberTest test
```

Pour lancer les test avec cucumber
```
mvn -Dtest=RunCucumberTest test
```

Cela se fait simplement car les tests cucumbers ont tous été mis dans RunCucumberTest, donc il suffit de dire au plugin de soit lancer tous les tests de RunCucumberTest.java ou lancer tous les tests sauf ceux de RunCucumberTest.java avec le symbole "!".
