<?php

switch ($loc) {

    case 'home':
        include "vue/home.php";
        break;

    case 'band':
        include "vue/band.php";
        break;

    case 'tour':
        include "vue/tour.php";
        break;

    case 'contact':
        include "vue/contact.php";
        break;

    case 'more':
        include "vue/more.php";
        break;

    case 'login':
        include "vue/login.php";
        break;

    case 'formulaire':
        include 'vue/formulaire.php';
        break;

    case 'inscription':
        include 'vue/inscription.php';
        break;
}
