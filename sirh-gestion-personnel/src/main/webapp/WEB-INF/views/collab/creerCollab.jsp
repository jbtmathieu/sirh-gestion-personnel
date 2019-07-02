<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html>
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    
    <title>Form</title>
  </head>
  <body>
        <h1> Nouveau Collaborateur</h1>
<!-- <form  action ="viewCollab.jsp" method="post"> pour acces direct-->
<form  method="post">
        <div class="container">
            <div class="row">
                <div class="col-5">Nom</div>
                <div class="col-7"><input type="text" name="Name" required></div>
                <br>
            </div>
            <div class="row-1">
            </div>
            <div class="row">
                <div class="col-5">Prenom</div>
                <div class="col-7"><input type="text" name="FirstName" required></div>
                <br>
            </div>
            <div class="row">
                <div class="col-5">Date de naissance</div>
                <div class="col-7"><input type="text" name="BirthDate" required></div>
                <br>
            </div>
            <div class="row">
                <div class="col-5">Adresse</div>
                <div class="col-7"><input type="text" name="Address"required></div>
                <br>
            </div>
            <div class="row">
                <div class="col-5">Numéro de sécurité sociale</div>
                <div class="col-7"><input type="text" name="ssNumber" required></div>
                <br>
            </div>
            <div class="row">
                    <div class="col-7"></div>
                    
                    <input type="submit" formmethod="post" value="Create">
                  
                    <br>
                </div>
</div>
</form>

<a href="http://localhost:8080/sgp/collaborateurs/lister">Lister</a>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>