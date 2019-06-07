<?php
try {
    $bdd = new PDO('mysql:host=localhost;dbname=media;charset=utf8', 'root', '', null);
} catch (Exception $e) {

    die('Erreur : ' . $e->getMessage());
}

$get_annee = filter_input(INPUT_GET, 'annee');
if ($get_annee == false) {
    echo 'annee inconnue';
    $annee = 0;
} else {
    $annee = $get_annee;
}

//$req = $bdd->prepare('SELECT jeux.*, Personne.prenom, Personne.nom AS pnom '
//        . 'FROM jeux, aime, Personne WHERE annee<:a '
//       . 'AND aime.id_personne=Personne.id AND aime.id_jeux=jeux.id'
//     . ' ORDER BY jeux.nom, annee');
//     
//     requête sans le mot clé JOIN
// AS correspond à un alias qui permet de renommé une colonne à la volé le temps d'une requête pour qu'il puisse faire la distinction
// je les range avec ORDER BY par default c'est en ASC

$req = $bdd->prepare('SELECT jeux.*, Personne.prenom, Personne.nom AS pnom '
    . 'FROM jeux ' //table dominante de gauche
    . 'LEFT JOIN aime ON aime.id_jeux=jeux.id '
    . 'LEFT JOIN Personne ON aime.id_personne=Personne.id '
    . 'WHERE annee<:a '
    //:a = marqueur nominatif
    . ' ORDER BY jeux.nom, annee');
//requête en jointure
$req->execute(array('a' => $annee));

$jeu = "";
while ($donne = $req->fetch()) {
    if ($jeu != $donne['nom']) {
        $jeu = $donne['nom'];
        //echo '<p>'. $donne['nom']. '</p><p> son prix est ' .$donne['prix']. '</p><p>'. $donne['description']. '</p>';
        ?>
<p>
    <strong> Le jeu </strong><br>
    <?= $donne['nom']; ?> <br>
    son prix est
    <?= $donne['prix']; ?> <br>
    Annee :
    <?= $donne['annee']; ?> <br>
    Synopsis : <br>
    <?= $donne['description']; ?>

    <br>
    <p>les personnes qui ont aimé ce jeux sont : </p>
    <?php

}
?>
    <li>
        <?= $donne['prenom'] . ' ' . $donne['pnom'] ?>
    </li>

</p>
<?php

}
/* page qui traité une page blanche sql */