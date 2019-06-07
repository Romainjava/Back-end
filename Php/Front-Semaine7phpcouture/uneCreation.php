
        
        <section class="central-top">
           
            <h1>
            <?php
           echo $titre    //je change le titre en fonction si je click robe ou sweat-shirt
            ?>
            </h1>

            <div>
                <input type="search" placeholder="Recherche" name="barreDeRecherche">
                <button class="btn btn-light"><i class="fas fa-search"></i></button>
            </div>
        </section>

        <!-- SECTION CENTRAL -->

        <section class="central-creation">
           <?php
            include 'listeCrea.php';
           ?>

          
            <article class="description-creation">
            <?php
            if($titre == 'Robe'):
            ?>
               <figure>
                    <img src="image/creations/robeMariePeau.jpg" alt="">
                    <figcaption> <a href="#">Créateur</a></figcaption>
                </figure>
                <figure>
                    <img src="image/creations/sweat-shirt.jpg" alt="">
                    <figcaption> <a href="#">Créateur</a></figcaption>
                </figure>
                <figure>
                    <img src="image/creations/pantalon.jpg" alt="">
                    <figcaption> <a href="#">Créateur</a></figcaption>
                </figure>
                <figure>
                    <img src="image/creations/chaussette.jpg" alt="">
                    <figcaption> <a href="#">Créateur</a></figcaption>
                </figure>
            <?php endif; ?> <!-- condition si robe == titre alors il m'affiche les 4images -->
                <figure>
                    <img src="image/creations/couverture.jpg" alt="">
                    <figcaption> <a href="#">Créateur</a></figcaption>
                </figure>
                <figure>
                    <img src="image/creations/bonnet(copie).jpg" alt="">
                    <figcaption> <a href="#">Créateur</a></figcaption>
                </figure>
                <figure>
                    <img src="image/creations/echarpe.jpg" alt="">
                    <figcaption> <a href="#">Créateur</a></figcaption>
                </figure>
                <figure>
                    <img src="image/creations/gant.jpg" alt="">
                    <figcaption> <a href="#">Créateur</a></figcaption>
                </figure>
                <figure>
                    <img src="image/creations/PullDoudou.jpg" alt="">
                    <figcaption> <a href="#">Créateur</a></figcaption>
                </figure>

            </article>
        </section>