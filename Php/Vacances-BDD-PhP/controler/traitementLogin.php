<?php
include_once '../modele/ClassConnection.php'; /* parent */
include_once '../modele/ClassCompte.php';

$login = filter_input(INPUT_POST, 'login');
$password = filter_input(INPUT_POST, 'password');
/* on les as attraper */

$user = new ClassCompte();
$user->setLogin($login);
$user->setPassword($password);

$user->traitementLogin();


/* On instancie notre classe `compte`, on lui passe le login et le password entrée par l'utilisateur
et on lance la methode traitement login de la classe `Compte` */