$("#saveOrUpdateDepartment").click(function () {
    let url = $("#saveOrUpdateDepartmentUrl").val();
    let redirectUrl = $("#departmentRedirectUrl").val();
    let departmentId = $("#departmentId").val();
    let departmentName = $("#departmentName").val();
    if (departmentName) {
        $.ajax({
            type: "POST",
            url: url,
            data: {
                departmentId: departmentId,
                departmentName: departmentName
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
$(".deleteDepartmentButton").click(function () {
    let departmentId = $(this).data("id")
    let departmentName = $("#departmentName").val();
    let url = "deleteDepartment";
    $.ajax({
        type: "POST",
        url: url,
        data: {
            id: departmentId
        },
        success: function (response) {
            alert(departmentName + " Department Successfully Deleted!")
            location.reload();
        },
        dataType: "json"
    });
});
