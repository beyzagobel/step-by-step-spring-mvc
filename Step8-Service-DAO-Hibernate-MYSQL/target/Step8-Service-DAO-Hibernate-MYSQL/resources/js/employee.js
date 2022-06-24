$("#saveButton").click(function (){
    let url ="kaydet";
    let fname = $("#fname").val();
    let lname = $("#lname").val();
    let bdate = $("#bdate").val();
    let gender = $("#gender").val();
    if(fname && lname) {
        $.ajax({
            type: "POST",
            url: url,
            data:{
                fname : fname ,
                lname : lname ,
                bdate : bdate ,
                gender : gender
            },
            success: function (response){
                alert("Successful!")
                window.location.href = "welcomeEmployee";
            },
            dataType: "json"
        });
    }
    else{
        alert("Failed!")
    }
});