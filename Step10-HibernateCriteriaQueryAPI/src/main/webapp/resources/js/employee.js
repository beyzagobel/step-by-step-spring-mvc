$("#saveOrUpdateButton").click(function () {
    let url = $("#saveOrUpdateEmployeeUrl").val();
    let redirectUrl = $("#employeesRedirectUrl").val();
    let employeeId = $("#employeeId").val();    let fname = $("#fname").val();
    let lname = $("#lname").val();
    let bdate = $("#bdate").val();
    let gender = $("#gender").val();
    let price = $("#price").val();
    if (fname && lname) {
        $.ajax({
            type: "POST",
            url: url,
            data: {
                employeeId: employeeId,
                fname: fname,
                lname: lname,
                bdate: bdate,
                gender: gender,
                price: price
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
    let fname = $("#fname").val();
    let lname = $("#lname").val();
    let url = "deleteEmployee";
    $.ajax({
        type: "POST",
        url: url,
        data: {
            id: employeeId
        },
        success: function (response) {
            alert(fname + " " + lname + " Employee Successfully Deleted!")
            location.reload();
        },
        dataType: "json"
    });
});
