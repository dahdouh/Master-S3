=================================================================
master package README
=================================================================

La classe Parcours expose une liste d'UEs que la classe Etudiant renseigne directement.
La classe Etudiant expose une propriété parcours qui est renseignée directement par la classe Parcours.
Ces membres (liste d'UEs et Parcours de l'étudiant) devraient être encapsulés de sorte que leur accès passe par des méthodes setters, permettant d'abstraire la forme du stockage de la donnée et de canaliser son accès de façon centralisée.
