<html>

<head>
    <title>add employee</title>
</head>
<body>


<div>
    <fieldset>

        <#--<div>${message}</div>-->
    <form name="employee" action="save" method="post">
        Firstname: <input type="text" name="name" />	<br/>
        Salary: <input type="text" name="salary" />	<br/>
        Date: <input type="text" name="joiningDate" />	<br/>
        SSN: <input type="text" name="ssn"/><br/>

        <input type="submit" value="   Save   " />

    </form>
        </fieldset>
</div>

</body>
</html>