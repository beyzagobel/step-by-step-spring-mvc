function employeesOfDepartment(value) {
    let url = "employeeOfDepartments";
    $.ajax({
        type: "POST",
        url: url,
        success: function (response) {
            //location.reload();
        },
        dataType: "json"
    })
}