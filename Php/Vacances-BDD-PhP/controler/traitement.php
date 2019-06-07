<?php

// ceci permettais d'inserer des nouvelles personnes dans la table personne 

$nom = filter_input(INPUT_POST, 'n');
$prenom = filter_input(INPUT_POST, 'p');


try {
    $bdd = new PDO('mysql:host=localhost;dbname=media;charset=utf8', 'root', '', null);
} catch (Exception $e) {

    die('Erreur : ' . $e->getMessage());
}

try{
$req = $bdd ->prepare('INSERT INTO `Personne`(`prenom`, `nom`) VALUES (:nom,:prenom)');
  $result=$req->execute(array(
        'nom'=>$nom,
        'prenom'=>$prenom
));
  $message="error";
if($result==true) {
    $message = "Succes";
}
}
 catch (PDOException $e){
     echo $e->getMessage();
 }
?>
<h1> <?=$message;?> </h1>
