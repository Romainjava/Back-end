<!DOCTYPE html>
<html lang="en">
<title>W3.CSS Template</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {font-family: "Lato", sans-serif}
.mySlides {display: none}
</style>
<body>

<!-- navbar -->
<?php include "vue/nav.php"; ?>

<!-- Page content -->
<div class="w3-content" style="max-width:2000px;margin-top:46px">

<?php include 'controler/controlerContent.php' ?>

  
<!-- End Page Content -->
</div>

<!--Image of location/map -->
<img src="image/map.jpg" class="w3-image w3-greyscale-min" style="width:100%">

<!-- footer -->
<?php include "vue/footer.php"; ?>

<script src="js/main.js">
// Automatic Slideshow - change image every 4 seconds

</script>

</body>
</html>
