
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Basic Bootstrap Template</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" type="text/css" href="/VotingApp/web-resources/js/bootstrap/bootstrap-3.3.2-dist/css/bootstrap.min.css"/>

    <script type="text/javascript" src="/VotingApp/web-resources/js/bootstrap/bootstrap-3.3.2-dist/js/bootstrap.min.js">

    </script>


    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

<#--<script src="http://localhost:8282/web-project/resources/scripts/bootstrap/js/bootstrap.min.js"></script>-->

    <link rel="stylesheet" type="text/css" href="http://localhost:8282/web-project/resources/scripts/bootstrap/css/bootstrap-theme.min.css">
    <link rel="stylesheet" type="text/css" href="http://localhost:8282/web-project/resources/scripts/bootstrap/css/bootstrap.min.css">
    <style type="text/css">
        body{
            padding-top: 70px;
        }
    </style>
</head>
<body>
<#include "header.ftl">
<div class="container">
    <div class="jumbotron">
        <h1>${message}</h1>
        <p>In today's world internet is the most popular way of connecting with the people. At <a href="http://www.tutorialrepublic.com" target="_blank">tutorialrepublic.com</a> you will learn the essential of web development technologies along with real life practice example, so that you can create your own website to connect with the people around the world.</p>
        <p><a href="#" target="_blank" class="btn btn-success btn-lg">Get started today</a></p>
    </div>
    <div class="row">
        <div class="col-xs-4">
            <h2>HTML</h2>
            <p>HTML is a markup language that is used for creating web pages. The HTML tutorial section will help you understand the basics of HTML, so that you can create your own web pages or website.</p>
            <p><a href="#" target="_blank" class="btn btn-success">Learn More &raquo;</a></p>
        </div>
        <div class="col-xs-4">
            <h2>CSS</h2>
            <p>CSS is used for describing the presentation of web pages. The CSS tutorial section will help you learn the essentials of CSS, so that you can fine control the style and layout of your HTML document.</p>
            <p><a href="#" target="_blank" class="btn btn-success">Learn More &raquo;</a></p>
        </div>
        <div class="col-xs-4">
            <h2>Bootstrap</h2>
            <p>Bootstrap is a powerful front-end framework for faster and easier web development. The Bootstrap tutorial section will help you learn the techniques of Bootstrap so that you can quickly create your own website.</p>
            <p><a href="#" target="_blank" class="btn btn-success">Learn More &raquo;</a></p>
        </div>
    </div>
    <hr>
    <div class="row">
        <div class="col-xs-12">
            <footer>
                <p>&copy; Copyright 2015 NRN CANADA</p>
            </footer>
        </div>
    </div>
</div>

</body>
</html>