<!DOCTYPE html>
<html>

<head>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
</head>

<body>

<div ng-app="">
    <h2>Hello ${message}</h2>

    <p>Name: <input type="text" ng-model="name"></p>
    <p ng-bind="name"></p>
    <p>you wrote: {{name}}</p>
</div>

</body>
</html>
