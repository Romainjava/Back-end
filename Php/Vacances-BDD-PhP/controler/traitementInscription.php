<?php
include_once '../modele/ClassConnection.php'; /* parent */
include_once '../modele/ClassCompte.php';

$login = filter_input(INPUT_POST, 'login');
$password = filter_input(INPUT_POST, 'password');
$confirm = filter_input(INPUT_POST, 'confirm');

if($password == $confirm){
    
}else{
    die();
}
$user = new ClassCompte();
$user->setLogin($login);
$user->setPassword($password);
$user->inscription();


/*
- filter input fait la verification si il est vide ou si il existe, il renvoie soit le login soit false -->
- input post va chercher dans le tableau "POST" si il y a une correspondance -->

- Si la variable $_POST['login'] est vide ou n'existe pas, alors il retourne FALSE
- et sinon il retourne $_POST['login']

L'idee c'est d'instancié l'objet, puis on lui passe ses attributs, puis ensuite la methode
*/