<?php 
class ClassConnexion
{
    static $bdd;
    public function __construct()
    {
        try {
           self::$bdd = new PDO('mysql:host=localhost;dbname=media;charset=utf8', 'root', '', null);
        } catch (Exception $e) {
        
            die('Erreur : ' . $e->getMessage());
        }
     }
}


/* classe qui instancie un objet pdo et qui me permet de me connecter à ma base de donnée */
