<div id="header">
    <h2>
        <a href="http://viralpatel.net"><img height="37" width="236" border="0px" src="http://viralpatel.net/blogs/wp-content/themes/vp/images/logo.png" align="left" pagespeed_url_hash="874063791" onload="pagespeed.CriticalImages.checkImageForCriticality(this);"></a>
        FreeMarker Spring MVC Hello World
    </h2>
</div>

<div id="content">

    <fieldset>
        <legend>Add User</legend>
        <form name="user" action="add.html" method="post">
            Firstname: <input type="text" name="firstname"> <br>
            Lastname: <input type="text" name="lastname">   <br>
            <input type="submit" value="   Save   ">
        </form>
    </fieldset>
    <br>

    <#list model["userList"] as user>
        <table class="datatable">
            <tbody><tr>
                <th>Firstname</th>  <th>Lastname</th>
            </tr><tr>
                <td>${user.firstname}</td> <td>${user.lastname}</td>
            </tr>
            <!--#list-->
            </tbody></table>

</div>  
 