<?php
try {
    $bdd = new PDO('mysql:host=localhost;dbname=media;charset=utf8', 'root', '');
} catch (Exception $e) {

    die('Erreur : ' . $e->getMessage());
}

$reponse = $bdd->query('SELECT * FROM `jeux`');

while ($donnees = $reponse->fetch()) {

    ?>

<p>

    <strong>Jeu</strong> :
    <?php echo $donnees['nom']; ?><br />

    Le jeu :
    <?php echo $donnees['nom']; ?>, et il le vend à
    <?php echo $donnees['prix']; ?> euros !<br />

    La description
    <?php echo $donnees['description']; ?> et on peut y jouer depuis
    <?php echo $donnees['annee']; ?> <br />

</p>

<?php

}


$reponse->closeCursor(); 
