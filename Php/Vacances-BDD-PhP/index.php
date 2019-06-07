<?php

// $tab = array(
//     'a'=>"regis"
//     ,'b'=> "ruben"
//     ,'c'=>"romain"
// );
// $tab2 = array("y","e","s");
// //var_dump($tab);
// for($i =0; $i < count($tab2);$i++){
//     echo $tab2[$i]. "</br>";
// }
// foreach ($tab as $key => $value) {
//     echo $key."-".$value."</br>";
// }
if (isset($_GET['loc']) && !empty($_GET['loc'])) {
    $loc = $_GET ['loc'];
} else {
       $loc = 'home';
}
//echo $loc;
//die();
   include "vue/template.php"; 