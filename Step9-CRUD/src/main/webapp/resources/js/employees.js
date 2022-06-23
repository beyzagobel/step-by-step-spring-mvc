$("#saveOrUpdateButton").click(function () {
    let url = "saveOrUpdateEmployee";
    let fname = $("#fname").val();
    let lname = $("#lname").val();
    let bdate = $("#bdate").val();
    let gender = $("#gender").val();
    if (fname && lname) {
        $.ajax({
            type: "POST",
            url: url,
            data: {
                fname: fname,
                lname: lname,
                bdate: bdate,
                gender:gender
            },
            success: function (response) {
                alert("Success!")
                window.location.href="employees"
            },
            dataType: "json"
        });
    } else {
        alert("Failed!")
    }
});




