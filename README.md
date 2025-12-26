 - Devoir ICT 301 - Principes SOLID

    Nom : KOUAWA BOUDA
    Prénoms : RYAN KEVIN
    Matricule : 23U2557

---

 --- Compréhension des Principes SOLID

Dans le cadre de ce TP, j'ai implémenté les cinq principes fondamentaux de la conception orientée objet (SOLID) afin d'améliorer la maintenabilité et l'extensibilité du code. Voici ce que j'ai retenu de chaque principe :

    1. SRP (Single Responsibility Principle)
  "Une classe ne doit avoir qu'une seule raison de changer."
J'ai appris qu'une classe doit se concentrer sur une seule tâche. Par exemple, au lieu d'avoir une classe `Book` qui gère les données, l'affichage et la sauvegarde, nous avons séparé ces rôles dans des classes distinctes (`Book`, `BookPrinter`, `BookSaver`). Cela rend le code plus facile à tester et à modifier sans créer d'effets de bord.

    2. OCP (Open-Closed Principle)
  "Ouvert à l'extension, fermé à la modification."
Ce principe m'a permis de comprendre qu'on ne devrait pas modifier une classe existante pour ajouter une fonctionnalité. En utilisant des interfaces (comme `Shape`), on peut ajouter de nouvelles formes (Cercle, Rectangle) sans jamais retoucher à la logique du calculateur de surface (`AreaCalculator`).

    3. LSP (Liskov Substitution Principle)
  "Les sous-classes doivent être substituables à leurs classes de base."**
J'ai compris qu'un héritage "logique" dans la vie réelle (un Carré est un Rectangle) peut être mauvais en programmation s'il casse le comportement attendu. Le refactoring nous a montré qu'il vaut mieux utiliser une interface commune plutôt que de forcer un héritage qui modifie le comportement des méthodes parentes.

    4. ISP (Interface Segregation Principle)
  "Mieux vaut plusieurs interfaces spécifiques qu'une seule interface générale."
J'ai appris qu'il ne faut pas forcer une classe à implémenter des méthodes dont elle n'a pas besoin. En séparant l'interface `Worker` en `Workable` et `Feedable`, nous avons évité qu'un `Robot` soit obligé de définir une méthode `eat()`.

    5. DIP (Dependency Inversion Principle)
  "Dépendre des abstractions, pas des implémentations concrètes."
Ce principe est crucial pour le découplage. Au lieu qu'une classe `OrderProcessor` soit liée à une base de données précise (`MySQLDatabase`), elle dépend désormais d'une interface `Database`. Cela permet de changer de système de stockage sans modifier le code métier.
