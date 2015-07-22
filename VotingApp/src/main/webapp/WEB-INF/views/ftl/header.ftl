
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Administration</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <#include "jslink.ftl">

    <style type="text/css">
        body{
            padding-top: 70px;
        }
    </style>
</head>
<body>
<nav id="myNavbar" class="navbar navbar-default navbar-inverse navbar-fixed-top" role="navigation">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbarCollapse">
                <span class="sr-only">NRN Candad</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">NRN Canada</a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="/VotingApp" target="_self">Home</a></li>
                <li><a href="#" target="_self">About</a></li>
                <li><a href="#" target="_self">Contact</a></li>
                <#--<li><a href="/web-project/ftl/datetime.ftl" target="_blank">DateTime</a></li>-->
                <li><a href="candidates" target="_self">Administration</a></li>

                <li><a href="#" target="_blank">Logout</a></li>
            </ul>
        </div>
    </div>
</nav>