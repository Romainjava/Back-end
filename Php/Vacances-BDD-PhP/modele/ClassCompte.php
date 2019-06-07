<?php
class ClassCompte extends ClassConnexion
{
    private $id, $login, $password;
    public function id()
    {
        return $this->id;
    }
    public function login()
    {
        return $this->login;
    }
    public function password()
    {
        return $this->password;
    }

    public function setId($id)
    {
        $this->id = $id;
    }
    public function setLogin($login)
    {
        $this->login = $login;
    }
    public function setPassword($password)
    {
        $this->password = $password;
    }
    public function traitementLogin(){
        $message = "error";
        $id=false;
        echo  $this->hash($this->password) ;
        try {
            $req = parent::$bdd->prepare('SELECT `id` FROM `compte` WHERE `login`=:login AND `password`=:password LIMIT 1');

            $result = $req->execute(array(
                'login' => $this->login,
                'password' => $this->hash($this->password) /*ma fonction pour crypte le mdp */

            ));
            if($result !== false){
                $id=$req->fetchColumn(); /*met la 1er column */
                $message = "Succes";
            }
            var_dump($result);
            
            // while($donnee = $result->fetch()){
            //     $id=$donnee["id"]; 
            //     $message = "Succes";
            //     /*fetch permet d'efeuiller, quand y'a plus rien derriere il renvoie false*/ 
            //     /* */
            // }
        } catch (PDOException $e) {
            echo $e->getMessage();
        }
        echo($message);
        echo($id);
    }
    public function hash($pass){
        return sha1($pass);
    }
    public function inscription()
    {
        $message = "error";
        try {
            $req = parent::$bdd->prepare('INSERT INTO `compte`(`login`, `password`) VALUES (:login,:password)');
            $result = $req->execute(array(
                'login' => $this->login,
                'password' => $this->hash($this->password) /*ma fonction pour crypte le mdp */
            ));
            
            if ($result == true) {
                $message = "Succes";
            }
        } catch (PDOException $e) {
            echo $e->getMessage();
        }
        echo ($message);
    }
}

/* cette classe herite de class connection(permet de se loguer à la bdd) elle contient une fonction `inscription`
qui nous permet de rajouter une nvelle entrée à la table `compte` et une fonction `traitementLogin`
qui permet de vérifier grâce à la requête SQL si le login et le password saisie par l'utilisateur correspond à une
entrée dans la base de donnée */




