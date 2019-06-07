<?php
if(isset($_GET['title'])){ //si title est défini, affiche le
    $titre = $_GET['title'];
}
$location = $_GET['loc']; //methode magique reservé a php, permet de recuperer un argument dans la bar url

/* if($location=='home'){
    include 'home.html';
}
else if($location=='creation'){
    include 'creation.html';
}
 */

 $content = 'home.php';
 switch($location){
     case 'home':
    /*  include 'home.php'; */
    $content ='home.php';
     break;

     case 'creation':
     $content='creation.php';
     break;

     case 'uneCreation':
     $content ='uneCreation.php';
     break;

     case 'tuto-niveau':
     $content='tuto-niveau.php';
     break;

     case 'tuto-type':
     $content='tuto-type.php';
     break;

 }
 include 'template.php';
//index est ma page principal qui me charge toutes les autres pages en elle même
 ?>