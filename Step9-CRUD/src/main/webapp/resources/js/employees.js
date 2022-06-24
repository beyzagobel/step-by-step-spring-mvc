$("#saveOrUpdateButton").click(function () {
    let url = $("#saveOrUpdateEmployeeUrl").val();
    let redirectUrl = $("#employeesRedirectUrl").val();
    let employeeId = $("#employeeId").val();
    let fname = $("#fname").val();
    let lname = $("#lname").val();
    let bdate = $("#bdate").val();
    let gender = $("#gender").val();
    if (fname && lname) {
        $.ajax({
            type: "POST",
            url: url,
            data: {
                employeeId: employeeId,
                fname: fname,
                lname: lname,
                bdate: bdate,
                gender: gender
            },
            success: function (response) {
                alert("Success!")
                window.location.href = redirectUrl ;
            },
            dataType: "json"
        });
    } else {
        alert("Failed!")
    }
});


$(".deleteButton").click(function () {
    let employeeId = $(this).data("id")
    let url = "deleteEmployee";
    $.ajax({
        type: "POST",
        url: url,
        data: {
            id: employeeId
        },
        success: function (response) {
                alert("Success!");
                location.reload();
        },
        dataType: "json"
    });
});







