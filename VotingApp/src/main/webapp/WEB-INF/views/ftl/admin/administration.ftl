
<#include "../header.ftl">

<script>
    $(function() {
//twitter bootstrap script
        $("button#saveCandidate").click(function(){
            $.ajax({
                type: "POST",
                url: "candidate/add",
                data: $('form.candidate').serialize(),
                success: function(msg){
//                    $("#thanks").html(msg)
                    $("#candidate").modal('hide');
                    console.log("success");
                },
                error: function(){
                    alert("failure");
                }
            });
        });
    });

</script>
<div class="container" style="height: 500px">
              <#--${message}-->
                  <#--<button type="button" class="btn btn-primary">Add Candidate</button>-->
                  <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#candidate">Add Candidate</button>

                  <#--<a href="#" class="btn btn-primary">Add Candidate</a>-->
              <#--<hr>-->
              <#--&lt;#&ndash;${test}&ndash;&gt;-->


          <#--<table class="datatable">-->
              <#--<tr>-->
                  <#--<th>Firstname</th>  <th>Lastname</th>-->
              <#--</tr>-->
          <#--<#list cadlist["candidateList"] as candidate>-->
              <#--<tr>-->
                  <#--<td>${candidate.firstName}</td> <td>${candidate.lastName}</td>-->
              <#--</tr>-->
          <#--</#list>-->
          <#--</table>-->


</div>

<!-- Modal -->
<div id="candidate" class="modal fade" role="dialog">
    <div class="modal-dialog">
        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Add Candidate</h4>
            </div>
            <form class="candidate">
            <div class="modal-body">

                <div class="form-group">
                    <div class="row">
                        <div class="col-lg-4 col-md-4 col-sm-12">
                            <label for="fname">First Name <input type="text" name="fname" class="form-control"/></label>
                        </div>
                        <div class="col-lg-4 col-md-4 col-sm-12">
                            <label for="mname">Middle Name <input type="text" name="mname" class="form-control"/></label>
                        </div>
                        <div class="col-lg-4 col-md-4 col-sm-12">
                            <label for="lname">Last Name <input type="text" name="lname" class="form-control"/></label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-4 col-md-4 col-sm-12">
                            <label for="email">Email<input type="text" name="email" class="form-control"/></label>
                        </div>
                        <div class="col-lg-4 col-md-4 col-sm-12">
                            <label for="phone">Phone<input type="text" name="phone" class="form-control"/></label>
                        </div>
                        <div class="col-lg-4 col-md-4 col-sm-12">
                            <label for="postal">Postal Code<input type="text" name="postal" class="form-control"/></label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-4">
                             <label for="zone">Zone</label>
                            <select id="zone" class="form-control" name="zone">
                                <option>A</option>
                                <option>B</option>
                                <option>C</option>
                                <option>D</option>
                            </select>
                        </div>
                    </div>



                </div>
            </div>
            </form>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" id="saveCandidate">Save changes</button>
            </div>
        </div>

    </div>
</div>



<#include "../footer.ftl">